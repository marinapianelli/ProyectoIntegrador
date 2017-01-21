/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegradorfase1;

/**
 *
 * @author educacionit
 */
public class Persona {
            private String nombre;
            private String apellido;
            private String NumeroDocumento;

            public String getNombre() {
                return nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public String getNumeroDocumento() {
                return NumeroDocumento;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public void setApellido(String apellido) {
                this.apellido = apellido;
            }

            public void setNumeroDocumento(String NumeroDocumento) {
                this.NumeroDocumento = NumeroDocumento;
            }

            public Persona(String nombre, String apellido, String NumeroDocumento) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.NumeroDocumento = NumeroDocumento;
            }
}
