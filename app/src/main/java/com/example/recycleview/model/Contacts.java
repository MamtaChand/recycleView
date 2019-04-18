package com.example.recycleview.model;

public class Contacts {

    private String name;
    private String contactNo;
    private int imageId;

    public Contacts(String name, String contactNo, int imageId) {
        this.name = name;
        this.contactNo = contactNo;
        this.imageId = imageId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
