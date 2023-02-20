package com.proyecto.salvus.Models;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;

    private String nombre, primerApellido, segundoApellido;
    private String estadoCivil;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private Date fecha;
    private String cedula;
    private int edad;
    private String sexo;
    private String nacionalidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idExpediente", referencedColumnName = "idExpediente")
    private Expediente idExpediente;

    public Paciente() {
    }

    public Paciente(String nombre, String primerApellido, String segundoApellido, String estadoCivil, String direccion,
            String ocupacion, String telefono, Date fecha, String cedula, int edad, String sexo, String nacionalidad,
            Expediente idExpediente) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.idExpediente = idExpediente;
    }

    public Paciente(int idPaciente, String nombre, String primerApellido, String segundoApellido, String estadoCivil,
            String direccion, String ocupacion, String telefono, Date fecha, String cedula, int edad, String sexo,
            String nacionalidad, Expediente idExpediente) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.idExpediente = idExpediente;
    }

}
