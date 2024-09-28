package ar.edu.ubp.das.supermercadorest.controller;

import ar.edu.ubp.das.supermercadorest.bean.SucursalesPrecios;
import ar.edu.ubp.das.supermercadorest.repository.SucursalesPreciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lista-precios")
public class SucursalesPreciosController {

    @Autowired
    private SucursalesPreciosRepository sucursalesPreciosRepository;

    @GetMapping("/precios")
    public ResponseEntity<List<SucursalesPrecios>> obtenerPrecios() {

        // Obtenemos la lista de precios de productos
        List<SucursalesPrecios> sucursalesPrecios = sucursalesPreciosRepository.getLocalidades();

        // Devolvemos la lista en el cuerpo de la respuesta
        return ResponseEntity.ok(sucursalesPrecios);
    }
}




