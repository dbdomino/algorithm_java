package com.ex.programmers;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/176962
/*
ㅇ 과제는 시작하기로 한 시각이 되면 시작합니다.
ㅇ 새로운 과제를 시작할 시각이 되었을 때, 기존에 진행 중이던 과제가 있다면 진행 중이던 과제를 멈추고 새로운 과제를 시작합니다. (새과제 시작시간에 기존 멈추고 새과제 시작)
진행중이던 과제를 끝냈을 때, 잠시 멈춘 과제가 있다면, 멈춰둔 과제를 이어서 진행합니다. (멈춘과제있으면 멈춘과제부터 시작)
만약, 과제를 끝낸 시각에 새로 시작해야 되는 과제와 잠시 멈춰둔 과제가 모두 있다면, 새로 시작해야 하는 과제부터 진행합니다. (새로시작 과제 우선순위 up)
멈춰둔 과제가 여러 개일 경우, 가장 최근에 멈춘 과제부터 시작합니다. (최근에 멈춘 과제 다음순위)
과제 계획을 담은 이차원 문자열 배열 plans가 매개변수로 주어질 때, (과제 계획 2차원 문자열 배열 plans [] [])
과제를 끝낸 순서대로 이름을 배열에 담아 return 하는 solution 함수를 완성해주세요.

즉, 과제 하나 끝나고 빈시간동안은 안하는데, 결국 과제는 다해야되니, 마지막 순서대로라도 다 끝나게 된다는 소리네.

plans의 원소는 [name, start, playtime]의 구조로 이루어져 있습니다.
[plans, plans, plans ....] 구조임
    name : 과제의 이름을 의미합니다.  2 ≤ name의 길이 ≤ 10
    start : 과제의 시작 시각을 나타냅니다.   "hh:mm"의 형태로 "00:00" ~ "23:59" 사이의 시간값만 들어가 있습니다.
    playtime : 과제를 마치는데 걸리는 시간을 의미하며, 단위는 분입니다.    1 ≤ playtime ≤ 100
진행중이던 과제가 끝나는 시각과 새로운 과제를 시작해야하는 시각이 같은 경우 진행중이던 과제는 끝난 것으로 판단합니다.

plan은 순서대로 들어오지 않는 것으로 보임
[["science", "12:40", "50"], ["music", "12:20", "40"], ["history", "14:00", "30"], ["computer", "12:30", "100"]]
["science", "history", "computer", "music"]

 */
public class homework {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] strarr= {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
        for (int i = 0; i < strarr.length; i++)             System.out.println(Arrays.toString(strarr[i]));

