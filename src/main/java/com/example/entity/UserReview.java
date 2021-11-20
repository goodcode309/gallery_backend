//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

public class UserReview {
    private Integer reviewId;
    private Integer userId;
    private String username;
    private String content;
    private Transform transform;

    public UserReview() {
    }

    public Integer getReviewId() {
        return this.reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Transform getTransform() {
        return this.transform;
    }

    public void setTransform(Transform transform) {
        this.transform = transform;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
