package com.ex.baekjoon.집합과맵;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ex7785 {
//    static final HashMap<String, String> map2 = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        final HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String state = sc.next();



//            if (map.containsKey(name)) {
            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, state);
            }
        }

        // 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력한다.
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for(String li : list) {
            System.out.println(li);
        }

    }
}
