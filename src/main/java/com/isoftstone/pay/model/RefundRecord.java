package com.isoftstone.pay.model;

import java.sql.Timestamp;

public class RefundRecord {

	private String id;
	private String channelId;
	private String refundOrderNo;
	private Timestamp refundTime;
	private String refundStatus;
	private String refundMethod;
	private String buyerAlipayAcc;
	private String sellerAlipayAcc;
	private String refundAccount;
	private String refundBatchNo;
	private String refundBatchNum;
	private String refundResDetail;
	private Timestamp createdTime;
	private String createdBy;
	private Timestamp updatedTime;
	private String updatedBy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getRefundOrderNo() {
		return refundOrderNo;
	}
	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}
	public Timestamp getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(Timestamp refundTime) {
		this.refundTime = refundTime;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundMethod() {
		return refundMethod;
	}
	public void setRefundMethod(String refundMethod) {
		this.refundMethod = refundMethod;
	}
	public String getBuyerAlipayAcc() {
		return buyerAlipayAcc;
	}
	public void setBuyerAlipayAcc(String buyerAlipayAcc) {
		this.buyerAlipayAcc = buyerAlipayAcc;
	}
	public String getSellerAlipayAcc() {
		return sellerAlipayAcc;
	}
	public void setSellerAlipayAcc(String sellerAlipayAcc) {
		this.sellerAlipayAcc = sellerAlipayAcc;
	}
	public String getRefundAccount() {
		return refundAccount;
	}
	public void setRefundAccount(String refundAccount) {
		this.refundAccount = refundAccount;
	}
	public String getRefundBatchNo() {
		return refundBatchNo;
	}
	public void setRefundBatchNo(String refundBatchNo) {
		this.refundBatchNo = refundBatchNo;
	}
	public String getRefundBatchNum() {
		return refundBatchNum;
	}
	public void setRefundBatchNum(String refundBatchNum) {
		this.refundBatchNum = refundBatchNum;
	}
	public String getRefundResDetail() {
		return refundResDetail;
	}
	public void setRefundResDetail(String refundResDetail) {
		this.refundResDetail = refundResDetail;
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
