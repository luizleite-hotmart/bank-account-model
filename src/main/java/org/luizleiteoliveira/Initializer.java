package org.luizleiteoliveira;

import io.quarkus.runtime.StartupEvent;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.luizleiteoliveira.entity.AccountField;
import org.luizleiteoliveira.entity.AccountFieldsRepository;

@ApplicationScoped
public class Initializer {

    private final static Logger LOGGER = Logger.getLogger(Initializer.class.getName());

    @Inject
    private AccountFieldsRepository accountFieldsRepository;

    protected void onStart(@Observes StartupEvent event) {
        LOGGER.info("##### Starting adding account models");
        AccountField accountField = new AccountField(1L, "teste", "fdsakljfs", "tt", "fdaskj");
        accountFieldsRepository.save(accountField);
        LOGGER.info(" #### End creation account models");
    }

}
