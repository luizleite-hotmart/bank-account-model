package org.luizleiteoliveira.entity;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import io.quarkus.test.junit.QuarkusTest;
import java.util.List;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AccountModelEntityTest {

    @Test
    public void createModelClassExample() {
        List<AccountField> accountFieldList = singletonList(
            new AccountField("number", "ALB", "string", "this is a number"));
        AccountModel accountModel = new AccountModel("country", accountFieldList);
        assertFalse(accountModel.getAccountFields().isEmpty());
        assertEquals("country", accountModel.getCountry());
    }

}
