
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRiveraSanchezGemaMaria2223 miVehiculoRiveraSanchezGemaMaria2223;
        int stockActual;
        
        miVehiculoRiveraSanchezGemaMaria2223 = new VehiculoRiveraSanchezGemaMaria2223("Seat",18000,100);
        operativaVehiculosRiveraSanchezGemaMaria2223(miVehiculoRiveraSanchezGemaMaria2223, 50); 
        stockActual = miVehiculoRiveraSanchezGemaMaria2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosRiveraSanchezGemaMaria2223(VehiculoRiveraSanchezGemaMaria2223 miVehiculoRiveraSanchezGemaMaria2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoRiveraSanchezGemaMaria2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoRiveraSanchezGemaMaria2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
