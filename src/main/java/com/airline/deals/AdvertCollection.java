package com.airline.deals;

public class AdvertCollection implements Collection
{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Advert[] advertList;

    public AdvertCollection()
    {
        advertList = new Advert[MAX_ITEMS];

        // Let us add some dummy adverts
        addItem("advert 1");
        addItem("advert 2");
        addItem("advert 3");
    }

    public void addItem(String str)
    {
        Advert advert = new Advert(str);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            advertList[numberOfItems] = advert;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator()
    {
        return new AdvertIterator(advertList);
    }
}
