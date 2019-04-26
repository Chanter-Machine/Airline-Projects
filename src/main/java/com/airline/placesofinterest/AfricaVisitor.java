package com.airline.placesofinterest;

import com.airline.bean.PlacesOfInterestSuggestion;
import com.airline.services.IPlacesOfInterestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AfricaVisitor implements PlacesOfInterestVisitor {

    @Autowired
    private IPlacesOfInterestSuggestionService placesOfInterestSuggestionService;

    @Override
    public List<PlacesOfInterestSuggestion> visit(AttractionsSuggestion attractionsSuggestion) {
        System.out.println("Attractions Suggestion available for Africa Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(1, 1);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(HotelsSuggestion hotelsSuggestion) {
        System.out.println("Hotel Suggestion available for Africa Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(1, 2);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(EntertainmentSuggestion entertainmentSuggestion) {
        System.out.println("Entertainment Suggestion available for Africa Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(1, 3);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(EducationSuggestion educationSuggestion) {
        System.out.println("Education Suggestion available for Africa Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(1, 4);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(ManufacturingSuggestion manufacturingSuggestion) {
        System.out.println("Manufacturing Suggestion available for Africa Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(1, 5);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(HealthSuggestion healthSuggestion) {
        System.out.println("Health Suggestion available for Africa Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(1, 6);
        return  placesOfInterestSuggestions;
    }

    @Override
    public List<PlacesOfInterestSuggestion> visit(ReligionSuggestion religionSuggestion) {
        System.out.println("Religion Suggestion available for Africa Visitors");
        List<PlacesOfInterestSuggestion> placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(1, 7);
        return  placesOfInterestSuggestions;
    }
}
