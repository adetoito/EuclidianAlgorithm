package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean inputting = true;

        int a = 0;
        int b = 0;

        while (inputting) {
            System.out.println("Input first number.");
            try {
                a = sc.nextInt();
                inputting = false;
            } catch (InputMismatchException ime) {
                System.out.println("Input a number please.");
            }
        }
        inputting = true;
        while (inputting) {
            System.out.println("Input second number.");
            try {
                b = sc2.nextInt();
                inputting = false;
            } catch (InputMismatchException ime) {
                System.out.println("Input a number please.");
            }
        }

        System.out.println("Recursive GCD of " + a + " and " + b + ": " + recursiveGCD(a, b));
        System.out.println("Iterative GCD of " + a + " and " + b + ": " + iterativeGCD(a, b));
    }

    public static int recursiveGCD (int A, int B) {
        if (A == 0) {
            return B;
        } else if (B == 0) {
            return A;
        } else {
            int R = A/B;
            return recursiveGCD(B, R);
        }
    }

    public static int iterativeGCD (int A, int B) {
        boolean calculating = true;
        int answer = 0;
        while (calculating) {
            if (A == 0 || B == 0) {
                if (A == 0) {
                    answer = B;
                    calculating = false;
                } else {
                    answer = A;
                    calculating = false;
                }
            }
            int R;
            try {
                R = A/B;
                A = B;
                B = R;
            } catch (ArithmeticException e) {
                if (A == 0 || B == 0) {
                    if (A == 0) {
                        answer = B;
                        calculating = false;
                    } else  {
                        answer = A;
                        calculating = false;
                    }
                }
            }

        }
        return answer;
    }
}
