class Solution {
   public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] array = new int[n];

        for (int i = 0; i < lost.length; i++) {
            array[lost[i]-1]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            array[reserve[i]-1]++;
        }

        if(array[0]==-1 && array[1]==1) {
            array[0]=0;
            array[1]=0;
        }

        for (int i = 1; i < array.length-1; i++) {
            if(array[i]==-1 && array[i-1]==1) {
                array[i]=0;
                array[i-1]=0;
            }
            if(array[i]==-1 && array[i+1]==1) {
                array[i]=0;
                array[i+1]=0;
            }
        }

        if(array[array.length-1]==-1 && array[array.length-2]==1) {
            array[array.length-1]=0;
            array[array.length-2]=0;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0) answer++;
        }

        return answer;
    }
}