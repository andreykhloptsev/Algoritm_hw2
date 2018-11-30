package ru.geekbrains.algoritm.hw_2;

import java.util.Random;

public class Main {

    private static Random  random = new Random();

    public static void main(String[] args) {

        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
        MyArrayList<Integer> arrayList2 = new MyArrayList<Integer>();
        for (int i = 0; i <100000 ; i++) {
            arrayList.insert(random.nextInt(1000000));
            arrayList2.insert(random.nextInt(1000000));
        }
        long start = System.currentTimeMillis();
        arrayList.insertionSort();
        System.out.println("Insertion exchanges: "+arrayList.getExchangeCounter());
        System.out.println("Insertion compares: "+arrayList.getCompareCounter());
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Insertion method time: "+timeConsumedMillis);

        start = System.currentTimeMillis();
        arrayList2.selectionSort();
        System.out.println("Selection exchanges: "+arrayList2.getExchangeCounter());
        System.out.println("Selection compares: "+arrayList2.getCompareCounter());
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Selection method time: "+timeConsumedMillis);


    }
}
