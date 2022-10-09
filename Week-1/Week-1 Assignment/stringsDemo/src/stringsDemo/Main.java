package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı:" + mesaj.length());
		System.out.println("5. eleman:" + mesaj.charAt(4)); // 0'dan başladığı için 5. eleman 4. indexteki elemandır
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("A")); // B ile başlıyor mu diye sorar başlıyorsa ture döndürür eğer
													// başlamıyorsa false döndürür. (Büyük-küçük harfe dikkat)
		System.out.println(mesaj.endsWith(".")); // nokta ile bitiyorsa true
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av")); // indexof karakterin mesajın içinde kaçıncı eleman
												// olduğunu bulmaya yarar
		System.out.println(mesaj.lastIndexOf("a")); // aramaya sağdan başlar
	}

}
