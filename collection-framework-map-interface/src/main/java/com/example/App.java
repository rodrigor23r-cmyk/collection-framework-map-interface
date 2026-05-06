package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * https://www.java2s.com/Tutorials/Java/Java_Stream/index.html
 */
public class App {
    public static void main(String[] args) {
    	/*
    	Un map interface es casi una Collection, se trata igual con las Collection Views.
    	Un mapa relaciona claves con valores: Estructura hash (key, value). 
    	Las claves no pueden repetirse (por ejemplo, rodrigo@gmail.com).
    	Los métodos de ordenamiento de Collection no se pueden aplicar a los mapas (sort() no funcionará).
    	 * */ 
    	
    	
    	List <String> listadoArgumentos = Arrays.asList(args);
    	listadoArgumentos.forEach(System.out::println);
    	
    	// Creación del mapa a partir del listado de argumentos
    

    	System.out.println("=========================================");
    	// método operaciones de agregado:
    	
    	Map<String, Long> mapa1 = null;
    	
    			mapa1 = listadoArgumentos.stream()
    			.collect(Collectors.groupingBy
    					(Function.identity(), Collectors.counting()));
    	
    	System.out.println(mapa1);
    	
    	System.out.println("=========================================");
    	
    	var mapa2 = listadoArgumentos.stream()
    	 .collect(Collectors.groupingBy(nombre -> nombre, Collectors.counting() ));
    	
    	System.out.println(mapa2);
    	
    	/*==============lista de empleados========================*/
    	
    	List<? extends Persona> listadoGenerico = new ArrayList<>();
    	
    	Empleado emp1 = Empleado.builder()
    			.nombre("Jorge Francisco")
    			.primerApellido("Alborch")
    			.segundoApellido("Villar")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1973, Month.JULY, 23))
    			.dpto(Departamento.INFORMATICA)
    			.salario(new BigDecimal(3500.45))
    			.fechaAlta(LocalDate.of(1990, Month.SEPTEMBER, 22))
    			.build();
    	Empleado emp2 = Empleado.builder()
    			.nombre("Andrés")
    			.primerApellido("Alonso")
    			.segundoApellido("Pelaez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1983, Month.SEPTEMBER, 23))
    			.dpto(Departamento.INFORMATICA)
    			.salario(new BigDecimal(3400.50))
    			.fechaAlta(LocalDate.of(1995, Month.SEPTEMBER, 22))
    			.build();
    	Empleado emp3 = Empleado.builder()
    			.nombre("Jerónimo")
    			.primerApellido("Arenal")
    			.segundoApellido("Gómez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1968, Month.OCTOBER, 20))
    			.dpto(Departamento.CONTABILIDAD)
    			.salario(new BigDecimal(3600.5))
    			.fechaAlta(LocalDate.of(1977, Month.JANUARY, 4))
    			.build();
    	Empleado emp4 = Empleado.builder()
    			.nombre("Carolina")
    			.primerApellido("Garzón")
    			.segundoApellido("Becerra")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(2001, Month.JUNE, 7))
    			.dpto(Departamento.INFORMATICA)
    			.salario(new BigDecimal(3700.50))
    			.fechaAlta(LocalDate.of(2020, Month.SEPTEMBER, 10))
    			.build();
    	Empleado emp5 = Empleado.builder()
    			.nombre("Mariana")
    			.primerApellido("Garzón")
    			.segundoApellido("Villar")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(2000, Month.AUGUST, 4))
    			.dpto(Departamento.FINANZAS)
    			.salario(new BigDecimal(3300.50))
    			.fechaAlta(LocalDate.of(2022, Month.SEPTEMBER, 25))
    			.build();
    	Empleado emp6 = Empleado.builder()
    			.nombre("Francisca")
    			.primerApellido("Álvarez")
    			.segundoApellido("González")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(1995, Month.DECEMBER, 10))
    			.dpto(Departamento.RRHH)
    			.salario(new BigDecimal(2500.45))
    			.fechaAlta(LocalDate.of(2010, Month.SEPTEMBER, 5))
    			.build();
    	Empleado emp7 = Empleado.builder()
    			.nombre("Maricarmen")
    			.primerApellido("Becerra")
    			.segundoApellido("Martínez")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(2003, Month.FEBRUARY, 14))
    			.dpto(Departamento.FINANZAS)
    			.salario(new BigDecimal(2600.45))
    			.fechaAlta(LocalDate.of(2021, Month.SEPTEMBER, 8))
    			.build();
    	Empleado emp8 = Empleado.builder()
    			.nombre("Eva")
    			.primerApellido("Cornide")
    			.segundoApellido("Machado")
    			.genero(Genero.MUJER)
    			.fechaNacimiento(LocalDate.of(1990, Month.MAY, 18))
    			.dpto(Departamento.INFORMATICA)
    			.salario(new BigDecimal(3500.45))
    			.fechaAlta(LocalDate.of(2015, Month.SEPTEMBER, 22))
    			.build();
    	Empleado emp9 = Empleado.builder()
    			.nombre("Alberto")
    			.primerApellido("González")
    			.segundoApellido("Sánchez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1990, Month.FEBRUARY, 14))
    			.dpto(Departamento.FINANZAS)
    			.salario(new BigDecimal(2600.45))
    			.fechaAlta(LocalDate.of(2008, Month.SEPTEMBER, 8))
    			.build();
    	Empleado emp10 = Empleado.builder()
    			.nombre("Javier")
    			.primerApellido("González")
    			.segundoApellido("Sánchez")
    			.genero(Genero.HOMBRE)
    			.fechaNacimiento(LocalDate.of(1995, Month.MAY, 20))
    			.dpto(Departamento.RRHH)
    			.salario(new BigDecimal(3500.45))
    			.fechaAlta(LocalDate.of(2015, Month.SEPTEMBER, 22))
    			.build();
    	Empleado emp11 = Empleado.builder()
    	        .nombre("Lucía")
    	        .primerApellido("Mendoza")
    	        .segundoApellido("Castillo")
    	        .genero(Genero.MUJER)
    	        .fechaNacimiento(LocalDate.of(1985, Month.MARCH, 12))
    	        .dpto(Departamento.RRHH)
    	        .salario(new BigDecimal(2450.75))
    	        .fechaAlta(LocalDate.of(2010, Month.JUNE, 05))
    	        .build();

    	Empleado emp12 = Empleado.builder()
    	        .nombre("Adrián")
    	        .primerApellido("Gómez")
    	        .segundoApellido("Pascual")
    	        .genero(Genero.HOMBRE)
    	        .fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 30))
    	        .dpto(Departamento.CONTABILIDAD)
    	        .salario(new BigDecimal(1800.00))
    	        .fechaAlta(LocalDate.of(2018, Month.FEBRUARY, 14))
    	        .build();

    	Empleado emp13 = Empleado.builder()
    	        .nombre("Elena")
    	        .primerApellido("Sanz")
    	        .segundoApellido("Garrido")
    	        .genero(Genero.MUJER)
    	        .fechaNacimiento(LocalDate.of(1978, Month.AUGUST, 17))
    	        .dpto(Departamento.INFORMATICA)
    	        .salario(new BigDecimal(4200.30))
    	        .fechaAlta(LocalDate.of(2002, Month.OCTOBER, 29))
    	        .build();

    	Estudiante est1 = Estudiante.builder()
    	        .nombre("Alex")
    	        .primerApellido("Ruiz")
    	        .segundoApellido("Jiménez")
    	        .genero(Genero.HOMBRE)
    	        .fechaNacimiento(LocalDate.of(1995, Month.MAY, 03))
    	        .facultad(Facultad.BIOLOGIA)
    	        .totalAsignaturas(10)
    	        .fechaAltaFacultad(LocalDate.of(2021, Month.JANUARY, 10))
    	        .build();
    	
    	listadoGenerico = Arrays.asList(
   		    emp1, emp2, emp3, emp4, emp5, emp6, emp7, 
	    emp8, emp9, emp10, emp11, emp12, emp13, est1);
