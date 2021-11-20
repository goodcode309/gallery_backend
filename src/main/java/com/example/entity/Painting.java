package com.example.entity;

import java.io.Serializable;

public class Painting implements Serializable {
    private Integer paintingId;
    private String paintingName;
    private String paintingPath;
    private Integer houseId;
    private static final long serialVersionUID = 1L;

    public Painting() {
    }

    public Integer getPaintingId() {
        return this.paintingId;
    }

    public void setPaintingId(Integer paintingId) {
        this.paintingId = paintingId;
    }

    public String getPaintingName() {
        return this.paintingName;
    }

    public void setPaintingName(String paintingName) {
        this.paintingName = paintingName;
    }

    public String getPaintingPath() {
        return this.paintingPath;
    }

    public void setPaintingPath(String paintingPath) {
        this.paintingPath = paintingPath;
    }

    public Integer getHouseId() {
        return this.houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
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
            label65: {
                label57: {
                    Painting other = (Painting)that;
                    if (this.getPaintingId() == null) {
                        if (other.getPaintingId() != null) {
                            break label57;
                        }
                    } else if (!this.getPaintingId().equals(other.getPaintingId())) {
                        break label57;
                    }

                    if (this.getPaintingName() == null) {
                        if (other.getPaintingName() != null) {
                            break label57;
                        }
                    } else if (!this.getPaintingName().equals(other.getPaintingName())) {
                        break label57;
                    }

                    if (this.getPaintingPath() == null) {
                        if (other.getPaintingPath() != null) {
                            break label57;
                        }
                    } else if (!this.getPaintingPath().equals(other.getPaintingPath())) {
                        break label57;
                    }

                    if (this.getHouseId() == null) {
                        if (other.getHouseId() == null) {
                            break label65;
                        }
                    } else if (this.getHouseId().equals(other.getHouseId())) {
                        break label65;
                    }
                }

                var10000 = false;
                return var10000;
            }

            var10000 = true;
            return var10000;
        }
    }

    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.getPaintingId() == null ? 0 : this.getPaintingId().hashCode());
        result = 31 * result + (this.getPaintingName() == null ? 0 : this.getPaintingName().hashCode());
        result = 31 * result + (this.getPaintingPath() == null ? 0 : this.getPaintingPath().hashCode());
        result = 31 * result + (this.getHouseId() == null ? 0 : this.getHouseId().hashCode());
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(this.hashCode());
        sb.append(", paintingId=").append(this.paintingId);
        sb.append(", paintingName=").append(this.paintingName);
        sb.append(", paintingPath=").append(this.paintingPath);
        sb.append(", houseId=").append(this.houseId);
        sb.append(", serialVersionUID=").append(1L);
        sb.append("]");
        return sb.toString();
    }
}
