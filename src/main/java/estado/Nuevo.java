package estado;

import estado.Estado;

public class Nuevo implements Estado {

    @Override
    public Double precioPrenda(int precioEstado){

        return (double) precioEstado;

    }

}