        System.out.println(Arrays.toString(s.solution(strarr)));
    }
    static class Solution {
        public String[] solution(String[][] plansArr) {
            Plan[] plans = new Plan[plansArr.length];
            for(int i = 0; i < plansArr.length; i++) {
                plans[i] = new Plan(plansArr[i]);
            }
//            Arrays.sort(plans); // plan은 순서대로 들어오지 않는 것으로 보임, 정렬한번 해줌.
//            for (int i = 0; i < plans.length; i++) {            System.out.println(plans[i].toString());        } // 정렬전 plan
            Arrays.sort(plans, (a, b) -> a.start - b.start); // a.start - b.start -> start 음수가 나오면 a의 객체가 작다고 판단, 양수가 나오면 b의 객체가 작다고 판단,
                                                             // 그러므로 작 -> 큰 으로 정렬
//            Arrays.sort(plans, (a, b) -> a.start + b.start); // a.start + b.start  -> 정렬안됨
            System.out.println(Arrays.toString(plans));   // 정렬 후 plan

            Stack<Plan> stop = new Stack<>(); // 중지한 과제 스택, 맨나중에 들어간 과제가 우선순위를 잡음
            List<String> answer = new ArrayList<>(); // 완료한 과제
            for(int i = 0; i < plans.length - 1; i++) {
                Plan curPlan = plans[i];
                Plan nextPlan = plans[i + 1];
//                System.out.println("curPlan ["+i+"]: "+ curPlan.toString());   // 정렬 후 plan
//                System.out.println("nextPlan ["+i+"]: "+ nextPlan.toString());   // 정렬 후 plan

                if(curPlan.getEndTime() > nextPlan.start) { //  (새과제 시작시간에 기존 멈추고 새과제 시작)
                    curPlan.playTime = curPlan.getEndTime() - nextPlan.start; // 남은 과제진행시간 기록
                    stop.push(curPlan);  // Stack에 객체(o)를 저장한다. 기존과제 스택에 저장,
                    continue; // continue문은 해당 조건문 블록을 탈출하여 아래 명령문은 실행하지 않고, 다음 반복문 실행절차를 수행한다.
                }
                answer.add(curPlan.name); // 새과제 완료했으면 완료리스트에 현재과제 올림

                int restTime = nextPlan.start - curPlan.getEndTime(); // 여유시간 계산
                // 여유시간 있는데 멈춰둔 과제 없으면, 여유시간 사용안함.
//                System.out.println(restTime);
                while(restTime > 0 && !stop.isEmpty()) { // 여유시간 있고, 멈춰둔 과제 있으면, 멈춰둔 과제 진행
                    Plan stoppedPlan = stop.peek(); // Stack의 맨 위에 저장된 객체를 반환, pop()과 달리 Stack에서 객체를 꺼내지는 않음.
                    int timeDiff = stoppedPlan.playTime - restTime; // stoppedPlan.playTime 완료까지 남은 과제시간, 양수 과제1 완료못함. 0이면 완료. 음수 과제완료후 시간남음
                    stoppedPlan.playTime = timeDiff;  //  양수 과제1 완료못함 -> 과제1에 남은시간 갱신. 0이면 완료. 음수 과제완료 -> 마이너스로 시간들어가나 이후안써서 노상관
                    restTime = timeDiff * -1; // 과제1 완료못함 -> restTime 음수로해서 반복종료, 0이면 완료, 과제완료 -> restTime 양수되어 다시 반복 가능
                    if(timeDiff > 0) break; // 양수 과제1 완료못함 -> restTime다씀, 반복빼고 새로운과제 해야함.
                    answer.add(stop.pop().name); // 0이면 완료-> answer에 이름 올림,  음수 과제완료후 시간남음 ->answer에 이름올림, 남은 restTime있는지랑 남은과제 있으면 반복다시해서 남은과제 수행
                }
            }
            System.out.println(plans[plans.length - 1].name);
            System.out.println(stop.isEmpty()); // stop 비지 않음
            answer.add(plans[plans.length - 1].name); // 마지막 index의 plan 처리
            System.out.println("!stop.isEmpty() : "); //
            while(!stop.isEmpty()) {
//                String names = stop.pop().name;
//                System.out.println(names);
//                answer.add(names); // stack에 남아있던 plan들 넣기 // Stack의 맨 위에 저장된 객체를 꺼낸다. (비었을 때는 EmptyStackException 발생)
                answer.add(stop.pop().name); // stack에 남아있던 plan들 넣기 // Stack의 맨 위에 저장된 객체를 꺼낸다. 제시간에 못끝낸 숙제들은 가장 최근에 멈춘 과제 순으로 완료시켜 더함.
                // 결국은 다끝내게끔 되어 출력되야하므로
            }
            return answer.toArray(new String[answer.size()]);
        }
    }

    static class Plan {
        String name;
        int start; // 시작시간을 분으로 고침. 우선순위 정하려고
        int playTime;

        public Plan(String name, String start, String playTime) {
            this.name = name;
            String[] time = start.split(":");
            this.start = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]); // 시간 * 60 + 분
            this.playTime = Integer.parseInt(playTime);
        }

        public Plan(String[] plan) {
            this(plan[0], plan[1], plan[2]);
        }

        public int getEndTime() {
            return start + playTime;
        }

        public String toString(){
            return "[name: "+name+", start: "+start+", playTime:"+playTime+"]";
        }
    }

}
