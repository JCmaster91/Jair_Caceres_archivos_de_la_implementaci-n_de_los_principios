package principios_solid;
/**
  * @author mrjair
Las marcas disponibles no se modificaran pero existe la posibilidad de ampliar 
* los tipos de vehiculos para elegir
 */
public class Open_Closed {
    
 
   abstract class auto{ abstract int marcadisponible();}
   
   class sedan extends auto{ int marcadisponible(){return "Chevrolet";}
   
   class hatchback extends auto{ int marcadisponible(){return "Ford";}
 
   class suv extends auto { int mmarcadisponible(){return "Dodge";}
   
   }}}
  public static void main(String[] args) {
  
      auto[] inventario = { 
          new sedan(),
          new hatchback(),
          new suv()};
      mostrarmarcasdisponibles(inventario);}
  
  public static void mostrarmarcasdisponibles(auto[] inventario){
      for(auto auto : inventario) {system.out.println(auto.inventario());}
      
      }
}      
