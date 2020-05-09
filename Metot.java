class metot 
{
  public static void main(String[] args) 
  {
   mesajVer("samet");

   hesapla();

   System.out.println(Topla(12, 23));

   System.out.println(KrediHesapla(10000));
  }


  public static void mesajVer(String isim){
    System.out.println("Merhaba "+ isim);
    //10larca satır olduğunu düşün
  }
  public static void hesapla(){
    System.out.println("Hesaplandı");
  }
  public static int Topla(int sayi1, int sayi2)
  {
    return sayi1 + sayi2;
  }

  public static double KrediHesapla(double KrediMiktari)
  {
    return KrediMiktari = KrediMiktari * 0.25 + KrediMiktari;
  }
}