package org.luizleiteoliveira;

import io.quarkus.runtime.StartupEvent;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.luizleiteoliveira.entity.AccountField;
import org.luizleiteoliveira.entity.AccountModel;
import org.luizleiteoliveira.repository.AccountModelRepository;

@ApplicationScoped
public class Initializer {

    private final static Logger LOGGER = Logger.getLogger(Initializer.class.getName());

    @Inject
    private AccountModelRepository accountFieldsRepository;

    protected void onStart(@Observes StartupEvent event) {
        LOGGER.info("##### Starting adding account models");
        accountFieldsRepository.save(buildMexicoModel());
        LOGGER.info(" #### End creation account models");
    }

    private AccountModel buildMexicoModel() {
        AccountModel accountModelMexico = new AccountModel("Mexico");
        accountModelMexico.getAccountFields()
            .add(new AccountField("bic_swift", "^[0-9A-Z]{8}$|^[0-9A-Z]{11}$", "text", "swift bank account"));
        accountModelMexico.getAccountFields()
            .add(new AccountField("clabe", "^\\d{18}$", "", "clabe"));
        accountModelMexico.getAccountFields()
            .add(new AccountField("state", "^.{1,255}", "", "state"));
        accountModelMexico.getAccountFields()
            .add(new AccountField("identification_value", "^(.{3}\\d{6}.{3}|.{4}\\d{6}.{3}|.{4}\\d{6}(M|H|m|h)[A-Za-z]{2}.{5})$", "", "identification_value"));
        return accountModelMexico;
    }

}
