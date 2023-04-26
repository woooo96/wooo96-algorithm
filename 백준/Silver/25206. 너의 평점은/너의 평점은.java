import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Float pNum = 0f, totalNum = 0f, totalGrade = 0f;
        String[][] array = new String[20][3];
        for (int i = 0; i < 20; i++) {
            array[i] = br.readLine().split(" ");
            if (array[i][2].equals("P")) pNum += Float.parseFloat(array[i][1]);
            totalGrade += Float.parseFloat(array[i][1]) * Float.parseFloat(grade(array[i][2]));
            totalNum+=Float.parseFloat(array[i][1]);
        }
        totalNum-=pNum;
        System.out.println(totalGrade/totalNum);
    }

    public static String grade(String grade) {
        switch (grade) {
            case "A+":
                return "4.5";
            case "A0":
                return "4.0";
            case "B+":
                return "3.5";
            case "B0":
                return "3.0";
            case "C+":
                return "2.5";
            case "C0":
                return "2.0";
            case "D+":
                return "1.5";
            case "D0":
                return "1.0";
            default:
                return "0.0";
        }
    }
}