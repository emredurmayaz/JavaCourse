
public class OyunKurucu {
	
 Oyuncu o1;	
 Oyuncu o2;
 Oyuncu o3;
      public int gsayi;
      
      public void sayiBelirle()
      {
    	 gsayi=(int)(Math.random()*10);
    	 System.out.println("Ben makinayým tahmin ettigim sayi:"+gsayi);
      }
      public void kontrolEt()
      {
    	  o1=new Oyuncu();
    	  o2=new Oyuncu();
    	  o3=new Oyuncu();
    	  int tahmin1=0;
    	  int tahmin2=0;
    	  int tahmin3=0;
    	  
    	  boolean bilen1=false;
    	  boolean bilen2=false;
    	  boolean bilen3=false;
    	  
    	  sayiBelirle();
    	  
    	  while(true)
    	  {
    		  o1.tahminEt();
    		  o2.tahminEt();
    		  o3.tahminEt();
    		  
    		  tahmin1=o1.tsayi;
    		  System.out.printf("1. oyuncu %d sayýsýný tahmin etti\n",tahmin1);
    		  tahmin2=o2.tsayi;
    		  System.out.printf("2. oyuncu %d sayýsýný tahmin etti\n",tahmin2);
    		  tahmin3=o3.tsayi;
    		  System.out.printf("3. oyuncu %d sayýsýný tahmin etti\n",tahmin3);
    		  if(tahmin1==gsayi)
    			  bilen1=true;
    		  
    		  if(tahmin2==gsayi)
    			  bilen2=true;
    		  
    		  if(tahmin3==gsayi)
    			  bilen3=true;
    		  
    		  if(bilen1 || bilen2 || bilen3)
    		  {
    			System.out.println("birinci oyuncu :"+bilen1); 
    			System.out.println("ikinci oyuncu :"+bilen2);
    			System.out.println("ucuncu oyuncu :"+bilen3);
    			System.out.println("OYUN BÝTTÝ");
    			  break;
    		  }
    		  else
    		  {
    			  
    			  System.out.println("Kimse bilemedi oyun yeniden baþlýyor");
    		  }
    		  
    		  
    		  
    	  }
    	  
    	  
    	  
    	  
    	  

      }
}
