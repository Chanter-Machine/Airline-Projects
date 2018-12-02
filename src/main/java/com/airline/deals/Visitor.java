package com.airline.deals;

public interface Visitor {
    void visit(AgeDealsDiscount ageDealsDiscount);
    void visit(DateDealsDiscount dateDealsDiscount);
}
