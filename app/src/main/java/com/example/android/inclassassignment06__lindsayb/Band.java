package com.example.android.inclassassignment06__lindsayb;

import java.io.Serializable;

/**
 * Created by lindsaybaer on 3/8/17.
 */

import java.io.Serializable;

public class Band implements Serializable {
    private String name;
    private int albums;
    private boolean together;

    public Band(String name, int albums, boolean together) {
        this.name = name;
        this.albums = albums;
        this.together = together;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlbums() {
        return albums;
    }

    public void setAlbums(int albums) {
        this.albums = albums;
    }

    public boolean isTogether() {
        return together;
    }

    public void setTogether(boolean together) {
        this.together = together;
    }

    @Override
    public String toString() {
        return "Band Name: " + name + '\n' +
                "Albums: " + albums + "\n" +
                "Still Together: " + together + "\n" + "\n";
    }
}