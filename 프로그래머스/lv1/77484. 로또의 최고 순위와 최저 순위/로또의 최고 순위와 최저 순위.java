class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] myCount=new int[46];  //1~45번의 값을 받기 위한 배열 크기 선언. -> 0~45=46
        int[] winCount=new int[46]; //1~45번의 값을 받기 위한 배열 크기 선언. -> 0~45=46
        int zeroCnt=0, sameCnt=0, high, low;

        //lottos에서 0인 값에 대해서 카운팅, 0 외에 다른숫자는 myCount[]++
        for (int i=0; i<lottos.length; i++) {
            if (lottos[i]==0) {
                zeroCnt++;
                continue;
            }
            myCount[lottos[i]]++;

        }
        //WinCount배열에 들어온 숫자를 winCount[] ++ 해준다.
        for (int i=0; i<win_nums.length; i++) {
            winCount[win_nums[i]]++;
        }
        //myCount, winCount 배열의 동일한 인덱스에 0이 아닌값이 들어가 있는 경우 sameCount++
        for (int i=0; i<myCount.length; i++) {
            if (myCount[i]!=0 && winCount[i]!=0) {
                sameCnt++;
            }
        }
        //high=same카운트 외에 다른숫자가 모두 맞는 경우 (최고 기대값)
        high=zeroCnt+sameCnt;
        //low=same카운트 외에 다른 숫자가 모두 틀리는 경우 (최저 기대값)
        low=sameCnt;

        switch (high) {
            case 6:
                answer[0]=1;
                break;
            case 5:
                answer[0]=2;
                break;
            case 4:
                answer[0]=3;
                break;
            case 3:
                answer[0]=4;
                break;
            case 2:
                answer[0]=5;
                break;
            default:
                answer[0]=6;
            break;
        }

        switch (low) {
            case 6:
                answer[1]=1;
                break;
            case 5:
                answer[1]=2;
                break;
            case 4:
                answer[1]=3;
                break;
            case 3:
                answer[1]=4;
                break;
            case 2:
                answer[1]=5;
                break;
            default:
                answer[1]=6;
                break;
        }

        return answer;
    }
}