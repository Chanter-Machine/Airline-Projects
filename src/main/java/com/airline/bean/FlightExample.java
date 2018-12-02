package com.airline.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FlightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andOriIsNull() {
            addCriterion("ori is null");
            return (Criteria) this;
        }

        public Criteria andOriIsNotNull() {
            addCriterion("ori is not null");
            return (Criteria) this;
        }

        public Criteria andOriEqualTo(Integer value) {
            addCriterion("ori =", value, "ori");
            return (Criteria) this;
        }

        public Criteria andOriNotEqualTo(Integer value) {
            addCriterion("ori <>", value, "ori");
            return (Criteria) this;
        }

        public Criteria andOriGreaterThan(Integer value) {
            addCriterion("ori >", value, "ori");
            return (Criteria) this;
        }

        public Criteria andOriGreaterThanOrEqualTo(Integer value) {
            addCriterion("ori >=", value, "ori");
            return (Criteria) this;
        }

        public Criteria andOriLessThan(Integer value) {
            addCriterion("ori <", value, "ori");
            return (Criteria) this;
        }

        public Criteria andOriLessThanOrEqualTo(Integer value) {
            addCriterion("ori <=", value, "ori");
            return (Criteria) this;
        }

        public Criteria andOriIn(List<Integer> values) {
            addCriterion("ori in", values, "ori");
            return (Criteria) this;
        }

        public Criteria andOriNotIn(List<Integer> values) {
            addCriterion("ori not in", values, "ori");
            return (Criteria) this;
        }

        public Criteria andOriBetween(Integer value1, Integer value2) {
            addCriterion("ori between", value1, value2, "ori");
            return (Criteria) this;
        }

        public Criteria andOriNotBetween(Integer value1, Integer value2) {
            addCriterion("ori not between", value1, value2, "ori");
            return (Criteria) this;
        }

        public Criteria andDstIsNull() {
            addCriterion("dst is null");
            return (Criteria) this;
        }

        public Criteria andDstIsNotNull() {
            addCriterion("dst is not null");
            return (Criteria) this;
        }

        public Criteria andDstEqualTo(Integer value) {
            addCriterion("dst =", value, "dst");
            return (Criteria) this;
        }

        public Criteria andDstNotEqualTo(Integer value) {
            addCriterion("dst <>", value, "dst");
            return (Criteria) this;
        }

        public Criteria andDstGreaterThan(Integer value) {
            addCriterion("dst >", value, "dst");
            return (Criteria) this;
        }

        public Criteria andDstGreaterThanOrEqualTo(Integer value) {
            addCriterion("dst >=", value, "dst");
            return (Criteria) this;
        }

        public Criteria andDstLessThan(Integer value) {
            addCriterion("dst <", value, "dst");
            return (Criteria) this;
        }

        public Criteria andDstLessThanOrEqualTo(Integer value) {
            addCriterion("dst <=", value, "dst");
            return (Criteria) this;
        }

        public Criteria andDstIn(List<Integer> values) {
            addCriterion("dst in", values, "dst");
            return (Criteria) this;
        }

        public Criteria andDstNotIn(List<Integer> values) {
            addCriterion("dst not in", values, "dst");
            return (Criteria) this;
        }

        public Criteria andDstBetween(Integer value1, Integer value2) {
            addCriterion("dst between", value1, value2, "dst");
            return (Criteria) this;
        }

        public Criteria andDstNotBetween(Integer value1, Integer value2) {
            addCriterion("dst not between", value1, value2, "dst");
            return (Criteria) this;
        }

        public Criteria andPlaneidIsNull() {
            addCriterion("planeId is null");
            return (Criteria) this;
        }

        public Criteria andPlaneidIsNotNull() {
            addCriterion("planeId is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneidEqualTo(Integer value) {
            addCriterion("planeId =", value, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidNotEqualTo(Integer value) {
            addCriterion("planeId <>", value, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidGreaterThan(Integer value) {
            addCriterion("planeId >", value, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planeId >=", value, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidLessThan(Integer value) {
            addCriterion("planeId <", value, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidLessThanOrEqualTo(Integer value) {
            addCriterion("planeId <=", value, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidIn(List<Integer> values) {
            addCriterion("planeId in", values, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidNotIn(List<Integer> values) {
            addCriterion("planeId not in", values, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidBetween(Integer value1, Integer value2) {
            addCriterion("planeId between", value1, value2, "planeid");
            return (Criteria) this;
        }

        public Criteria andPlaneidNotBetween(Integer value1, Integer value2) {
            addCriterion("planeId not between", value1, value2, "planeid");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeIsNull() {
            addCriterion("takeOffTIme is null");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeIsNotNull() {
            addCriterion("takeOffTIme is not null");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeEqualTo(Date value) {
            addCriterionForJDBCTime("takeOffTIme =", value, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("takeOffTIme <>", value, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeGreaterThan(Date value) {
            addCriterionForJDBCTime("takeOffTIme >", value, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("takeOffTIme >=", value, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeLessThan(Date value) {
            addCriterionForJDBCTime("takeOffTIme <", value, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("takeOffTIme <=", value, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeIn(List<Date> values) {
            addCriterionForJDBCTime("takeOffTIme in", values, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("takeOffTIme not in", values, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("takeOffTIme between", value1, value2, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andTakeofftimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("takeOffTIme not between", value1, value2, "takeofftime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("arriveTIme is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("arriveTIme is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(Date value) {
            addCriterionForJDBCTime("arriveTIme =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("arriveTIme <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("arriveTIme >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("arriveTIme >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(Date value) {
            addCriterionForJDBCTime("arriveTIme <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("arriveTIme <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<Date> values) {
            addCriterionForJDBCTime("arriveTIme in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("arriveTIme not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("arriveTIme between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("arriveTIme not between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
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