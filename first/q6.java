package com.first;

public class q6 {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,4,4,5,5,6};
        int count=0;
        for(int element=0;element<arr.length;element++) {
            for(int nxtelement=0;nxtelement<arr.length;nxtelement++) {
                if(arr[element]==arr[nxtelement])
                    count++;
            }
            if(count==1)
                System.out.println("once in an array="+arr[element]);
            count=0;
        }
    }
}