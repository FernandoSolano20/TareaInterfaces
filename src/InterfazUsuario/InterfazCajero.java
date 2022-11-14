package InterfazUsuario;

public class InterfazCajero extends InterfazUsuario {
    @Override
    public void leerEntrada() {
    	
    }

    @Override
    public String MostrarInfo() {
    	
    	//switch Deposito => private hacer_deposito()
    	return gCons.obtenerConsulta();
    }
    
    //private hacer_deposito()
}
