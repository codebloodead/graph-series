package com.org.demo.graph.representation;

import java.util.Scanner;

public class GraphDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes :");
        int n=sc.nextInt();
        System.out.println("Enter number of edges :");
        int m=sc.nextInt();
        int [][] matrix=new int[n+1][n+1];
        for(int i=0; i<m; i++) {
            System.out.println("Enter "+i+" th entry");
            int u=sc.nextInt();
            int v=sc.nextInt();
            matrix[u][v]=1;
            matrix[v][u]=1;
        }


        System.out.println("Matrix representation");
        for(int i=0; i<=n; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
