/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice.application;
import java.util.Scanner;

/**
 *
 * @author Aleaya
 */
public class InvoiceApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the tax as a decimal");
        double tax = keyboard.nextDouble();
        System.out.println("Insert a price. Insert 0.0 when all prices have been entered");
        //declare the array of a set size
        double myPrices[] = new double[100];
       //add prices to array. 
        //Use a counter to keep track of how many items are in your array.
        int counter = 1;
        double price = keyboard.nextDouble(); 
        
        double sum = 0.0;
       
        while(price != 0.0)
        {
            sum = sum + price;
            myPrices[counter] = price;
            counter +=1;
            System.out.println("Insert a price. Insert 0.0 when all prices have been entered");
            price = keyboard.nextDouble();
            //myPrices[counter] = price;
            //counter +=1;
            
            
        }
        double tot = (sum * tax) + sum;
        System.out.println("The tax rate is: " + tax);
        for (int i=1;i <counter; i++){

                System.out.printf("Price " + i + ": %.02f\n",myPrices[i]);
            }
        System.out.println("The total is " + tot);
    }
    }
    

