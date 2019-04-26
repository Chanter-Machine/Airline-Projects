package com.airline.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.Continent;
import com.airline.services.IContinentService;
import com.airline.utils.Msg;

@Controller
public class ContinentController {

    @Autowired
    private IContinentService continentService;
    @ResponseBody
    @RequestMapping("/getContinents.do")
    public Msg getAdverts() {
        List<Continent>continents = continentService.getAllContinents();
        return Msg.success().add("continents", continents);
    }
}

