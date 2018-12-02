package com.airline.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightandorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightandorderExample() {
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

        public Criteria andFlightandorderidIsNull() {
            addCriterion("flightAndOrderId is null");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidIsNotNull() {
            addCriterion("flightAndOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidEqualTo(Integer value) {
            addCriterion("flightAndOrderId =", value, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidNotEqualTo(Integer value) {
            addCriterion("flightAndOrderId <>", value, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidGreaterThan(Integer value) {
            addCriterion("flightAndOrderId >", value, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("flightAndOrderId >=", value, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidLessThan(Integer value) {
            addCriterion("flightAndOrderId <", value, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidLessThanOrEqualTo(Integer value) {
            addCriterion("flightAndOrderId <=", value, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidIn(List<Integer> values) {
            addCriterion("flightAndOrderId in", values, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidNotIn(List<Integer> values) {
            addCriterion("flightAndOrderId not in", values, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidBetween(Integer value1, Integer value2) {
            addCriterion("flightAndOrderId between", value1, value2, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightandorderidNotBetween(Integer value1, Integer value2) {
            addCriterion("flightAndOrderId not between", value1, value2, "flightandorderid");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNull() {
            addCriterion("flightId is null");
            return (Criteria) this;
        }

        public Criteria andFlightidIsNotNull() {
            addCriterion("flightId is not null");
            return (Criteria) this;
        }

        public Criteria andFlightidEqualTo(Integer value) {
            addCriterion("flightId =", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotEqualTo(Integer value) {
            addCriterion("flightId <>", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThan(Integer value) {
            addCriterion("flightId >", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThanOrEqualTo(Integer value) {
            addCriterion("flightId >=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThan(Integer value) {
            addCriterion("flightId <", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThanOrEqualTo(Integer value) {
            addCriterion("flightId <=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidIn(List<Integer> values) {
            addCriterion("flightId in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotIn(List<Integer> values) {
            addCriterion("flightId not in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidBetween(Integer value1, Integer value2) {
            addCriterion("flightId between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotBetween(Integer value1, Integer value2) {
            addCriterion("flightId not between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andSeattypeIsNull() {
            addCriterion("seatType is null");
            return (Criteria) this;
        }

        public Criteria andSeattypeIsNotNull() {
            addCriterion("seatType is not null");
            return (Criteria) this;
        }

        public Criteria andSeattypeEqualTo(String value) {
            addCriterion("seatType =", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotEqualTo(String value) {
            addCriterion("seatType <>", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeGreaterThan(String value) {
            addCriterion("seatType >", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeGreaterThanOrEqualTo(String value) {
            addCriterion("seatType >=", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeLessThan(String value) {
            addCriterion("seatType <", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeLessThanOrEqualTo(String value) {
            addCriterion("seatType <=", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeLike(String value) {
            addCriterion("seatType like", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotLike(String value) {
            addCriterion("seatType not like", value, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeIn(List<String> values) {
            addCriterion("seatType in", values, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotIn(List<String> values) {
            addCriterion("seatType not in", values, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeBetween(String value1, String value2) {
            addCriterion("seatType between", value1, value2, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeattypeNotBetween(String value1, String value2) {
            addCriterion("seatType not between", value1, value2, "seattype");
            return (Criteria) this;
        }

        public Criteria andSeatnumIsNull() {
            addCriterion("seatNum is null");
            return (Criteria) this;
        }

        public Criteria andSeatnumIsNotNull() {
            addCriterion("seatNum is not null");
            return (Criteria) this;
        }

        public Criteria andSeatnumEqualTo(Integer value) {
            addCriterion("seatNum =", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumNotEqualTo(Integer value) {
            addCriterion("seatNum <>", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumGreaterThan(Integer value) {
            addCriterion("seatNum >", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatNum >=", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumLessThan(Integer value) {
            addCriterion("seatNum <", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumLessThanOrEqualTo(Integer value) {
            addCriterion("seatNum <=", value, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumIn(List<Integer> values) {
            addCriterion("seatNum in", values, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumNotIn(List<Integer> values) {
            addCriterion("seatNum not in", values, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumBetween(Integer value1, Integer value2) {
            addCriterion("seatNum between", value1, value2, "seatnum");
            return (Criteria) this;
        }

        public Criteria andSeatnumNotBetween(Integer value1, Integer value2) {
            addCriterion("seatNum not between", value1, value2, "seatnum");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateIsNull() {
            addCriterion("takeoffDate is null");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateIsNotNull() {
            addCriterion("takeoffDate is not null");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateEqualTo(Date value) {
            addCriterion("takeoffDate =", value, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateNotEqualTo(Date value) {
            addCriterion("takeoffDate <>", value, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateGreaterThan(Date value) {
            addCriterion("takeoffDate >", value, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateGreaterThanOrEqualTo(Date value) {
            addCriterion("takeoffDate >=", value, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateLessThan(Date value) {
            addCriterion("takeoffDate <", value, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateLessThanOrEqualTo(Date value) {
            addCriterion("takeoffDate <=", value, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateIn(List<Date> values) {
            addCriterion("takeoffDate in", values, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateNotIn(List<Date> values) {
            addCriterion("takeoffDate not in", values, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateBetween(Date value1, Date value2) {
            addCriterion("takeoffDate between", value1, value2, "takeoffdate");
            return (Criteria) this;
        }

        public Criteria andTakeoffdateNotBetween(Date value1, Date value2) {
            addCriterion("takeoffDate not between", value1, value2, "takeoffdate");
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