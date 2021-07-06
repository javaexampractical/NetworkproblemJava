import java.util.Scanner;
class num{
	int a;
    	int b;
    	int c;
    	Scanner sc = new Scanner(System.in);
    	
    	public num(){
		System.out.println("Enter the three numbers");
        	a=sc.nextInt();
        	b=sc.nextInt();
        	c=sc.nextInt();
    	}
}

class pin extends num{
	int o;
    	int t;
    	int h;
    	int th;
    	public int max(int x){
        	int z=x%10;
        	x=x/10;
        	if (z<x%10)
            		z=x%10;
        	x=x/10;
        	if(z<x)
            		z=x;
        	return z;
    	}
    
    public void unit(){
       		o=super.a%10;
        	if(super.b%10<o)
            	o=super.b%10;
        	if (super.c%10<o)
            		o=super.c%10;
    }
    
    public void tens(){
        	t=super.a%100;
        	t=t/10;
        	int x=super.b%100;
       	 	x=x/10;
        	if(t>x)
            		t=x;
        	x=super.c%100;
        	x=x/10;
        	if(t>x)
            		t=x;
    }
    
    public void hundred(){
        	h=super.a%1000;
        	h=h/100;
        	int x=super.b%1000;
        	x=x/100;
        	if(h>x)
            		h=x;
        	x=super.c%1000;
        	x=x/100;
        	if(h>x)
            		h=x;
    }
    
    public void thousand() {
        	int a = max(super.a);
        	int b = max(super.b);
        	int c = max(super.c);
		th=a;
        	if(th<b)
			th=b;
        	if (th<c)
			th=c;
    }
    public void pinum(){
		System.out.println("The PIN is "+th+h+t+o);
    }
}

public class PinGenerator {
	public static void main(String[] args) {
	        pin p=new pin();
		p.unit();
		p.tens();
		p.hundred();
		p.thousand();
		p.pinum();
}
}
