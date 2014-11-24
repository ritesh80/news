package com.pyr.news.service.advertise;

import org.pyr.news.hib.dao.advertise.AdvertiseDao;
import org.pyr.news.hib.dao.advertise.AdvertiserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pyr.news.hib.model.advertise.Advertise;
import com.pyr.news.hib.model.advertise.Advertiser;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {
	
	//@Autowired
	//@Qualifier("advertiseDaoImplImpl")
	private AdvertiseDao advertiseDaoImpl;
	
	//@Autowired
	//@Qualifier("advertiserDaoImplImpl")
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

	public void addAdvertise(Advertise Advertise){
		advertiseDaoImpl.addAdvertise(Advertise);
	}
	
	public void updateAdvertise(Advertise Advertise){
		advertiseDaoImpl.updateAdvertise(Advertise);
	}
	
	public void removeAdvertise(Advertise Advertise){
		advertiseDaoImpl.removeAdvertise(Advertise);
	}
	
	public Advertise getAdvertise(int AdvertiseID){
		return advertiseDaoImpl.getAdvertise(AdvertiseID);
	}
	
	public void addAdvertiser(Advertiser advertiser){
		advertiserDaoImpl.addAdvertiser(advertiser);
	}
	
	public void updateAdvertiser(Advertiser advertiser){
		advertiserDaoImpl.updateAdvertiser(advertiser);
	}
	
	public void removeAdvertiser(Advertiser advertiser){
		advertiserDaoImpl.removeAdvertiser(advertiser);
	}
	
	public Advertiser getAdvertiser(int advertiserID){
		return advertiserDaoImpl.getAdvertiser(advertiserID);
	}
	

}
