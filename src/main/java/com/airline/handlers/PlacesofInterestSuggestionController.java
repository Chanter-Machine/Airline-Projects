package com.airline.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.PlacesOfInterestSuggestion;
import com.airline.services.IPlacesOfInterestSuggestionService;
import com.airline.utils.Msg;

@Controller
public class PlacesofInterestSuggestionController {

    @Autowired
    private IPlacesOfInterestSuggestionService placesOfInterestSuggestionService;
    @ResponseBody
    @RequestMapping("/getPlacesOfInterestSuggestion.do")
    public Msg getSuggestions(int continentCode, int categoryCode) {
        List<PlacesOfInterestSuggestion>placesOfInterestSuggestions = placesOfInterestSuggestionService.getThisSuggestion(continentCode, categoryCode);
        //List<PlacesOfInterestSuggestion>placesOfInterestSuggestions = placesOfInterestSuggestionService.getSuggestion(continentCode, categoryCode);
        return Msg.success().add("Places of Interest Suggestion", placesOfInterestSuggestions);
    }
}
