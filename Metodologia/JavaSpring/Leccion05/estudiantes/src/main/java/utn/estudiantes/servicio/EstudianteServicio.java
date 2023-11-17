package utn.estudiantes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiantes2022> listarEstudiantes() {
        List<Estudiantes2022> estudiantes2022 = estudianteRepositorio.findAll();
        return estudiantes2022;
    }

    @Override
    public Estudiantes2022 buscarEstudiantePorId(Integer idEstudiante) {
        Estudiantes2022 estudiantes2022 = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiantes2022;
    }

    @Override
    public void guardarEstudiante(Estudiantes2022 estudiantes2022) {
       estudianteRepositorio.save(estudiantes2022);
    }

    @Override
    public void eliminarEstudiante(Estudiantes2022 estudiantes2022) {
       estudianteRepositorio.delete(estudiantes2022);
    }
}
