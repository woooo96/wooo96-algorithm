class Solution {
    public int solution(String s) {
        int answer = 0;
        String[][] numbers = {{"0", "zero"},{"1", "one"},{"2", "two"},{"3","three"},{"4","four"},{"5","five"},{"6","six"},{"7","seven"},{"8","eight"},{"9","nine"}};
        for (int i=0; i<numbers.length; i++) {
            s=s.replace(numbers[i][1], numbers[i][0]);
        }
        answer=Integer.parseInt(s);
        return answer;
    }
}