package com.airline.services;

import java.util.ArrayList;
import java.util.List;
import com.airline.bean.*;
import com.airline.placesofinterest.*;
import com.airline.bean.PlacesOfInterestSuggestionExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.dao.placesofinterestsuggestionMapper;

@Service
public class PlacesOfInterestSuggestionServiceImp implements IPlacesOfInterestSuggestionService {

    @Autowired
    placesofinterestsuggestionMapper suggestionMapper;

    PlacesOfInterestSuggestionExample suggestionExample = new PlacesOfInterestSuggestionExample();

    @Override
    public List<PlacesOfInterestSuggestion> getAllSuggestion(){
        return suggestionMapper.selectByExample(suggestionExample);
    }

    @Override
    public List<PlacesOfInterestSuggestion> getSuggestion(int continentid, int categoryid) {
        Criteria criteria = suggestionExample.createCriteria();
        criteria.andContinentidEqualTo(continentid);
        criteria.andPlacesofinterestcategoryidEqualTo(categoryid);
        return suggestionMapper.selectByExample(suggestionExample);
    }

    @Override
    public List<PlacesOfInterestSuggestion> getThisSuggestion(int continentid, int categoryid) {
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions;
        Suggestion category;
        if (categoryid==1) {
            category = new AttractionsSuggestion();
            if (continentid==1)
                placesOfInterestSuggestions = category.accept(new AfricaVisitor());
            else if (continentid==2)
                placesOfInterestSuggestions = category.accept(new AsiaVisitor());
            else if (continentid==3)
                placesOfInterestSuggestions = category.accept(new AntarcticaVisitor());
            else if (continentid==4)
                placesOfInterestSuggestions = category.accept(new EuropeVisitor());
            else if (continentid==5)
                placesOfInterestSuggestions = category.accept(new NorthAmericaVisitor());
            else if (continentid==6)
                placesOfInterestSuggestions = category.accept(new SouthAmericaVisitor());
            else
                placesOfInterestSuggestions = category.accept(new OceaniaVisitor());
        }
        else if (categoryid==2) {
            category = new HotelsSuggestion();
            if (continentid==1)
                placesOfInterestSuggestions = category.accept(new AfricaVisitor());
            else if (continentid==2)
                placesOfInterestSuggestions = category.accept(new AsiaVisitor());
            else if (continentid==3)
                placesOfInterestSuggestions = category.accept(new AntarcticaVisitor());
            else if (continentid==4)
                placesOfInterestSuggestions = category.accept(new EuropeVisitor());
            else if (continentid==5)
                placesOfInterestSuggestions = category.accept(new NorthAmericaVisitor());
            else if (continentid==6)
                placesOfInterestSuggestions = category.accept(new SouthAmericaVisitor());
            else
                placesOfInterestSuggestions = category.accept(new OceaniaVisitor());
        }
        else if (categoryid==3) {
            category = new EntertainmentSuggestion();
            if (continentid==1)
                placesOfInterestSuggestions = category.accept(new AfricaVisitor());
            else if (continentid==2)
                placesOfInterestSuggestions = category.accept(new AsiaVisitor());
            else if (continentid==3)
                placesOfInterestSuggestions = category.accept(new AntarcticaVisitor());
            else if (continentid==4)
                placesOfInterestSuggestions = category.accept(new EuropeVisitor());
            else if (continentid==5)
                placesOfInterestSuggestions = category.accept(new NorthAmericaVisitor());
            else if (continentid==6)
                placesOfInterestSuggestions = category.accept(new SouthAmericaVisitor());
            else
                placesOfInterestSuggestions = category.accept(new OceaniaVisitor());
        }
        else if (categoryid==4) {
            category = new EducationSuggestion();
            if (continentid==1)
                placesOfInterestSuggestions = category.accept(new AfricaVisitor());
            else if (continentid==2)
                placesOfInterestSuggestions = category.accept(new AsiaVisitor());
            else if (continentid==3)
                placesOfInterestSuggestions = category.accept(new AntarcticaVisitor());
            else if (continentid==4)
                placesOfInterestSuggestions = category.accept(new EuropeVisitor());
            else if (continentid==5)
                placesOfInterestSuggestions = category.accept(new NorthAmericaVisitor());
            else if (continentid==6)
                placesOfInterestSuggestions = category.accept(new SouthAmericaVisitor());
            else
                placesOfInterestSuggestions = category.accept(new OceaniaVisitor());
        }
        else if (categoryid==5) {
            category = new ManufacturingSuggestion();
            if (continentid==1)
                placesOfInterestSuggestions = category.accept(new AfricaVisitor());
            else if (continentid==2)
                placesOfInterestSuggestions = category.accept(new AsiaVisitor());
            else if (continentid==3)
                placesOfInterestSuggestions = category.accept(new AntarcticaVisitor());
            else if (continentid==4)
                placesOfInterestSuggestions = category.accept(new EuropeVisitor());
            else if (continentid==5)
                placesOfInterestSuggestions = category.accept(new NorthAmericaVisitor());
            else if (continentid==6)
                placesOfInterestSuggestions = category.accept(new SouthAmericaVisitor());
            else
                placesOfInterestSuggestions = category.accept(new OceaniaVisitor());
        }
        else if (categoryid==6) {
            category = new HealthSuggestion();
            if (continentid==1)
                placesOfInterestSuggestions = category.accept(new AfricaVisitor());
            else if (continentid==2)
                placesOfInterestSuggestions = category.accept(new AsiaVisitor());
            else if (continentid==3)
                placesOfInterestSuggestions = category.accept(new AntarcticaVisitor());
            else if (continentid==4)
                placesOfInterestSuggestions = category.accept(new EuropeVisitor());
            else if (continentid==5)
                placesOfInterestSuggestions = category.accept(new NorthAmericaVisitor());
            else if (continentid==6)
                placesOfInterestSuggestions = category.accept(new SouthAmericaVisitor());
            else
                placesOfInterestSuggestions = category.accept(new OceaniaVisitor());
        }
        else {
            category = new ReligionSuggestion();
            if (continentid==1)
                placesOfInterestSuggestions = category.accept(new AfricaVisitor());
            else if (continentid==2)
                placesOfInterestSuggestions = category.accept(new AsiaVisitor());
            else if (continentid==3)
                placesOfInterestSuggestions = category.accept(new AntarcticaVisitor());
            else if (continentid==4)
                placesOfInterestSuggestions = category.accept(new EuropeVisitor());
            else if (continentid==5)
                placesOfInterestSuggestions = category.accept(new NorthAmericaVisitor());
            else if (continentid==6)
                placesOfInterestSuggestions = category.accept(new SouthAmericaVisitor());
            else
                placesOfInterestSuggestions = category.accept(new OceaniaVisitor());
        }

        return  placesOfInterestSuggestions;
    }

    @Override
    public void addSuggestion(PlacesOfInterestSuggestion suggestion){
        suggestionMapper.insert(suggestion);
    }
    @Override
    public void removeCategory(int suggestionid){
        suggestionMapper.deleteByPrimaryKey(suggestionid);

    }
}
