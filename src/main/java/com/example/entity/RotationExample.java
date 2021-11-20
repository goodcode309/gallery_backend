//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class RotationExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<RotationExample.Criteria> oredCriteria = new ArrayList();
    private Integer limit;
    private Long offset;

    public RotationExample() {
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public List<RotationExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(RotationExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public RotationExample.Criteria or() {
        RotationExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public RotationExample.Criteria createCriteria() {
        RotationExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected RotationExample.Criteria createCriteriaInternal() {
        RotationExample.Criteria criteria = new RotationExample.Criteria();
        return criteria;
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return this.offset;
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
            return this.condition;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getSecondValue() {
            return this.secondValue;
        }

        public boolean isNoValue() {
            return this.noValue;
        }

        public boolean isSingleValue() {
            return this.singleValue;
        }

        public boolean isBetweenValue() {
            return this.betweenValue;
        }

        public boolean isListValue() {
            return this.listValue;
        }

        public String getTypeHandler() {
            return this.typeHandler;
        }

        protected Criterion(String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }

        }

        protected Criterion(String condition, Object value) {
            this(condition, value, (String)null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, (String)null);
        }
    }

    public static class Criteria extends RotationExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<RotationExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<RotationExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<RotationExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new RotationExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new RotationExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new RotationExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public RotationExample.Criteria andRotationIdIsNull() {
            this.addCriterion("rotation_id is null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdIsNotNull() {
            this.addCriterion("rotation_id is not null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdEqualTo(Integer value) {
            this.addCriterion("rotation_id =", value, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdNotEqualTo(Integer value) {
            this.addCriterion("rotation_id <>", value, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdGreaterThan(Integer value) {
            this.addCriterion("rotation_id >", value, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("rotation_id >=", value, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdLessThan(Integer value) {
            this.addCriterion("rotation_id <", value, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("rotation_id <=", value, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdIn(List<Integer> values) {
            this.addCriterion("rotation_id in", values, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdNotIn(List<Integer> values) {
            this.addCriterion("rotation_id not in", values, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdBetween(Integer value1, Integer value2) {
            this.addCriterion("rotation_id between", value1, value2, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andRotationIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("rotation_id not between", value1, value2, "rotationId");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXIsNull() {
            this.addCriterion("x is null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXIsNotNull() {
            this.addCriterion("x is not null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXEqualTo(Float value) {
            this.addCriterion("x =", value, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXNotEqualTo(Float value) {
            this.addCriterion("x <>", value, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXGreaterThan(Float value) {
            this.addCriterion("x >", value, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXGreaterThanOrEqualTo(Float value) {
            this.addCriterion("x >=", value, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXLessThan(Float value) {
            this.addCriterion("x <", value, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXLessThanOrEqualTo(Float value) {
            this.addCriterion("x <=", value, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXIn(List<Float> values) {
            this.addCriterion("x in", values, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXNotIn(List<Float> values) {
            this.addCriterion("x not in", values, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXBetween(Float value1, Float value2) {
            this.addCriterion("x between", value1, value2, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andXNotBetween(Float value1, Float value2) {
            this.addCriterion("x not between", value1, value2, "x");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYIsNull() {
            this.addCriterion("y is null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYIsNotNull() {
            this.addCriterion("y is not null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYEqualTo(Float value) {
            this.addCriterion("y =", value, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYNotEqualTo(Float value) {
            this.addCriterion("y <>", value, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYGreaterThan(Float value) {
            this.addCriterion("y >", value, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYGreaterThanOrEqualTo(Float value) {
            this.addCriterion("y >=", value, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYLessThan(Float value) {
            this.addCriterion("y <", value, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYLessThanOrEqualTo(Float value) {
            this.addCriterion("y <=", value, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYIn(List<Float> values) {
            this.addCriterion("y in", values, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYNotIn(List<Float> values) {
            this.addCriterion("y not in", values, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYBetween(Float value1, Float value2) {
            this.addCriterion("y between", value1, value2, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andYNotBetween(Float value1, Float value2) {
            this.addCriterion("y not between", value1, value2, "y");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZIsNull() {
            this.addCriterion("z is null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZIsNotNull() {
            this.addCriterion("z is not null");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZEqualTo(Float value) {
            this.addCriterion("z =", value, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZNotEqualTo(Float value) {
            this.addCriterion("z <>", value, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZGreaterThan(Float value) {
            this.addCriterion("z >", value, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZGreaterThanOrEqualTo(Float value) {
            this.addCriterion("z >=", value, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZLessThan(Float value) {
            this.addCriterion("z <", value, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZLessThanOrEqualTo(Float value) {
            this.addCriterion("z <=", value, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZIn(List<Float> values) {
            this.addCriterion("z in", values, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZNotIn(List<Float> values) {
            this.addCriterion("z not in", values, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZBetween(Float value1, Float value2) {
            this.addCriterion("z between", value1, value2, "z");
            return (RotationExample.Criteria)this;
        }

        public RotationExample.Criteria andZNotBetween(Float value1, Float value2) {
            this.addCriterion("z not between", value1, value2, "z");
            return (RotationExample.Criteria)this;
        }
    }
}
