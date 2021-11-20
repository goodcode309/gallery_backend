package com.example.dao;

import com.example.entity.UserReview;
import java.util.List;

public interface UserReviewDao {
    List<UserReview> selectByPaintingId(Integer paintingId);
}