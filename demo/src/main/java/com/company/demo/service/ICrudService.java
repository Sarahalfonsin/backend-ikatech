package com.company.demo.service;

import java.util.Set;

public interface ICrudService<T> {
    Set<T> listarTodos();
}
