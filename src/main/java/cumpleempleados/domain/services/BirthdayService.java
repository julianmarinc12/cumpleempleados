package cumpleempleados.domain.services;

import cumpleempleados.config.exceptions.BabRequestException;
import cumpleempleados.config.exceptions.NotFoundException;
import cumpleempleados.domain.Birthday;
import cumpleempleados.domain.repository.BirthdayRepository;
import cumpleempleados.persistems.web.entity.Cumpleanios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BirthdayService {
    @Autowired
    private BirthdayRepository birthdayRepository;

    public List<Birthday> getAll(){

        return birthdayRepository.getAll();
    }

    public Optional<List<Birthday>> getByFechaCumple(LocalDate birthday){
        return birthdayRepository.getByFechaCumple(birthday);
    }

    public Optional<List<Birthday>> getByProfecion(String profession){
        return birthdayRepository.getByProfecion(profession);
    }

    public Birthday save (Birthday birthday){
        if(birthday.getName() == null || birthday.getName().isEmpty()){
            throw new BabRequestException("invalid user name");
        }
        return birthdayRepository.save(birthday);
    }

    public void delete(Integer id){
        birthdayRepository.delete(id);
    }

    public void existsById(Integer id){
        if(!birthdayRepository.existsById(id)){
            throw new NotFoundException("user not exist");
        }
        birthdayRepository.existsById(id);
    }


}
