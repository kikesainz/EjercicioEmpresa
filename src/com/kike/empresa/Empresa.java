package com.kike.empresa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.kike.empleados.Empleado;
import com.kike.empleados.Gerente;
import com.kike.empleados.TrabajadorHoras;
import com.kike.empleados.TrabajadorNomina;

public class Empresa {

	private List<Empleado> listaEmpleados = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void menuEmpresa() {

		do {
			System.out.println("\nBienvenid@ al menú de empresa, ¿Qué desea?\n" 
					+ "\n1. Añadir empleado"
					+ "\n2. Calcular salario de los empleados" 
					+ "\n3. Salir");
			
			switch (Integer.parseInt(sc.nextLine())) {
				case 1:
					crearEmpleado();
					break;
					
				case 2:
					calcularSalarioListaEmpleados();
					break;
					
				case 3:
					sc.close();
					System.out.println("(!) Programa finalizado");
					System.exit(0);
					break;
		
				default:
					System.err.println("Introduzca una opción del menú");
					continue;
				}
		}while(true);
		
	}

	private void crearEmpleado() {
		String nombre;
		int num;
		int sueldo;
		int horas;
		int comision;
		
		do {
			System.out.println("¿Qué tipo de empleado desea añadir?\n"
					+ "\n1. Trabajador por nómina"
					+ "\n2. Trabajador por horas"
					+ "\n3. Gerente"
					+ "\n4. Volver al menú");
			
			switch(Integer.parseInt(sc.nextLine())) {
				case 1:
					System.out.print("Introduzca el nombre: ");
					nombre = sc.nextLine();
					
					System.out.print("Introduzca el nº de empleado: ");
					num = Integer.parseInt(sc.nextLine());
					
					System.out.print("Introduzca el sueldo: ");
					sueldo = Integer.parseInt(sc.nextLine());
					
					Empleado eNomina = new TrabajadorNomina(nombre, num, sueldo);
					listaEmpleados.add(eNomina);
					System.out.println("(!) Empleado añadido con éxito");
					return;
				
				case 2:
					System.out.print("Introduzca el nombre: ");
					nombre = sc.nextLine();
					
					System.out.print("Introduzca el nº de empleado: ");
					num = Integer.parseInt(sc.nextLine());
					
					System.out.print("Introduzca el sueldo: ");
					sueldo = Integer.parseInt(sc.nextLine());
					
					System.out.print("Introduzca el nº de horas: ");
					horas = Integer.parseInt(sc.nextLine());
					
					Empleado eHoras = new TrabajadorHoras(nombre, num, sueldo, horas);
					listaEmpleados.add(eHoras);
					System.out.println("(!) Empleado añadido con éxito");
					return;
					
				case 3:
					System.out.print("Introduzca el nombre: ");
					nombre = sc.nextLine();
					
					System.out.print("Introduzca el nº de empleado: ");
					num = Integer.parseInt(sc.nextLine());
					
					System.out.print("Introduzca el sueldo: ");
					sueldo = Integer.parseInt(sc.nextLine());
					
					System.out.print("Introduzca la cantidad de comisión: ");
					comision = Integer.parseInt(sc.nextLine());
					
					Empleado gerente = new Gerente(nombre, num, sueldo, comision);
					listaEmpleados.add(gerente);
					System.out.println("(!) Empleado añadido con éxito");
					return;
					
				case 4:
					return;
					
				default:
					System.err.println("Introduzca una opción del menú");
					continue;
					
			}
		}while(true);
	}
	
	private void calcularSalarioListaEmpleados() {
		Iterator<Empleado> i = listaEmpleados.iterator();
		
		System.out.println("Mostrando lista de empleados:\n");
		
		while(i.hasNext()) {
			Empleado e = i.next();
			e.calcularSueldo();
			System.out.println(e.toString()); 
		}
	}
}
