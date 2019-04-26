package com.airline.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.PlacesOfInterestCategory;
import com.airline.services.IPlacesOfInterestCategoryService;
import com.airline.utils.Msg;

@Controller
public class PlacesofInterestCategoryController {

    @Autowired
    private IPlacesOfInterestCategoryService placesOfInterestCategoryService;
    @ResponseBody
    @RequestMapping("/getPlacesOfInterestCategory.do")
    public Msg getCategories() {
        List<PlacesOfInterestCategory>placesofinterestCategories = placesOfInterestCategoryService.getAllCategory();
        return Msg.success().add("Places of Interest Category", placesofinterestCategories);
    }
}
