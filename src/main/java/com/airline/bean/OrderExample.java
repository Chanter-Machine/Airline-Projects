package com.airline.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andPassageridIsNull() {
            addCriterion("passagerId is null");
            return (Criteria) this;
        }

        public Criteria andPassageridIsNotNull() {
            addCriterion("passagerId is not null");
            return (Criteria) this;
        }

        public Criteria andPassageridEqualTo(Integer value) {
            addCriterion("passagerId =", value, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridNotEqualTo(Integer value) {
            addCriterion("passagerId <>", value, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridGreaterThan(Integer value) {
            addCriterion("passagerId >", value, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("passagerId >=", value, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridLessThan(Integer value) {
            addCriterion("passagerId <", value, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridLessThanOrEqualTo(Integer value) {
            addCriterion("passagerId <=", value, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridIn(List<Integer> values) {
            addCriterion("passagerId in", values, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridNotIn(List<Integer> values) {
            addCriterion("passagerId not in", values, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridBetween(Integer value1, Integer value2) {
            addCriterion("passagerId between", value1, value2, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPassageridNotBetween(Integer value1, Integer value2) {
            addCriterion("passagerId not between", value1, value2, "passagerid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNull() {
            addCriterion("paymentId is null");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNotNull() {
            addCriterion("paymentId is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentidEqualTo(Integer value) {
            addCriterion("paymentId =", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotEqualTo(Integer value) {
            addCriterion("paymentId <>", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThan(Integer value) {
            addCriterion("paymentId >", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentId >=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThan(Integer value) {
            addCriterion("paymentId <", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThanOrEqualTo(Integer value) {
            addCriterion("paymentId <=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIn(List<Integer> values) {
            addCriterion("paymentId in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotIn(List<Integer> values) {
            addCriterion("paymentId not in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidBetween(Integer value1, Integer value2) {
            addCriterion("paymentId between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentId not between", value1, value2, "paymentid");
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