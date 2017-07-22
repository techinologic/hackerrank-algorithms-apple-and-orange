import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int[] apple = new int[m];//{-2, 2, 1};
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n]; //{5, -6};
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        int numApple = 0;
        for (int i = 0; i < m; i++) {
            if ((apple[i] + a) >= s && (apple[i] + a) <= t) {
                numApple++;
            }
        }
        System.out.println(numApple);

        int numOrange = 0;
        for (int i = 0; i < n; i++) {
            if ((orange[i] + b) >= s && (orange[i] + b) <= t) {
                numOrange++;
            }
        }
        System.out.println(numOrange);
    }
}
