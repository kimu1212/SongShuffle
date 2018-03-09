package com.songproject.song.model;

public class Song {
    private String name = null;
    private int id = 0;
    private int status = 0;

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getStatus(){
        return status;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setStatus(int status){
        this.status = status;
    }
}
