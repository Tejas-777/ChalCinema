package com.sunbeam.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private int paymentId;
	
	private Double amount;
	private String dateTime;
	private String method;
	
	@Column(name="transaction_id")
	private String transactionId;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", dateTime=" + dateTime + ", method="
				+ method + ", transactionId=" + transactionId + "]";
	}

	public Payment(int paymentId, Double amount, String dateTime, String method, String transactionId) {
	
		this.paymentId = paymentId;
		this.amount = amount;
		this.dateTime = dateTime;
		this.method = method;
		this.transactionId = transactionId;
	}

	public Payment() {
	}
	
	
	
	
	
	
	
	
	
	

}
