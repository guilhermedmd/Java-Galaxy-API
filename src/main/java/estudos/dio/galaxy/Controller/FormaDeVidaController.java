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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import estudos.dio.galaxy.Service.FormaDeVidaService;
import estudos.dio.galaxy.model.FormaDeVida;


@RestController
@RequestMapping("/formadevida")
public class FormaDeVidaController {

    @Autowired
    private FormaDeVidaService service;

    @PostMapping("/1")
    public FormaDeVida adicionarFormaDeVida(@RequestBody FormaDeVida formaDeVida) {
        return service.save(formaDeVida);
    }

    @PutMapping("/2/{id}")
    public FormaDeVida editarFormaDeVida(@PathVariable Long id, @RequestBody FormaDeVida formaDeVida) {
        return service.edit(id, formaDeVida);
    }

    @GetMapping("/3")
    public List<FormaDeVida> mostrarTodos() {
        return service.findAll();
    }

    @GetMapping("/4/{id}")
    public FormaDeVida getMethodName(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/5/{id}")
    public void deletarFormaDeVida(@PathVariable Long id){
            service.deleteById(id);
    }
    
    
    
    
}
