
package thread;

import java.util.Random;

public class Matris {
    
    public int dizi[][];
    
    public Matris(Random rnd,int boyut)
    {
        dizi= new int [boyut][boyut];
        
        for(int i=0;i<boyut;i++)
        
        {
            for(int j=0;j<boyut;j++){
                
                dizi[i][j]=rnd.nextInt(10);
                
            }
                      
        }
              
    }
    
    public Matris(int boyut)
    {
        dizi=new int [boyut][boyut];
        
    }
    
    
    @Override
    public String toString()
    {
        String ekran="";
        
        for(int satir=0;satir<dizi.length;satir++){
            
            for(int sutun=0;sutun<dizi.length;sutun++){
                
                ekran+="\t"+dizi[satir][sutun];
                
            }
            
            ekran+="\n";
        }
        
        return ekran;
    }
    
}
