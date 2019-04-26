package com.airline.services.payment.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface PaymentCommand {

    public boolean execute(HttpServletRequest request, HttpServletResponse response);

    public boolean undo(HttpServletRequest request, HttpServletResponse response);

}
