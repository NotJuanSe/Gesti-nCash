

public class categoria {
    private String nombre;
    private String descripcion;
    
    public categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return "Categoria{" + "nombre='" + nombre + '\'' +", descripcion='" + descripcion + '\'' +'}';
    }
}
