package com.airline.deals;

public class AdvertBar {
    AdvertCollection adverts;

    public AdvertBar(AdvertCollection adverts)
    {
        this.adverts = adverts;
    }

    public void displayAdverts()
    {
        Iterator iterator = adverts.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext())
        {
            Advert n = (Advert)iterator.next();
            System.out.println(n.getAdvert());
        }
    }
}
