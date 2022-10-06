package com.example.Student_201701105.dto;

public class HelloRequest {
    private String name;
    private int level;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "HelloRequerst{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
