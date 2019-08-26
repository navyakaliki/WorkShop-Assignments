public class ForNestedLoopExample {
    public static void main(String s[]) {
        outerLoop: for(int j=1; j<=20; j++) {
            innerLoop: for (int i = 1; i <= 10; i++) {
                if((j == 5 || j== 10 || j ==15)  && i>5) {
                                    }
                System.out.println(String.format("%d X %d = %d", j, i, j * i));
            }
        }
    }
}
