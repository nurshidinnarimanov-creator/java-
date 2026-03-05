public class Task11 {
    public static void main(String[] args) {
        int[] A = new int[25];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random()*100);
        }

        int min = A[0], max = A[0];
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
                minIndex = i;
            }
            if (A[i] > max) {
                max = A[i];
                maxIndex = i;
            }
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;
    }
}