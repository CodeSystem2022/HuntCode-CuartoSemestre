package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiantes2022;

import java.util.List;

public interface IEstudianteServicio {  // Definimos metodos de la interface, que luego implementaremos desde la clase EstudianteServicio
    public List<Estudiantes2022> listarEstudiantes();
    public Estudiantes2022 buscarEstudiantePorId(Integer idEstudiantes2022);
    public void guardarEstudiante(Estudiantes2022 estudiantes2022);  //objeto estudiante de tipo Estudiante
    public void eliminarEstudiante(Estudiantes2022 estudiante);


}
