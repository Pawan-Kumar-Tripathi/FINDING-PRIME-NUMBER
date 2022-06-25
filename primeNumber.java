import java.io.*;
import java.util.*;
class primeNumber
    {
        public static  void main ()
        {
            System.out.println(" Enter the number for which you want to check wheather the number is prime or not");
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int c = 0, p=0;
            
            char r ;
            
            for(int i = 1; i<=N; i++)
            {
                if (N% i == 0 )
                {
                    c++; 
                }
                
          
    }
    if(c==2)
    {
    System.out.println("prime"); 
}
    else
    {
    System.out.println("not prime");}
}
}