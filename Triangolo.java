
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
        
        sommaAngolo+=a1.getGradi()+a2.getGradi()+a3.getGradi();
        
        /* if((sommaAngolo<180)||(sommaAngolo>180))
        {
            */
            setAngolo1(a1);
            setAngolo2(a2);
            setAngolo3(a3);
            /*
        }
        else
        {
            a1 = new Angolo(60,0,0);
            a2 = new Angolo(60,0,0);
            a3 = new Angolo(60,0,0);
        }
        */
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
        return "Angolo 1: " + a1.visualizzaAngolo() + "\nAngolo 2: " + a2.visualizzaAngolo() + "\nAngolo 3: " + a3.visualizzaAngolo();
    }
}
