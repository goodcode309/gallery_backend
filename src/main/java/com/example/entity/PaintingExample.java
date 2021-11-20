//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class PaintingExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<PaintingExample.Criteria> oredCriteria = new ArrayList();
    private Integer limit;
    private Long offset;

    public PaintingExample() {
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

    public List<PaintingExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(PaintingExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public PaintingExample.Criteria or() {
        PaintingExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public PaintingExample.Criteria createCriteria() {
        PaintingExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected PaintingExample.Criteria createCriteriaInternal() {
        PaintingExample.Criteria criteria = new PaintingExample.Criteria();
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

    public static class Criteria extends PaintingExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<PaintingExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<PaintingExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<PaintingExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new PaintingExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new PaintingExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new PaintingExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public PaintingExample.Criteria andPaintingIdIsNull() {
            this.addCriterion("painting_id is null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdIsNotNull() {
            this.addCriterion("painting_id is not null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdEqualTo(Integer value) {
            this.addCriterion("painting_id =", value, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdNotEqualTo(Integer value) {
            this.addCriterion("painting_id <>", value, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdGreaterThan(Integer value) {
            this.addCriterion("painting_id >", value, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("painting_id >=", value, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdLessThan(Integer value) {
            this.addCriterion("painting_id <", value, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("painting_id <=", value, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdIn(List<Integer> values) {
            this.addCriterion("painting_id in", values, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdNotIn(List<Integer> values) {
            this.addCriterion("painting_id not in", values, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdBetween(Integer value1, Integer value2) {
            this.addCriterion("painting_id between", value1, value2, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("painting_id not between", value1, value2, "paintingId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameIsNull() {
            this.addCriterion("painting_name is null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameIsNotNull() {
            this.addCriterion("painting_name is not null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameEqualTo(String value) {
            this.addCriterion("painting_name =", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameNotEqualTo(String value) {
            this.addCriterion("painting_name <>", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameGreaterThan(String value) {
            this.addCriterion("painting_name >", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameGreaterThanOrEqualTo(String value) {
            this.addCriterion("painting_name >=", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameLessThan(String value) {
            this.addCriterion("painting_name <", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameLessThanOrEqualTo(String value) {
            this.addCriterion("painting_name <=", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameLike(String value) {
            this.addCriterion("painting_name like", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameNotLike(String value) {
            this.addCriterion("painting_name not like", value, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameIn(List<String> values) {
            this.addCriterion("painting_name in", values, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameNotIn(List<String> values) {
            this.addCriterion("painting_name not in", values, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameBetween(String value1, String value2) {
            this.addCriterion("painting_name between", value1, value2, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingNameNotBetween(String value1, String value2) {
            this.addCriterion("painting_name not between", value1, value2, "paintingName");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathIsNull() {
            this.addCriterion("painting_path is null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathIsNotNull() {
            this.addCriterion("painting_path is not null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathEqualTo(String value) {
            this.addCriterion("painting_path =", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathNotEqualTo(String value) {
            this.addCriterion("painting_path <>", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathGreaterThan(String value) {
            this.addCriterion("painting_path >", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathGreaterThanOrEqualTo(String value) {
            this.addCriterion("painting_path >=", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathLessThan(String value) {
            this.addCriterion("painting_path <", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathLessThanOrEqualTo(String value) {
            this.addCriterion("painting_path <=", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathLike(String value) {
            this.addCriterion("painting_path like", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathNotLike(String value) {
            this.addCriterion("painting_path not like", value, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathIn(List<String> values) {
            this.addCriterion("painting_path in", values, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathNotIn(List<String> values) {
            this.addCriterion("painting_path not in", values, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathBetween(String value1, String value2) {
            this.addCriterion("painting_path between", value1, value2, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andPaintingPathNotBetween(String value1, String value2) {
            this.addCriterion("painting_path not between", value1, value2, "paintingPath");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdIsNull() {
            this.addCriterion("house_id is null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdIsNotNull() {
            this.addCriterion("house_id is not null");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdEqualTo(Integer value) {
            this.addCriterion("house_id =", value, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdNotEqualTo(Integer value) {
            this.addCriterion("house_id <>", value, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdGreaterThan(Integer value) {
            this.addCriterion("house_id >", value, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("house_id >=", value, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdLessThan(Integer value) {
            this.addCriterion("house_id <", value, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("house_id <=", value, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdIn(List<Integer> values) {
            this.addCriterion("house_id in", values, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdNotIn(List<Integer> values) {
            this.addCriterion("house_id not in", values, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdBetween(Integer value1, Integer value2) {
            this.addCriterion("house_id between", value1, value2, "houseId");
            return (PaintingExample.Criteria)this;
        }

        public PaintingExample.Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("house_id not between", value1, value2, "houseId");
            return (PaintingExample.Criteria)this;
        }
    }
}
