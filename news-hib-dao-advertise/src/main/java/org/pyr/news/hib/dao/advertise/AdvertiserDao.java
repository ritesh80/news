package org.pyr.news.hib.dao.advertise;

import com.pyr.news.hib.model.advertise.Advertiser;

public interface AdvertiserDao {
	public void addAdvertiser(Advertiser advertiser);
	
	public void updateAdvertiser(Advertiser advertiser);
	
	public void removeAdvertiser(Advertiser advertiser);
	
	public Advertiser getAdvertiser(int advertiserID);
}
