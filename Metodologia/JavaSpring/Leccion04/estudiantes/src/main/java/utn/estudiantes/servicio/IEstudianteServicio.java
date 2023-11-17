package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiantes2022;

import java.util.List;

public interface IEstudianteServicio {  // Definimos metodos de la interface, que luego implementaremos desde la clase EstudianteServicio
    public List<Estudiantes2022> listarEstudiantes();
    public Estudiantes2022 buscarEstudiantePorId(Integer idEstudiante);
    public void guardarEstudiante(Estudiantes2022 estudiante);  //objeto estudiante de tipo Estudiantes2022
    public void eliminarEstudiante(Estudiantes2022 estudainte);


}
