package com.airline.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserActivationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserActivationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andActivationcodeIsNull() {
            addCriterion("activationcode is null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeIsNotNull() {
            addCriterion("activationcode is not null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeEqualTo(Integer value) {
            addCriterion("activationcode =", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeNotEqualTo(Integer value) {
            addCriterion("activationcode <>", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeGreaterThan(Integer value) {
            addCriterion("activationcode >", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activationcode >=", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeLessThan(Integer value) {
            addCriterion("activationcode <", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeLessThanOrEqualTo(Integer value) {
            addCriterion("activationcode <=", value, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeIn(List<Integer> values) {
            addCriterion("activationcode in", values, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeNotIn(List<Integer> values) {
            addCriterion("activationcode not in", values, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeBetween(Integer value1, Integer value2) {
            addCriterion("activationcode between", value1, value2, "activationcode");
            return (Criteria) this;
        }

        public Criteria andActivationcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("activationcode not between", value1, value2, "activationcode");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(Boolean value) {
            addCriterion("used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(Boolean value) {
            addCriterion("used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(Boolean value) {
            addCriterion("used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(Boolean value) {
            addCriterion("used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(Boolean value) {
            addCriterion("used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<Boolean> values) {
            addCriterion("used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<Boolean> values) {
            addCriterion("used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(Boolean value1, Boolean value2) {
            addCriterion("used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("used not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedIsNull() {
            addCriterion("timegenerated is null");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedIsNotNull() {
            addCriterion("timegenerated is not null");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedEqualTo(Date value) {
            addCriterion("timegenerated =", value, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedNotEqualTo(Date value) {
            addCriterion("timegenerated <>", value, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedGreaterThan(Date value) {
            addCriterion("timegenerated >", value, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedGreaterThanOrEqualTo(Date value) {
            addCriterion("timegenerated >=", value, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedLessThan(Date value) {
            addCriterion("timegenerated <", value, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedLessThanOrEqualTo(Date value) {
            addCriterion("timegenerated <=", value, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedIn(List<Date> values) {
            addCriterion("timegenerated in", values, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedNotIn(List<Date> values) {
            addCriterion("timegenerated not in", values, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedBetween(Date value1, Date value2) {
            addCriterion("timegenerated between", value1, value2, "timegenerated");
            return (Criteria) this;
        }

        public Criteria andTimegeneratedNotBetween(Date value1, Date value2) {
            addCriterion("timegenerated not between", value1, value2, "timegenerated");
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