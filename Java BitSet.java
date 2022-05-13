/*
https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int operationNumber = scanner.nextInt();
        
        
        BitSet bit1 = new BitSet(length);
        BitSet bit2 = new BitSet(length);
        
        
        while(operationNumber-->0){
            String operationType = scanner.next(); 
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(operationType.equals("AND")){
                if(a == 1){
                    bit1.and(bit2);
                }
                else {
                    bit2.and(bit1);
                }
            }
            else if(operationType.equals("OR")){
                  if(a == 1){
                    bit1.or(bit2);
                }
                else {
                    bit2.or(bit1);
                }
            }
            else if(operationType.equals("FLIP")){
                if(a ==1){
                    bit1.flip(b);;
                }
                else {
                    bit2.flip(b);
                }
            }
            else if (operationType.equals("SET")){
                 if(a ==1){
                    bit1.set(b);;
                }
                else {
                    bit2.set(b);
                }
            }
            else if(operationType.equals("XOR")){
                  if(a ==1){
                    bit1.xor(bit2);;;
                }
                else {
                    bit2.xor(bit1);
                }
            }
              System.out.println(bit1.cardinality()+" "+bit2.cardinality());
        }
        scanner.close();     
    }
    
}
