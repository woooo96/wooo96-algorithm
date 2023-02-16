import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> max = new ArrayList<>();
        int maxp= nums.length/2;
        Arrays.sort(nums);
        max.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]!=nums[i]) {
                max.add(nums[i]);
            }
        }
        if(max.size()>maxp) {
            answer = maxp;
        } else {
            answer = max.size();
        }

        return answer;
    }
}