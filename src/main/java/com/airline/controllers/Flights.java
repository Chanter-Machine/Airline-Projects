package com.airline.controllers;
import com.airline.bean.City;
import com.airline.bean.SearchData;
import com.airline.services.ICityService;
import com.airline.services.IFlightService;
import com.airline.services.SearchResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/flights")
public class Flights {

    @Autowired
    private ICityService cityService;

    @Autowired
    private SearchResult searchResult;

    @Autowired
    private IFlightService flightService;


    @ApiOperation(value = "Get airline's flight destination cities")
    @RequestMapping(value = "/getCities", method=RequestMethod.GET)
    public List<City> getCities() {
        return cityService.findAllCityies();
    }

    @ApiOperation(value = "Search for available flights")
    @RequestMapping(value = "/getFlights", method = RequestMethod.POST)
    public SearchResult getFlights(SearchData searchData){
        searchResult = flightService.searchFlights(searchData);
        return searchResult;
    }


}
