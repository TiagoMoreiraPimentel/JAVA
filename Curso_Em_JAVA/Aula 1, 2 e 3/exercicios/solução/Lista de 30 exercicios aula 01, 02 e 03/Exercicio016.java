package ListaExercicios_001;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
    16. Escreva um programa Java para exibir a data e hora atual em um formato específico.
 */
public class Exercicio016 {
    
    public static void main(String[] args)
    {
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        
        System.out.println("\nAgora" + cdt.format(System.currentTimeMillis()));
    }
    
}
