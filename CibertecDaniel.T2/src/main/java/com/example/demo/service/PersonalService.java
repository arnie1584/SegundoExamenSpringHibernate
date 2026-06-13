package com.example.demo.service;

import com.example.demo.model.Personal;
import com.example.demo.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    public List<Personal> listarTodo() {
        return personalRepository.findAll();
    }

    public Personal registrar(Personal personal) {
        return personalRepository.save(personal);
    }

    public Personal buscarPorId(Integer id) {
        return personalRepository.findById(id).orElse(null);
    }

    public Personal actualizar(Personal personal) {
        return personalRepository.save(personal);
    }

    public void eliminar(Integer id) {
        personalRepository.deleteById(id);
    }
}