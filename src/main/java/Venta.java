
import estado.Estado;
import java.util.ArrayList;
import java.util.List;

public class Venta {

    List<Prenda> prendas = new ArrayList<Prenda>();

    Estado estado;

    public void agregarPrendaVendida(Prenda prenda){

        prendas.add(prenda);

    }

    public double totalVentas(){

        return prendas.stream()
                .mapToDouble( p -> p.getPrecioPrenda())
                .sum();

    }

}
