package DSANotesProblems;

import java.util.Arrays;


//    static int[] sort(int[] in){  //{5,3,1,4,2}
//        int count=0;
//        System.out.println("Arays before sort is: "+Arrays.toString(in));
//
//    }
//
//    static void swap(int[] in){
//        for(int i=0; i< in.length;i++ ){
//            for (int j=0; j<in.length-i-1;j++){
//                count++;
//                System.out.println("count is: "+count);
//                System.out.println("Element at i and j are: "+in[i]+ "   "+in[j]);
//                if(in[j]>in[j+1]) {
//                    int temp = in[j];
//                    in[j] = in[j+1];
//                    in[j+1] = temp;
//                }
//                System.out.println("Arays after sort is: "+Arrays.toString(in));
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] in={5,3,1,4,2};
//        System.out.println("sort :"+ sort(in));
//    }

    public class BubbleSort {
        public static void main(String[] args) {
            int[] numbers = {5, 3, 8, 6, 2};


            bubbleSort(numbers);

            System.out.println("Sorted Array: " + Arrays.toString(numbers));
        }

        public static void bubbleSort(int[] array) {
            int n = array.length;
            int count=0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.println("elements at j ad j+1: "+ array[j]+"   "+ array[j+1]);
                    if (array[j] > array[j + 1]) {

                        // Swap elements
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        count++;
                        System.out.println("Sorted Array after "+count + Arrays.toString(array));


                    }
                }
            }
        }
    }

