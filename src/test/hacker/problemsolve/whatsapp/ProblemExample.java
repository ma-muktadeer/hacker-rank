public class ProblemExample {
    public static void main(String[] args) {
        int[] test = { 3, 2, 1, 4, 1 };
        System.out.println(isMiddleValueIsLessThenAllOtherValues(test));
    }

    static int isMiddleValueIsLessThenAllOtherValues(int[] test) {
        if (test.length % 2 == 0) {
            return 0;
        }
        int midleIndex = test.length / 2;
        // System.out.println("midleIndex: " + midleIndex);
        int res = test[midleIndex];
        // System.out.println("res: " + res);
        for (int i = 0; i < test.length; i++) {
            if (i != midleIndex && test[i] <= res) {
                return 0;
            }
        }
        return 1;
    }
}