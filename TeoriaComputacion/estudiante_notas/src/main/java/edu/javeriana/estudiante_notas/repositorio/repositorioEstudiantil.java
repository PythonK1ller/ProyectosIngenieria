package edu.javeriana.estudiante_notas.repositorio;

import edu.javeriana.estudiante_notas.modelo.Estudiante;
import edu.javeriana.estudiante_notas.repositorio.*;

import java.util.Optional;

import org.hibernate.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface repositorioEstudiantil extends JpaRepository<Estudiante Long>{
 Optional Estudiante findBYcorreo(string correo);
 boolean existsBYCorreo(string correo);
    
}
