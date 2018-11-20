package com.airline.bean;

import java.util.ArrayList;
import java.util.List;

public class PlaneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaneExample() {
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

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassIsNull() {
            addCriterion("numOfFirstClass is null");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassIsNotNull() {
            addCriterion("numOfFirstClass is not null");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassEqualTo(Integer value) {
            addCriterion("numOfFirstClass =", value, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassNotEqualTo(Integer value) {
            addCriterion("numOfFirstClass <>", value, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassGreaterThan(Integer value) {
            addCriterion("numOfFirstClass >", value, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfFirstClass >=", value, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassLessThan(Integer value) {
            addCriterion("numOfFirstClass <", value, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassLessThanOrEqualTo(Integer value) {
            addCriterion("numOfFirstClass <=", value, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassIn(List<Integer> values) {
            addCriterion("numOfFirstClass in", values, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassNotIn(List<Integer> values) {
            addCriterion("numOfFirstClass not in", values, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassBetween(Integer value1, Integer value2) {
            addCriterion("numOfFirstClass between", value1, value2, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumoffirstclassNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfFirstClass not between", value1, value2, "numoffirstclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassIsNull() {
            addCriterion("numOfBusinessClass is null");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassIsNotNull() {
            addCriterion("numOfBusinessClass is not null");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassEqualTo(Integer value) {
            addCriterion("numOfBusinessClass =", value, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassNotEqualTo(Integer value) {
            addCriterion("numOfBusinessClass <>", value, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassGreaterThan(Integer value) {
            addCriterion("numOfBusinessClass >", value, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfBusinessClass >=", value, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassLessThan(Integer value) {
            addCriterion("numOfBusinessClass <", value, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassLessThanOrEqualTo(Integer value) {
            addCriterion("numOfBusinessClass <=", value, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassIn(List<Integer> values) {
            addCriterion("numOfBusinessClass in", values, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassNotIn(List<Integer> values) {
            addCriterion("numOfBusinessClass not in", values, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassBetween(Integer value1, Integer value2) {
            addCriterion("numOfBusinessClass between", value1, value2, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofbusinessclassNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfBusinessClass not between", value1, value2, "numofbusinessclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassIsNull() {
            addCriterion("numOfEconomyClass is null");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassIsNotNull() {
            addCriterion("numOfEconomyClass is not null");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassEqualTo(Integer value) {
            addCriterion("numOfEconomyClass =", value, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassNotEqualTo(Integer value) {
            addCriterion("numOfEconomyClass <>", value, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassGreaterThan(Integer value) {
            addCriterion("numOfEconomyClass >", value, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("numOfEconomyClass >=", value, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassLessThan(Integer value) {
            addCriterion("numOfEconomyClass <", value, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassLessThanOrEqualTo(Integer value) {
            addCriterion("numOfEconomyClass <=", value, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassIn(List<Integer> values) {
            addCriterion("numOfEconomyClass in", values, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassNotIn(List<Integer> values) {
            addCriterion("numOfEconomyClass not in", values, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassBetween(Integer value1, Integer value2) {
            addCriterion("numOfEconomyClass between", value1, value2, "numofeconomyclass");
            return (Criteria) this;
        }

        public Criteria andNumofeconomyclassNotBetween(Integer value1, Integer value2) {
            addCriterion("numOfEconomyClass not between", value1, value2, "numofeconomyclass");
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