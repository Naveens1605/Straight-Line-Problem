package com.company;

import java.util.Scanner;

public class Main {
    public static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)
            return true;
        for(int i=0;i<coordinates.length-2;i++) {
            int x1 = coordinates[i][0];
            int x2 = coordinates[i+1][0];
            int x3 = coordinates[i+2][0];
            int y1 = coordinates[i][1];
            int y2 = coordinates[i+1][1];
            int y3 = coordinates[i+2][1];
            if((x2-x1)*(y3-y1)-(y2-y1)*(x3-x1)!=0)
                        return false;
                }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Vector : ");
        int m = sc.nextInt();
        int[][] coordi = new int[m][2];
        System.out.println("Enter the Coordinates : ");
        for(int i=0; i < m; i++)
            for(int j = 0; j < 2; j++)
            coordi[i][j] = sc.nextInt();
        System.out.println(checkStraightLine(coordi));
    }
}
