import java.util.List;

public class CargaLista {
    public static List<Producto> cargarProductos() {
        return List.of(
                new Producto("Laptop", 1500, "Electronica", 5),
                new Producto("Smartphone", 800, "Electronica", 10),
                new Producto("Televisor", 1200, "Electronica", 3),
                new Producto("Heladera", 2000, "Hogar", 2),
                new Producto("Microondas", 500, "Hogar", 8),
                new Producto("Silla", 150, "Muebles", 12),
                new Producto("Mesa", 300, "Muebles", 7),
                new Producto("Zapatillas", 100, "Deportes", 15),
                new Producto("Pelota", 50, "Deportes", 20),
                new Producto("Bicicleta", 500, "Deportes", 5),
                new Producto("Libro", 30, "Libreria", 50),
                new Producto("Cuaderno", 10, "Libreria", 100),
                new Producto("Lámpara", 80, "Hogar", 30),
                new Producto("Cafetera", 250, "Hogar", 6),
                new Producto("Auriculares", 120, "Electronica", 14),
                new Producto("Teclado", 90, "Electronica", 9),
                new Producto("Mouse", 60, "Electronica", 18),
                new Producto("Monitor", 700, "Electronica", 4),
                new Producto("Cama", 800, "Muebles", 2),
                new Producto("Sofá", 1000, "Muebles", 3),
                new Producto("Espejo", 120, "Hogar", 12),
                new Producto("Ventilador", 150, "Hogar", 7),
                new Producto("Patines", 180, "Deportes", 5),
                new Producto("Raqueta", 220, "Deportes", 6),
                new Producto("Taza", 15, "Hogar", 40)
        );
    }
}