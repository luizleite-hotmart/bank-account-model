package org.luizleiteoliveira.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AccountFieldsTest {

    @Test
    public void createModelFromAccountField() {
        AccountField accountField = new AccountField("name", "regex", "type", "description");

        assertEquals("name", accountField.getName());
        assertEquals("regex", accountField.getRegex());
        assertEquals("type", accountField.getType());
        assertEquals("description", accountField.getDescription());
    }
}
