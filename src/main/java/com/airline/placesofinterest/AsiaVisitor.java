package com.airline.placesofinterest;

import com.airline.bean.PlacesOfInterestSuggestion;
import com.airline.services.IPlacesOfInterestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AsiaVisitor implements PlacesOfInterestVisitor {

    @Autowired
    private IPlacesOfInterestSuggestionService placesOfInterestSuggestionService;

    @Override
    public List<PlacesOfInterestSuggestion> visit(AttractionsSuggestion attractionsSuggestion) {
        System.out.println("Attractions Suggestion available for Asia Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(3, 1);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(HotelsSuggestion hotelsSuggestion) {
        System.out.println("Hotel Suggestion available for Asia Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(3, 2);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(EntertainmentSuggestion entertainmentSuggestion) {
        System.out.println("Entertainment Suggestion available for Asia Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(3, 3);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(EducationSuggestion educationSuggestion) {
        System.out.println("Education Suggestion available for Asia Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(3, 4);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(ManufacturingSuggestion manufacturingSuggestion) {
        System.out.println("Manufacturing Suggestion available for Asia Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(3, 5);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(HealthSuggestion healthSuggestion) {
        System.out.println("Health Suggestion available for Asia Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(3, 6);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(ReligionSuggestion religionSuggestion) {
        System.out.println("Religion Suggestion available for Asia Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(3, 7);
        return  placesOfInterestSuggestions;
    }
}
