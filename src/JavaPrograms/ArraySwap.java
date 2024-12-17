package JavaPrograms;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] swapInt = {1, 2, 3, 4};
        int[] swapInt1={};
        System.out.println("Before swap: swapInt: " + Arrays.toString(swapInt));
        for (int i=0; i<swapInt.length;i++) {
            int temp = swapInt[swapInt.length - 1];
            System.out.println("temp: " + temp);
            swapInt[swapInt.length - 1] = swapInt[i];
            System.out.println("swapInt[swapInt.length-1]: " + swapInt[swapInt.length - 1]);
            swapInt[i] = temp;
            System.out.println("swapInt[i]: " + swapInt[i]);

        }
        System.out.println("After swap: swapInt: " + Arrays.toString(swapInt));
    }
}
