package invertir.cadena;
import java.util.Scanner;
public class InvertirCadena {
    public static void main(String[] args) {
      
        Scanner lector=new Scanner (System.in);
        String cadena;
        System.out.print("Ingrese un nombre: ");
        cadena=lector.nextLine ();
        System.out.print("La cadena invertidad es: ");
        for (int i=cadena.length()-1;i>=0;i--){
		
        System.out.print(cadena.charAt(i));
         
       
        }
        System.out.println("\n");
            
        
    
    }
}
    

