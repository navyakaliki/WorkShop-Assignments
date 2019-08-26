public class ForLoopExample {
    public static void main(String s[]) {
        for(int j=1; j<=5 ; j++) {
            System.out.println(String.format("\n\n%d Table\n", j));
            for (int i = 1; i <= 12; i++) {
                System.out.println(String.format("%d X %d = %d", j, i, j * i));
            }
        }
    }
}