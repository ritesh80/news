package com.pyr.news.service.advertise;

import com.pyr.news.hib.model.advertise.Advertise;
import com.pyr.news.hib.model.advertise.Advertiser;

public interface AdvertiseService {
	public void addAdvertise(Advertise Advertise);

	public void updateAdvertise(Advertise Advertise);

	public void removeAdvertise(Advertise Advertise);

	public Advertise getAdvertise(int AdvertiseID);

	public void addAdvertiser(Advertiser advertiser);

	public void updateAdvertiser(Advertiser advertiser);

	public void removeAdvertiser(Advertiser advertiser);

	public Advertiser getAdvertiser(int advertiserID);
}
