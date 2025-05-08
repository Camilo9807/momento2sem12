package com.example.cesde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cesde.entity.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    // Aquí puedes definir métodos personalizados para consultas más complejas si es necesario
}
