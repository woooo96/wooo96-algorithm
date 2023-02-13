class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        int index=0;
        for (int i = 0; i < words.length-1; i++) {

            for (int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    index=j;
                    answer[0] = (index+1)%n==0 ? n : (index+1)%n;
                    answer[1] = answer[0]!=n ? (index+1)/n+1 : (index+1)/n;
                    return answer;
                }
            }
            if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)) {
                index=i+1;
                answer[0] = (index+1)%n==0 ? n : (index+1)%n;
                answer[1] = answer[0]!=n ? (index+1)/n+1 : (index+1)/n;
                return answer;
            }



            if(index!=0) {
                break;
            }
        }

        if(index==0) {
            answer = new int[]{0,0};
            return answer;
        }


        return answer;
    }
}