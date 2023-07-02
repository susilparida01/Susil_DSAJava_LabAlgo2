package com.greatlearning.driver;

import com.greatlearning.services.BubbleSortImpl;
import com.greatlearning.services.CurrencyCountServiceImpl;

import java.util.Scanner;

public class CurrencyMain {

    public static void main(String[] args) {
        System.out.println("enter the size of currency denominations ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] notes = new int[size];
        System.out.println("enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            notes[i] = sc.nextInt();
        }
        System.out.println("enter the amount you want to pay");
        int amount = sc.nextInt();
        BubbleSortImpl bubbleSortImpl = new BubbleSortImpl();
        bubbleSortImpl.bubblesort(notes);
        CurrencyCountServiceImpl currencyCountServiceImpl = new CurrencyCountServiceImpl();
        currencyCountServiceImpl.currencyCountImpl(notes, amount);
    }

}
