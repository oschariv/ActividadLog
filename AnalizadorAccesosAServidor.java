import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * Write a description of class AnalizadorAccesosAServidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnalizadorAccesosAServidor
{
    // instance variables - replace the example below with your own
    private ArrayList<Acceso> listaDeAccesos;

    /**
     * Constructor for objects of class AnalizadorAccesosAServidor
     */
    public AnalizadorAccesosAServidor()
    {
        listaDeAccesos = new ArrayList<Acceso>();
    }

    /**
     *  
     */
    public void analizarArchivoDeLog(String archivoLogALeer)
    {
        try {
            File archivo = new File(archivoLogALeer);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
                String[] lineaActual = linea.split(" ");
                Acceso acceso = new Acceso(Integer.parseInt(lineaActual[0]), 
                        Integer.parseInt(lineaActual[1]), 
                        Integer.parseInt(lineaActual[2]), 
                        Integer.parseInt(lineaActual[3]),
                        Integer.parseInt(lineaActual[4]));
                listaDeAccesos.add(acceso);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     */
    public int obtenerHoraMasAccesos()
    {
        int horaActual = 0;
        int contActual = 0;
        int horaMasAccesos = 0;
        int contMasAccesos = 0;
        
        //int[] horasAcceso = new int[listaDeAccesos.size()];
        for (int i = 0; i < 24; i++){
            horaActual = i;
            for (Acceso acceso : listaDeAccesos){
                if (acceso.getHoraAcceso() == horaActual){
                    contActual++;
                }
            }
            
            if (contActual > contMasAccesos){
                contMasAccesos = contActual;
                horaMasAccesos = horaActual;
            }
            
            contActual = 0;
        }
        

        if (horaMasAccesos == 0) {
            System.out.println("No tengo datos.");
        }
        else {
            System.out.println("La hora con mas accesos es: " + horaMasAccesos); 
        }
        return horaMasAccesos;
    }
}
