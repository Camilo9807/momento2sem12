package com.example.cesde.service;

import com.example.cesde.entity.Tarea;
import com.example.cesde.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    public Optional<Tarea> getTareaById(Long id) {
        return tareaRepository.findById(id);
    }

    public Tarea createTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public Tarea updateTarea(Long id, Tarea tarea) {
        if (tareaRepository.existsById(id)) {
            tarea.setId(id); 
            return tareaRepository.save(tarea);
        }
        return null; 
    }

    public void deleteTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}
