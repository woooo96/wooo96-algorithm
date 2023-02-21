class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] sArr1 = new String[arr1.length];
        String[] sArr2 = new String[arr2.length];

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                temp = arr1[i]%2 + temp;
                arr1[i]/=2;
            }
            if (temp.length()!=n) {
                while (temp.length() != n) {
                    temp = "0" + temp;
                }
            }
            sArr1[i]=temp;
        }

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                temp = arr2[i]%2 + temp;
                arr2[i]/=2;
            }
            if (temp.length()!=n) {
                while (temp.length() != n) {
                    temp = "0" + temp;
                }
            }
            sArr2[i]=temp;
        }

        for (int i = 0; i < n; i++) {
            String temp="";
            for (int j = 0; j < n; j++) {
                if(sArr1[i].charAt(j)=='1'||sArr2[i].charAt(j)=='1') {
                    temp+="#";
                } else {
                    temp+=" ";
                }
            }
            answer[i]=temp;
        }

        return answer;
    }
}