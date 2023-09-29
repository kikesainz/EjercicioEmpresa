package com.kike.empleados;

public class Gerente extends Empleado{

	private Integer comision;
	
	public Gerente(String name, Integer num, Integer sueldo, Integer comision) {
		super(name, num, sueldo);
		
		this.comision = comision;
	}

	@Override
	public void calcularSueldo() {
		setSueldo(getSueldo() + comision);
	}

	@Override
	public String toString() {
		return "[Gerente] " + super.toString();
	}
}
