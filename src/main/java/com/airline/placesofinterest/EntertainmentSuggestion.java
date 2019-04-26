package com.airline.placesofinterest;

import com.airline.bean.PlacesOfInterestSuggestion;

import java.util.List;

public class EntertainmentSuggestion implements Suggestion {

    @Override
    public List<PlacesOfInterestSuggestion> accept(PlacesOfInterestVisitor visitor) {
        return visitor.visit(this);
    }
}
