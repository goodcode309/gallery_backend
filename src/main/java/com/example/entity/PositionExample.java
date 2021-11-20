//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<PositionExample.Criteria> oredCriteria = new ArrayList();
    private Integer limit;
    private Long offset;

    public PositionExample() {
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

    public List<PositionExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(PositionExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public PositionExample.Criteria or() {
        PositionExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public PositionExample.Criteria createCriteria() {
        PositionExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected PositionExample.Criteria createCriteriaInternal() {
        PositionExample.Criteria criteria = new PositionExample.Criteria();
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

    public static class Criteria extends PositionExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<PositionExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<PositionExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<PositionExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new PositionExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new PositionExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new PositionExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public PositionExample.Criteria andPositionIdIsNull() {
            this.addCriterion("position_id is null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdIsNotNull() {
            this.addCriterion("position_id is not null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdEqualTo(Integer value) {
            this.addCriterion("position_id =", value, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdNotEqualTo(Integer value) {
            this.addCriterion("position_id <>", value, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdGreaterThan(Integer value) {
            this.addCriterion("position_id >", value, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("position_id >=", value, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdLessThan(Integer value) {
            this.addCriterion("position_id <", value, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("position_id <=", value, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdIn(List<Integer> values) {
            this.addCriterion("position_id in", values, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdNotIn(List<Integer> values) {
            this.addCriterion("position_id not in", values, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdBetween(Integer value1, Integer value2) {
            this.addCriterion("position_id between", value1, value2, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("position_id not between", value1, value2, "positionId");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXIsNull() {
            this.addCriterion("x is null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXIsNotNull() {
            this.addCriterion("x is not null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXEqualTo(Float value) {
            this.addCriterion("x =", value, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXNotEqualTo(Float value) {
            this.addCriterion("x <>", value, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXGreaterThan(Float value) {
            this.addCriterion("x >", value, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXGreaterThanOrEqualTo(Float value) {
            this.addCriterion("x >=", value, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXLessThan(Float value) {
            this.addCriterion("x <", value, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXLessThanOrEqualTo(Float value) {
            this.addCriterion("x <=", value, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXIn(List<Float> values) {
            this.addCriterion("x in", values, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXNotIn(List<Float> values) {
            this.addCriterion("x not in", values, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXBetween(Float value1, Float value2) {
            this.addCriterion("x between", value1, value2, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andXNotBetween(Float value1, Float value2) {
            this.addCriterion("x not between", value1, value2, "x");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYIsNull() {
            this.addCriterion("y is null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYIsNotNull() {
            this.addCriterion("y is not null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYEqualTo(Float value) {
            this.addCriterion("y =", value, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYNotEqualTo(Float value) {
            this.addCriterion("y <>", value, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYGreaterThan(Float value) {
            this.addCriterion("y >", value, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYGreaterThanOrEqualTo(Float value) {
            this.addCriterion("y >=", value, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYLessThan(Float value) {
            this.addCriterion("y <", value, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYLessThanOrEqualTo(Float value) {
            this.addCriterion("y <=", value, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYIn(List<Float> values) {
            this.addCriterion("y in", values, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYNotIn(List<Float> values) {
            this.addCriterion("y not in", values, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYBetween(Float value1, Float value2) {
            this.addCriterion("y between", value1, value2, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andYNotBetween(Float value1, Float value2) {
            this.addCriterion("y not between", value1, value2, "y");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZIsNull() {
            this.addCriterion("z is null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZIsNotNull() {
            this.addCriterion("z is not null");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZEqualTo(Float value) {
            this.addCriterion("z =", value, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZNotEqualTo(Float value) {
            this.addCriterion("z <>", value, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZGreaterThan(Float value) {
            this.addCriterion("z >", value, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZGreaterThanOrEqualTo(Float value) {
            this.addCriterion("z >=", value, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZLessThan(Float value) {
            this.addCriterion("z <", value, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZLessThanOrEqualTo(Float value) {
            this.addCriterion("z <=", value, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZIn(List<Float> values) {
            this.addCriterion("z in", values, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZNotIn(List<Float> values) {
            this.addCriterion("z not in", values, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZBetween(Float value1, Float value2) {
            this.addCriterion("z between", value1, value2, "z");
            return (PositionExample.Criteria)this;
        }

        public PositionExample.Criteria andZNotBetween(Float value1, Float value2) {
            this.addCriterion("z not between", value1, value2, "z");
            return (PositionExample.Criteria)this;
        }
    }
}
