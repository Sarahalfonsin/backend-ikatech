package com.company.demo.controller;

import com.company.demo.dto.ProductoDTO;
import com.company.demo.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ResponseEntity<?> listarTodos(){
        Set<ProductoDTO> productoDTO = productoService.listarTodos();
        return new ResponseEntity<>(productoDTO, HttpStatus.OK);
    }


}
