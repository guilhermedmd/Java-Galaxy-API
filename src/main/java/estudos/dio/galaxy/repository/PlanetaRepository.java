package estudos.dio.galaxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudos.dio.galaxy.model.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, String>{
    
}
