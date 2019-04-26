package com.airline.bean;

import java.util.ArrayList;
import java.util.List;

public class PlacesOfInterestSuggestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlacesOfInterestSuggestionExample() {
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

        public Criteria andPlacesofinterestsuggestionidIsNull() {
            addCriterion("placesofinterestsuggestionid is null");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidIsNotNull() {
            addCriterion("placesofinterestsuggestionid is not null");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidEqualTo(Integer value) {
            addCriterion("placesofinterestsuggestionid =", value, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidNotEqualTo(Integer value) {
            addCriterion("placesofinterestsuggestionid <>", value, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidGreaterThan(Integer value) {
            addCriterion("placesofinterestsuggestionid >", value, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("placesofinterestsuggestionid >=", value, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidLessThan(Integer value) {
            addCriterion("placesofinterestsuggestionid <", value, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidLessThanOrEqualTo(Integer value) {
            addCriterion("placesofinterestsuggestionid <=", value, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidIn(List<Integer> values) {
            addCriterion("placesofinterestsuggestionid in", values, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidNotIn(List<Integer> values) {
            addCriterion("placesofinterestsuggestionid not in", values, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidBetween(Integer value1, Integer value2) {
            addCriterion("placesofinterestsuggestionid between", value1, value2, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("placesofinterestsuggestionid not between", value1, value2, "placesofinterestsuggestionid");
            return (Criteria) this;
        }

        public Criteria andContinentidIsNull() {
            addCriterion("continentid is null");
            return (Criteria) this;
        }

        public Criteria andContinentidIsNotNull() {
            addCriterion("continentid is not null");
            return (Criteria) this;
        }

        public Criteria andContinentidEqualTo(Integer value) {
            addCriterion("continentid =", value, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidNotEqualTo(Integer value) {
            addCriterion("continentid <>", value, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidGreaterThan(Integer value) {
            addCriterion("continentid >", value, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("continentid >=", value, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidLessThan(Integer value) {
            addCriterion("continentid <", value, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidLessThanOrEqualTo(Integer value) {
            addCriterion("continentid <=", value, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidIn(List<Integer> values) {
            addCriterion("continentid in", values, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidNotIn(List<Integer> values) {
            addCriterion("continentid not in", values, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidBetween(Integer value1, Integer value2) {
            addCriterion("continentid between", value1, value2, "continentid");
            return (Criteria) this;
        }

        public Criteria andContinentidNotBetween(Integer value1, Integer value2) {
            addCriterion("continentid not between", value1, value2, "continentid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidIsNull() {
            addCriterion("placesofinterestcategoryid is null");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidIsNotNull() {
            addCriterion("placesofinterestcategoryid is not null");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidEqualTo(Integer value) {
            addCriterion("placesofinterestcategoryid =", value, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidNotEqualTo(Integer value) {
            addCriterion("placesofinterestcategoryid <>", value, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidGreaterThan(Integer value) {
            addCriterion("placesofinterestcategoryid >", value, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("placesofinterestcategoryid >=", value, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidLessThan(Integer value) {
            addCriterion("placesofinterestcategoryid <", value, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("placesofinterestcategoryid <=", value, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidIn(List<Integer> values) {
            addCriterion("placesofinterestcategoryid in", values, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidNotIn(List<Integer> values) {
            addCriterion("placesofinterestcategoryid not in", values, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("placesofinterestcategoryid between", value1, value2, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("placesofinterestcategoryid not between", value1, value2, "placesofinterestcategoryid");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameIsNull() {
            addCriterion("placesofinterestsuggestionname is null");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameIsNotNull() {
            addCriterion("placesofinterestsuggestionname is not null");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameEqualTo(String value) {
            addCriterion("placesofinterestsuggestionname =", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameNotEqualTo(String value) {
            addCriterion("placesofinterestsuggestionname <>", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameGreaterThan(String value) {
            addCriterion("placesofinterestsuggestionname >", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameGreaterThanOrEqualTo(String value) {
            addCriterion("placesofinterestsuggestionname >=", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameLessThan(String value) {
            addCriterion("placesofinterestsuggestionname <", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameLessThanOrEqualTo(String value) {
            addCriterion("placesofinterestsuggestionname <=", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameLike(String value) {
            addCriterion("placesofinterestsuggestionname like", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameNotLike(String value) {
            addCriterion("placesofinterestsuggestionname not like", value, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameIn(List<String> values) {
            addCriterion("placesofinterestsuggestionname in", values, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameNotIn(List<String> values) {
            addCriterion("placesofinterestsuggestionname not in", values, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameBetween(String value1, String value2) {
            addCriterion("placesofinterestsuggestionname between", value1, value2, "placesofinterestsuggestionname");
            return (Criteria) this;
        }

        public Criteria andPlacesofinterestsuggestionnameNotBetween(String value1, String value2) {
            addCriterion("placesofinterestsuggestionname not between", value1, value2, "placesofinterestsuggestionname");
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