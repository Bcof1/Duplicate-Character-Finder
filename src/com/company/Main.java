package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        System.out.println("Input a string:");
        HashMap<Character, Integer> duplicates = new HashMap<>();

        try {
            char[] characters = bufferedReader.readLine().toCharArray();

            for (char chars : characters) { // for every character they type it will add it to the hashmap which takes a char, and an int
                if(!duplicates.containsKey(chars)){
                    duplicates.put(chars, 1);
                }else{
                    int count = duplicates.get(chars);
                    duplicates.put(chars, ++count); // adds the number up next to the char to know that it has been in the map more than once
                }
            }
            System.out.println("Duplicates found is:");
            for(char chars : duplicates.keySet()){ // goes through the hashmap which then sees if any of the characters appeared more than once
                if(duplicates.get(chars) > 1){
                    System.out.println(chars + " Appeared " + duplicates.get(chars) + " times!");
                }
            }
        }catch (IOException e){
        }
    }
}
