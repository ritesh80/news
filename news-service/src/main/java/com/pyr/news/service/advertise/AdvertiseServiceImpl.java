package com.pyr.news.service.advertise;

import org.pyr.news.hib.dao.advertise.AdvertiseDao;
import org.pyr.news.hib.dao.advertise.AdvertiserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyr.news.hib.model.advertise.Advertise;
import com.pyr.news.hib.model.advertise.Advertiser;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {

	// @Autowired
	// @Qualifier("advertiseDaoImplImpl")
	private AdvertiseDao advertiseDaoImpl;

	// @Autowired
	// @Qualifier("advertiserDaoImplImpl")
	private AdvertiserDao advertiserDaoImpl;

	@Autowired
	public AdvertiseDao getAdvertiseDaoImpl() {
		return advertiseDaoImpl;
	}

	public void setAdvertiseDaoImpl(AdvertiseDao advertiseDaoImpl) {
		this.advertiseDaoImpl = advertiseDaoImpl;
	}

	@Autowired
	public AdvertiserDao getAdvertiserDaoImpl() {
		return advertiserDaoImpl;
	}

	public void setAdvertiserDaoImpl(AdvertiserDao advertiserDaoImpl) {
		this.advertiserDaoImpl = advertiserDaoImpl;
	}

	public void addAdvertise(Advertise Advertise) {
		advertiseDaoImpl.insert(Advertise);
	}

	public void updateAdvertise(Advertise Advertise) {
		advertiseDaoImpl.update(Advertise);
	}

	public void removeAdvertise(Advertise Advertise) {
		advertiseDaoImpl.remove(Advertise);
	}

	public Advertise getAdvertise(int AdvertiseID) {
		return (Advertise) advertiseDaoImpl.get(Advertise.class, AdvertiseID);
	}

	public void addAdvertiser(Advertiser advertiser) {
		advertiserDaoImpl.insert(advertiser);
	}

	public void updateAdvertiser(Advertiser advertiser) {
		advertiserDaoImpl.update(advertiser);
	}

	public void removeAdvertiser(Advertiser advertiser) {
		advertiserDaoImpl.remove(advertiser);
	}

	public Advertiser getAdvertiser(int advertiserID) {
		return (Advertiser) advertiserDaoImpl.get(Advertiser.class,
				advertiserID);
	}

}
