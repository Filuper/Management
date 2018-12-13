package com.company;

public class Boots extends Product {
    private Integer size;
    private boolean isNaturalSkin;

    public Boots(Integer size, boolean isNaturalSkin, Long id, String productName, Float price, Float weight, String color, Integer productCount) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public Integer getSize() {
        return size;
    }

    public boolean IsNaturalSkin() {
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
