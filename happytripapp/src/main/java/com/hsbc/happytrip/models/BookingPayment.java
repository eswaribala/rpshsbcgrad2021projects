package com.hsbc.happytrip.models;

import java.io.Serializable;

import java.util.Date;

/**
 * The persistent class for the bookingpayments database table.
 * 
 */

public class BookingPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	private long bookingId;

	private float paymentAmount;

	private Date paymentDate;

	private String referenceNo;

	// bi-directional one-to-one association to Booking

	private Booking booking;


	private long creditCardNumber;

	public BookingPayment() {
	}

	public long getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public float getPaymentAmount() {
		return this.paymentAmount;
	}

	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentDate() {
		if (paymentDate != null) {
			return (Date) this.paymentDate.clone();
		} else {
			return this.paymentDate;
		}
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Booking getBooking() {
		return this.booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

}