package com.airline.services;

import com.airline.bean.Dealdate;

public interface IDealDateService {
        public int addDealDate(Dealdate dealdate);
        public void removeDealDate(int id);
}
