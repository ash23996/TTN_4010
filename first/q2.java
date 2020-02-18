package com.first;

public class q2 {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";
        int count;

        //Converts the string into lowercase
        string = string.toLowerCase();

        //Split the string into words using built-in function
        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int word = 0; word < words.length; word++) {
            count = 1;
            for (int nxtword = word+1 ; nxtword < words.length; nxtword++) {
                if (words[word].equals(words[nxtword])) {
                    if(words[nxtword]!="0")
                        count++;
                    words[nxtword]="0";
                }
            }
            if (count > 1 )
                System.out.println(words[word]+"=duplicate word and  no of occurence="+count);
        }

    }
}