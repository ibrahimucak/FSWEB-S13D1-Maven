package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width of rectangle:");
        double width = scanner.nextDouble();
        System.out.println("enter height of rectangle:");
        double height = scanner.nextDouble();
        System.out.println("area of rectangle:" + area(width,height));

        System.out.println("enter radius of circle");
        double radius = scanner.nextDouble();
        System.out.println("area of circle:" + area(radius));


    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
            if (clock<0 ||  clock >23 || !isBarking) {
                return false;
            }
            return clock>=20 || clock < 8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge > 13 && firstAge <= 19) ||
                (secondAge > 13 && secondAge <= 19) ||
                (thirdAge > 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int lowestTemp = 25;
        int highestTemp = isSummer ? 45:35;

        if(temp<highestTemp && temp>lowestTemp){
            return true;
        }else{
            return false;
        }
     
    }

    public static double area(double width, double height) {
       if(width<0 || height < 0 )
           System.out.println("width veya height 0 dan küçük olamaz. !! width:" + width + "Height:" + height);
        int i = -1;
        return i;

    }



    public static double area(double radius) {
       if (radius<0){
           System.out.println("radius can not be less than zero!!! Radius : " + radius);
           return -1;
       }
       return Math.PI*Math.pow(radius,2);
    }
}
