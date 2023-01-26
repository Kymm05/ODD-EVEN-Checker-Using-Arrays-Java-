
package com.mycompany.ymk;
import java.util.Scanner;


public class YMK {

    public static void main(String[] args) {
        
    int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Number(s)");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter More Element(s): ");
    for (int i = 0; i < n; i++) 
    {
        a[i] = s.nextInt();
    }
    System.out.print("ODD Number(s):");
    for(int i = 0 ; i < n ; i++)
    {
        if(a[i] % 2 != 0)
        {
            System.out.print(a[i]+" ");
        }
    }
    System.out.println("");
    System.out.print("Even Number(s):");
    for(int i = 0 ; i < n ; i++)
    {
        if(a[i] % 2 == 0)
        {
            System.out.print(a[i]+" ");
        }
    }
        
    }
}
