package com.company.demo.service;

import com.company.demo.dto.ProductoDTO;
import com.company.demo.persistencia.model.Producto;
import com.company.demo.persistencia.repository.IProductoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductoService implements IProductoService {
    private static  final Logger logger = Logger.getLogger(ProductoService.class);

    @Autowired
    IProductoRepository productoRepository;
    @Autowired
    ObjectMapper mapper;
    @Override
    public Set<ProductoDTO> listarTodos() {
        List<Producto> productos= productoRepository.findAll();

        Set<ProductoDTO> productosDTO = new HashSet<>();

        for(Producto producto : productos){
            productosDTO.add(mapper.convertValue(producto,ProductoDTO.class));
            logger.info("Se encontro al prodcuto" + producto.getNombre() + producto.getReferencia());
        }
        return productosDTO;
    }
}
