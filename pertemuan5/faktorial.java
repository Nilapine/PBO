import java.util.Scanner;
public class faktorial{
	public static void main (String[] args){
		long fak=1; int bil;
		Scanner in=new Scanner (System.in);
		System.out.print("Bilangan : ");
		bil=in.nextInt();
		for(int i=2; i<=bil; i++){
			System.out.print(fak+" x "+i+" = ");
			fak=fak*i;
			System.out.println(fak);
		}
		
		for (int i=1; i<=bil; i++){
			System.out.print(i + " ");
			if(i%5==0) println("dipecah : ");
		}
	}
}