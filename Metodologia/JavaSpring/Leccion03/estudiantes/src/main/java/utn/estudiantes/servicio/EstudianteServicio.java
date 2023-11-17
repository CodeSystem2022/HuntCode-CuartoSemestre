package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiante;

import java.util.List;

public class EstudianteServicio implements IEstudianteServicio {
    @Override
    public List<Estudiante> listarEstudiantes() {
        return null;
    }

    @Override
    public Estudiante buscarEstudiantePorId(Integer idEstudiante) {
        Estudiante estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {

    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {

    }
}
