package programmers.lv1;


//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
//        solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
//
//        제한 조건
//        n은 길이 10,000이하인 자연수입니다.
public class pr20 {
    public String solution(int n) {
        String answer = "";
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                answer += "수박";
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                answer += "수박";
            }
            answer += "수";
        }

        return answer;
    }
}
