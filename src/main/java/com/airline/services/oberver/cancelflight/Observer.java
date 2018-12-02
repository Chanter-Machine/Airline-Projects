package com.airline.services.oberver.cancelflight;

import com.airline.bean.FlightRecord;

public interface Observer {
	/**
     * 
     * @param state    Set state, and notify customers
     */
    public void update(FlightRecord flightrecord);
}
