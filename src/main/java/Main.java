import estado.Estado;
import estado.Nuevo;
import estado.Promocion;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("fede");


        Venta venta = new Venta();

        Estado estadoPrenda = new Nuevo();


        Prenda prenda = new Prenda();
        Prenda prenda2 = new Prenda();


        prenda.setEstado(estadoPrenda);

        prenda2.setEstado(new Promocion(10) );

        venta.agregarPrendaVendida(prenda);

        venta.agregarPrendaVendida(prenda2);


        System.out.println(prenda.getPrecioBase());


        System.out.println( "prenda2 precio: " + prenda2.getPrecioPrenda() );
        System.out.println( "total ventas:  " + venta.totalVentas()  );



    }

}
