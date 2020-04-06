//package estado;

import estado.Estado;
//import Nuevo;

import estado.Nuevo;
//import main.java.estado.Nuevo;

public class Prenda {

	int precioBase = 100;

	Estado estado;

	Estado estadoPrenda = new Nuevo();

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}



	public double getPrecioPrenda(){

		return this.estado.precioPrenda(precioBase);

	};

	public void setEstado(Estado estado) {
		this.estado = estado;
	}


}

