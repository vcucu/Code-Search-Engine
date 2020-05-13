29
https://raw.githubusercontent.com/swwheihei/wvp/master/src/main/java/com/genersoft/iot/vmp/gb28181/bean/RecordInfo.java
package com.genersoft.iot.vmp.gb28181.bean;

import java.util.List;

/**    
 * @Description:设备录像信息bean 
 * @author: songww
 * @date:   2020年5月8日 下午2:05:56     
 */
public class RecordInfo {

	private String deviceId;
	
	private String name;
	
	private int sumNum;
	
	private List<RecordItem> recordList;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSumNum() {
		return sumNum;
	}

	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}

	public List<RecordItem> getRecordList() {
		return recordList;
	}

	public void setRecordList(List<RecordItem> recordList) {
		this.recordList = recordList;
	}
}