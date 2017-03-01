
/**
 * Write a description of class Acceso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acceso
{
    // instance variables - replace the example below with your own
    private int anno;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;

    /**
     * Constructor for objects of class Acceso
     */
    public Acceso(int anno, int mes, int dia, int hora, int minuto)
    {
        this.anno = anno;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getHoraAcceso()
    {
        return hora;
    }
}
