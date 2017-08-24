package com.ruomingxx.blog.models.support;

/**
 * Created by jicheng
 * on 8/24/2017.
 */
public enum PostStatus {
    DRAFT("Draft"),
    PUBLISHED("Published");

    private String name;

    PostStatus(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId(){
        return name();
    }

    @Override
    public String toString() {
        return getName();
    }
}
