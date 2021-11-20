//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<ReviewExample.Criteria> oredCriteria = new ArrayList();
    private Integer limit;
    private Long offset;

    public ReviewExample() {
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

    public List<ReviewExample.Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(ReviewExample.Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public ReviewExample.Criteria or() {
        ReviewExample.Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public ReviewExample.Criteria createCriteria() {
        ReviewExample.Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }

        return criteria;
    }

    protected ReviewExample.Criteria createCriteriaInternal() {
        ReviewExample.Criteria criteria = new ReviewExample.Criteria();
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

    public static class Criteria extends ReviewExample.GeneratedCriteria {
        protected Criteria() {
        }
    }

    protected abstract static class GeneratedCriteria {
        protected List<ReviewExample.Criterion> criteria = new ArrayList();

        protected GeneratedCriteria() {
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<ReviewExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<ReviewExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            } else {
                this.criteria.add(new ReviewExample.Criterion(condition));
            }
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            } else {
                this.criteria.add(new ReviewExample.Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 != null && value2 != null) {
                this.criteria.add(new ReviewExample.Criterion(condition, value1, value2));
            } else {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
        }

        public ReviewExample.Criteria andReviewIdIsNull() {
            this.addCriterion("review_id is null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdIsNotNull() {
            this.addCriterion("review_id is not null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdEqualTo(Integer value) {
            this.addCriterion("review_id =", value, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdNotEqualTo(Integer value) {
            this.addCriterion("review_id <>", value, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdGreaterThan(Integer value) {
            this.addCriterion("review_id >", value, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("review_id >=", value, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdLessThan(Integer value) {
            this.addCriterion("review_id <", value, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("review_id <=", value, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdIn(List<Integer> values) {
            this.addCriterion("review_id in", values, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdNotIn(List<Integer> values) {
            this.addCriterion("review_id not in", values, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdBetween(Integer value1, Integer value2) {
            this.addCriterion("review_id between", value1, value2, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andReviewIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("review_id not between", value1, value2, "reviewId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdIsNull() {
            this.addCriterion("painting_id is null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdIsNotNull() {
            this.addCriterion("painting_id is not null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdEqualTo(Integer value) {
            this.addCriterion("painting_id =", value, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdNotEqualTo(Integer value) {
            this.addCriterion("painting_id <>", value, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdGreaterThan(Integer value) {
            this.addCriterion("painting_id >", value, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("painting_id >=", value, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdLessThan(Integer value) {
            this.addCriterion("painting_id <", value, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("painting_id <=", value, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdIn(List<Integer> values) {
            this.addCriterion("painting_id in", values, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdNotIn(List<Integer> values) {
            this.addCriterion("painting_id not in", values, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdBetween(Integer value1, Integer value2) {
            this.addCriterion("painting_id between", value1, value2, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPaintingIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("painting_id not between", value1, value2, "paintingId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdIsNull() {
            this.addCriterion("user_id is null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdIsNotNull() {
            this.addCriterion("user_id is not null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdEqualTo(Integer value) {
            this.addCriterion("user_id =", value, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdNotEqualTo(Integer value) {
            this.addCriterion("user_id <>", value, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdGreaterThan(Integer value) {
            this.addCriterion("user_id >", value, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("user_id >=", value, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdLessThan(Integer value) {
            this.addCriterion("user_id <", value, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("user_id <=", value, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdIn(List<Integer> values) {
            this.addCriterion("user_id in", values, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdNotIn(List<Integer> values) {
            this.addCriterion("user_id not in", values, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id between", value1, value2, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("user_id not between", value1, value2, "userId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentIsNull() {
            this.addCriterion("content is null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentIsNotNull() {
            this.addCriterion("content is not null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentEqualTo(String value) {
            this.addCriterion("content =", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentNotEqualTo(String value) {
            this.addCriterion("content <>", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentGreaterThan(String value) {
            this.addCriterion("content >", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentGreaterThanOrEqualTo(String value) {
            this.addCriterion("content >=", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentLessThan(String value) {
            this.addCriterion("content <", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentLessThanOrEqualTo(String value) {
            this.addCriterion("content <=", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentLike(String value) {
            this.addCriterion("content like", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentNotLike(String value) {
            this.addCriterion("content not like", value, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentIn(List<String> values) {
            this.addCriterion("content in", values, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentNotIn(List<String> values) {
            this.addCriterion("content not in", values, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentBetween(String value1, String value2) {
            this.addCriterion("content between", value1, value2, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andContentNotBetween(String value1, String value2) {
            this.addCriterion("content not between", value1, value2, "content");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdIsNull() {
            this.addCriterion("position_id is null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdIsNotNull() {
            this.addCriterion("position_id is not null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdEqualTo(Integer value) {
            this.addCriterion("position_id =", value, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdNotEqualTo(Integer value) {
            this.addCriterion("position_id <>", value, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdGreaterThan(Integer value) {
            this.addCriterion("position_id >", value, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("position_id >=", value, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdLessThan(Integer value) {
            this.addCriterion("position_id <", value, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("position_id <=", value, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdIn(List<Integer> values) {
            this.addCriterion("position_id in", values, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdNotIn(List<Integer> values) {
            this.addCriterion("position_id not in", values, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdBetween(Integer value1, Integer value2) {
            this.addCriterion("position_id between", value1, value2, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("position_id not between", value1, value2, "positionId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdIsNull() {
            this.addCriterion("rotation_id is null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdIsNotNull() {
            this.addCriterion("rotation_id is not null");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdEqualTo(Integer value) {
            this.addCriterion("rotation_id =", value, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdNotEqualTo(Integer value) {
            this.addCriterion("rotation_id <>", value, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdGreaterThan(Integer value) {
            this.addCriterion("rotation_id >", value, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdGreaterThanOrEqualTo(Integer value) {
            this.addCriterion("rotation_id >=", value, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdLessThan(Integer value) {
            this.addCriterion("rotation_id <", value, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdLessThanOrEqualTo(Integer value) {
            this.addCriterion("rotation_id <=", value, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdIn(List<Integer> values) {
            this.addCriterion("rotation_id in", values, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdNotIn(List<Integer> values) {
            this.addCriterion("rotation_id not in", values, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdBetween(Integer value1, Integer value2) {
            this.addCriterion("rotation_id between", value1, value2, "rotationId");
            return (ReviewExample.Criteria)this;
        }

        public ReviewExample.Criteria andRotationIdNotBetween(Integer value1, Integer value2) {
            this.addCriterion("rotation_id not between", value1, value2, "rotationId");
            return (ReviewExample.Criteria)this;
        }
    }
}
