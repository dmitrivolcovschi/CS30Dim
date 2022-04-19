/*
Program: Ex6MathTutor.java          Last Date of this Revision: April 19, 2022
Author: Dmitri Volcovschi
School: CHHS
Course: Computer Science 20
 
 
*/

import java.util.Random;
import java.util.Scanner;

public class Ex6MathTutor {

    public static void main(String args[]) {
    
        try (Scanner userinput = new Scanner(System.in)) {
            String a;
 
            do{
 
            String operatorSwitch;
            int b;
            int c = 0;
 
            Random number = new Random();
            int d = number.nextInt(50) +1;
            int e = number.nextInt(50) +1;
 
            Random operatorChoice = new Random();
            int operator = operatorChoice.nextInt(4);
 
            switch (operator){
 
                case 0: operatorSwitch= "+";
                    c = d+e;
                    break;
                case 1: operatorSwitch= "-";
                    c = d-e;
                    break;
                case 2: operatorSwitch= "*";
                    c = d*e;
                    break;
                case 3: operatorSwitch= "/";
                    c = d/e;
                    break;
                default: operatorSwitch= "";
            }
            System.out.println("What is: "+d+operatorSwitch+e+"?");
            b = userinput.nextInt();
            
            if(b!=c)
            
                System.out.println("Incorrect! Right answer is: " +c);
            else{if(b==c)
                System.out.println("Correct!");
            
            }
            System.out.println("Continue? y/n");
            a = userinput.next();

        }while(a.equals("y"));
    }
    
    

}

}

                
/*
 
What is: 15+26?
41
Correct!
Continue? y/n

 */
    



