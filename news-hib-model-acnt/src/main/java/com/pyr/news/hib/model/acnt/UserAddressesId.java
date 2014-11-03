package com.pyr.news.hib.model.acnt;

// Generated Nov 3, 2014 6:22:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserAddressesId generated by hbm2java
 */
@Embeddable
public class UserAddressesId implements java.io.Serializable {

	private int userId;
	private int addressId;

	public UserAddressesId() {
	}

	public UserAddressesId(int userId, int addressId) {
		this.userId = userId;
		this.addressId = addressId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "address_id", nullable = false)
	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserAddressesId))
			return false;
		UserAddressesId castOther = (UserAddressesId) other;

		return (this.getUserId() == castOther.getUserId())
				&& (this.getAddressId() == castOther.getAddressId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getAddressId();
		return result;
	}

}
