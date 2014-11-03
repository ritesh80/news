package com.pyr.news.hib.model.advertise;

// Generated Nov 3, 2014 6:31:34 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AdvertiserContactId generated by hbm2java
 */
@Embeddable
public class AdvertiserContactId implements java.io.Serializable {

	private int advertiserId;
	private int contactId;

	public AdvertiserContactId() {
	}

	public AdvertiserContactId(int advertiserId, int contactId) {
		this.advertiserId = advertiserId;
		this.contactId = contactId;
	}

	@Column(name = "advertiser_id", nullable = false)
	public int getAdvertiserId() {
		return this.advertiserId;
	}

	public void setAdvertiserId(int advertiserId) {
		this.advertiserId = advertiserId;
	}

	@Column(name = "contact_id", nullable = false)
	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AdvertiserContactId))
			return false;
		AdvertiserContactId castOther = (AdvertiserContactId) other;

		return (this.getAdvertiserId() == castOther.getAdvertiserId())
				&& (this.getContactId() == castOther.getContactId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAdvertiserId();
		result = 37 * result + this.getContactId();
		return result;
	}

}
