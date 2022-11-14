package InterfazUsuario;

import Interfaces.*;

public abstract class InterfazUsuario implements IUConsulta, IUDeposito, IUMovil, IURetiro, IUTransfer {

public abstract void leerEntrada();
public abstract String MostrarInfo();

    @Override
    public double infoSaldo() {
        return 0;
    }

    @Override
    public double infoCantidad() {
        return 0;
    }

    @Override
    public String infoRecarga() {
        return null;
    }

    @Override
    public boolean infoSinFondos() {
        return false;
    }

    @Override
    public String infoCuenta() {
        return null;
    }
}
