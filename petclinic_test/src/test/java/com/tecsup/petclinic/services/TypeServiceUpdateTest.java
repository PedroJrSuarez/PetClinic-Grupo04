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
class TypeServiceUpdateTest {

    @Autowired
    private TypeService typeService;

    @Test
    void testUpdateType() throws TypeNotFoundException {
        Type typeToUpdate = typeService.findById(1);
        typeToUpdate.setName("updated-cat");
        typeToUpdate.setDescription("Updated feline");
        typeToUpdate.setAverageLifespan(16);

        Type updatedType = typeService.update(typeToUpdate);

        assertEquals(1, updatedType.getId());
        assertEquals("updated-cat", updatedType.getName());
        assertEquals("Updated feline", updatedType.getDescription());
        assertEquals(16, updatedType.getAverageLifespan());
    }
}
