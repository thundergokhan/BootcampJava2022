package switchDemo;

public class Main {
	// char verdiğimiz için tek tırnak
	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel :Geçtiniz");
			break;
		// break bitirmek için kullanılır
		case 'B':
		case 'C':
			System.out.println("İyi :Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}
		// Format Document or press Ctrl+Shift+F.

	}

}
