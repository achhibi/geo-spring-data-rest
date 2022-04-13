package amch.demo.repository;

import amch.demo.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRestRepository extends JpaRepository<City, Long> {
}
