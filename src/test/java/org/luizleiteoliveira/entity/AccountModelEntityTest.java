package org.luizleiteoliveira.entity;

import io.quarkus.test.junit.QuarkusTest;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AccountModelEntityTest {

    @Test
    public void createModelClassExample() {
        List<AccountField> accountFieldList = Arrays.asList(new AccountField("number", "ALB", "string", "this is a number"));
        AccountModel accountModel = new AccountModel("country", accountFieldList);
    }

}
