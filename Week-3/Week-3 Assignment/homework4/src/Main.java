interface portakal {

    int meyve = 99;

    //gosterilmesi için soyut metot oluşturduk
    void goster();
}
//meyve arayuzunu implements eden bir sınıf olusturduk.
class arayuz implements portakal {

    //arayüzün özellikleri uygulandı.
    @Override
    public void goster() {
        System.out.println("Portakallar");
    }

    public static void main (String [] args) {
        //nesnelerimizi oluşturduk
        arayuz arayuz1 = new arayuz();

        arayuz1.goster();
        System.out.println("Portakallar ve İnsanlar = " +meyve);

    }

}