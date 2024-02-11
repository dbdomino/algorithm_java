package com.ex.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // HashMap을 이용해서 푼다. Key는 String, Value는 Integer로 한다. Key는 사람의 이름을 저장할 것이고,
        // Value로는 이 사람이 Map에 들어간 횟수를 저장할 것이다.
        Map<String, Integer> map = new HashMap<>();
        // 그리고 입력으로 듣도 못한 사람들의 이름이 주어질 때 이 HashMap에 Value는 1로 저장한다.
        // 그리고 보도 못한 사람들의 이름을 입력으로 받을 때 그 사람이 Map에 이미 들어있으면 Value는 2로 수정하고 없으면 Value 1로 그대로 Map에 넣는다.

        // 결과는 List에 저장 ArrayList
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i<n; i++) { // 듣도못한사람
            map.put(br.readLine(), 1);
        }

        for(int i = 0; i < m; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name,0) +  1); // 핵심이네. map.getOrDefault(key, default_value) value얻을때 key가없다면 기본값출력
            if (map.get(name) == 2) list.add(name);
        }
        StringBuilder sb = new StringBuilder();

        Collections.sort(list);
        sb.append(list.size() + "\n");
        for (String s : list) {
            sb.append(s + "\n");
        }

        System.out.print(sb);
    }

}
