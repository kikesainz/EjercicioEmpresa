package com.kike.empleados;

public class TrabajadorNomina extends Empleado {

	public TrabajadorNomina(String name, Integer num, Integer sueldo) {
		super(name, num, sueldo);
	}

	@Override
	public String toString() {
		return "[Trabajador en nómina] " + super.toString();
	}

}
