package estudos.dio.galaxy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estudos.dio.galaxy.model.FormaDeVida;
import estudos.dio.galaxy.repository.FormaDeVidaRepository;

@Service
public class FormaDeVidaService {
    
    @Autowired
    FormaDeVidaRepository repository;

    public FormaDeVida save(FormaDeVida formaDeVida){
        return repository.save(formaDeVida);
    }

    public FormaDeVida edit(Long id, FormaDeVida novosDados){
        return repository.findById(id).map(existente -> {existente.setNome(novosDados.getNome()); 
        existente.setIdade(novosDados.getIdade());
        existente.setEspecie(novosDados.getEspecie());
        existente.setPlaneta(novosDados.getPlaneta());
        return repository.save(existente);
        }
        ).orElse(null);
    }

    public FormaDeVida findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<FormaDeVida> findAll(){
        return repository.findAll();
    }

    public void deleteById(Long id){
         repository.deleteById(id);
    }
}
