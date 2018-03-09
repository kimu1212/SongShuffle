package com.songproject.song.model;

public class Song {
    private String name = null;
    private int index = 0;

    public String getName(){
        return name;
    }

    public int getIndex(){
        return index;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIndex(int index){
        this.index = index;
    }
}
