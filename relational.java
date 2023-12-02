
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class relational {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int num1=sc.nextInt();
        System.out.println("enter 2nd number:");
        int num2=sc.nextInt();
        if(num1<num2)
        {
            System.out.println(num1+"is less than"+num2);
        }
        else if(num1>num2)
        {
            System.out.println(num1+"ia greater than"+num2);
        }
        else
        {
            System.out.println(num1+"is equal to"+num2);
        }
        sc.close();
    }
}
