package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempresa")
    private Integer idEmpresa;

    @Column(name = "nombreEmpresa", length = 45)
    private String nombreEmpresa;

    @Column(name = "codigoEmpresa", length = 45)
    private String codigoEmpresa;

    @Column(name = "areaEmpresa", length = 45)
    private String areaEmpresa;

    public Empresa() {}

    // Getters y Setters
    public Integer getIdEmpresa() { return idEmpresa; }
    public void setIdEmpresa(Integer idEmpresa) { this.idEmpresa = idEmpresa; }
    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }
    public String getCodigoEmpresa() { return codigoEmpresa; }
    public void setCodigoEmpresa(String codigoEmpresa) { this.codigoEmpresa = codigoEmpresa; }
    public String getAreaEmpresa() { return areaEmpresa; }
    public void setAreaEmpresa(String areaEmpresa) { this.areaEmpresa = areaEmpresa; }
}