class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max_array = Integer.MIN_VALUE;
        int max = 0;
        int double_max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_array) {
                max_array = array[i];
            }
        }
        int[] index = new int[max_array + 1];

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] == max) {
                double_max += 1;
            } else if (index[i] > max) {
                double_max = 0;
                max = index[i];
                answer = i;
            }

        }
        if (double_max != 0) {
            answer = -1;
        }
        
        return answer;
    }
}