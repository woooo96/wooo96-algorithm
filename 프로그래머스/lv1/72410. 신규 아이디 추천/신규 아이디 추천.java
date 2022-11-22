class Solution {
    public String solution(String new_id) {
        String answer = "";

        //1단계
        new_id=new_id.toLowerCase();

        //2단계
        new_id=new_id.replaceAll("[^a-z\\d-_.]","");

        //3단계
        new_id=new_id.replaceAll("\\.{2,}",".");

        //4단계
        new_id=new_id.replaceAll("^[.]|[.]$", "");

        //5단계
        if(new_id.equals("")) {
            new_id="a";
        }

        //6단계
        if(new_id.length()>15) {
            new_id=new_id.substring(0,15);
            if (new_id.charAt(14)=='.') {
                new_id=new_id.substring(0,new_id.length()-1);
            }
        }

        //7단계
        if(new_id.length()<=2) {
            while (true) {
                new_id+=new_id.charAt(new_id.length()-1);
                if(new_id.length()==3) {
                    break;
                }
            }

        }
        answer=new_id;
        return answer;

    }
}