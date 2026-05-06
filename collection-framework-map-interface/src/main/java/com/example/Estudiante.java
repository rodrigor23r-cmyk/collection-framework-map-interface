package com.example;

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

public class Estudiante extends Persona {
	private Facultad facultad;
	private int totalAsignaturas;
	private LocalDate fechaAltaFacultad;
	
	@Override
	public String toString() {
	    return String.format(
	        "\n============= FICHA DE ESTUDIANTE ===============\n" +
	        "  Nombre completo : %s %s %s\n" +
	        "  Nacimiento      : %s\n" +
	        "  Género          : %s\n" +
	        "---------------------------------------------------\n" +
	        "  Facultad        : %s\n" +
	        "  Fecha de Alta   : %s\n" +
	        "  Num. Asignaturas: %s\n" + 
	        "===================================================\n",
	        super.getNombre(), super.getPrimerApellido(), super.getSegundoApellido(), // Atributos de Persona
	        super.getFechaNacimiento(), super.getGenero(),
	        this.getFacultad(), this.getFechaAltaFacultad(), this.getTotalAsignaturas()//Atributos de Estudiante
	    );
	}
}
