package org.example.lesson1.HomeWork6th;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Laptop {
    private int amountRAM;
    private int volumeHD;
    private String nameOS;
    private String color;
    private int price;

    public Laptop(int amountRAM, int volumeHD, String nameOS, String color, int price) {
        this.amountRAM = amountRAM;
        this.volumeHD = volumeHD;
        this.nameOS = nameOS;
        this.color = color;
        this.price = price;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public int getVolumeHD() {
        return volumeHD;
    }

    public void setVolumeHD(int volumeHD) {
        this.volumeHD = volumeHD;
    }

    public String getNameOS() {
        return nameOS;
    }

    public void setNameOS(String nameOS) {
        this.nameOS = nameOS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static List<String> featuresForFilter() {
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("volumeHD");
        list.add("nameOS");
        list.add("color");
        list.add("price");

        return list;
    }


    @Override
    public int hashCode() {
        return Objects.hash(amountRAM, volumeHD, nameOS, color, price);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "amountRAM=" + amountRAM +
                ", volumeHD=" + volumeHD +
                ", nameOS='" + nameOS + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
