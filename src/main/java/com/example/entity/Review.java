//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.io.Serializable;

public class Review implements Serializable {
    private Integer reviewId;
    private Integer paintingId;
    private Integer userId;
    private String content;
    private Integer positionId;
    private Integer rotationId;
    private static final long serialVersionUID = 1L;

    public Review() {
    }

    public Integer getReviewId() {
        return this.reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getPaintingId() {
        return this.paintingId;
    }

    public void setPaintingId(Integer paintingId) {
        this.paintingId = paintingId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getRotationId() {
        return this.rotationId;
    }

    public void setRotationId(Integer rotationId) {
        this.rotationId = rotationId;
    }

    public boolean equals(Object that) {
        if (this == that) {
            return true;
        } else if (that == null) {
            return false;
        } else if (this.getClass() != that.getClass()) {
            return false;
        } else {
            boolean var10000;
            label80: {
                Review other = (Review)that;
                if (this.getReviewId() == null) {
                    if (other.getReviewId() != null) {
                        break label80;
                    }
                } else if (!this.getReviewId().equals(other.getReviewId())) {
                    break label80;
                }

                if (this.getPaintingId() == null) {
                    if (other.getPaintingId() != null) {
                        break label80;
                    }
                } else if (!this.getPaintingId().equals(other.getPaintingId())) {
                    break label80;
                }

                if (this.getUserId() == null) {
                    if (other.getUserId() != null) {
                        break label80;
                    }
                } else if (!this.getUserId().equals(other.getUserId())) {
                    break label80;
                }

                if (this.getContent() == null) {
                    if (other.getContent() != null) {
                        break label80;
                    }
                } else if (!this.getContent().equals(other.getContent())) {
                    break label80;
                }

                if (this.getPositionId() == null) {
                    if (other.getPositionId() != null) {
                        break label80;
                    }
                } else if (!this.getPositionId().equals(other.getPositionId())) {
                    break label80;
                }

                if (this.getRotationId() == null) {
                    if (other.getRotationId() != null) {
                        break label80;
                    }
                } else if (!this.getRotationId().equals(other.getRotationId())) {
                    break label80;
                }

                var10000 = true;
                return var10000;
            }

            var10000 = false;
            return var10000;
        }
    }

    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.getReviewId() == null ? 0 : this.getReviewId().hashCode());
        result = 31 * result + (this.getPaintingId() == null ? 0 : this.getPaintingId().hashCode());
        result = 31 * result + (this.getUserId() == null ? 0 : this.getUserId().hashCode());
        result = 31 * result + (this.getContent() == null ? 0 : this.getContent().hashCode());
        result = 31 * result + (this.getPositionId() == null ? 0 : this.getPositionId().hashCode());
        result = 31 * result + (this.getRotationId() == null ? 0 : this.getRotationId().hashCode());
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(this.hashCode());
        sb.append(", reviewId=").append(this.reviewId);
        sb.append(", paintingId=").append(this.paintingId);
        sb.append(", userId=").append(this.userId);
        sb.append(", content=").append(this.content);
        sb.append(", positionId=").append(this.positionId);
        sb.append(", rotationId=").append(this.rotationId);
        sb.append(", serialVersionUID=").append(1L);
        sb.append("]");
        return sb.toString();
    }
}
