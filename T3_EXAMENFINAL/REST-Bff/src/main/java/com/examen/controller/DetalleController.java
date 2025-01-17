package com.examen.controller;

import com.examen.model.DetalleRespuesta;
import com.examen.service.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/detalle")
public class DetalleController {
    @Autowired
    private DetalleService detalleService;
    @GetMapping("/{codigoUnico}")
    public ResponseEntity<DetalleRespuesta>obtenerDetalles(@PathVariable String codigoUnico){
        return ResponseEntity.ok(detalleService.obtenerDetallesPorCodigoUnico(codigoUnico));
    }
}
