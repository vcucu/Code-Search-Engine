12
https://raw.githubusercontent.com/Pingvin235/bgerp/master/src/ru/bgcrm/plugin/bgbilling/dao/MessageTypeSearchEmail.java
package ru.bgcrm.plugin.bgbilling.dao;

import java.util.Set;

import ru.bgcrm.model.BGException;
import ru.bgcrm.model.CommonObjectLink;
import ru.bgcrm.model.SearchResult;
import ru.bgcrm.model.message.Message;
import ru.bgcrm.plugin.bgbilling.proto.dao.ContractDAO;
import ru.bgcrm.plugin.bgbilling.proto.model.Contract;
import ru.bgcrm.struts.form.DynActionForm;
import ru.bgcrm.util.ParameterMap;
import ru.bgcrm.util.Utils;
import ru.bgcrm.util.sql.ConnectionSet;

public class MessageTypeSearchEmail
	extends MessageTypeSearchBilling
{
	private final Set<Integer> paramIds;
	
	public MessageTypeSearchEmail( ParameterMap config )
		throws BGException
	{
		super( config );
		paramIds = Utils.toIntegerSet( config.get( "paramIds" ) );
	}

	@Override
	public void search( DynActionForm form, ConnectionSet conSet, 
	                    Message message, Set<CommonObjectLink> result )
		throws BGException
	{
		String email = message.getFrom();
		
		SearchResult<Contract> searchResult = new SearchResult<Contract>();
		new ContractDAO( form.getUser(), billingId ).searchContractByEmailParam( searchResult, null, paramIds, email );
		
		for( Contract contract : searchResult.getList() )
		{
			result.add( new CommonObjectLink( 0, Contract.OBJECT_TYPE + ":" + contract.getBillingId(), 
			                                  contract.getId(), contract.getTitle(), contract.getComment() ) );
		}
	}
}