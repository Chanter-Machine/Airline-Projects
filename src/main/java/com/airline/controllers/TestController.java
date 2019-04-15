package com.airline.controllers;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "Swagger2DemoRestController", description = "REST APIs related to Student Entity!!!!")
@RestController
@RequestMapping("/students")
public class TestController {
    @ApiOperation(value = "Get specific Student in the System ", tags = "getStudent")
    @RequestMapping(value = "/getStudent/{name}", method=RequestMethod.GET)
    public String getString(@PathVariable(value = "name") String name) {
        return "Hello "+name+" !";
    }
}
