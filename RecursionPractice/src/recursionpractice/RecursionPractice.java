/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpractice;

import java.util.Scanner;

/**
 *
 * @author seeda5023
 */
public class RecursionPractice {
    /**
     * @param args the command line arguments
     */
    
        //Q1.1 - COUNTING RABBIT EARS
        /*we need to count the number of ears there are,
          when odd number bunnies have 2 ears and the even
          number bunnies have 3 ears.
          * -need to find # of ears
          * -to find ears we need to know if bunny is even or odd
        */
    static int totalEars = 0;
    public static int BunnyEars(int n){
        if (n == 0){
            return totalEars;
            //this will keep happenning until n = 0
        } else if (n>0){
            if(n%2==0){
                totalEars+=3;
                BunnyEars(n-1);
            }
            else{
                totalEars +=2;
                BunnyEars(n-1);
            }
        }
        return totalEars;
    }
       
    
    /*Q1.2 - TRIANGLE NUMBERS
    We have a triangle made of blocks. The topmost row has 1 block, the next
    row down has 2, the next has 3, and so on. Compute recursively (no loops or
    muliplacation) the total number of blocks in such a triangle with the given
    number of rows. Method signature will be public int triangle (int n).
    */
    public static int triangle (int n){
         // base case
         //this is permutation
        int num = 0;
        if (n == 0){
            return num;
        }
        else{
            num=num+n;
            num=num+triangle(n-1);
        }
        return num;
    }
    
    
    /*Q1.3 - SUM OF DIGITS
    Given a non-negative int n, return the sum of its digits.
        NOTE: mod(%) by 10 yeilds the rightmost digit (126 % 10 is 6), while divide
    (/) by 10 removes the rightmost digit (126/10 is 12).
        TEST CASES: sumDigits(126) -> 9
                    sumDigits(49) -> 13
                    sumDigits(12) -> 3
    
    */
    public static int sumDigits(int n){
        if (n%10 == 0){
            return 0;
        }else{
            int a=n%10;
            n=n/10;
            return a + sumDigits(n);
        }
    }
    
     
    /*Q1.4 - COUNTING 7's
    Given a non-negative int n, return the count of the occurences of 7 as a
    digit (no loops). 
        TEST CASES:
            count7(717) -> 2
            count7(7) -> 1
            count7(123) -> 0
    */
    public static int count7(int n){
        if(n==0){
            return 0;
        }else if (n%10==7){
            return 1 + count7(n/10);
        }else{
            return count7(n/10);
        }
    }
    
    
    /*Q1.5 - CHANGINGE X TO Y
    Given a string, compute recursively a new string where all lower case 'x' 
    chars have been changed to 'y' chars, and vice versa.
    */
    public static String changeXY(String s){
        if(s.endsWith("x")){
        String phase1 = s.substring(0, s.length());
        String word1 = ("y" + phase1);
        return word1;
    }
        else if (s.endsWith("y")){
            String phase2 = s.substring(0, s.length());
            String word2 = ("x" + phase2);
            return word2;
        }
        else{
            String letter = s.substring(s.length()-1);
            String phase3 = s.substring(0, s.length());
            String word3 = (letter + phase3);
            return word3;
        }
        //String replaceString = s.replaceAll("x","y"); //Replace all x's with y's
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        /*
        //Q1.1 - COUNTING BUNNY EARS
            System.out.println("There are " + totalEars + " bunny ears.");
        */
        /*System.out.println("How many Bunnies are there?");
        int bunnies = input.nextInt();
        System.out.println("With " + bunnies + " bunnies, there are " + BunnyEars(bunnies) + " ears in total");
          */
        
        
            /*
            //Q1.2 - TRIANGLE NUMBERS
            int totalBlocks = 0;
            System.out.println("How many rows are there?");
            int rows = input.nextInt();
            /*we need to take the row number, and add each row before that to
            that number. Ex. row 5 -> 5 + 4 + 3 + 2 + 1 = (basically permutation)
            */
            /*System.out.println("How many rows are there?");
            int rows = input.nextInt();
            System.out.println("There are " + triangle(rows) + " Blocks in total with " + rows + " rows");
            */
            
            
            //Q1.3 -SUM OF DIGITS
            /*System.out.print("Enter a number: ");
            int num = input.nextInt();
            System.out.println("The sum of digits is " + sumDigits(num));
            */
            
            
            //Q1.4 - COUNTING 7's
            /*System.out.print("Enter a number: ");
            int num = input.nextInt();
            System.out.println("There are " + count7(num) + " sevens");
            */
            
            
            //Q1.5 - CHANGINGE X TO Y
            System.out.print("Enter a word: ");
            String word = input.nextLine();
            System.out.println(changeXY(word));
        
    }
}
