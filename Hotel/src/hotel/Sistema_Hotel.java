/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author genni
 */
public class Sistema_Hotel {
    //Atributos privados con las características de las habitaciones 
    private String numeroDeHabitacion;
    private String TipoDeHabitacion;
    private int Precio;
    private String Disponibilidad;
    private String Estado;
    
    //Constructor para iniciar los atributos de las habitaciones
    public Sistema_Hotel(String numeroDeHabitacion, String TipoDeHabitacion, int Precio,String Disponibilidad, String Estado){
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.Precio = Precio;
        this.Disponibilidad = Disponibilidad;
        this.Estado = Estado;
    }
    //Aqui los métodos getter y setter para acceder a los atributos privados y modificarlos 

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(String numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public String getTipoDeHabitacion() {
        return TipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String TipoDeHabitacion) {
        this.TipoDeHabitacion = TipoDeHabitacion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
    
}

    

