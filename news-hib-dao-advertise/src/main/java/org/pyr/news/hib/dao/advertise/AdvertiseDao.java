package org.pyr.news.hib.dao.advertise;

import com.pyr.news.hib.model.advertise.Advertise;

public interface AdvertiseDao {
	public void addAdvertise(Advertise Advertise);
	
	public void updateAdvertise(Advertise Advertise);
	
	public void removeAdvertise(Advertise Advertise);
	
	public Advertise getAdvertise(int AdvertiseID);
}
