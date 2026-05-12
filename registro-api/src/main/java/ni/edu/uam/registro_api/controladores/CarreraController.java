package ni.edu.uam.registro_api.controladores;

import ni.edu.uam.registro_api.models.Carrera;
import ni.edu.uam.registro_api.servicios.CarreraService;
import org.springframework.web.bind.annotation.*;

import javax.management.DescriptorKey;
import java.util.List;

@RestController
@RequestMapping("/api/carreras")
public class CarreraController {

    private final CarreraService carreraService;

    public CarreraController(CarreraService carreraService){
        this.carreraService = carreraService;
    }

    @GetMapping
    public List<Carrera> getAllCarreras(){
        return carreraService.getAllCarreras();
    }

    @GetMapping("/{id}")
    public Carrera getCarreraById(@PathVariable Long id){
        return carreraService.getCarreraByID(id);
    }

    @PostMapping
    public Carrera saveCarrera(@RequestBody Carrera carrera){
        return carreraService.saveCarrera(carrera);
    }

    @PutMapping("/{id}")
    public Carrera updateCarrera(@PathVariable Long id, @RequestBody Carrera carrera){
        carrera.setId(id);
        return carreraService.saveCarrera(carrera);
    }

    @DeleteMapping("/{id}")
    public void deleteCarrera(@PathVariable Long id){
        carreraService.deleteCarrera(id);
    }

}
