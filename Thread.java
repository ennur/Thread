
package thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread {

    
    public static void main(String[] args) {
       int boyut=3;
       
       Random rnd=new Random();
       
       Matris sonuc= new Matris(10);
       Matris A= new Matris(rnd,10);
       Matris B= new Matris(rnd,10);
       
       ExecutorService havuz= Executors.newFixedThreadPool(20);
       
       long baslangic=System.nanoTime();
       
       for(int satir=0;satir<boyut;satir++)
       {
           for(int sutun=0;sutun<boyut;sutun++)
           {
             
               havuz.execute(new Carpma(satir,sutun,A,B,sonuc));
                
           }
           
       }
       havuz.shutdown();
       
       while(!havuz.isTerminated())
       {
           
       }
       
       long bitis=System.nanoTime();
       
       double sure=(bitis-baslangic)/1000000.0;
       
       System.out.println("A Matris: ");
       System.out.println(A);
       
        System.out.println("B Matris: ");
        System.out.println(B);
        System.out.println("Souc Matris: ");
        System.out.println(sonuc); 
        System.out.println("\nHesaplama Suresi"+String.format("%.2f",sure)+"milisaniye");
        
    }
    
}
