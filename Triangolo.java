
/**
 * Triangolo
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 24/10/2019)
 */
public class Triangolo
{
    private Angolo a1;
    private Angolo a2;
    private Angolo a3;
    
    public Triangolo(Angolo a1, Angolo a2, Angolo a3)
    {
        int sommaAngolo=0;
        
        sommaAngolo=a1.getGradi()+a2.getGradi()+a3.getGradi();
        
        if(sommaAngolo==180)
        {
            setAngolo1(a1);
            setAngolo2(a2);
            setAngolo3(a3);
        }
        else
        {
            this.a1 = new Angolo(60,0,0);
            this.a2 = new Angolo(60,0,0);
            this.a3 = new Angolo(60,0,0);
        }
    }
    
    private void setAngolo1(Angolo a)
    {
        a1=a;
    }
    
    private void setAngolo2(Angolo a)
    {
        a2=a;
    }
    
    private void setAngolo3(Angolo a)
    {
        a3=a;
    }
    
    public String toString()
    {
        String s="";
        if((a1.getGradi()==90)||(a2.getGradi()==90)||(a3.getGradi()==90))
            s="Triangolo rettangolo";
        
        else if((a1.getGradi()==60)&&(a2.getGradi()==60)&&(a3.getGradi()==60))
            s="Triangolo equilatero";
        
        if((a1.getGradi()==a2.getGradi())&&(a1.getGradi()!=a3.getGradi())||
            (a1.getGradi()==a3.getGradi())&&(a2.getGradi()!=a3.getGradi())||
            (a2.getGradi()==a3.getGradi())&&(a1.getGradi()!=a3.getGradi()))
            s+=" Triangolo isoscele";
         
        else if((a1.getGradi()!=a2.getGradi())&&(a2.getGradi()!=a3.getGradi())&&(a1.getGradi()!=a3.getGradi())&&
        !((a1.getGradi()==90)||(a2.getGradi()==90)||(a3.getGradi()==90)))
            s="Triangolo scaleno";
            s+=" Angolo 1: " + a1.visualizzaAngolo() + "\nAngolo 2: " + a2.visualizzaAngolo() + "\nAngolo 3: " + a3.visualizzaAngolo();
        return s;
    }
}
