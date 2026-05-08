package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Empleado extends Persona implements Comparable<Empleado> {
	
	private Departamento dpto;
	private BigDecimal salario; 
	private LocalDate fechaAlta;
	
	
	@Override
	public String toString() {
	    return String.format(
	        "\n================ FICHA DE EMPLEADO ================\n" +
	        "  Nombre completo: %s %s %s\n" +
	        "  Nacimiento     : %s\n" +
	        "  Género         : %s\n" +
	        "---------------------------------------------------\n" +
	        "  Departamento   : %s\n" +
	        "  Fecha de Alta  : %s\n" +
	        "  Salario        : %.2f €\n" + 
	        "===================================================\n",
	        super.getNombre(), super.getPrimerApellido(), super.getSegundoApellido(), // Atributos de Persona
	        super.getFechaNacimiento(), super.getGenero(),
	        this.getDpto(), this.getFechaAlta(), this.getSalario()                    // Atributos de Empleado
	    );
	}


	@Override
	public int compareTo(Empleado emp) {
		
		return this.fechaAlta.compareTo(emp.fechaAlta);
	}
	
}
