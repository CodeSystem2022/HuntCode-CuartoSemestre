package utn.tienda_libros;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import utn.tienda_libros.vista.LibroFrom;

import java.awt.EventQueue;


@SpringBootApplication
public class TiendaLibrosApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext contextoSpring =
				new SpringApplicationBuilder(TiendaLibrosApplication.class)
						.headless(false)
						.web(WebApplicationType.NONE)
						.run(args);

		//Ejecutamos el codigo para el formulario
		EventQueue.invokeLater(() -> { //Método Lambda
			// Obtenemos el objeto from a traves del spring
			LibroFrom libroFrom = contextoSpring.getBean(LibroFrom.class);
			libroFrom.setVisible(true);
		});
	}
}





