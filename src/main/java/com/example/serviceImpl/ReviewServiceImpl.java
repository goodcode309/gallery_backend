//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.PositionDao;
import com.example.dao.ReviewDao;
import com.example.dao.RotationDao;
import com.example.dao.UserReviewDao;
import com.example.entity.Position;
import com.example.entity.Review;
import com.example.entity.Rotation;
import com.example.entity.UserReview;
import com.example.service.ReviewService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewDao reviewDao;
    @Autowired
    private UserReviewDao userReviewDao;
    @Autowired
    private PositionDao positionDao;
    @Autowired
    private RotationDao rotationDao;

    public ReviewServiceImpl() {
    }

    public String getComments(Integer paintingId) {
        JSONObject jsonObject = new JSONObject();
        List<UserReview> userReviews = this.userReviewDao.selectByPaintingId(paintingId);
        if (userReviews.isEmpty()) {
            jsonObject.put("result", false);
            jsonObject.put("message", "此画作还没有评论");
            return jsonObject.toJSONString();
        } else {
            jsonObject.put("result", true);
            jsonObject.put("message", "获取评论成功");
            jsonObject.put("comments", userReviews);
            return jsonObject.toJSONString();
        }
    }

    public String releaseComment(HttpSession httpSession, Integer paintingId, String content, JSONObject position, JSONObject rotation) {
        JSONObject jsonObject = new JSONObject();
        if (httpSession.getAttribute("userId") == null) {
            jsonObject.put("result", false);
            jsonObject.put("message", "session过期，请重新登录");
            return jsonObject.toJSONString();
        } else {
            Position position1 = new Position();
            position1.setX(position.getFloat("x"));
            position1.setY(position.getFloat("y"));
            position1.setZ(position.getFloat("z"));
            this.positionDao.insert(position1);
            int positionIndex = position1.getPositionId();
            Rotation rotation1 = new Rotation();
            rotation1.setX(rotation.getFloat("x"));
            rotation1.setY(rotation.getFloat("y"));
            rotation1.setZ(rotation.getFloat("z"));
            this.rotationDao.insert(rotation1);
            int rotationIndex = rotation1.getRotationId();
            Integer userId = (Integer)httpSession.getAttribute("userId");
            Review review = new Review();
            review.setContent(content);
            review.setPaintingId(paintingId);
            review.setUserId(userId);
            review.setPositionId(positionIndex);
            review.setRotationId(rotationIndex);
            this.reviewDao.insert(review);
            jsonObject.put("result", true);
            jsonObject.put("message", "评论成功");
            return jsonObject.toJSONString();
        }
    }
}
