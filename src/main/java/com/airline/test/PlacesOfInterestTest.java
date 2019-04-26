package com.airline.test;

import com.airline.placesofinterest.*;

public class PlacesOfInterestTest {
    public static void main(String[] args){

        Suggestion[] placesOfInterest = new Suggestion[] {new AttractionsSuggestion(), new HotelsSuggestion(), new EntertainmentSuggestion(), new EducationSuggestion(), new ManufacturingSuggestion(), new HealthSuggestion(), new ReligionSuggestion()};

        for (int i=0; i<placesOfInterest.length; i++)
            placesOfInterest[i].accept(new AfricaVisitor());
    }
}
