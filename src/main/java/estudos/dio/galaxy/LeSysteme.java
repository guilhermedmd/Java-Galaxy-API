package estudos.dio.galaxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import estudos.dio.galaxy.model.Planeta;

@FeignClient(name="lesysteme", url="https://api.le-systeme-solaire.net/")
public interface LeSysteme {
    
    @GetMapping("/rest/bodies/{planeta}")
    Planeta consultarPlaneta(@PathVariable ("planeta") String planeta);
}
