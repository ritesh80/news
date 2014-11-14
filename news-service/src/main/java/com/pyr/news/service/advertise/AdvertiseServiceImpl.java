package com.pyr.news.service.advertise;

import org.pyr.news.hib.dao.advertise.AdvertiseDao;
import org.pyr.news.hib.dao.advertise.AdvertiserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyr.news.hib.model.advertise.Advertise;
import com.pyr.news.hib.model.advertise.Advertiser;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {
	
	@Autowired
	private AdvertiseDao advertiseDao;
	
	@Autowired
	private AdvertiserDao advertiserDao;
	
	public void addAdvertise(Advertise Advertise){
		advertiseDao.addAdvertise(Advertise);
	}
	
	public void updateAdvertise(Advertise Advertise){
		advertiseDao.updateAdvertise(Advertise);
	}
	
	public void removeAdvertise(Advertise Advertise){
		advertiseDao.removeAdvertise(Advertise);
	}
	
	public Advertise getAdvertise(int AdvertiseID){
		return advertiseDao.getAdvertise(AdvertiseID);
	}
	
	public void addAdvertiser(Advertiser advertiser){
		advertiserDao.addAdvertiser(advertiser);
	}
	
	public void updateAdvertiser(Advertiser advertiser){
		advertiserDao.updateAdvertiser(advertiser);
	}
	
	public void removeAdvertiser(Advertiser advertiser){
		advertiserDao.removeAdvertiser(advertiser);
	}
	
	public Advertiser getAdvertiser(int advertiserID){
		return advertiserDao.getAdvertiser(advertiserID);
	}
	

}
