package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
    	Map<String, Long> mapa = 
    			listadoArgumentos.stream()
    			.collect(Collectors.groupingBy
    					(nombre -> nombre, Collectors.counting()));
    	
    	System.out.println(mapa);
    	
    }
}
