package com.airline.deals;

public class AdvertIterator implements Iterator
{
    Advert[] advertList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of notifiactionList are
    // going to iterate over.
    public  AdvertIterator (Advert[] advertList)
    {
        this.advertList = advertList;
    }

    public Object next()
    {
        // return next element in the array and increment pos
        Advert advert =  advertList[pos];
        pos += 1;
        return advert;
    }

    public boolean hasNext()
    {
        if (pos >= advertList.length ||
                advertList[pos] == null)
            return false;
        else
            return true;
    }
}
