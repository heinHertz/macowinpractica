//import junit.framework.TestCase;

import estado.Estado;
import estado.Nuevo;
import estado.Promocion;
import org.junit.Test;
import org.junit.Assert.*;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;



public class VentaTest  {

    private static final double DELTA = 1e-15;


    @Test
    public void testTotalVentas() {

        Venta venta = new Venta();

        Prenda prenda = new Prenda();

        prenda.setEstado(new Nuevo());
        //

        Prenda prenda2 = new Prenda();

        prenda2.setEstado(new Promocion(10) );

        //

        venta.agregarPrendaVendida(prenda);

        venta.agregarPrendaVendida(prenda2);


        assertEquals(190, venta.totalVentas(), DELTA);


    }
}