package com.pyr.news.hib.model.acnt;

// Generated Nov 3, 2014 6:22:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserAccountId generated by hbm2java
 */
@Embeddable
public class UserAccountId implements java.io.Serializable {

	private int userId;
	private int accountId;

	public UserAccountId() {
	}

	public UserAccountId(int userId, int accountId) {
		this.userId = userId;
		this.accountId = accountId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "account_id", nullable = false)
	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserAccountId))
			return false;
		UserAccountId castOther = (UserAccountId) other;

		return (this.getUserId() == castOther.getUserId())
				&& (this.getAccountId() == castOther.getAccountId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getAccountId();
		return result;
	}

}
