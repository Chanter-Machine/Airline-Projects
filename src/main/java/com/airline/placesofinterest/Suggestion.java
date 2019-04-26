package com.airline.placesofinterest;

import com.airline.bean.PlacesOfInterestSuggestion;

import java.util.List;

public interface Suggestion {
    public List<PlacesOfInterestSuggestion> accept(PlacesOfInterestVisitor visitor);
}
