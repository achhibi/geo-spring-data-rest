package amch.demo;

import amch.demo.domain.Country;
import amch.demo.repository.CountryRestRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.ArrayList;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class GeoApplication implements ApplicationListener<ContextRefreshedEvent> {

    private CountryRestRepository countryRestRepository;

    public static void main(String[] args) {
        SpringApplication.run(GeoApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Country c1 = new Country(null, "France", 46000000, new ArrayList<>());
        this.countryRestRepository.save(c1);
        log.info("Countries inserted OK");
    }

  /* @Bean
    CountryEventHandler countryEventHandler() {
        return new CountryEventHandler();
    } */

}
