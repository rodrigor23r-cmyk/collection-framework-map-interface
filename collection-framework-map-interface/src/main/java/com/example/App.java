package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
    	Map<String, Integer> mapa = new HashMap<>();
    	
    	Integer repeticion = null;
    	// método for mejorado:
    	for (String nombre : listadoArgumentos) {
			// opción: 1
    		repeticion = mapa.get(nombre);
    		mapa.put(nombre, repeticion == null ? 1 : ++repeticion); 
    	/* opción 2
    	 * 	if (mapa.containsKey(nombre)) {
    			mapa.put(nombre, mapa.get(nombre) + 1);
    		} else {
    			mapa.put(nombre, 1);
    		}
    		*/
		}   		
    	System.out.println(mapa);
    	System.out.println("=========================================");
    	// método operaciones de agregado:
    	
    	
    	
    }
}
