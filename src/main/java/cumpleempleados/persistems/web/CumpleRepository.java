package cumpleempleados.persistems.web;

import cumpleempleados.domain.Birthday;
import cumpleempleados.domain.repository.BirthdayRepository;
import cumpleempleados.persistems.web.crud.CumpleCrudRepository;
import cumpleempleados.persistems.web.entity.Cumpleanios;
import cumpleempleados.persistems.web.mapper.BirthdayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class CumpleRepository implements BirthdayRepository {

    @Autowired
    private CumpleCrudRepository cumpleCrudRepository;

    @Autowired
    private BirthdayMapper mapper;

    @Override
    public List<Birthday> getAll() {
        List<Cumpleanios> cumpleanios = (List<Cumpleanios>) cumpleCrudRepository.findAll();
        return (List<Birthday>) mapper.toBirthday(cumpleanios);
    }

    @Override
    public Optional<List<Birthday>> getByFechaCumple(LocalDate birthday) {
        List<Cumpleanios> cumpleanios =cumpleCrudRepository.findByFechaCumple(birthday);
        return Optional.of(mapper.toBirthday(cumpleanios));
    }

    @Override
    public Optional<List<Birthday>> getByProfecion(String profession) {
        List<Cumpleanios> cumpleanios = cumpleCrudRepository.findByProfesion(profession);
        return Optional.of(mapper.toBirthday(cumpleanios));
    }

    @Override
    public Birthday save(Birthday birthday) {
        Cumpleanios cumpleanios =  mapper.toCumpleanios(birthday);
        return mapper.toBirthday(cumpleCrudRepository.save(cumpleanios)) ;
    }

    @Override
    public void delete(Integer id) {
        cumpleCrudRepository.deleteById(id);

    }

    @Override
    public boolean existsById(Integer id) {
        cumpleCrudRepository.existsById(id);
        return false;
    }



}
