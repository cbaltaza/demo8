package com.example.demoj8;

import java.io.Serializable;

public class Data implements Serializable {
	 private String total_invoices;
	 private String first_invoice_date;
	 private String last_invoice_date;
	/**
	 * @return the total_invoices
	 */
	public String getTotal_invoices() {
		return total_invoices;
	}
	/**
	 * @param total_invoices the total_invoices to set
	 */
	public void setTotal_invoices(String total_invoices) {
		this.total_invoices = total_invoices;
	}
	/**
	 * @return the first_invoice_date
	 */
	public String getFirst_invoice_date() {
		return first_invoice_date;
	}
	/**
	 * @param first_invoice_date the first_invoice_date to set
	 */
	public void setFirst_invoice_date(String first_invoice_date) {
		this.first_invoice_date = first_invoice_date;
	}
	/**
	 * @return the last_invoice_date
	 */
	public String getLast_invoice_date() {
		return last_invoice_date;
	}
	/**
	 * @param last_invoice_date the last_invoice_date to set
	 */
	public void setLast_invoice_date(String last_invoice_date) {
		this.last_invoice_date = last_invoice_date;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [total_invoices=");
		builder.append(total_invoices);
		builder.append(", first_invoice_date=");
		builder.append(first_invoice_date);
		builder.append(", last_invoice_date=");
		builder.append(last_invoice_date);
		builder.append("]");
		return builder.toString();
	}
	
	
}
