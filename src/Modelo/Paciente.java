package Modelo;

public class Paciente extends Persona{ 

    private String ocupacion;
    private String alergias;
    private String probSalud;
    private String responsable;

    public Paciente(String name, String surname, String dateBirth, String curp, String sexo, String bloodType,
    String address, String municipality, String state, int cp, String city, String email, String phone,String ocupacion, String alergias, String probSalud, String responsable) {

        super(name,surname,dateBirth,curp,sexo,bloodType,address,municipality,state,cp,city,email,phone);
                //,ocupacion,alergias,probSalud,responsable);
        this.ocupacion = ocupacion;
        this.alergias = alergias;
        this.probSalud = probSalud;
        this.responsable = responsable;

    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getProbSalud() {
        return probSalud;
    }

    public void setProbSalud(String probSalud) {
        this.probSalud = probSalud;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Paciente [ Nombre = "+ getName()+ "Apellidos = "+getSurname()
        +", Fecha de Nacimiento = "+getDateBirth() + ", Curp ="+getCurp()+" , Sexo = "+getSexo()
        +" , Tipo de Sangre = "+ getBloodType()+ " , Dirección = "+ getAddress()+" , Municipio = "+ getMunicipality()
        + " , Estado = "+getState()+" , CP = "+getCp()+" , Ciudad = "+getCity()+" , Email = "+ getEmail()+" , Celular = "+getPhone()
        +", alergias=" + alergias + ", ocupacion=" + ocupacion + ", probSalud=" + probSalud
                + ", responsable=" + responsable + "]";
    }
    
}