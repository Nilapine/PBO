import java.util.Scanner;
public class Determinan{
	int a,b,c;
	long d;
	double x1,x2;
	Scanner myObj = new Scanner(System.in);
	void inputData() {
		System.out.print("a \t:"); a=myObj.nextInt();
		System.out.print("b \t:"); b=myObj.nextInt();
		System.out.print("c \t:"); c=myObj.nextInt();
	}
	void hitungD() {
		d=(b*b)-(4*a*c);
	}
	void hitungX() {
		if(d>0) {
			x1 = (-b+Math.sqrt(d))/(2*a);
			x2 = (-b-Math.sqrt(d))/(2*a);
		}
		else if(d==0) {
			x1=x2=-b/(2*a);
		}
		else {
			x1 = -b/(2*a)+Math.sqrt(-d);
			x2 = -b/(2*a)-Math.sqrt(-d);
		}
	}
	void cetak() {
		System.out.println("D \t:"+d);
		System.out.println("x1 \t:"+x1);
		System.out.println("x2 \t:"+x2);
	}
}