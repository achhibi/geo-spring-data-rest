package amch.demo.handler;

import amch.demo.domain.Country;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
@Slf4j
public class CountryEventHandler {

    @HandleBeforeCreate
    public void handleCountryBeforeCreate(Country country){
        log.info("Intercept Country Before Create it....");
        log.info(country.toString());
    }

    @HandleAfterCreate
    public void handleCountryAfterCreate(Country country){
        log.info("Intercept Country After Create it....");
        log.info(country.toString());
    }

    @HandleBeforeSave
    public void handleCountryBeforeSave(Country country){
        log.info("Intercept Country Before Save it....");
        log.info(country.toString());
    }

    @HandleAfterSave
    public void handleCountryAfterSave(Country country){
        log.info("Intercept Country After Save it....");
        log.info(country.toString());
    }

    @HandleBeforeDelete
    public void handleAuthorBeforeDelete(Country country){
        log.info("Intercept Country Before Delete it ....");
        log.info(country.toString());
    }

    @HandleAfterDelete
    public void handleAuthorAfterDelete(Country country){
        log.info("Inside Author After Delete it ....");
        log.info(country.toString());
    }
}
