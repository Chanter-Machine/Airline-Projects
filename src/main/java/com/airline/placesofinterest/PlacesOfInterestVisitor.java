package com.airline.placesofinterest;

import com.airline.bean.PlacesOfInterestSuggestion;

import java.util.List;

public interface PlacesOfInterestVisitor {
    public List<PlacesOfInterestSuggestion> visit(AttractionsSuggestion attractionsSuggestion);
    public List<PlacesOfInterestSuggestion> visit(HotelsSuggestion hotelsSuggestion);
    public List<PlacesOfInterestSuggestion> visit(EntertainmentSuggestion entertainmentSuggestion);
    public List<PlacesOfInterestSuggestion> visit(EducationSuggestion educationSuggestion);
    public List<PlacesOfInterestSuggestion> visit(ManufacturingSuggestion manufacturingSuggestion);
    public List<PlacesOfInterestSuggestion> visit(HealthSuggestion healthSuggestion);
    public List<PlacesOfInterestSuggestion> visit(ReligionSuggestion religionSuggestion);
}
