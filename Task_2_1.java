import java.util.Scanner;
public class Task_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку =  ");
        String s = sc.nextLine();
        int[] index = new int[s.length()];
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            index[i] = count;
            count-=1;
        }
        System.out.println(shuffle(s, index));
        sc.close();
    }
    public static String shuffle(final String s, final int[] index) {
        char[] chars = s.toCharArray();
        String res = "";
        for (int i : index)
            res += chars[i - 1];
        return res;
    }
}