package com.bridgelabz;

import java.util.Scanner;
import java.lang.Math;
public class LineComparision {

        public static int LengthOfLine() {

            int x1,y1,x2,y2;
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the line co-ordinates: x1,y1,x2,y2");
            x1 = scn.nextInt();
            y1 = scn.nextInt();
            x2 = scn.nextInt();
            y2 = scn.nextInt();
            int lineLength =(int)Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
            return lineLength;

        }
        public static void main(String[] args) {
            int lineLength = LengthOfLine();
            System.out.println("The length of line is: "+lineLength);
        }

    }

