package Searching;

import java.util.*;
class ThreeSumToZero{
    public static List<List<Integer>> findTriplets(int[] arr){
        HashMap<Integer,List<Integer>> mp=new HashMap<>(); //Here, the key part is the number and the value part is the indices where it's present
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                int val=-1*(arr[j]+arr[k]);
                if(mp.containsKey(val)){
                    for(int i : mp.get(val)){ //basically the number of times 'val' is present in the Map
                        ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    }
                }
            }
            mp.putIfAbsent(arr[j],new ArrayList<>());
            mp.get(arr[j]).add(j);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,2,3,1,-5};
        List<List<Integer>> ans=findTriplets(arr);
        for(List<Integer> list : ans){
            System.out.print(list.get(0)+" "+list.get(1)+" "+list.get(2));
            System.out.println();
        }
    }
}