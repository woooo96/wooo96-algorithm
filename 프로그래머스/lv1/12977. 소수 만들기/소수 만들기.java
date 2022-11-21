class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] cntArray=new int[2998];
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int sum=nums[i]+nums[j]+nums[k];
                    cntArray[sum]++;
                }
            }
        }
        int k=0;

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