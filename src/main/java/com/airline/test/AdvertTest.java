package com.airline.test;

import com.airline.advert.AdvertCareTaker;
import com.airline.advert.AdvertOriginator;
import com.airline.advert.Caretaker;
import com.airline.advert.Originator;
import com.airline.bean.Advert;
import com.airline.services.IAdvertService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class AdvertTest {

    @Autowired
    IAdvertService advertService;

    @Test
    public void test(){
        Caretaker caretaker = new AdvertCareTaker();
        List<Advert> allAdverts = advertService.getAllAdverts();
        Originator originator = new AdvertOriginator(allAdverts);
        Advert advert = allAdverts.get(0);
        originator.setAdvertid(advert.getAdvertid());
        System.out.println(originator);
        caretaker.addMemento(originator.save());
        originator.setAdvertid(5);
        caretaker.addMemento(originator.save());
        originator.setAdvertid(3);
        System.out.println(originator);
        originator.restore( caretaker.getMemento() );
        System.out.println(originator);
    }

}
