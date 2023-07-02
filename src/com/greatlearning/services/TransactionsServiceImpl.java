package com.greatlearning.services;

public class TransactionsServiceImpl {

    public void search(int[] arr, long target){

        long sum = 0;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (sum >= target){
                System.out.println("Target achieved after "+(i+1)+" transaction");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Given target is not achieved");
        }
    }

}
