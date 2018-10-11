package com.company;
import java.util.*;
import java.util.Scanner;
public class Main {
    /*enter the year
        if the year id divisible by 4 then it is a leap year
        or not a leap year*/
      public static void main(String[] args) {
          if (isleapyear()) {
              System.out.println("is a leap year");
          } else {
              System.out.println("is not a leap year");
          }
      }

        public static boolean isleapyear(){
          boolean year = false;
          Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of days in a year");
            int userInput = sc.nextInt();
            if(userInput%4 ==0){
                year = true;
            }
            return year;

        }
    }

