//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.entity;

import java.io.Serializable;

public class Position implements Serializable {
    private Integer positionId;
    private Float x;
    private Float y;
    private Float z;
    private static final long serialVersionUID = 1L;

    public Position() {
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Float getX() {
        return this.x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return this.y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getZ() {
        return this.z;
    }

    public void setZ(Float z) {
        this.z = z;
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
                    Position other = (Position)that;
                    if (this.getPositionId() == null) {
                        if (other.getPositionId() != null) {
                            break label57;
                        }
                    } else if (!this.getPositionId().equals(other.getPositionId())) {
                        break label57;
                    }

                    if (this.getX() == null) {
                        if (other.getX() != null) {
                            break label57;
                        }
                    } else if (!this.getX().equals(other.getX())) {
                        break label57;
                    }

                    if (this.getY() == null) {
                        if (other.getY() != null) {
                            break label57;
                        }
                    } else if (!this.getY().equals(other.getY())) {
                        break label57;
                    }

                    if (this.getZ() == null) {
                        if (other.getZ() == null) {
                            break label65;
                        }
                    } else if (this.getZ().equals(other.getZ())) {
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
        result = 31 * result + (this.getPositionId() == null ? 0 : this.getPositionId().hashCode());
        result = 31 * result + (this.getX() == null ? 0 : this.getX().hashCode());
        result = 31 * result + (this.getY() == null ? 0 : this.getY().hashCode());
        result = 31 * result + (this.getZ() == null ? 0 : this.getZ().hashCode());
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(this.hashCode());
        sb.append(", positionId=").append(this.positionId);
        sb.append(", x=").append(this.x);
        sb.append(", y=").append(this.y);
        sb.append(", z=").append(this.z);
        sb.append(", serialVersionUID=").append(1L);
        sb.append("]");
        return sb.toString();
    }
}
