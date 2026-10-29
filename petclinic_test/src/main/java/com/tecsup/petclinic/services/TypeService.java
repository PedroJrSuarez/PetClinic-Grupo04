package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Type;
import com.tecsup.petclinic.exceptions.TypeNotFoundException;

public interface TypeService {

    Type create(Type type);

    Type update(Type type);

    Type findById(Integer id) throws TypeNotFoundException;
}
