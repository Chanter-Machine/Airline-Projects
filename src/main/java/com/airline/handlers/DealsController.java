package com.airline.handlers;

import com.airline.bean.Deal;
import com.airline.bean.Dealtype;
import com.airline.services.IDealService;
import com.airline.services.IDealTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.airline.utils.Msg;

import java.util.List;


@Controller
public class DealsController {
    @Autowired
    IDealService dealService;

    @Autowired
    IDealTypeService dealTypeService;


    @RequestMapping("/createdeals.do")
    @ResponseBody
    public ModelAndView addNewDeal(Deal deal) {
        int customersCount = dealService.addDeal(deal);

        Msg dealsmsg = new Msg();
        dealsmsg.setMsg("You have successfully added New Deal!!! "+customersCount+" registered passengers have been notified about this Deal");
        ModelAndView mv = new ModelAndView();
        mv.addObject("dealsmsg", dealsmsg);
        mv.setViewName("/deals/createdeals.jsp");

        return mv;
    }

    @RequestMapping("/createdealtype.do")
    @ResponseBody
    public ModelAndView addNewDealType(Dealtype dealtype) {
        dealTypeService.addDealtype(dealtype);

        Msg dealtypemsg = new Msg();
        ModelAndView mv = new ModelAndView();
        mv.addObject("deal", dealtypemsg);
        mv.setViewName("/deals/createdeals.jsp");

        return mv;
    }

    @ResponseBody
    @RequestMapping("/allDealTypes.do")
    public Msg allDealTypes() {
        List<Dealtype> dealtypeList = dealTypeService.getAllDealTypes();
        return Msg.success().add("dealtypeList", dealtypeList);
    }
}
