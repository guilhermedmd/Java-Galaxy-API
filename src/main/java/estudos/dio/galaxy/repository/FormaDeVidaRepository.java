package estudos.dio.galaxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudos.dio.galaxy.model.FormaDeVida;

@Repository
public interface FormaDeVidaRepository extends JpaRepository<FormaDeVida, Long> {
  
}
