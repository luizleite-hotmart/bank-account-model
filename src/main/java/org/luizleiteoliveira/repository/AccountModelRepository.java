package org.luizleiteoliveira.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.enterprise.context.ApplicationScoped;
import org.luizleiteoliveira.entity.AccountModel;

@ApplicationScoped
public class AccountModelRepository {

    static Map<String, AccountModel> data = new ConcurrentHashMap<>();

    public List<AccountModel> findAll() {
        return new ArrayList<>(data.values());
    }

    public AccountModel findByCountry(String country) {
        return data.get(country);
    }

    public AccountModel save(AccountModel accountModel) {
        data.put(accountModel.getCountry(), accountModel);
        return accountModel;
    }

}
