package com.airline.services;

import com.airline.bean.PlacesOfInterestSuggestion;

import java.util.List;

public interface IPlacesOfInterestSuggestionService {
    public List<PlacesOfInterestSuggestion> getAllSuggestion();
    public List<PlacesOfInterestSuggestion> getSuggestion(int continentid, int categoryid);
    public List<PlacesOfInterestSuggestion> getThisSuggestion(int continentid, int categoryid);
    public void addSuggestion(PlacesOfInterestSuggestion suggestion);
    public void removeCategory(int suggestionid);
}
