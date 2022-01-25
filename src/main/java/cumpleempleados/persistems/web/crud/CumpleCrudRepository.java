package cumpleempleados.persistems.web.crud;

import cumpleempleados.persistems.web.entity.Cumpleanios;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface CumpleCrudRepository extends CrudRepository<Cumpleanios,Integer> {

    List<Cumpleanios> findByFechaCumple(LocalDate fechaCumple);
    List<Cumpleanios> findByProfesion(String profecion);


}
