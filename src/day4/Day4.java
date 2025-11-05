package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int sizeArr = input.nextInt();
//
//        int[] elements = new int[sizeArr];
//        Random randomElem = new Random();
//
//        int counterNumberOne = 0;
//        int counterMoreEight = 0;
//        int counterEvenNumbers = 0;
//        int counterOddNumbers = 0;
//        int sumOfAllElements = 0;
//
//        for(int i=0; i<sizeArr; i++){
//            elements[i] = randomElem.nextInt(1,10);
//
//            if(elements[i] > 8) counterMoreEight++;
//            if(elements[i] == 1) counterNumberOne++;
//            if(elements[i] % 2== 0) counterEvenNumbers++;
//            if(elements[i] % 3 == 0) counterOddNumbers++;
//
//            sumOfAllElements += elements[i];
//        }
//
//        System.out.println(Arrays.toString(elements));
//        System.out.println(elements.length);
//        System.out.println(counterMoreEight);
//        System.out.println(counterNumberOne);
//        System.out.println(counterEvenNumbers);
//        System.out.println(counterOddNumbers);
//        System.out.println(sumOfAllElements);



//        int[] arr = new int[100];
//        Random randomValue = new Random();
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = randomValue.nextInt(0, 1000);
//        }
//
//        int findMaxElement = 0;
//        int findMinElement = arr.length-1;
//        int findElementEndZeroCount = 0;
//        int findElementEndZeroSum = 0;
//
//        for(int i: arr){
//            if(i > findMaxElement){
//                findMaxElement = i;
//            }
//            if(findMinElement > i){
//                findMinElement = i;
//            }
//            if(i%10==0){
//                findElementEndZeroCount++;
//            }
//            if(i%10==0){
//                findElementEndZeroSum+=i;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(findMaxElement);
//        System.out.println(findMinElement);
//        System.out.println(findElementEndZeroCount);
//        System.out.println(findElementEndZeroSum);



//        Random rand = new Random();
//        int[][] matrix = new int[12][8];
//        int[] totalElemArray = new int[12];
//        int temp = 0;
//
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[i].length; j++){
//                matrix[i][j] = rand.nextInt(50);
//                temp += matrix[i][j];
//            }
//            totalElemArray[i] = temp;
//            temp = 0;
//        }
//        int maxElemIndex = 0;
//        int elem = totalElemArray[0];
//        for(int i=0; i<totalElemArray.length; i++){
//            if (totalElemArray[i] > elem) {
//                elem = totalElemArray[i];
//                maxElemIndex = i;
//            }
//        };
//        System.out.println(Arrays.toString(totalElemArray));
//        System.out.printf("The maximum number is %d", maxElemIndex);



        int[] numbers = new int[100];
        Random random = new Random();

        for(int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(0, 10000);
        };

        int maxSum = 0;
        int maxIndex = 0;

        for(int i=0; i<numbers.length-2; i++){
            int sum = numbers[i] + numbers[i+1] + numbers[i+2];
            if(sum > maxSum){
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.printf("Maximum sum: %d, Maximum index: %d", maxSum, maxIndex);


    }
}
