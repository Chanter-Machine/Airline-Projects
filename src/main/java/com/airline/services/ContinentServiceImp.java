package com.airline.services;

import java.util.List;
import com.airline.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.dao.continentMapper;

@Service
public class ContinentServiceImp implements IContinentService {

    @Autowired
    continentMapper contMapper;

    ContinentExample contExample = new ContinentExample();

    @Override
    public List<Continent> getAllContinents(){
        return contMapper.selectByExample(contExample);
    }

    @Override
    public void addContinent(Continent cont){
        contMapper.insert(cont);
    }
    @Override
    public void removeContinent(int contid){
        contMapper.deleteByPrimaryKey(contid);

    }
}
