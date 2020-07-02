package lambda_streams;

import java.util.Arrays;
import java.util.List;

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
            2500);

    public static void main(String[] args) {
        // Part I :complete the static class methods that have been set up in this
        // Numbers class java file. Use streams to compute the results wheever possible.
        System.out.println(nums);

        // Part II - refactor all of the class methods to accept lambda expressions. You
        // can put the lambda functions directly inside the method calls, or defined
        // them first, then pass them into the methods. give them the same names as the
        // static methods, but add the word 'lambda' in front of every lambda function:
        /*
         * e.g.
         * 
         * added(() -> {});
         * 
         * OR
         * 
         * lambdaAdd = () -> {}; added(lambdaAdd);
         * 
         * isOdd(() -> {});
         * 
         * OR
         * 
         * lambdaOdd = () -> {}; isOdd(lambdaOdd); etc...
         * 
         */
        isPrime(nums);
        isEven(nums);
        isOdd(nums);
        added(nums);
        subtracted(nums);
        multipled(nums);
    }

    static boolean isOdd(List<Integer> nums) {
        // determine if the value at the index i is odd. return true if yes, return
        // false if no.
        Actions1 lambdaIsEven = (i) -> {
            if (i % 2 != 0) {
                return true;
            } else {
                return false;
            }
        };
        int k = 0;
        while (k < nums.size()) {
            System.out.println(lambdaIsEven.oneInt(nums.get(k)));
            k++;
        }
        System.out.println("The isOdd method works!");
        return true;
    }

    static boolean isEven(List<Integer> nums) {
        // determine if the value at the index i is even. return true if yes, return
        // false if no.
        Actions1 lambdaIsEven = (i) -> {
            if (i % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        int k = 0;
        while (k < nums.size()) {
            System.out.println(lambdaIsEven.oneInt(nums.get(k)));
            k++;
        }
        System.out.println("The isEven method works!");
        return true;

    }

    static boolean isPrime(List<Integer> nums) {
        // determine if the value at the index i is a prime number. return true if yes,
        // return false if no.
        Actions1 lambdaIsPrime = (i) -> {
            if (i == 2) {
                return true;
            } else if (i < 2) {
                return false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        };
        int k = 0;
        while (k < nums.size()) {
            System.out.println(lambdaIsPrime.oneInt(nums.get(k)));
            k++;
        }
        System.out.println("The isPrime method is working, it'll now return true!");
        return true;
    }

    static int added(List<Integer> nums) {
        // add all the elements in the list. return the sum.
        Action lambdaAdded = () -> {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return sum;
        };
        System.out.println(lambdaAdded.noInt());
        return 0;
    }

    static int subtracted(List<Integer> nums) {
        // subtract all the elements in the list. return the remainder.
        Action lambdaSubtracted = () -> {
            int subtraction = 0;
            for (int num : nums) {
                if (subtraction == 0) {
                    subtraction = num;
                } else {
                    subtraction -= num;
                }
            }
            return subtraction;
        };
        System.out.println(lambdaSubtracted.noInt());
        return 0;
    }

    static int multipled(List<Integer> nums) {
        // multiply all the elements in the list. and return the product.
        Action lambdaMultiplied = () -> {
            int product = 1;
            for (int num : nums) {
                if (product == 1) {
                    product = num;
                } else {
                    product *= num;
                }
            }
            return product;
        };
        System.out.println(lambdaMultiplied.noInt());
        return 0;
    }

    static int divided() {
        // multiply all the elements in the list. and return the product.
        return 0;
    }

    static int findMax() {
        // return the maximum value in the list.
        return 0;
    }

    static int findMin() {
        // return the minimum value in the list.
        return 0;
    }

    static int compare(int i, int j) {
        // compare the values stored in the array at index position i and j.
        // if the value at i is greater, return 1. if the value at j is greater, return
        // -1. if the two values are equal, return 0.
        return 0;
    }

    static int append(int n) {
        // add a new value to the values list. return that value after adding it to the
        // list.
        return 0;
    }

}

interface Actions {
    public int oneInt(int i);
}

interface Actions1 {
    public boolean oneInt(int i);
}

interface Action {
    public int noInt();
}

interface Actions2 {
    public int twoInt(int i, int j);
}
