package com.isha.leave_warden;

public class Model {
    String name,id;

    public Model(String name,String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

   /* public String getImageUrl() {
        //return imageUrl;
    }*/
}