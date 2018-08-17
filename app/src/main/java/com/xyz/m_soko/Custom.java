package com.xyz.m_soko;

public class Custom {
    int images;
    String names,description;

    public Custom(int images, String names, String description) {
        this.images = images;
        this.names = names;
        this.description = description;
    }

    public int getImages() {
        return images;
    }

    public String getNames() {
        return names;
    }

    public String getDescription() {
        return description;
    }
}
