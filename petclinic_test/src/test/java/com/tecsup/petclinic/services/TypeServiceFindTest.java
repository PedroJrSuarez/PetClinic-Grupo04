package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Type;
import com.tecsup.petclinic.exceptions.TypeNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("h2")
@Transactional
class TypeServiceFindTest {

    @Autowired
    private TypeService typeService;

    @Test
    void testFindTypeById() throws TypeNotFoundException {
        Type foundType = typeService.findById(1);

        assertEquals(1, foundType.getId());
        assertEquals("cat", foundType.getName());
        assertEquals("Domestic feline", foundType.getDescription());
    }
}
