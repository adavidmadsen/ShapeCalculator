package com.company;

import java.util.concurrent.Callable;

public class Main
{

    public static void main(String[] args)
    {


        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Enter C for circle, R for rectangle, S for square:");
        String command = userInput.next();
    
                switch (command)
                {
                    case "C":
                        circleArea();
                        break;
                    case "R":
                        rectangleArea();
                        break;
                    case "S":
                        squareArea();
                        break;

                }
        }

    }

    private static double circleArea()
    {
        double radius;
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter radius;");
        radius = userInput.nextInt();
        double area = (radius * radius) * 3.14;
        System.out.println("Area of circle is: " + area);
        double circumference =(radius + radius) * 3.14;
        System.out.println("circumference is: " + circumference);
        return(0);

    }


    private static double rectangleArea()

    {
        double width;
        double length;
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter height:");
        double height = userInput.nextInt();
        System.out.println("Enter width:");
        width = userInput.nextInt();
        double area = height * width;
        System.out.println("Rectangle area is: " + area);
        double perimeter = (height + width) *2;
        System.out.println(" Perimeter is: " + perimeter);
        return area;
    }
    private static double squareArea()
    {
        double height;
        double width;
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Enter height:");
         height = userInput.nextInt();
        System.out.println("Enter width:");
        width = userInput.nextInt();
        double area = height * width;
        System.out.println("Square area is: " + area);
        double perimeter = (height + width) * 2;
        System.out.println(" Perimeter is: " + perimeter);
        return area;
    }
}








