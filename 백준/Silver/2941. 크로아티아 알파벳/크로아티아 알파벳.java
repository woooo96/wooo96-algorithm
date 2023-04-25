import java.util.Scanner;

//č	c=
//ć	c-
//dž	dz=
//đ	d-
//lj	lj
//nj	nj
//š	s=
//ž	z=
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int cnt =0;
        String[] alphabet = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String croatiaWord : alphabet) {
            cnt += (str.length() - str.replace(croatiaWord, "").length())/croatiaWord.length();
            str = str.replace(croatiaWord, " ");
        }
        cnt+=str.replace(" ", "").length();
        System.out.println(cnt);

    }
}
