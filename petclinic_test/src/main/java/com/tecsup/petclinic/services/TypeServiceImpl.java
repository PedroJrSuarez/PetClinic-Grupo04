package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Type;
import com.tecsup.petclinic.exceptions.TypeNotFoundException;
import com.tecsup.petclinic.repositories.TypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService {

    private final TypeRepository typeRepository;

    @Override
    public Type create(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public Type update(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public Type findById(Integer id) throws TypeNotFoundException {
        return typeRepository.findById(id)
                .orElseThrow(() -> new TypeNotFoundException("Type not found: " + id));
    }
}
