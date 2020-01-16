
package thread;


public class Carpma implements Runnable{
    private int satir;
    private int sutun;
    private Matris a;
    private Matris b;
    private Matris sonuc;
    
    public Carpma(int satir,int sutun,Matris a ,Matris b,Matris sonuc)
    {
       this.satir=satir;
       this.sutun=sutun;
       this.a=a;
       this.b=b;
       this.sonuc=sonuc;      
    }
    
    @Override
    public void run() {
       
        for(int i=0;i<b.dizi.length;i++)
        {
            sonuc.dizi[satir][sutun]+=a.dizi[satir][i]*b.dizi[i][sutun];
        }
        
    } 
}
