public class main {
    public static void main(String[] args) {
        
        categoria comida = new categoria("Comida", "Gastos relacionados con comida");
        categoria entretenimiento = new categoria("Entretenimiento", "Gastos relacionados con ocio y diversión");

        
        usuario usuario = new usuario("Juan Pérez", "juan.perez@.com", "contraseña123");

        
        usuario.agregarGasto(50.00, "2024-09-09", "Almuerzo en restaurante", comida);
        usuario.agregarGasto(30.00, "2024-09-09", "Entrada al cine", entretenimiento);

        
        System.out.println("Gastos de " + usuario.getNombre() + ":");
        for (String gasto : usuario.getGastos()) {
            System.out.println(gasto);
        }
    }
}
