package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String intput = reader.readLine();
            list.add(intput);
        }
        ArrayList<String> result = doubleValues(list);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i = i + 1) {
            list2.add(list.get(i));
            list2.add(list.get(i));
        }
        for(int i = 0; i < list2.size(); i ++){
            System.out.println(list2.get(i));
        }
        return list2;
    }
}


