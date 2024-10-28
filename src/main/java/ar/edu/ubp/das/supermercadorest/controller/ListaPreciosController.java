package ar.edu.ubp.das.supermercadorest.controller;

import ar.edu.ubp.das.supermercadorest.bean.ListaPrecios;
import ar.edu.ubp.das.supermercadorest.repository.ListaPreciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lista-precios")
public class ListaPreciosController {

    @Autowired
    private ListaPreciosRepository listaPreciosRepository;

    @GetMapping("/precios")
    public ResponseEntity<List<ListaPrecios>> obtenerPrecios() {

        // Obtenemos la lista de precios de productos
        List<ListaPrecios> listaPrecios = listaPreciosRepository.getLocalidades();

        // Devolvemos la lista en el cuerpo de la respuesta
        return ResponseEntity.ok(listaPrecios);
    }
}




