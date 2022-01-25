package cumpleempleados.domain.repository;

import cumpleempleados.domain.Birthday;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BirthdayRepository {

    List<Birthday> getAll();

    Optional<List<Birthday>> getByFechaCumple(LocalDate birthday);

    Optional<List<Birthday>> getByProfecion(String profession);

    Birthday save (Birthday birthday);

    void delete(Integer id);

    boolean existsById(Integer id);
}
