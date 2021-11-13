package principios_solid;

/**
 *
 * @author mrjair
 * Tanto sport como familiar se estienden a categoria siendo sustituibles
 */
public class Liskov_Substitution {
 
class auto { void configuracion(){}}
class marcadisponible extends tipo {}
public class categoria extends configuracion { void Sport(){}}

public class familiar extends categoria{}

}   
