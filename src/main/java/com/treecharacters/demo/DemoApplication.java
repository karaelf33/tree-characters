package com.treecharacters.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.treecharacters.demo.methods.MethodStar.methodPyramid;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen basamak sayısını gir:");

        int scan = scanner.nextInt();

        methodPyramid(scan);

    }

}
