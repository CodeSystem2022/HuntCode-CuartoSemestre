package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {  // Definimos metodos de la interface, que luego implementaremos desde la clase EstudianteServicio
    public List<Estudiante> listarEstudiantes();
    public Estudiante buscarEstudiantePorId(Integer idEstudiante);
    public void guardarEstudiante(Estudiante estudiante);  //objeto estudiante de tipo Estudiante
    public void eliminarEstudiante(Estudiante estudainte);


}
