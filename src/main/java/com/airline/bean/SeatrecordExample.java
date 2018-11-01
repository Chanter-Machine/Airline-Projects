package com.airline.bean;

import java.util.ArrayList;
import java.util.List;

public class SeatrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatrecordExample() {
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

        public Criteria andSeatrecordidIsNull() {
            addCriterion("seatRecordId is null");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidIsNotNull() {
            addCriterion("seatRecordId is not null");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidEqualTo(Integer value) {
            addCriterion("seatRecordId =", value, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidNotEqualTo(Integer value) {
            addCriterion("seatRecordId <>", value, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidGreaterThan(Integer value) {
            addCriterion("seatRecordId >", value, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatRecordId >=", value, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidLessThan(Integer value) {
            addCriterion("seatRecordId <", value, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("seatRecordId <=", value, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidIn(List<Integer> values) {
            addCriterion("seatRecordId in", values, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidNotIn(List<Integer> values) {
            addCriterion("seatRecordId not in", values, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidBetween(Integer value1, Integer value2) {
            addCriterion("seatRecordId between", value1, value2, "seatrecordid");
            return (Criteria) this;
        }

        public Criteria andSeatrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("seatRecordId not between", value1, value2, "seatrecordid");
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

        public Criteria andFlightidEqualTo(String value) {
            addCriterion("flightId =", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotEqualTo(String value) {
            addCriterion("flightId <>", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThan(String value) {
            addCriterion("flightId >", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidGreaterThanOrEqualTo(String value) {
            addCriterion("flightId >=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThan(String value) {
            addCriterion("flightId <", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLessThanOrEqualTo(String value) {
            addCriterion("flightId <=", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidLike(String value) {
            addCriterion("flightId like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotLike(String value) {
            addCriterion("flightId not like", value, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidIn(List<String> values) {
            addCriterion("flightId in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotIn(List<String> values) {
            addCriterion("flightId not in", values, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidBetween(String value1, String value2) {
            addCriterion("flightId between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andFlightidNotBetween(String value1, String value2) {
            addCriterion("flightId not between", value1, value2, "flightid");
            return (Criteria) this;
        }

        public Criteria andAvailfirstIsNull() {
            addCriterion("availFirst is null");
            return (Criteria) this;
        }

        public Criteria andAvailfirstIsNotNull() {
            addCriterion("availFirst is not null");
            return (Criteria) this;
        }

        public Criteria andAvailfirstEqualTo(Integer value) {
            addCriterion("availFirst =", value, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstNotEqualTo(Integer value) {
            addCriterion("availFirst <>", value, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstGreaterThan(Integer value) {
            addCriterion("availFirst >", value, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("availFirst >=", value, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstLessThan(Integer value) {
            addCriterion("availFirst <", value, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstLessThanOrEqualTo(Integer value) {
            addCriterion("availFirst <=", value, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstIn(List<Integer> values) {
            addCriterion("availFirst in", values, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstNotIn(List<Integer> values) {
            addCriterion("availFirst not in", values, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstBetween(Integer value1, Integer value2) {
            addCriterion("availFirst between", value1, value2, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailfirstNotBetween(Integer value1, Integer value2) {
            addCriterion("availFirst not between", value1, value2, "availfirst");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessIsNull() {
            addCriterion("availBusiness is null");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessIsNotNull() {
            addCriterion("availBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessEqualTo(Integer value) {
            addCriterion("availBusiness =", value, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessNotEqualTo(Integer value) {
            addCriterion("availBusiness <>", value, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessGreaterThan(Integer value) {
            addCriterion("availBusiness >", value, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("availBusiness >=", value, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessLessThan(Integer value) {
            addCriterion("availBusiness <", value, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessLessThanOrEqualTo(Integer value) {
            addCriterion("availBusiness <=", value, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessIn(List<Integer> values) {
            addCriterion("availBusiness in", values, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessNotIn(List<Integer> values) {
            addCriterion("availBusiness not in", values, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessBetween(Integer value1, Integer value2) {
            addCriterion("availBusiness between", value1, value2, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvailbusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("availBusiness not between", value1, value2, "availbusiness");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylIsNull() {
            addCriterion("availEconomyl is null");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylIsNotNull() {
            addCriterion("availEconomyl is not null");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylEqualTo(Integer value) {
            addCriterion("availEconomyl =", value, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylNotEqualTo(Integer value) {
            addCriterion("availEconomyl <>", value, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylGreaterThan(Integer value) {
            addCriterion("availEconomyl >", value, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylGreaterThanOrEqualTo(Integer value) {
            addCriterion("availEconomyl >=", value, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylLessThan(Integer value) {
            addCriterion("availEconomyl <", value, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylLessThanOrEqualTo(Integer value) {
            addCriterion("availEconomyl <=", value, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylIn(List<Integer> values) {
            addCriterion("availEconomyl in", values, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylNotIn(List<Integer> values) {
            addCriterion("availEconomyl not in", values, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylBetween(Integer value1, Integer value2) {
            addCriterion("availEconomyl between", value1, value2, "availeconomyl");
            return (Criteria) this;
        }

        public Criteria andAvaileconomylNotBetween(Integer value1, Integer value2) {
            addCriterion("availEconomyl not between", value1, value2, "availeconomyl");
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