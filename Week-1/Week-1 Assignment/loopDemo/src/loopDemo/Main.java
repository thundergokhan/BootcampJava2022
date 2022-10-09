package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		

		//While
				int i=1;        // i=2 çift sayılar için
		while(i<10){
			System.out.println(i);
			i+=2;     //i+=2 tek sayı    i++; ise 1'den 9'a 
		}
		
		System.out.println("While Döngüsü Bitti");
		
		//Do-While
		int j=1;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");

	}

}
