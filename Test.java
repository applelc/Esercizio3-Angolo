
/**
 * Angoli
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 08/10/2019)
 */
public class Test
{
    public static void main (String[] args)
    {
        Angolo a1, a2, a3, a4, a5, a6;
        Triangolo t1, t2;
        
        a1 = new Angolo(45,0,0);
        a2 = new Angolo(45,0,0);
        a3 = new Angolo(90,0,0);
        
        a4 = new Angolo(10,0,0);
        a5 = new Angolo(90,0,0);
        a6 = new Angolo(80,0,0);
        
        t1 = new Triangolo(a1,a2,a3);
        t2 = new Triangolo(a4,a5,a6);
        
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
