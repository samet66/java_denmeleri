class classsKullanma {
    public static void main(String[] args) 
   {
      int[] sayilar = new int[]{1,2,3};


       Urun product1 = new Urun();
       product1.setName("Laptop");

       Urun product2 = new Urun();
       product2.setName("Mouse");

       Urun[] urunler = new Urun[]{product1,product2};


      for(int i=0; i<urunler.length;i++){
        System.out.println(urunler[i].getName());
      }
   }
    
}