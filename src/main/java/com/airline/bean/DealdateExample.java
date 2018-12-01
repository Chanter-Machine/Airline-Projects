package com.airline.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DealdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealdateExample() {
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

        public Criteria andMinimumDateIsNull() {
            addCriterion("\"minimum date\" is null");
            return (Criteria) this;
        }

        public Criteria andMinimumDateIsNotNull() {
            addCriterion("\"minimum date\" is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumDateEqualTo(Date value) {
            addCriterionForJDBCDate("\"minimum date\" =", value, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("\"minimum date\" <>", value, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateGreaterThan(Date value) {
            addCriterionForJDBCDate("\"minimum date\" >", value, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"minimum date\" >=", value, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateLessThan(Date value) {
            addCriterionForJDBCDate("\"minimum date\" <", value, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"minimum date\" <=", value, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateIn(List<Date> values) {
            addCriterionForJDBCDate("\"minimum date\" in", values, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("\"minimum date\" not in", values, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"minimum date\" between", value1, value2, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMinimumDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"minimum date\" not between", value1, value2, "minimumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateIsNull() {
            addCriterion("\"maximum date\" is null");
            return (Criteria) this;
        }

        public Criteria andMaximumDateIsNotNull() {
            addCriterion("\"maximum date\" is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumDateEqualTo(Date value) {
            addCriterionForJDBCDate("\"maximum date\" =", value, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("\"maximum date\" <>", value, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateGreaterThan(Date value) {
            addCriterionForJDBCDate("\"maximum date\" >", value, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"maximum date\" >=", value, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateLessThan(Date value) {
            addCriterionForJDBCDate("\"maximum date\" <", value, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"maximum date\" <=", value, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateIn(List<Date> values) {
            addCriterionForJDBCDate("\"maximum date\" in", values, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("\"maximum date\" not in", values, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"maximum date\" between", value1, value2, "maximumDate");
            return (Criteria) this;
        }

        public Criteria andMaximumDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"maximum date\" not between", value1, value2, "maximumDate");
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