package com.airline.services;

import java.util.List;
import java.util.ArrayList;
import com.airline.bean.*;
import com.airline.deals.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.dao.DealMapper;

@Service
public class DealServiceImp implements IDealService {

    @Autowired
    DealMapper dealMapper;

    Dealtype dealtype = new Dealtype();

    @Autowired
    IDealTypeService myDealtype;

    @Autowired
    IUserService myUserService;

    DealExample dealExample = new DealExample();
    User user = new User();
    private List<User> listOfCustomers = new ArrayList<User>();
    private List<String> listOfCustomerEmail = new ArrayList<String>();
    NewDeal newdeal = new NewDeal();


    @Override
    public int addDeal(Deal deal) {
        dealMapper.insert(deal);
        newdeal.setDealName(deal.getDescription());
        listOfCustomers = myUserService.getUserBySubscribed();
        for(User theuser : listOfCustomers){
            listOfCustomerEmail.add(theuser.getEmail());
            newdeal.registerObserver(theuser);
        }

        newdeal.setPassengerEmail(listOfCustomerEmail);
        return newdeal.setAvailable(true);
    }

    @Override
    public void removeDeal(int id) {

        dealMapper.deleteByPrimaryKey(id);

    }

    @Override
    public double calculateDiscount(Passenger passenger) {

        List<Deal> listofDeals = getAllDealsAndType();
        RunDealsVisit runDealsVisit= new RunDealsVisit();
        runDealsVisit.setData(passenger, listofDeals);
        return runDealsVisit.calculatePostage();
    }

    @Override
    public List<Deal> getAllDealsAndType() {
        return dealMapper.selectAllDealsAndType();
    }

    @Override
    public List<Deal> getAllDeals() {

        return dealMapper.selectByExample(dealExample);
    }
}
