package GreedyAlgorithm;

//Approach=> Selecting items by value/weight ratio - O(nlogn) TC and O(n) SC

//The idea is to always pick items greedily based on their value-to-weight ratio.
// Take the item with the highest ratio first, then the next highest, and so on, until the knapsack is full.
// If any item doesn’t fully fit, then take its fractional part according to the remaining capacity.

//Steps to solve:
// Calculate value/weight ratio for all items and sort it in decreasing order.

import java.util.Comparator;
import java.util.*;

public class FractionalKnapsack {
    public static class ItemComparator implements Comparator<int[]>{
        public int compare(int[] a,int[] b){
              double a1=(1.0*a[0])/a[1];
              double b1=(1.0*b[0])/b[1];
              return Double.compare(b1,a1);
        }
    }
    public static double fractionalKnapsack(int[] val,int[] wt,int capacity){
        int n=wt.length;
        int[][] ratio=new int[n][2];
        for(int i=0;i<n;i++){
            ratio[i][0]=val[i];
            ratio[i][1]=wt[i];
        }
        Arrays.sort(ratio, new ItemComparator());
        double ans=0.0;
        for(int i=0;i<n;i++){
            if(ratio[i][1]<=capacity){
                capacity-=ratio[i][1];
                ans+=ratio[i][0];
            }else{
                ans+=((1.0*ratio[i][0])/ratio[i][1])*capacity;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;

        System.out.println(fractionalKnapsack(val, wt, capacity));
    }
}
