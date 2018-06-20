/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4_ooad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author aishwariyatalathi
 */
public class Assignment4_OOAD {
    public static void main(String[] args) {
        String terminating_character= "";
        do {
         Invoker invoker = new Invoker();
         System.out.println("Enter String");
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         invoker.Compute(s); 
         Scanner input = new Scanner(System.in);
         System.out.println("Enter x to exit");
         terminating_character =  input.nextLine();
        }while(!"x".equals(terminating_character));
        }
    }
