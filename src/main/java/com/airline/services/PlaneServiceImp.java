package com.airline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.bean.Plane;
import com.airline.dao.PlaneMapper;
@Service
public class PlaneServiceImp implements IPlaneService{

	@Autowired
	PlaneMapper planeMapper;
	
	@Override
	public List<Plane> findAllPlanes() {
		return planeMapper.selectByExample(null);
	}

}
