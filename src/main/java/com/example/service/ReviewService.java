package com.example.service;

import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpSession;

public interface ReviewService {
    String getComments(Integer paintingId);

    String releaseComment(HttpSession httpSession, Integer paintingId, String content, JSONObject position, JSONObject rotation);
}
