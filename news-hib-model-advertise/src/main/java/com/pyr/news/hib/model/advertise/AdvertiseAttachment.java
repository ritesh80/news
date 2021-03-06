package com.pyr.news.hib.model.advertise;

// Generated Nov 17, 2014 3:27:02 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AdvertiseAttachment generated by hbm2java
 */
@Entity
@Table(name = "advertise_attachment", catalog = "demo_news")
public class AdvertiseAttachment implements java.io.Serializable {

	private AdvertiseAttachmentId id;
	private Advertise advertise;

	public AdvertiseAttachment() {
	}

	public AdvertiseAttachment(AdvertiseAttachmentId id, Advertise advertise) {
		this.id = id;
		this.advertise = advertise;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "advertiseId", column = @Column(name = "advertise_id", nullable = false)),
			@AttributeOverride(name = "attachmentId", column = @Column(name = "attachment_id", nullable = false)) })
	public AdvertiseAttachmentId getId() {
		return this.id;
	}

	public void setId(AdvertiseAttachmentId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advertise_id", nullable = false, insertable = false, updatable = false)
	public Advertise getAdvertise() {
		return this.advertise;
	}

	public void setAdvertise(Advertise advertise) {
		this.advertise = advertise;
	}

}
