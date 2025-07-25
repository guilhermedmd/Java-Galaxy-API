package estudos.dio.galaxy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estudos.dio.galaxy.LeSysteme;
import estudos.dio.galaxy.Service.PlanetaService;
import estudos.dio.galaxy.model.Planeta;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/planeta")
public class PlanetaController{

    @Autowired
    private PlanetaService service;

    @Autowired
    private LeSysteme leSystemeAPI;

    @PostMapping("/1/{planeta}")
    public Planeta AdicionarPlaneta(@PathVariable String planeta){
        // Uso da API feigh do Le-Sisteme
        Planeta planetaAPI = leSystemeAPI.consultarPlaneta(planeta);
        System.out.println("Planeta encontrado:");
        System.out.println(planetaAPI);
        service.save(planetaAPI);
        return planetaAPI;
    }

    @PutMapping("2/{id}")
    public Planeta editarPlaneta(@PathVariable String id, @RequestBody Planeta novoPlaneta) {
        // return deve ser o service para aplicar as mudanças
        return service.edit(id, novoPlaneta);
        
    }

    @GetMapping("/3")
    public List<Planeta> mostrarPlanetas() {
        return service.findAll();
    }
    
    @GetMapping("/4/{id}")
    public Planeta buscarUmPlaneta(@RequestParam String id) {
        System.out.println(service.findById(id).getEnglishName());
        return service.findById(id);
    }

    @DeleteMapping("/5/{id}")
    public void deletarPlaneta(@PathVariable String id){
        service.deleteById(id);
    }
    

    


    
}
