package com.treecharacters.demo.methods;

public class MethodStar {

    public static void methodPyramid(int scan) {
        String star = "*";
        int k = 0;


        for (int i = 1; i <= scan; i++, k = 0) {
            for (int j = 1; j <= scan - i; ++j) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print(star + " ");
                k++;
            }
            System.out.println("");

        }
    }
}
