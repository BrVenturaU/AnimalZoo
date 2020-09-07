package com.example.animalzoo.Utils;

public class AnimalType {
    private Integer ColdCount;
    private Integer HotCount;

    public AnimalType() {
    }

    public AnimalType(Integer coldCount, Integer hotCount) {
        ColdCount = coldCount;
        HotCount = hotCount;
    }

    public Integer getColdCount() {
        return ColdCount;
    }

    public void setColdCount(Integer coldCount) {
        ColdCount = coldCount;
    }

    public Integer getHotCount() {
        return HotCount;
    }

    public void setHotCount(Integer hotCount) {
        HotCount = hotCount;
    }
}
