package com.example.phamngocnhuy_18055121;

public class Burger {
    private String name;
    private double rate;
    private double price;
    private int imgHinh;
    private int imgTim;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(int imgHinh) {
        this.imgHinh = imgHinh;
    }

    public int getImgTim() {
        return imgTim;
    }

    public void setImgTim(int imgTim) {
        this.imgTim = imgTim;
    }

    public Burger(String name, double rate, double price, int imgHinh, int imgTim) {
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.imgHinh = imgHinh;
        this.imgTim = imgTim;
    }

    public Burger() {
    }
}
