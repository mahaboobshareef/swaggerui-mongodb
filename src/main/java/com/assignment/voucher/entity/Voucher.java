/**
 * 
 */
package com.assignment.voucher.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author m.shareef.mohammed
 *
 */
@Document(collection="VoucherDetails")
public class Voucher {

	/**
	 * 
	 */
	public Voucher() {
		// TODO Auto-generated constructor stub
	}
	
	@Field
	private int voucherNumber;
	@Field
	private String voucherDate; 
	@Field
	private String debitAccount;
	@Field
	private String creditAccount;
	@Field
	private String voucherDescription;
	@Field
	private int amount;

	public int getVoucherNumber() {
		return voucherNumber;
	}

	public void setVoucherNumber(int voucherNumber) {
		this.voucherNumber = voucherNumber;
	}

	public String getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(String voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}

	public String getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}

	public Voucher(int voucherNumber, String voucherDate, String debitAccount, String creditAccount,
			String voucherDescription, int amount) {
		super();
		this.voucherNumber = voucherNumber;
		this.voucherDate = voucherDate;
		this.debitAccount = debitAccount;
		this.creditAccount = creditAccount;
		this.voucherDescription = voucherDescription;
		this.amount = amount;
	}

	public String getVoucherDescription() {
		return voucherDescription;
	}

	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Voucher [voucherNumber=" + voucherNumber + ", voucherDate=" + voucherDate + ", debitAccount="
				+ debitAccount + ", creditAccount=" + creditAccount + ", voucherDescription=" + voucherDescription
				+ ", amount=" + amount + "]";
	}

}

