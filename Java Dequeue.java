/*
Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.

Constraints




The numbers in the array will range between .

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size .

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3
Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is 
*/ 
                           import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0, distinct = 0;
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            if (hashmap.get(num) == null) hashmap.put(num,0);
            
            hashmap.put(num, hashmap.get(num)+1);
            
            if (hashmap.get(num)==1) distinct++;
            
            if (deque.size() == m+1){
                int ele = deque.removeFirst();
                hashmap.put(ele, hashmap.get(ele)-1);
                if (hashmap.get(ele) == 0) distinct--;
            }
            if (deque.size() == m){
                if (distinct > ans) ans = distinct;
            }
           
        }
        System.out.println(ans);
        in.close();
    }
}
