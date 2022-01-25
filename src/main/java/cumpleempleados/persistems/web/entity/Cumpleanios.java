package cumpleempleados.persistems.web.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cumpleaños_usuarios")
public class Cumpleanios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20)
    private String nombre;
    @Column(length = 20)
    private String apellido;
    @Column(length = 50)
    private String email;
    @Column(name = "naciomiento")
    private LocalDate fechaCumple;
    @Column(length = 5)
    private  Integer edad;
    @Column(length = 50)
    private String profesion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(LocalDate fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}

