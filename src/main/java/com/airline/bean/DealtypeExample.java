package com.airline.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DealtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealtypeExample() {
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

        public Criteria andTypeidIsNull() {
            addCriterion("typeID is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeID =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeID <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeID >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeID >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeID <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeID <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeID in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeID not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeID between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeID not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMinageIsNull() {
            addCriterion("minAge is null");
            return (Criteria) this;
        }

        public Criteria andMinageIsNotNull() {
            addCriterion("minAge is not null");
            return (Criteria) this;
        }

        public Criteria andMinageEqualTo(Integer value) {
            addCriterion("minAge =", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotEqualTo(Integer value) {
            addCriterion("minAge <>", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageGreaterThan(Integer value) {
            addCriterion("minAge >", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageGreaterThanOrEqualTo(Integer value) {
            addCriterion("minAge >=", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageLessThan(Integer value) {
            addCriterion("minAge <", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageLessThanOrEqualTo(Integer value) {
            addCriterion("minAge <=", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageIn(List<Integer> values) {
            addCriterion("minAge in", values, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotIn(List<Integer> values) {
            addCriterion("minAge not in", values, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageBetween(Integer value1, Integer value2) {
            addCriterion("minAge between", value1, value2, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotBetween(Integer value1, Integer value2) {
            addCriterion("minAge not between", value1, value2, "minage");
            return (Criteria) this;
        }

        public Criteria andMaxageIsNull() {
            addCriterion("maxAge is null");
            return (Criteria) this;
        }

        public Criteria andMaxageIsNotNull() {
            addCriterion("maxAge is not null");
            return (Criteria) this;
        }

        public Criteria andMaxageEqualTo(Integer value) {
            addCriterion("maxAge =", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotEqualTo(Integer value) {
            addCriterion("maxAge <>", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageGreaterThan(Integer value) {
            addCriterion("maxAge >", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxAge >=", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageLessThan(Integer value) {
            addCriterion("maxAge <", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageLessThanOrEqualTo(Integer value) {
            addCriterion("maxAge <=", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageIn(List<Integer> values) {
            addCriterion("maxAge in", values, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotIn(List<Integer> values) {
            addCriterion("maxAge not in", values, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageBetween(Integer value1, Integer value2) {
            addCriterion("maxAge between", value1, value2, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotBetween(Integer value1, Integer value2) {
            addCriterion("maxAge not between", value1, value2, "maxage");
            return (Criteria) this;
        }

        public Criteria andMindateIsNull() {
            addCriterion("minDate is null");
            return (Criteria) this;
        }

        public Criteria andMindateIsNotNull() {
            addCriterion("minDate is not null");
            return (Criteria) this;
        }

        public Criteria andMindateEqualTo(Date value) {
            addCriterionForJDBCDate("minDate =", value, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("minDate <>", value, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateGreaterThan(Date value) {
            addCriterionForJDBCDate("minDate >", value, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("minDate >=", value, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateLessThan(Date value) {
            addCriterionForJDBCDate("minDate <", value, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("minDate <=", value, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateIn(List<Date> values) {
            addCriterionForJDBCDate("minDate in", values, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("minDate not in", values, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("minDate between", value1, value2, "mindate");
            return (Criteria) this;
        }

        public Criteria andMindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("minDate not between", value1, value2, "mindate");
            return (Criteria) this;
        }

        public Criteria andMaxdateIsNull() {
            addCriterion("maxDate is null");
            return (Criteria) this;
        }

        public Criteria andMaxdateIsNotNull() {
            addCriterion("maxDate is not null");
            return (Criteria) this;
        }

        public Criteria andMaxdateEqualTo(Date value) {
            addCriterionForJDBCDate("maxDate =", value, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("maxDate <>", value, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateGreaterThan(Date value) {
            addCriterionForJDBCDate("maxDate >", value, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maxDate >=", value, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateLessThan(Date value) {
            addCriterionForJDBCDate("maxDate <", value, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maxDate <=", value, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateIn(List<Date> values) {
            addCriterionForJDBCDate("maxDate in", values, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("maxDate not in", values, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maxDate between", value1, value2, "maxdate");
            return (Criteria) this;
        }

        public Criteria andMaxdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maxDate not between", value1, value2, "maxdate");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeIsNull() {
            addCriterion("rangeTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeIsNotNull() {
            addCriterion("rangeTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeEqualTo(Integer value) {
            addCriterion("rangeTypeCode =", value, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeNotEqualTo(Integer value) {
            addCriterion("rangeTypeCode <>", value, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeGreaterThan(Integer value) {
            addCriterion("rangeTypeCode >", value, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rangeTypeCode >=", value, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeLessThan(Integer value) {
            addCriterion("rangeTypeCode <", value, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeLessThanOrEqualTo(Integer value) {
            addCriterion("rangeTypeCode <=", value, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeIn(List<Integer> values) {
            addCriterion("rangeTypeCode in", values, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeNotIn(List<Integer> values) {
            addCriterion("rangeTypeCode not in", values, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeBetween(Integer value1, Integer value2) {
            addCriterion("rangeTypeCode between", value1, value2, "rangetypecode");
            return (Criteria) this;
        }

        public Criteria andRangetypecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("rangeTypeCode not between", value1, value2, "rangetypecode");
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