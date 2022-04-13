package amch.demo.repository;

import amch.demo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "pays", path = "pays")
public interface CountryRestRepository extends JpaRepository<Country, Long> {

    @RestResource(path = "name")
    Optional<Country> findByName(String name);



}
