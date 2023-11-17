package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;

public class LibroFrom extends JFrame {
    LibroServicio LibroServicio;
    private JPanel panel;

    @Autowired
    public_LibroFrom(LibroServicio libroServicio){
       this.libroServicio = libroServicio;
       iniciarForma();
    }

    private void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SetVisible(true);
        setSize(900, 700);
    }
}



