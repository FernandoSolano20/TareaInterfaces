import InterfazUsuario.InterfazUsuario;
import InterfazUsuario.InterfazCajero;

public class Main {

    public static void main(String[] args) {
    	InterfazUsuario iu_Prueba = null;
    	iu_Prueba =  new InterfazCajero();
    
    	System.out.println(iu_Prueba.MostrarInfo());
    	

    }
}
