
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class votelab {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("enter your age:");
        age=sc.nextInt();
        if(age>18)
        {
        System.out.println("the person is eligible to vote.");
    }
}
}

