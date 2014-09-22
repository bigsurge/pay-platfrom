package com.isoftstone.pay.model;

import java.sql.Timestamp;

public class SendLog {

	private String id;
	private String sendUrl;
	private Timestamp sendTime;
	private String sendChannel;
	private String sendType;
	private String sendError;
	private Timestamp createdTime;
	private String orderNo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSendUrl() {
		return sendUrl;
	}
	public void setSendUrl(String sendUrl) {
		this.sendUrl = sendUrl;
	}
	public Timestamp getSendTime() {
		return sendTime;
	}
	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}
	public String getSendChannel() {
		return sendChannel;
	}
	public void setSendChannel(String sendChannel) {
		this.sendChannel = sendChannel;
	}
	public String getSendType() {
		return sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}
	public String getSendError() {
		return sendError;
	}
	public void setSendError(String sendError) {
		this.sendError = sendError;
	}
	public Timestamp getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
}
