package org.luizleiteoliveira.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AccountFieldsRepository {

    static Map<Long, AccountField> data = new ConcurrentHashMap<>();

    public List<AccountField> findAll() {
        return new ArrayList<>(data.values());
    }

    public AccountField findById(Long id) {
        return data.get(id);
    }

    public AccountField save(AccountField accountField){
        data.put(accountField.getId(), accountField);
        return accountField;
    }

}
