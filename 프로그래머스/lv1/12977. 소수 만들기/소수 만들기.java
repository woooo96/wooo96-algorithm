class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 합을 더해서 카운트 할 배열 선언(숫자 3개의 합을 최대로 해서 배열 생성)
        int[] cntArray=new int[2998];
        // 배열을 순회하며 숫자 3개의 합을 cntArray 배열에 입력
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int sum=nums[i]+nums[j]+nums[k];
                    cntArray[sum]++;
                }
            }
        }
        int k=0;
        // cntArray 배열을 체크하여 0이 아닌 인덱스를 중복문을 통해 소수인지 체크하고 소수이면 answer에 해당 인덱스 값을 더함.
        for (int i=6; i<cntArray.length; i++) {
            if (cntArray[i] != 0) {
                for (int j=2; j<i; j++) {
                    if (i%j == 0) {
                        k=0;
                        break;
                    }
                    k++;
                }
                if (k!=0) {
                    answer+=cntArray[i];
                }
                k=0;
            }
        }

        return answer;
    }
}