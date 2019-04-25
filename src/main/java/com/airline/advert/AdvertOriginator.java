package com.airline.advert;

import com.airline.bean.Advert;

import java.util.List;

public class AdvertOriginator implements Originator {
    private int advertid;
    private String description;
    private String category;
    private String imagelocation;

   /* public AdvertOriginator(int advertid, String description, String category, String imagelocation) {
    this.advertid = advertid;
        this.description = description;
        this.category = category;
        this.imagelocation = imagelocation; */

    public AdvertOriginator(List<Advert> adverts) {
        super();
        for (Advert ad: adverts) {
            advertid = ad.getAdvertid();
            description = ad.getDescription();
            category = ad.getCategory();
            imagelocation = ad.getLocation();
        }
    }
    public int getAdvertid() {
        return advertid;
    }
    public void setAdvertid(int advertid) {
        this.advertid = advertid;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getImagelocation() {
        return imagelocation;
    }
    public void setImagelocation(String imagelocation) {
        this.imagelocation = imagelocation;
    }
    @Override
    public Memento save() {
        // TODO Auto-generated method stub
        return new AdvertMemento(this.advertid);
    }
    @Override
    public void restore(Memento memento) {
        this.advertid = memento.getAdvertid();
    }
    @Override
    public String toString() {
        return "AdvertOriginator [advertid=" + advertid + ", description=" + description + ", category=" + category + ", imagelocation="+ imagelocation + "]";
    }
}
