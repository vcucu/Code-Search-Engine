29
https://raw.githubusercontent.com/swwheihei/wvp/master/src/main/java/com/genersoft/iot/vmp/gb28181/event/EventPublisher.java
package com.genersoft.iot.vmp.gb28181.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.genersoft.iot.vmp.gb28181.event.online.OnlineEvent;
import com.genersoft.iot.vmp.gb28181.event.outline.OutlineEvent;

/**    
 * @Description:Event事件通知推送器，支持推送在线事件、离线事件
 * @author: songww
 * @date:   2020年5月6日 上午11:30:50     
 */
@Component
public class EventPublisher {

	@Autowired
    private ApplicationEventPublisher applicationEventPublisher;
	
	public void onlineEventPublish(String deviceId, String from) {
		OnlineEvent onEvent = new OnlineEvent(this);
		onEvent.setDeviceId(deviceId);
		onEvent.setFrom(from);
        applicationEventPublisher.publishEvent(onEvent);
    }
	
	public void outlineEventPublish(String deviceId, String from){
		OutlineEvent outEvent = new OutlineEvent(this);
		outEvent.setDeviceId(deviceId);
		outEvent.setFrom(from);
        applicationEventPublisher.publishEvent(outEvent);
    }
}
