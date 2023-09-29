package com.kike.empleados;

/**
 * @author rubentxogg
 *
 */
public  class Empleado {

	private String name;
	private Integer num;
	private Integer sueldo;
	
	public Empleado(String name, Integer num, Integer sueldo) {
		super();
		this.name = name;
		this.num = num;
		this.sueldo = sueldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [name=" + name + ", num=" + num + ", sueldo=" + sueldo + "]";
	}
	
	public  void calcularSueldo() {
		// Empty
	}
}
