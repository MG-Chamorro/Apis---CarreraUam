package ni.edu.uam.registro_api.servicios;

import ni.edu.uam.registro_api.models.Carrera;
import ni.edu.uam.registro_api.repository.CarreraRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService {

    private final CarreraRepo carreraRepo;

    public CarreraService(CarreraRepo carreraRepo){
        this.carreraRepo = carreraRepo;
    }

    public List<Carrera> getAllCarreras(){
        return carreraRepo.findAll();
    }

    public Carrera getCarreraByID(Long id){
        return carreraRepo.findById(id).orElse(null);
    }

    public Carrera saveCarrera(Carrera carrera){
        return carreraRepo.save(carrera);
    }

    public void deleteCarrera(Long id){
        carreraRepo.deleteById(id);
    }

}
