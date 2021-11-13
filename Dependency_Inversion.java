package principios_solid;
public class Dependency_Inversion {

    interface auto {
    void aceleracion();
}

class Autodeportivo implements auto {
    private int combustiblerestante;
    private int potencia;

    public Autodeportivo(final int fuel) {
        combustiblerestante = fuel;
    }
 
    public void aceleracion() {
        potencia++;
        combustiblerestante--;
    }
}

class conductor {
    private auto autodeportivo;

    public conductor(final auto autodeportivo) {
        this.autodeportivo = autodeportivo;
    }

    public void increaseSpeed() {
        this.autodeportivo.aceleracion();
    }
}
}