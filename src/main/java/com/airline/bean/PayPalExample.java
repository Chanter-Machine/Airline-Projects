package com.airline.bean;

import java.util.ArrayList;
import java.util.List;

public class PayPalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayPalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPaypalidIsNull() {
            addCriterion("paypalId is null");
            return (Criteria) this;
        }

        public Criteria andPaypalidIsNotNull() {
            addCriterion("paypalId is not null");
            return (Criteria) this;
        }

        public Criteria andPaypalidEqualTo(String value) {
            addCriterion("paypalId =", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidNotEqualTo(String value) {
            addCriterion("paypalId <>", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidGreaterThan(String value) {
            addCriterion("paypalId >", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidGreaterThanOrEqualTo(String value) {
            addCriterion("paypalId >=", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidLessThan(String value) {
            addCriterion("paypalId <", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidLessThanOrEqualTo(String value) {
            addCriterion("paypalId <=", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidLike(String value) {
            addCriterion("paypalId like", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidNotLike(String value) {
            addCriterion("paypalId not like", value, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidIn(List<String> values) {
            addCriterion("paypalId in", values, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidNotIn(List<String> values) {
            addCriterion("paypalId not in", values, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidBetween(String value1, String value2) {
            addCriterion("paypalId between", value1, value2, "paypalid");
            return (Criteria) this;
        }

        public Criteria andPaypalidNotBetween(String value1, String value2) {
            addCriterion("paypalId not between", value1, value2, "paypalid");
            return (Criteria) this;
        }

        public Criteria andIntentIsNull() {
            addCriterion("intent is null");
            return (Criteria) this;
        }

        public Criteria andIntentIsNotNull() {
            addCriterion("intent is not null");
            return (Criteria) this;
        }

        public Criteria andIntentEqualTo(String value) {
            addCriterion("intent =", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentNotEqualTo(String value) {
            addCriterion("intent <>", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentGreaterThan(String value) {
            addCriterion("intent >", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentGreaterThanOrEqualTo(String value) {
            addCriterion("intent >=", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentLessThan(String value) {
            addCriterion("intent <", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentLessThanOrEqualTo(String value) {
            addCriterion("intent <=", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentLike(String value) {
            addCriterion("intent like", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentNotLike(String value) {
            addCriterion("intent not like", value, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentIn(List<String> values) {
            addCriterion("intent in", values, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentNotIn(List<String> values) {
            addCriterion("intent not in", values, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentBetween(String value1, String value2) {
            addCriterion("intent between", value1, value2, "intent");
            return (Criteria) this;
        }

        public Criteria andIntentNotBetween(String value1, String value2) {
            addCriterion("intent not between", value1, value2, "intent");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("paymentMethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("paymentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(String value) {
            addCriterion("paymentMethod =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(String value) {
            addCriterion("paymentMethod <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(String value) {
            addCriterion("paymentMethod >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("paymentMethod >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(String value) {
            addCriterion("paymentMethod <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("paymentMethod <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLike(String value) {
            addCriterion("paymentMethod like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotLike(String value) {
            addCriterion("paymentMethod not like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<String> values) {
            addCriterion("paymentMethod in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<String> values) {
            addCriterion("paymentMethod not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(String value1, String value2) {
            addCriterion("paymentMethod between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("paymentMethod not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("totalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("totalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(String value) {
            addCriterion("totalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(String value) {
            addCriterion("totalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(String value) {
            addCriterion("totalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(String value) {
            addCriterion("totalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(String value) {
            addCriterion("totalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(String value) {
            addCriterion("totalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLike(String value) {
            addCriterion("totalAmount like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotLike(String value) {
            addCriterion("totalAmount not like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<String> values) {
            addCriterion("totalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<String> values) {
            addCriterion("totalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(String value1, String value2) {
            addCriterion("totalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(String value1, String value2) {
            addCriterion("totalAmount not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberIsNull() {
            addCriterion("invoiceNumber is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberIsNotNull() {
            addCriterion("invoiceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberEqualTo(String value) {
            addCriterion("invoiceNumber =", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotEqualTo(String value) {
            addCriterion("invoiceNumber <>", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberGreaterThan(String value) {
            addCriterion("invoiceNumber >", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceNumber >=", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberLessThan(String value) {
            addCriterion("invoiceNumber <", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberLessThanOrEqualTo(String value) {
            addCriterion("invoiceNumber <=", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberLike(String value) {
            addCriterion("invoiceNumber like", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotLike(String value) {
            addCriterion("invoiceNumber not like", value, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberIn(List<String> values) {
            addCriterion("invoiceNumber in", values, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotIn(List<String> values) {
            addCriterion("invoiceNumber not in", values, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberBetween(String value1, String value2) {
            addCriterion("invoiceNumber between", value1, value2, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andInvoicenumberNotBetween(String value1, String value2) {
            addCriterion("invoiceNumber not between", value1, value2, "invoicenumber");
            return (Criteria) this;
        }

        public Criteria andPayeridIsNull() {
            addCriterion("payerId is null");
            return (Criteria) this;
        }

        public Criteria andPayeridIsNotNull() {
            addCriterion("payerId is not null");
            return (Criteria) this;
        }

        public Criteria andPayeridEqualTo(String value) {
            addCriterion("payerId =", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotEqualTo(String value) {
            addCriterion("payerId <>", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridGreaterThan(String value) {
            addCriterion("payerId >", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridGreaterThanOrEqualTo(String value) {
            addCriterion("payerId >=", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLessThan(String value) {
            addCriterion("payerId <", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLessThanOrEqualTo(String value) {
            addCriterion("payerId <=", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridLike(String value) {
            addCriterion("payerId like", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotLike(String value) {
            addCriterion("payerId not like", value, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridIn(List<String> values) {
            addCriterion("payerId in", values, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotIn(List<String> values) {
            addCriterion("payerId not in", values, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridBetween(String value1, String value2) {
            addCriterion("payerId between", value1, value2, "payerid");
            return (Criteria) this;
        }

        public Criteria andPayeridNotBetween(String value1, String value2) {
            addCriterion("payerId not between", value1, value2, "payerid");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstName =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstName <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstName >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstName >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstName <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstName <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstName like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstName not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstName in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstName not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstName between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstName not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("lastName is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastName =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastName <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastName >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastName >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastName <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastName <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastName like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastName not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastName in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastName not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastName between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastName not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIsNull() {
            addCriterion("CountryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIsNotNull() {
            addCriterion("CountryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeEqualTo(String value) {
            addCriterion("CountryCode =", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotEqualTo(String value) {
            addCriterion("CountryCode <>", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThan(String value) {
            addCriterion("CountryCode >", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CountryCode >=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThan(String value) {
            addCriterion("CountryCode <", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThanOrEqualTo(String value) {
            addCriterion("CountryCode <=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLike(String value) {
            addCriterion("CountryCode like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotLike(String value) {
            addCriterion("CountryCode not like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIn(List<String> values) {
            addCriterion("CountryCode in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotIn(List<String> values) {
            addCriterion("CountryCode not in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeBetween(String value1, String value2) {
            addCriterion("CountryCode between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotBetween(String value1, String value2) {
            addCriterion("CountryCode not between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIsNull() {
            addCriterion("paymentState is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIsNotNull() {
            addCriterion("paymentState is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstateEqualTo(String value) {
            addCriterion("paymentState =", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotEqualTo(String value) {
            addCriterion("paymentState <>", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateGreaterThan(String value) {
            addCriterion("paymentState >", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateGreaterThanOrEqualTo(String value) {
            addCriterion("paymentState >=", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLessThan(String value) {
            addCriterion("paymentState <", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLessThanOrEqualTo(String value) {
            addCriterion("paymentState <=", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLike(String value) {
            addCriterion("paymentState like", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotLike(String value) {
            addCriterion("paymentState not like", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIn(List<String> values) {
            addCriterion("paymentState in", values, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotIn(List<String> values) {
            addCriterion("paymentState not in", values, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateBetween(String value1, String value2) {
            addCriterion("paymentState between", value1, value2, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotBetween(String value1, String value2) {
            addCriterion("paymentState not between", value1, value2, "paymentstate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}