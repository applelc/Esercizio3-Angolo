
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
        Angolo a1, a2, a3;
        Triangolo t1;
        
        a1 = new Angolo(10,0,0);
        a2 = new Angolo(70,0,0);
        a3 = new Angolo(100,0,0);
        
        t1 = new Triangolo(a1,a2,a3);
        
        System.out.println(t1.toString());
    }
}