// listadoGenerico.add(emp1);
    	
    	System.out.println(emp1.equals(emp2)); // da true si todos los campos del tipo son iguales
    	System.out.println("Código hash de emp1: " + emp1.hashCode()); // da la referencia en memoria
    	
    	/*=============colección que agrupe por género sólo los empleados================*/
    	
    	Map<Genero, List<Persona>> personasPorGenero = listadoGenerico.stream()
    			.collect(Collectors.groupingBy(p -> p.getGenero(), Collectors.toList()));
    	
    	 System.out.println(personasPorGenero);
    	// ========================================================
    	Map<Genero, List<Persona>> personasPorGenero2 = listadoGenerico.stream()
    			.collect(Collectors.groupingBy(Persona::getGenero)); // no es necesario indicar el valor!!!!
    	
    	System.out.println(personasPorGenero2);

    	
    	// ========================================================	
    	// Cambia List<Persona> por List<String>
    	Map<Genero, List<String>> personasPorGenero3 = listadoGenerico.stream()
    	        .collect(Collectors.groupingBy(Persona::getGenero, 
    	                Collectors.mapping(Persona::getNombre, Collectors.toList())));

    	System.out.println(personasPorGenero3);
    	
    	
    	
    	// ========================================================
    	Map<Genero, List<String>> empleadosPorGenero4 = listadoGenerico.stream()
    			.filter(obj -> obj instanceof Empleado)
    			.map(obj -> (Empleado) obj)
    	      //.filter(Empleado.class::isInstance) // Reemplaza a obj instanceof Empleado
    		  //.map(Empleado.class::cast)          // Reemplaza a (Empleado) obj
    			.collect(Collectors.groupingBy(Empleado::getGenero,
    		    Collectors.mapping(Empleado::getNombre, Collectors.toList())));
    	
    	    	
    	// 1. Extraemos las listas de forma segura (por si no hubiera hombres o mujeres)
    	List<String> hombreS = empleadosPorGenero4.getOrDefault(Genero.HOMBRE, Collections.emptyList());
    	List<String> mujereS = empleadosPorGenero4.getOrDefault(Genero.MUJER, Collections.emptyList());

    	// 2. Averiguamos cuál es la lista más larga para saber cuántas filas tendrá la tabla
    	int maxFilaS = Math.max(hombreS.size(), mujereS.size());

    	// 3. Imprimimos la cabecera (usamos %-25s para reservar 25 espacios alineados a la izquierda)
    	System.out.println(String.format("\n%-25s | %-25s", "HOMBRES", "MUJERES"));
    	System.out.println("--------------------------+--------------------------");

    	// 4. Bucle para imprimir fila a fila
    	for (int i = 0; i < maxFilaS; i++) {
    	    // Operador ternario: Si hay elemento en esa posición, lo coge. Si no, pone un espacio en blanco.
    	    String nombreHombrE = (i < hombreS.size()) ? hombreS.get(i) : "";
    	    String nombreMujeR = (i < mujereS.size()) ? mujereS.get(i) : "";
    	    
    	    // Imprimimos la fila respetando los 25 espacios de columna
    	    System.out.println(String.format("%-25s | %-25s", nombreHombrE, nombreMujeR));
    	}
    	System.out.println("--------------------------+--------------------------\n");
    	
    }
}
