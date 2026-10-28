package com.pruralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        FileReader fr1 = new FileReader("goldilocks.txt");
        FileReader fr2 = new FileReader("hansel_and_gretel.txt");
        FileReader fr3 = new FileReader("mary_had_a_little_lamb.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        BufferedReader br2 = new BufferedReader(fr2);
        BufferedReader br3 = new BufferedReader(fr3);
        Scanner storyScanner = new Scanner(System.in);
        System.out.println("Enter the name of a story:");
        System.out.println("goldilocks.txt");
        System.out.println("hansel_and_gretel.txt");
        System.out.println("mary_had_a_little_lamb.txt");
        switch (storyScanner.nextLine()) {
            case "goldilocks.txt":
                int lineNumber = 1;

                String line;
                while((line = br1.readLine()) != null) {
                    System.out.println(lineNumber + ". " + line);
                    ++lineNumber;
                    Thread.sleep(1950L);
                }
                break;
            case "hansel_and_gretel.txt":
                int lineNumber2 = 1;

                String line2;
                while((line2 = br2.readLine()) != null) {
                    System.out.println(lineNumber2 + ". " + line2);
                    ++lineNumber2;
                    Thread.sleep(1950L);
                }
                break;
            case "mary_had_a_little_lamb.txt":
                int lineNumber3 = 1;

                String line3;
                while((line3 = br3.readLine()) != null) {
                    System.out.println(lineNumber3 + ". " + line3);
                    ++lineNumber3;
                    Thread.sleep(1950L);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        br1.close();
        br2.close();
        br3.close();
    }
}
