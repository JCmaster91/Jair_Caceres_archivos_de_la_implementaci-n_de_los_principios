package principios_solid;

/**
 * @author mrjai
se segrega la configuracion del motor para que aplique la interfaz que 
* corresponda
*/
public class Interface_Segregation {
    
    interface motor1{void Combustion();}
    interface motor2{void electrico();}
    interface motor3{void hibrido();}
    
    class susukiswift implements motor3{
    public void combustion(){}
    public void electrico(){}
        }
    }
