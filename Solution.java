import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();
        String stra=""+a;
        String strb=""+b;
        BigInteger t1 = new BigInteger(stra);
        BigInteger t2 = new BigInteger(strb);
        BigInteger t3=new BigInteger("1");
        int n=kb.nextInt();
        HashMap<Integer,BigInteger> hm=new HashMap<Integer,BigInteger>(); 
        for(int i=3;i<=n;i++)
            {
            t3=((t1.add(t2.multiply(t2))));
            
            hm.put(i,t3);
            String tim=""+t3;
            BigInteger temp=new BigInteger(tim);
            t1=t2;
            t2=temp;
        }
        System.out.println(hm.get(n));
    }
}
