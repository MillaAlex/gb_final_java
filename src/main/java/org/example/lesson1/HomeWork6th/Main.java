package org.example.lesson1.HomeWork6th;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(8, 500, "Windows", "blue", 55000);
        Laptop laptop2 = new Laptop(16, 5000, "Linux", "metallic", 95000);
        Laptop laptop3 = new Laptop(10, 4000, "MacOS", "white", 145000);
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        System.out.println("laptopList: " + laptopList);
        System.out.println("laptopFilter(laptopList): " + laptopFilter(laptopList));
        String option = "Выберите критерий поиска: \n " +
                "1 - ОЗУ\n " +
                "2 - Объем ЖД\n " +
                "3 - Операционная система\n " +
                "4 - Цвет\n " +
                "5 - Цена\n ";
        System.out.println(option);

    }
    public static int Filter(List<Laptop> laptopList) {
        Map filter = new HashMap();
        Scanner scanner = new Scanner(System.in);
        int filterKey = scanner.nextInt();
        switch (filterKey) {
            case 1:
                filterKey = 1;
                System.out.println("Введите значение ОЗУ: ");
                String amountRAM = String.valueOf(Integer.parseInt(scanner.nextLine()));
                filter.put(filterKey, amountRAM);
                return filterKey;
            case 2:
                filterKey = 2;
                System.out.println("Введите объем жесткого диска: ");
                String volumeHD = String.valueOf(Integer.parseInt(scanner.nextLine()));
                filter.put(filterKey, volumeHD);
                return filterKey;
            case 3:
                filterKey = 3;
                System.out.println("Операционная система: ");
                String nameOS = scanner.nextLine();
                filter.put(filterKey, nameOS);
                return filterKey;
            case 4:
                filterKey = 4;
                System.out.println("Цвет: ");
                String color = scanner.nextLine();
                filter.put(filterKey, color);
                return filterKey;
            case 5:
                filterKey = 5;
                System.out.println("Цена: ");
                String price = String.valueOf(Integer.parseInt(scanner.nextLine()));
                filter.put(filterKey, price);
                return filterKey;
            default:
                return filterKey;
        }
    }

    private static Collection laptopFilter(List<Laptop> laptopList) {
        return new HashSet(laptopList);
    }
}
