import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        // 수포자 학생의 찍는 방식패턴을 다차원 배열로 선언
        int[][] student = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        // 학생별로 정답과 비교하여 맞춘 개수 저장할 배열 선언
        int[] cnt=new int[3];
        int max=0, max_count=0;

        // 배열을 순회하며 맞춘 개수를 cnt배열에 카운팅
        for(int i=0; i<student.length; i++) {
            for (int j=0, z=0; j<answers.length; j++) {
                //answer의 정답을 하나씩 비교하며 맞춘 값 카운팅
                if (answers[z]==student[i][j]) {
                        cnt[i]++;
                }
                // z(answers 배열의 값을 하나씩 증가시키며 확인하기 위한 변수) 와 answers.length가 동일하면 break;
                if (answers.length==++z) {
                    break;
                /*j(수포자 학생이 찍는 패턴의 인덱스를 가리키는 변수) 값이 length-1값과 동일해지면(==찍는 패턴의 마지막에 도달하면)
                -1을 대입하고 위의 for문에서 j++를 통해 다시 j=0값부터 answers값과 비교하도록 설정*/
                } else if (j==student[i].length-1) {
                    j=-1;
                }
            }
        }
        // cnt 배열을 순회하며 가장 높게 나온(==가장 많이 맞춘) 값을 max에 저장하고, max값이 동일할 경우 max_count를 ++ 해줌.
        for(int i=0; i<cnt.length; i++) {
            if (max < cnt[i]) {
                max_count=1;
                max=cnt[i];
            } else if(max==cnt[i]) {
                max_count++;
            }
        }
        // answer 배열 length를 max_count값으로 설정 
        answer = new int[max_count];
        // cnt[i]값이 max값과 같다면 해당 학생이 가장 많이 맞춘 학생이므로 answer 배열에 학생의 인덱스(i)+1를 입력
        for (int i=0, j=0; i<cnt.length; i++) {
            if (cnt[i]==max) {
                // max값이 나온 학생은 정해져 있으나, i를 증가시켜 answer에 대입할경우 배열 length를 초과하게 되어 에러 발생. 
                answer[j]=i+1;
                j++;
            }
        }
        // answer배열 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
}