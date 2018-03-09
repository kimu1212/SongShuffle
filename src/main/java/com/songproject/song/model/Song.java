package com.songproject.song.model;

public class Song {
    private String name = null;
    private int id = 0;

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
}
