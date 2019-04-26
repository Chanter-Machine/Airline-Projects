package com.airline.handlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airline.bean.Advert;
import com.airline.services.IAdvertService;
import com.airline.utils.Msg;

@Controller
public class AdvertController {

    @Autowired
    private IAdvertService advertService;
    @ResponseBody
    @RequestMapping("/getAdverts.do")
    public Msg getAdverts() {
        List<Advert>adverts = advertService.getAllAdverts();
        return Msg.success().add("adverts", adverts);
    }
}