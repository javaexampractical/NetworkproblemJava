import java.io.*;
import  java.util.*;
class pin
{
        public void createPIN(int input1,int input2, int input3)
        {
        int arr[]={input1,input2,input3};
        int max=0,min;
        double sum=0.0;
        double place=1.0;
        int num;
        for(int i=0;i<3;i++)
        {
            num=arr[i];
            while(num!=0)
           {
                int r=num%10;
                if(r>max)
                max=r;
                num=num/10;
           }
       }
      for(int i=0;i<3;i++)
      {
         min=99;
          for(int j=0;j<3;j++)
          {
              int rem=arr[j]%10;
              if(rem<min)
                min=rem;
                arr[j]/=10;
          }
          sum=(min+(sum/place));
          sum*=place;
          place*=10;
      }
      double val = max*1000+sum;
      System.out.println("pin=="+val);
    }
}

class b{
  public static void main(String[] args) 
{
   pin p=new pin();
   p.createPIN(190,267,853);
}
}


