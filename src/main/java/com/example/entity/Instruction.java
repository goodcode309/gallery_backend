package com.example.entity;

import java.io.Serializable;

public class Instruction implements Serializable {
    private Integer instructionId;
    private Integer paintingId;
    private String content;
    private static final long serialVersionUID = 1L;

    public Instruction() {
    }

    public Integer getInstructionId() {
        return this.instructionId;
    }

    public void setInstructionId(Integer instructionId) {
        this.instructionId = instructionId;
    }

    public Integer getPaintingId() {
        return this.paintingId;
    }

    public void setPaintingId(Integer paintingId) {
        this.paintingId = paintingId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
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
            label57: {
                label49: {
                    Instruction other = (Instruction)that;
                    if (this.getInstructionId() == null) {
                        if (other.getInstructionId() != null) {
                            break label49;
                        }
                    } else if (!this.getInstructionId().equals(other.getInstructionId())) {
                        break label49;
                    }

                    if (this.getPaintingId() == null) {
                        if (other.getPaintingId() != null) {
                            break label49;
                        }
                    } else if (!this.getPaintingId().equals(other.getPaintingId())) {
                        break label49;
                    }

                    if (this.getContent() == null) {
                        if (other.getContent() == null) {
                            break label57;
                        }
                    } else if (this.getContent().equals(other.getContent())) {
                        break label57;
                    }
                }

                var10000 = false;
                return var10000;
            }

            var10000 = true;
            return var10000;
        }
    }

    // 对hashCode函数做了修改
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.getInstructionId() == null ? 0 : this.getInstructionId().hashCode());
        result = 31 * result + (this.getPaintingId() == null ? 0 : this.getPaintingId().hashCode());
        result = 31 * result + (this.getContent() == null ? 0 : this.getContent().hashCode());
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(this.hashCode());
        sb.append(", instructionId=").append(this.instructionId);
        sb.append(", paintingId=").append(this.paintingId);
        sb.append(", content=").append(this.content);
        sb.append(", serialVersionUID=").append(1L);
        sb.append("]");
        return sb.toString();
    }
}
