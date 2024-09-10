

import java.util.ArrayList;
import java.util.List;

public class usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private List<String> gastos;  

    
    public usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.gastos = new ArrayList<>();
    }

    public void agregarGasto(double cantidad, String fecha, String descripcion, categoria categoria) {
        String gasto = String.format("Cantidad: %.2f, Fecha: %s, Descripción: %s, Categoría: %s",cantidad, fecha, descripcion, categoria.getNombre());
        this.gastos.add(gasto);
    }

    public List<String> getGastos() {
        return gastos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String toString() {
        return "Usuario{" +"nombre='" + nombre + '\'' +", email='" + email + '\'' +'}';
    }
}

