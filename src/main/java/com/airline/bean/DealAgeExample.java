package com.airline.bean;

import java.util.ArrayList;
import java.util.List;

public class DealAgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealAgeExample() {
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

        public Criteria andRangeidIsNull() {
            addCriterion("rangeID is null");
            return (Criteria) this;
        }

        public Criteria andRangeidIsNotNull() {
            addCriterion("rangeID is not null");
            return (Criteria) this;
        }

        public Criteria andRangeidEqualTo(Integer value) {
            addCriterion("rangeID =", value, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidNotEqualTo(Integer value) {
            addCriterion("rangeID <>", value, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidGreaterThan(Integer value) {
            addCriterion("rangeID >", value, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rangeID >=", value, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidLessThan(Integer value) {
            addCriterion("rangeID <", value, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidLessThanOrEqualTo(Integer value) {
            addCriterion("rangeID <=", value, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidIn(List<Integer> values) {
            addCriterion("rangeID in", values, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidNotIn(List<Integer> values) {
            addCriterion("rangeID not in", values, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidBetween(Integer value1, Integer value2) {
            addCriterion("rangeID between", value1, value2, "rangeid");
            return (Criteria) this;
        }

        public Criteria andRangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("rangeID not between", value1, value2, "rangeid");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeIsNull() {
            addCriterion("\"minimum age\" is null");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeIsNotNull() {
            addCriterion("\"minimum age\" is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeEqualTo(Integer value) {
            addCriterion("\"minimum age\" =", value, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeNotEqualTo(Integer value) {
            addCriterion("\"minimum age\" <>", value, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeGreaterThan(Integer value) {
            addCriterion("\"minimum age\" >", value, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"minimum age\" >=", value, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeLessThan(Integer value) {
            addCriterion("\"minimum age\" <", value, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeLessThanOrEqualTo(Integer value) {
            addCriterion("\"minimum age\" <=", value, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeIn(List<Integer> values) {
            addCriterion("\"minimum age\" in", values, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeNotIn(List<Integer> values) {
            addCriterion("\"minimum age\" not in", values, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeBetween(Integer value1, Integer value2) {
            addCriterion("\"minimum age\" between", value1, value2, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMinimumAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"minimum age\" not between", value1, value2, "minimumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeIsNull() {
            addCriterion("\"maximum age\" is null");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeIsNotNull() {
            addCriterion("\"maximum age\" is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeEqualTo(Integer value) {
            addCriterion("\"maximum age\" =", value, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeNotEqualTo(Integer value) {
            addCriterion("\"maximum age\" <>", value, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeGreaterThan(Integer value) {
            addCriterion("\"maximum age\" >", value, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"maximum age\" >=", value, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeLessThan(Integer value) {
            addCriterion("\"maximum age\" <", value, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeLessThanOrEqualTo(Integer value) {
            addCriterion("\"maximum age\" <=", value, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeIn(List<Integer> values) {
            addCriterion("\"maximum age\" in", values, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeNotIn(List<Integer> values) {
            addCriterion("\"maximum age\" not in", values, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeBetween(Integer value1, Integer value2) {
            addCriterion("\"maximum age\" between", value1, value2, "maximumAge");
            return (Criteria) this;
        }

        public Criteria andMaximumAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"maximum age\" not between", value1, value2, "maximumAge");
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