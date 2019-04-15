package com.airline.advert;

import com.airline.bean.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import com.airline.services.IAdvertService;
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
        Advert newAdvert = new Advert();
        newAdvert.setCategory("Europe");
        newAdvert.setDescription("European Region");
        newAdvert.setLocation("EuropePix");
//        advertService.addAdvert(newAdvert);

        List<Advert> allAdverts = advertService.getAllAdverts();
        for (Advert ad: allAdverts
             ) {
            System.out.println(ad);
        }
        Originator originator = new AdvertOriginator(1,"22","1992-09-23","new york");
        Advert advert = allAdverts.get(0);
        originator.setAdvertid(advert.getAdvertid());
        System.out.println(originator);
        caretaker.addMemento(originator.save());
        originator.setAdvertid(90000);
        caretaker.addMemento(originator.save());
        originator.setAdvertid(95000);
        System.out.println(originator);
        originator.restore( caretaker.getMemento() );
        System.out.println(originator);
    }


}
