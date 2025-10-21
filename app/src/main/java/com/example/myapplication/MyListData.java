package com.example.myapplication;

public class MyListData {
    String name;
    String desc;
    int imgID;

    public MyListData(String name, String desc, int imgID) {
        this.name = name;
        this.desc = desc;
        this.imgID =imgID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public int getImgID(){
        return imgID;
    }
    public void setImgID(int imgID){
        this.imgID = imgID;
    }
}
