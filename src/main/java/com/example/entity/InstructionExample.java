package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class InstructionExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<InstructionExample.Criteria> oredCriteria = new ArrayList();
    private Integer limit;
    private Long offset;

    public InstructionExample() {
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

    public List<InstructionExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(InstructionExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public InstructionExample.Criteria or() {
        InstructionExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public InstructionExample.Criteria createCriteria() {
        InstructionExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected InstructionExample.Criteria createCriteriaInternal() {
        InstructionExample.Criteria criteria = new InstructionExample.Criteria();
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

    public static class Criteria extends InstructionExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<InstructionExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<InstructionExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<InstructionExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new InstructionExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new InstructionExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new InstructionExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public InstructionExample.Criteria andInstructionIdIsNull() {
            this.addCriterion("instruction_id is null");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdIsNotNull() {
            this.addCriterion("instruction_id is not null");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdEqualTo(Integer value) {
            this.addCriterion("instruction_id =", value, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdNotEqualTo(Integer value) {
            this.addCriterion("instruction_id <>", value, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdGreaterThan(Integer value) {
            this.addCriterion("instruction_id >", value, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("instruction_id >=", value, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdLessThan(Integer value) {
            this.addCriterion("instruction_id <", value, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("instruction_id <=", value, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdIn(List<Integer> values) {
            this.addCriterion("instruction_id in", values, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdNotIn(List<Integer> values) {
            this.addCriterion("instruction_id not in", values, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdBetween(Integer value1, Integer value2) {
            this.addCriterion("instruction_id between", value1, value2, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andInstructionIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("instruction_id not between", value1, value2, "instructionId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdIsNull() {
            this.addCriterion("painting_id is null");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdIsNotNull() {
            this.addCriterion("painting_id is not null");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdEqualTo(Integer value) {
            this.addCriterion("painting_id =", value, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdNotEqualTo(Integer value) {
            this.addCriterion("painting_id <>", value, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdGreaterThan(Integer value) {
            this.addCriterion("painting_id >", value, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("painting_id >=", value, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdLessThan(Integer value) {
            this.addCriterion("painting_id <", value, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("painting_id <=", value, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdIn(List<Integer> values) {
            this.addCriterion("painting_id in", values, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdNotIn(List<Integer> values) {
            this.addCriterion("painting_id not in", values, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdBetween(Integer value1, Integer value2) {
            this.addCriterion("painting_id between", value1, value2, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andPaintingIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("painting_id not between", value1, value2, "paintingId");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentIsNull() {
            this.addCriterion("content is null");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentIsNotNull() {
            this.addCriterion("content is not null");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentEqualTo(String value) {
            this.addCriterion("content =", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentNotEqualTo(String value) {
            this.addCriterion("content <>", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentGreaterThan(String value) {
            this.addCriterion("content >", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentGreaterThanOrEqualTo(String value) {
            this.addCriterion("content >=", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentLessThan(String value) {
            this.addCriterion("content <", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentLessThanOrEqualTo(String value) {
            this.addCriterion("content <=", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentLike(String value) {
            this.addCriterion("content like", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentNotLike(String value) {
            this.addCriterion("content not like", value, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentIn(List<String> values) {
            this.addCriterion("content in", values, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentNotIn(List<String> values) {
            this.addCriterion("content not in", values, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentBetween(String value1, String value2) {
            this.addCriterion("content between", value1, value2, "content");
            return (InstructionExample.Criteria)this;
        }

        public InstructionExample.Criteria andContentNotBetween(String value1, String value2) {
            this.addCriterion("content not between", value1, value2, "content");
            return (InstructionExample.Criteria)this;
        }
    }
}
