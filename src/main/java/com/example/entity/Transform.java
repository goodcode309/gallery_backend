package com.example.entity;

public class Transform {
    private Position position;
    private Rotation rotation;

    public Transform() {
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Rotation getRotation() {
        return this.rotation;
    }

    public void setRotation(Rotation rotation) {
        this.rotation = rotation;
    }
}
