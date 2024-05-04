package com.AppAgenciaDeViajes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppAgenciaDeViajesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAgenciaDeViajesApplication.class, args);
	}

}
/*

Una agencia de viajes vende distintos paquetes turísticos. Cada paquete turístico es único, se arma
para una fecha determinada, debiendo registrarse fecha de salida y fecha de regreso, pudiendo partir
y llegar a distintas ciudades, depende el paquete.

Cada paquete incluye un recorrido por distintas ciudades, que pueden ser de uno o diferentes países,
de cada paquete, se sabe su recorrido, esto es día-hora y lugar de partida y llegada a cada localidad.

A su vez, los clientes, tiene opcionalmente la posibilidad de contratar visitas o atractivos, cada
atractivo, corresponde a una ciudad, por ejemplo: Cerro Catedral, Bariloche; Ruta del vino,
Mendoza, etc. tiene un costo, cuando se contrata, se establece el día y la hora.

A su vez en cada ciudad hay distintas opciones de hoteles, que el cliente puede elegir, de cada hotel
se sabe su nombre, la ciudad en la que está, la cantidad de estrellas, y los servicios que posee, por
ejemplo: desayuno, sauna, etc. A su vez de cada hotel se lleva un registro de las opiniones de los
clientes de la agencia que pararon allí, debiendo tener identificación de la persona, la fecha, una
marca de 1 a 5 estrellas y una opinión de hasta 200 caracteres.

Cuando se contrata un paquete, se debe indicar la cantidad de personas, los hoteles y las visitas y
atractivos, el monto total y la cantidad de personas.

Se pide:
• Listado de todos los paquetes que salen en abril de 2022.
• Dado un paquete: indicar dia/hora de salida y de llegada y las ciudades por donde pasa.
• Dada una ciudad, indicar los hoteles y las visitas o atractivos.

*/