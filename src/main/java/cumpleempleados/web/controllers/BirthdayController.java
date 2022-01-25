package cumpleempleados.web.controllers;

import cumpleempleados.domain.Birthday;
import cumpleempleados.domain.services.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cumplea")
public class BirthdayController {

    @Autowired
    private BirthdayService birthdayService;

    @GetMapping("/all")
    public List<Birthday> getAll(){

        return birthdayService.getAll();
    }

    @GetMapping("/fecha/{birthday}")
    public Optional<List<Birthday>> getByFechaCumple(@PathVariable("birthday") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birthday){
        return birthdayService.getByFechaCumple(birthday);
    }
    @GetMapping("/profe/{profession}")
    public Optional<List<Birthday>> getByProfecion(@PathVariable("profession") String profession){
        return birthdayService.getByProfecion(profession);
    }
    @PostMapping("/save")
    public Birthday save (@RequestBody Birthday birthday){
        return birthdayService.save(birthday);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        birthdayService.delete(id);
    }

    @GetMapping("/encid/{id}")
    public void existsById(@PathVariable("id") Integer id){
        birthdayService.existsById(id);
    }
}
