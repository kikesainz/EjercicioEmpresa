package com.kike.empleados;

public class TrabajadorHoras extends Empleado{

	Integer horas;
	
	public TrabajadorHoras(String name, Integer num, Integer sueldo, Integer horas) {
		super(name, num, sueldo);
		
		this.horas = horas;
	}

	@Override
	public void calcularSueldo() {
		setSueldo(getSueldo() * horas);
	}

	@Override
	public String toString() {
		return "[Trabajador por horas] " + super.toString();
	}
}
