package cumpleempleados.persistems.web.mapper;

import cumpleempleados.domain.Birthday;
import cumpleempleados.persistems.web.entity.Cumpleanios;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BirthdayMapper {

    @Mappings({
            @Mapping(source = "id",target = "idBi"),
            @Mapping(source = "nombre",target ="name"),
            @Mapping(source = "apellido",target = "lastName"),
            @Mapping(source = "email",target = "mail"),
            @Mapping(source = "fechaCumple",target = "birthday"),
            @Mapping(source = "profesion",target = "profession")
    })
    Birthday toBirthday(Cumpleanios cumpleanios);
    List<Birthday> toBirthday(List<Cumpleanios> cumpleanios);

    @InheritInverseConfiguration
    @Mapping(target = "edad", ignore = true)
    Cumpleanios toCumpleanios(Birthday birthday);
}
