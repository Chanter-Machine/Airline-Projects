package com.airline.bean;

import java.util.ArrayList;
import java.util.List;

public class PaymentTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentTypeExample() {
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

        public Criteria andPaymenttypeidIsNull() {
            addCriterion("paymentTypeId is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidIsNotNull() {
            addCriterion("paymentTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidEqualTo(Integer value) {
            addCriterion("paymentTypeId =", value, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidNotEqualTo(Integer value) {
            addCriterion("paymentTypeId <>", value, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidGreaterThan(Integer value) {
            addCriterion("paymentTypeId >", value, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentTypeId >=", value, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidLessThan(Integer value) {
            addCriterion("paymentTypeId <", value, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("paymentTypeId <=", value, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidIn(List<Integer> values) {
            addCriterion("paymentTypeId in", values, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidNotIn(List<Integer> values) {
            addCriterion("paymentTypeId not in", values, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidBetween(Integer value1, Integer value2) {
            addCriterion("paymentTypeId between", value1, value2, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentTypeId not between", value1, value2, "paymenttypeid");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameIsNull() {
            addCriterion("paymentTypeName is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameIsNotNull() {
            addCriterion("paymentTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameEqualTo(String value) {
            addCriterion("paymentTypeName =", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameNotEqualTo(String value) {
            addCriterion("paymentTypeName <>", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameGreaterThan(String value) {
            addCriterion("paymentTypeName >", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameGreaterThanOrEqualTo(String value) {
            addCriterion("paymentTypeName >=", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameLessThan(String value) {
            addCriterion("paymentTypeName <", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameLessThanOrEqualTo(String value) {
            addCriterion("paymentTypeName <=", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameLike(String value) {
            addCriterion("paymentTypeName like", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameNotLike(String value) {
            addCriterion("paymentTypeName not like", value, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameIn(List<String> values) {
            addCriterion("paymentTypeName in", values, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameNotIn(List<String> values) {
            addCriterion("paymentTypeName not in", values, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameBetween(String value1, String value2) {
            addCriterion("paymentTypeName between", value1, value2, "paymenttypename");
            return (Criteria) this;
        }

        public Criteria andPaymenttypenameNotBetween(String value1, String value2) {
            addCriterion("paymentTypeName not between", value1, value2, "paymenttypename");
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