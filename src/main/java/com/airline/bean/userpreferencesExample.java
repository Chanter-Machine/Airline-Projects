package com.airline.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class userpreferencesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public userpreferencesExample() {
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

        public Criteria andPreferenceidIsNull() {
            addCriterion("preferenceID is null");
            return (Criteria) this;
        }

        public Criteria andPreferenceidIsNotNull() {
            addCriterion("preferenceID is not null");
            return (Criteria) this;
        }

        public Criteria andPreferenceidEqualTo(Integer value) {
            addCriterion("preferenceID =", value, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidNotEqualTo(Integer value) {
            addCriterion("preferenceID <>", value, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidGreaterThan(Integer value) {
            addCriterion("preferenceID >", value, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("preferenceID >=", value, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidLessThan(Integer value) {
            addCriterion("preferenceID <", value, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidLessThanOrEqualTo(Integer value) {
            addCriterion("preferenceID <=", value, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidIn(List<Integer> values) {
            addCriterion("preferenceID in", values, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidNotIn(List<Integer> values) {
            addCriterion("preferenceID not in", values, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidBetween(Integer value1, Integer value2) {
            addCriterion("preferenceID between", value1, value2, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andPreferenceidNotBetween(Integer value1, Integer value2) {
            addCriterion("preferenceID not between", value1, value2, "preferenceid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSeatingclassIsNull() {
            addCriterion("seatingClass is null");
            return (Criteria) this;
        }

        public Criteria andSeatingclassIsNotNull() {
            addCriterion("seatingClass is not null");
            return (Criteria) this;
        }

        public Criteria andSeatingclassEqualTo(String value) {
            addCriterion("seatingClass =", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassNotEqualTo(String value) {
            addCriterion("seatingClass <>", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassGreaterThan(String value) {
            addCriterion("seatingClass >", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassGreaterThanOrEqualTo(String value) {
            addCriterion("seatingClass >=", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassLessThan(String value) {
            addCriterion("seatingClass <", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassLessThanOrEqualTo(String value) {
            addCriterion("seatingClass <=", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassLike(String value) {
            addCriterion("seatingClass like", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassNotLike(String value) {
            addCriterion("seatingClass not like", value, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassIn(List<String> values) {
            addCriterion("seatingClass in", values, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassNotIn(List<String> values) {
            addCriterion("seatingClass not in", values, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassBetween(String value1, String value2) {
            addCriterion("seatingClass between", value1, value2, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatingclassNotBetween(String value1, String value2) {
            addCriterion("seatingClass not between", value1, value2, "seatingclass");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceIsNull() {
            addCriterion("seatPreference is null");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceIsNotNull() {
            addCriterion("seatPreference is not null");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceEqualTo(String value) {
            addCriterion("seatPreference =", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceNotEqualTo(String value) {
            addCriterion("seatPreference <>", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceGreaterThan(String value) {
            addCriterion("seatPreference >", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceGreaterThanOrEqualTo(String value) {
            addCriterion("seatPreference >=", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceLessThan(String value) {
            addCriterion("seatPreference <", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceLessThanOrEqualTo(String value) {
            addCriterion("seatPreference <=", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceLike(String value) {
            addCriterion("seatPreference like", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceNotLike(String value) {
            addCriterion("seatPreference not like", value, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceIn(List<String> values) {
            addCriterion("seatPreference in", values, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceNotIn(List<String> values) {
            addCriterion("seatPreference not in", values, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceBetween(String value1, String value2) {
            addCriterion("seatPreference between", value1, value2, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andSeatpreferenceNotBetween(String value1, String value2) {
            addCriterion("seatPreference not between", value1, value2, "seatpreference");
            return (Criteria) this;
        }

        public Criteria andWifiavailableIsNull() {
            addCriterion("wifiAvailable is null");
            return (Criteria) this;
        }

        public Criteria andWifiavailableIsNotNull() {
            addCriterion("wifiAvailable is not null");
            return (Criteria) this;
        }

        public Criteria andWifiavailableEqualTo(Integer value) {
            addCriterion("wifiAvailable =", value, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableNotEqualTo(Integer value) {
            addCriterion("wifiAvailable <>", value, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableGreaterThan(Integer value) {
            addCriterion("wifiAvailable >", value, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("wifiAvailable >=", value, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableLessThan(Integer value) {
            addCriterion("wifiAvailable <", value, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableLessThanOrEqualTo(Integer value) {
            addCriterion("wifiAvailable <=", value, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableIn(List<Integer> values) {
            addCriterion("wifiAvailable in", values, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableNotIn(List<Integer> values) {
            addCriterion("wifiAvailable not in", values, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableBetween(Integer value1, Integer value2) {
            addCriterion("wifiAvailable between", value1, value2, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andWifiavailableNotBetween(Integer value1, Integer value2) {
            addCriterion("wifiAvailable not between", value1, value2, "wifiavailable");
            return (Criteria) this;
        }

        public Criteria andAirportpickupIsNull() {
            addCriterion("airportPickup is null");
            return (Criteria) this;
        }

        public Criteria andAirportpickupIsNotNull() {
            addCriterion("airportPickup is not null");
            return (Criteria) this;
        }

        public Criteria andAirportpickupEqualTo(Integer value) {
            addCriterion("airportPickup =", value, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupNotEqualTo(Integer value) {
            addCriterion("airportPickup <>", value, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupGreaterThan(Integer value) {
            addCriterion("airportPickup >", value, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupGreaterThanOrEqualTo(Integer value) {
            addCriterion("airportPickup >=", value, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupLessThan(Integer value) {
            addCriterion("airportPickup <", value, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupLessThanOrEqualTo(Integer value) {
            addCriterion("airportPickup <=", value, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupIn(List<Integer> values) {
            addCriterion("airportPickup in", values, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupNotIn(List<Integer> values) {
            addCriterion("airportPickup not in", values, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupBetween(Integer value1, Integer value2) {
            addCriterion("airportPickup between", value1, value2, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAirportpickupNotBetween(Integer value1, Integer value2) {
            addCriterion("airportPickup not between", value1, value2, "airportpickup");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsIsNull() {
            addCriterion("accomodationSuggestions is null");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsIsNotNull() {
            addCriterion("accomodationSuggestions is not null");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsEqualTo(Integer value) {
            addCriterion("accomodationSuggestions =", value, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsNotEqualTo(Integer value) {
            addCriterion("accomodationSuggestions <>", value, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsGreaterThan(Integer value) {
            addCriterion("accomodationSuggestions >", value, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("accomodationSuggestions >=", value, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsLessThan(Integer value) {
            addCriterion("accomodationSuggestions <", value, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsLessThanOrEqualTo(Integer value) {
            addCriterion("accomodationSuggestions <=", value, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsIn(List<Integer> values) {
            addCriterion("accomodationSuggestions in", values, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsNotIn(List<Integer> values) {
            addCriterion("accomodationSuggestions not in", values, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsBetween(Integer value1, Integer value2) {
            addCriterion("accomodationSuggestions between", value1, value2, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andAccomodationsuggestionsNotBetween(Integer value1, Integer value2) {
            addCriterion("accomodationSuggestions not between", value1, value2, "accomodationsuggestions");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitIsNull() {
            addCriterion("budgetLimit is null");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitIsNotNull() {
            addCriterion("budgetLimit is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitEqualTo(BigDecimal value) {
            addCriterion("budgetLimit =", value, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitNotEqualTo(BigDecimal value) {
            addCriterion("budgetLimit <>", value, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitGreaterThan(BigDecimal value) {
            addCriterion("budgetLimit >", value, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("budgetLimit >=", value, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitLessThan(BigDecimal value) {
            addCriterion("budgetLimit <", value, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("budgetLimit <=", value, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitIn(List<BigDecimal> values) {
            addCriterion("budgetLimit in", values, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitNotIn(List<BigDecimal> values) {
            addCriterion("budgetLimit not in", values, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budgetLimit between", value1, value2, "budgetlimit");
            return (Criteria) this;
        }

        public Criteria andBudgetlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("budgetLimit not between", value1, value2, "budgetlimit");
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