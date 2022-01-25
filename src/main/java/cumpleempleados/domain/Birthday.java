package cumpleempleados.domain;

import java.time.LocalDate;

public class Birthday {

    private Integer idBi;
    private String name;
    private String lastName;
    private String mail;
    private LocalDate birthday;
    private String profession;

    public Integer getIdBi() {
        return idBi;
    }

    public void setIdBi(Integer idBi) {
        this.idBi = idBi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
