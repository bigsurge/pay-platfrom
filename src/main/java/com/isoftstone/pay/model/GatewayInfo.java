package com.isoftstone.pay.model;

import java.sql.Timestamp;

public class GatewayInfo {

	private String gatewayId;
	private String payMethod;
	private String busCoopId;
	private String busCoopAcc;
	private String busCoopKey;
	private Timestamp createdTime;
	private String createdBy;
	private Timestamp updatedTime;
	private String updatedBy;
	public String getGatewayId() {
		return gatewayId;
	}
	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public String getBusCoopId() {
		return busCoopId;
	}
	public void setBusCoopId(String busCoopId) {
		this.busCoopId = busCoopId;
	}
	public String getBusCoopAcc() {
		return busCoopAcc;
	}
	public void setBusCoopAcc(String busCoopAcc) {
		this.busCoopAcc = busCoopAcc;
	}
	public String getBusCoopKey() {
		return busCoopKey;
	}
	public void setBusCoopKey(String busCoopKey) {
		this.busCoopKey = busCoopKey;
	}
	public Timestamp getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
}
