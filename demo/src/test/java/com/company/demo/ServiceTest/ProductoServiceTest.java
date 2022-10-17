package com.company.demo.ServiceTest;

import com.company.demo.dto.ProductoDTO;
import com.company.demo.service.ProductoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductoServiceTest {

     @Autowired
    ProductoService pservice;

     ProductoDTO producto= new ProductoDTO();

    @BeforeEach
    public  void setUp() {
        producto= new ProductoDTO();
       producto.setId(1l);
        producto.setNombre("SarahTest");
       producto.setFoto("1.jpg");
       producto.setPrecio(500);
       producto.setReferencia("G24");

    }
     @Test
    public void testListarTodos(){
         pservice.listarTodos();
                 assertTrue(pservice.listarTodos().size()>=0);
     }

}
