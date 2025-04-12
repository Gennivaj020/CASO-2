/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author genni
 */
public class Personal {

   
    private Sistema_Hotel[][] habitaciones; //Matriz que mostrara las habitaciones del hotel 3x3

    public Personal() {
        habitaciones = new Sistema_Hotel[3][3];
        MatrizHabitaciones(); //Aqui llama al método que llena la matriz
    }

    private void MatrizHabitaciones() { //Método donde inicializa las habitaciones del hotel
        habitaciones[0][0] = new Sistema_Hotel("101", "Simple", 200, "Ocupada", "Sucia");
        habitaciones[0][1] = new Sistema_Hotel("102", "Doble", 500, "Libre", "Limpia");
        habitaciones[0][2] = new Sistema_Hotel("103", "Simple", 200, "Libre", "Limpia");

        habitaciones[1][0] = new Sistema_Hotel("104", "Matrimonial", 700, "Libre", "Limpia");
        habitaciones[1][1] = new Sistema_Hotel("105", "Doble", 500, "Libre", "Sucia");
        habitaciones[1][2] = new Sistema_Hotel("106", "VIP", 1000, "Ocupada", "Sucia");

        habitaciones[2][0] = new Sistema_Hotel("107", "VIP", 1000, "Libre", "Sucia");
        habitaciones[2][1] = new Sistema_Hotel("108", "Simple", 200, "Libre", "Sucia");
        habitaciones[2][2] = new Sistema_Hotel("109", "Matrimonial", 200, "Libre", "Sucia");

    }

    public void ReservarHabitacion() { //Este método es para poder hacer las reservas de las habitaciones 
        String NumeroDeHabitacion = JOptionPane.showInputDialog("Ingrese el numero de habitacion que desea reservar");
        for (int fila = 0; fila < 3; fila++) { //Esto recorre todas las habitaciones
            for (int col = 0; col < 3; col++) {
                Sistema_Hotel h = habitaciones[fila][col];
                if (h.getNumeroDeHabitacion().equals(NumeroDeHabitacion)) { //Este if es para encontrar la habitacion que el personal pidio
                    if (h.getDisponibilidad().equals("Libre")) { //Y este verifica si la habitacion esta disponible o no
                        h.setDisponibilidad("Ocupada");

                        JOptionPane.showMessageDialog(null, "Reserva realizada");
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitacion no esta disponible");
                    }
                    return;
                }

            }
        }
    }

    public void MostrarLasHabitaciones() { //Este método muestra las habitaciones y sus respectivos 
        // precios, estado, tipo y disponibilidad 
        String cuadro = "";

        for (int fila = 0; fila < habitaciones.length; fila++) { //Aqui reccore las columnas 
            cuadro += "Piso" + (3 - fila) + "\t";

            for (int col = 0; col < habitaciones[fila].length; col++) {
                Sistema_Hotel h = habitaciones[fila][col];
                // Este que dice "cuadro" es para formar una cadena con los datos de las habitaciones
                cuadro += h.getNumeroDeHabitacion() + "-" + h.getTipoDeHabitacion() + "-$" + h.getPrecio() + "-" + h.getEstado() + "-" + h.getDisponibilidad() + "\n";

            }
            cuadro += "\n"; //Esto me funciono para separar la línea entre pisos

        }

        JOptionPane.showMessageDialog(null, cuadro);
    }

    public void CambiarEstado() { //Este método para cambiar el estado de las habitaciones
        String NumeroDeHabitacion = JOptionPane.showInputDialog("Ingrese el numero de habitación");
        String nuevoEstadoDeHabitacion = JOptionPane.showInputDialog("Ingrese su nuevo estado. Limpia/Sucia");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                if (habitaciones[fila][col].getNumeroDeHabitacion().equals(NumeroDeHabitacion)) {
                    habitaciones[fila][col].setEstado(nuevoEstadoDeHabitacion);
                    JOptionPane.showMessageDialog(null, "La disponibilidad de la habitacion ha sido actualizada");
                    return;

                }
            }
        }
    }

    public void CambiarDisponibilidado() { //Este método es para cambiar la disponibilidad de las habitaciones del hotel
        String NumeroDeHabitacion = JOptionPane.showInputDialog("Ingrese el numero de habitación");
        String nuevaDisponibilidad = JOptionPane.showInputDialog("Ingrese su disponibilidad Libre/Ocupada");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                if (habitaciones[fila][col].getNumeroDeHabitacion().equals(NumeroDeHabitacion)) {
                    habitaciones[fila][col].setDisponibilidad(nuevaDisponibilidad);
                    JOptionPane.showMessageDialog(null, "El estado de la habitacion ha sido actualizada");
                    return;

                }
            }
        }
    }

    public void CambiarPrecio() { //Este de aqui para realizar cambios de precios
        String NumeroDeHabitacion = JOptionPane.showInputDialog("Ingrese el numero de habitación");
        String nuevoPrecioStr = JOptionPane.showInputDialog("Ingrese el precio ($)");

        int nuevoPrecio = Integer.parseInt(nuevoPrecioStr);
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                if (habitaciones[fila][col].getNumeroDeHabitacion().equals(NumeroDeHabitacion)) {
                    habitaciones[fila][col].setPrecio(nuevoPrecio);
                    JOptionPane.showMessageDialog(null, "El precio ha sido actualizado");
                    return;

                }
            }
        }
    }

    public void Menu() { //El menú que muestra las opciones para que el personal pueda elejir 
        while (true) {
            String Opcion = JOptionPane.showInputDialog(
                    "1. Hacer reserva\n "
                    + "2. Mostrar Habitaciones\n "
                    + "3. Cambiar el estado de la habitacion\n "
                    + "4. Cambiar Disponibilidad de habitacion\n"
                    + "5. Cambiar Precio \n "
                    + "6. Salir");

            switch (Opcion) {
                case "1":
                    ReservarHabitacion();
                    break;

                case "2":
                    MostrarLasHabitaciones();
                    break;

                case "3":
                    CambiarEstado();
                    break;
                case "4":
                    CambiarDisponibilidado();
                    break;
                case "5":
                    CambiarPrecio();
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null, "¡Gracias por preferinos!");
                    return; //Salir del menú

            }
        }
    }

}
//Intente hacer el punto 5 pero no logre llegar al objetivo, aún asi, seguire intendo con eso y las matrices.