/**
 * Angolo - Esegue una serie di metodi per compiere azioni sui gradi, primi e secondi degli angoli.
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 08/10/2019)
 */
public class Angolo
{
    private int gradi;
    private int primi;
    private int secondi;
    
    public Angolo(int gradi, int primi, int secondi)
    {
        setGradi(gradi);
        setPrimi(primi);
        setSecondi(secondi);
    }
    
    private void setGradi(int g)
    {
        gradi=g;
    }
    
    private void setPrimi(int p)
    {
        primi=p;
    }
    
    private void setSecondi(int s)
    {
       secondi=s;
    }
    
    public int getGradi() 
    { 
        return gradi;
    }
    
    public int getPrimi() 
    { 
        return primi;
    }
    
    public int getSecondi() 
    { 
        return secondi;
    }
    
    public String visualizzaAngolo()
    {
        return "L'angolo ha " + getGradi() + " " + getPrimi() + " " + getSecondi();
   
    }
    
    public void aggiungiGradi(int n)
    {
        gradi=gradi+n;
    }
    
    public void aggiungiPrimi(int n)
    {
        primi=primi+n;
    }
    
    public void aggiungiSecondi(int n)
    {
        secondi=secondi+n;
    }
    
    public int angoloSecondi()
    {
        int auxPrimi=0, auxSecondi=0, somma=0;
        
        auxPrimi=gradi*60;
        auxSecondi=auxPrimi*60;
        somma=secondi+auxSecondi;
        
        return somma;
    }
    
    public void secondiAngolo(int n)
    {
        primi=(int)n/60;    
        n=n-(primi*60);
        
        gradi=(int)primi/60; 
        
        primi=primi-(60*gradi);
        
        setSecondi(n);
    }
    
    
}


