public class Swap {
    public int[] swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        return new int[] { num1, num2 };
    }
}

