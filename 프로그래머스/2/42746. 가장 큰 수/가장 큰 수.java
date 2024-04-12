import java.util.Arrays;
class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            StringBuilder result = new StringBuilder();

            String[] strArray = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

            /*
            Comparator의 compareTo
            Comparator를 사용하여 문자열을 붙여서 판단 후 내림차순 정렬해야한다.

            a.compareTo(b)는 a의 아스키 코드 값과 b의 아스키 코드를 비교하는 메서드이다.
            a는 기존에 존재하던 값을 의미하고 b는 새롭게 들어오는 값을 의미한다.
            이때 (a - b) > 0라면 양수가 반환되고 그 반대에는 음수가 반환, 값이 같을 때에는 0을 리턴한다.
            음수거나 0일 때에는 순서가 그대로 유지되지만 양수가 나오게 되면 두 값의 자리가 변경된다.
            (o2+o1) > (o1+o2) 여기서 +는 덧셈이 아니라 합치는 걸 의미한다.
            오름차순으로 정렬시 (o2 + o1).compareTo(o1 + o2)
            내림차순으로 정렬시 (o1 + o2).compareTo(o1 + o2)

            [3, 30, 34, 5, 9]를 비교하면 (o2 + o1).compareTo(o1 + o2)를 이용하여 비교하면 다음과 같은 결과가 나온다.

            o2 + o1 = 330 o1 + o2 = 303
            o2 + o1 = 3034 o1 + o2 = 3430
            o2 + o1 = 3034 o1 + o2 = 3430
            o2 + o1 = 334 o1 + o2 = 343
            o2 + o1 = 35 o1 + o2 = 53
            o2 + o1 = 345 o1 + o2 = 534
            o2 + o1 = 39 o1 + o2 = 93
            o2 + o1 = 349 o1 + o2 = 934
            o2 + o1 = 59 o1 + o2 = 95
             */
            Arrays.sort(strArray, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
            
            if (strArray[0].equals("0")) {
                return "0";
            }

            for (int i = 0; i < strArray.length; i++) {
                result.append(strArray[i]);
            }


            return result.toString();
        }
    }