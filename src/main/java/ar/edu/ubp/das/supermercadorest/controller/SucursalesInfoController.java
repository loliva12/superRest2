package ar.edu.ubp.das.supermercadorest.controller;

import ar.edu.ubp.das.supermercadorest.bean.SucursalesRequest;
import ar.edu.ubp.das.supermercadorest.repository.SucursalesInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informacion")
public class SucursalesInfoController {

    @Autowired
    private SucursalesInfoRepository sucursalesInfoRepository;

    @GetMapping("/sucursales")
    public ResponseEntity<List<SucursalesRequest>> obtenerSucursales() {

        // Llamamos al repositorio para obtener la lista de sucursales
        List<SucursalesRequest> sucursales = sucursalesInfoRepository.getSucursales();

        // Devolvemos la lista en el cuerpo de la respuesta
        return ResponseEntity.ok(sucursales);
    }
}
