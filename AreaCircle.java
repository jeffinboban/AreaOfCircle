package com.company;
java.util.Scanner;
Public class Main
{
public static void main(String []args)
{
  Scanner sc = new Scanner(System.in);
double rad=sc.nextDouble();
double pi=22.0/7;

int area=(int)(pi*((rad*rad)/(100*100)));

System.out.println("Area of the circle with the given radius is "+area);
}
}
