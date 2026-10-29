package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Type;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("h2")
@Transactional
class TypeServiceCreateTest {

    @Autowired
    private TypeService typeService;

    @Test
    void testCreateType() {
        Type typeToCreate = new Type(null, "test-cat", "Test feline", true, "small", 15, "medium");

        Type createdType = typeService.create(typeToCreate);

        assertNotNull(createdType.getId());
        assertEquals("test-cat", createdType.getName());
        assertEquals("Test feline", createdType.getDescription());
        assertEquals("small", createdType.getSizeCategory());
    }
}
