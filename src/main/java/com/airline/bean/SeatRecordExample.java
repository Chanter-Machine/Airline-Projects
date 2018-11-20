package com.airline.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class SeatRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andBookedfirstIsNull() {
            addCriterion("bookedFirst is null");
            return (Criteria) this;
        }

        public Criteria andBookedfirstIsNotNull() {
            addCriterion("bookedFirst is not null");
            return (Criteria) this;
        }

        public Criteria andBookedfirstEqualTo(Integer value) {
            addCriterion("bookedFirst =", value, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstNotEqualTo(Integer value) {
            addCriterion("bookedFirst <>", value, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstGreaterThan(Integer value) {
            addCriterion("bookedFirst >", value, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookedFirst >=", value, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstLessThan(Integer value) {
            addCriterion("bookedFirst <", value, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstLessThanOrEqualTo(Integer value) {
            addCriterion("bookedFirst <=", value, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstIn(List<Integer> values) {
            addCriterion("bookedFirst in", values, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstNotIn(List<Integer> values) {
            addCriterion("bookedFirst not in", values, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstBetween(Integer value1, Integer value2) {
            addCriterion("bookedFirst between", value1, value2, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedfirstNotBetween(Integer value1, Integer value2) {
            addCriterion("bookedFirst not between", value1, value2, "bookedfirst");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessIsNull() {
            addCriterion("bookedBusiness is null");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessIsNotNull() {
            addCriterion("bookedBusiness is not null");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessEqualTo(Integer value) {
            addCriterion("bookedBusiness =", value, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessNotEqualTo(Integer value) {
            addCriterion("bookedBusiness <>", value, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessGreaterThan(Integer value) {
            addCriterion("bookedBusiness >", value, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookedBusiness >=", value, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessLessThan(Integer value) {
            addCriterion("bookedBusiness <", value, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessLessThanOrEqualTo(Integer value) {
            addCriterion("bookedBusiness <=", value, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessIn(List<Integer> values) {
            addCriterion("bookedBusiness in", values, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessNotIn(List<Integer> values) {
            addCriterion("bookedBusiness not in", values, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessBetween(Integer value1, Integer value2) {
            addCriterion("bookedBusiness between", value1, value2, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedbusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("bookedBusiness not between", value1, value2, "bookedbusiness");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicIsNull() {
            addCriterion("bookedEconomic is null");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicIsNotNull() {
            addCriterion("bookedEconomic is not null");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicEqualTo(Integer value) {
            addCriterion("bookedEconomic =", value, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicNotEqualTo(Integer value) {
            addCriterion("bookedEconomic <>", value, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicGreaterThan(Integer value) {
            addCriterion("bookedEconomic >", value, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookedEconomic >=", value, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicLessThan(Integer value) {
            addCriterion("bookedEconomic <", value, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicLessThanOrEqualTo(Integer value) {
            addCriterion("bookedEconomic <=", value, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicIn(List<Integer> values) {
            addCriterion("bookedEconomic in", values, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicNotIn(List<Integer> values) {
            addCriterion("bookedEconomic not in", values, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicBetween(Integer value1, Integer value2) {
            addCriterion("bookedEconomic between", value1, value2, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andBookedeconomicNotBetween(Integer value1, Integer value2) {
            addCriterion("bookedEconomic not between", value1, value2, "bookedeconomic");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
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