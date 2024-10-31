/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Axel
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String sexo;
    private double estatura; 
    private double cadera;   
    private double iac;     

    public Usuario(String nombre, int edad, String sexo, double estatura, double cadera) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estatura = estatura;
        this.cadera = cadera;
        this.iac = calcularIAC(); 
    }

    // Getters y setters
    public String getNombre() {
    return nombre;}
    public void setNombre(String nombre) {
    this.nombre = nombre;}

    public int getEdad() { 
    return edad;}
    public void setEdad(int edad) {
    this.edad = edad;}

    public String getSexo() {
    return sexo;}
    public void setSexo(String sexo) {
    this.sexo = sexo; }

    public double getEstatura() {
    return estatura; }
    public void setEstatura(double estatura) {
    this.estatura = estatura;}

    public double getCadera() { return cadera; }
    public void setCadera(double cadera) {
    this.cadera = cadera;}

    public double getIAC() { return iac; }
    public double calcularIAC() {
    return (cadera / Math.pow(estatura, 1.5)) - 18;
    }
}
