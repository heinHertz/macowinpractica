package estado;

public class Promocion implements Estado {

    Double descuento;

    public Promocion(int descuentoUsuario){

        this.descuento = (double) descuentoUsuario;

    }

    public Double precioPrenda(int precioPrenda){

        return precioPrenda-descuento;

    }


    public void setDescuento(Double descuento) {

        this.descuento = descuento;

    }
}
