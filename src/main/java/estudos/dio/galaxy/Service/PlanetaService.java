package estudos.dio.galaxy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estudos.dio.galaxy.model.Planeta;
import estudos.dio.galaxy.repository.PlanetaRepository;

@Service
public class PlanetaService {
    
    @Autowired
    private PlanetaRepository repository;

    public Planeta save(Planeta planeta){
        return repository.save(planeta);
    }

    public Planeta edit(String id, Planeta novosDados){
        return repository.findById(id).map(existente -> {
            existente.setEnglishName(novosDados.getEnglishName());
            existente.setGravity(novosDados.getGravity());
            existente.setPlanet(novosDados.isPlanet());
            return repository.save(existente);
        }).orElse(null);
    }

    public Planeta findById(String id){
        return repository.findById(id).orElse(null);
    }

    public List<Planeta> findAll(){
        return repository.findAll();
    }

    // delete sempre retorna void
    public void deleteById(String id){
        repository.deleteById(id);
    }
}
