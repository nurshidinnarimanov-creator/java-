public class Task7 {
    public static void main(String[] args) {
        int[][] B = new int[5][5];
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                B[i][j] = (int)(Math.random()*20 - 10);
                if (B[i][j] > 0) sum += B[i][j];
            }
            A[i] = sum;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(A[i]);
        }
    }
}