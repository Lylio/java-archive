package junit;

public class MyMath {
    public int mySum(int[] numbers) {
        int sumTotal = 0;
        for(int i : numbers) {
            sumTotal += i;
        }
        return sumTotal;
    }
}

