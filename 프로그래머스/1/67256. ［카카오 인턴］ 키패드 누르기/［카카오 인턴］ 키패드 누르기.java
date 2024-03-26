class Solution {
    public String solution(int[] numbers, String hand) {
        int leftLocation=10; // 처음위치 *
        int rightLocation=12; // 처음위치 #

        int[][] keybord = {{1,4,7,10},{2,5,8,0},{3,6,9,12}};


        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftLocation = number;
            } else if (number == 3|| number == 6 || number == 9) {
                sb.append("R");
                rightLocation = number;
            } else {
                if (number == 0) number=11;
                int leftDiff = (Math.abs(number - leftLocation) / 3) + (Math.abs(number - leftLocation) % 3);
                int rightDiff =(Math.abs(number - rightLocation) / 3) + (Math.abs(number - rightLocation) % 3);

                if (leftDiff == rightDiff){
                    if ("left".equals(hand)){
                        sb.append("L");
                        leftLocation = number;
                    }else {
                        sb.append("R");
                        rightLocation = number;
                    }
                } else if (leftDiff > rightDiff){
                    sb.append("R");
                    rightLocation = number;
                } else {
                    sb.append("L");
                    leftLocation = number;
                }
            }

        }
        String answer = sb.toString();
        return answer;
    }
}