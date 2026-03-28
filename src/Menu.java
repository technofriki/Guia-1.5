import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    Scanner buffer;
    List<Producto> lista;

    public Menu(Scanner buffer, List<Producto> lista) {
        this.buffer = buffer;
        this.lista = lista;
    }

    public void mostrarMenu() {

        System.out.println("--------------------------Ejercicio 1--------------------------");
        System.out.println("1. Filtrado y Transformación\n" +
                "○ Obtener una lista con los nombres y precios de los productos de la categoría\n" +
                "\"Electronica\" cuyo precio sea mayor a 1000, ordenados de mayor a menor\n" +
                "precio.");
        List<Producto> productosMayoresMil = lista.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Electronica") && p.getPrecio() > 1000)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .toList();
        System.out.println("Lista productos mayores a 1000: ");
        productosMayoresMil.forEach(System.out::println);


        System.out.println("--------------------------Ejercicio 2--------------------------");
        System.out.println("2. Reducción de Datos\n" +
                "○ Calcular el precio promedio de los productos de la categoría \"Hogar\", pero\n" +
                "solo considerando aquellos con stock disponible.");

        Double promedio = lista.stream()
                        .filter(p -> p.getCategoria().equalsIgnoreCase("Hogar") && p.getStock() > 0)
                                .mapToDouble(Producto::getPrecio)
                                        .average()
                                                .orElse (0.0);
        System.out.println("Promedio: " + promedio);


        System.out.println("--------------------------Ejercicio 3--------------------------");
        System.out.println("3. Producto mas caro\n" +
                "○ Obtener el producto más caro de cada categoría y devolver un mapa con la\n" +
                "categoría como clave y el producto más caro como valor");
        Map<String, Optional<Producto>> productoCaroCategoria = lista.stream()
                        .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.maxBy(Comparator.comparingDouble(Producto::getPrecio))));
        System.out.println("Productos mas caros por categoria: "+productoCaroCategoria);



        System.out.println("--------------------------Ejercicio 4--------------------------");
        System.out.println("Uso de Optionals\n" +
                "○ Encontrar el producto de la categoría \"Deportes\" con stock mayor a 10\n" +
                "unidades, obtener su nombre en minúsculas y devolverlo dentro de un\n" +
                "Optional. Mostrarlo o si no existe, mostrar “Producto Inexistente”");
       Optional <Producto> productoDeportesMayorADiez = lista.stream()
                       .filter(n -> n.getCategoria().equalsIgnoreCase("Deportes") && n.getStock()>10)
                               .findFirst();
        System.out.println("Producto deportes: "+productoDeportesMayorADiez);


        System.out.println("--------------------------Ejercicio 5--------------------------");
        System.out.println("5. Producto Mas Barato\n" +
                "○ Encontrar el producto mas barato calculando el valor total de todas las\n" +
                "unidades en stock (Precio * stock). Devolver un Opcional con el producto. En\n" +
                "caso de que no exista, lanzar una excepción.");


        System.out.println("--------------------------Ejercicio 6--------------------------");
        System.out.println("6. Productos en stock ordenados alfabéticamente\n" +
                "○ Obtener una lista con los nombres de los productos que tienen stock,\n" +
                "ordenarlos alfabéticamente y excluir los productos con nombres de menos de\n" +
                "5 caracteres.");
        System.out.println("--------------------------Ejercicio 7--------------------------");
        System.out.println("7. Calculo de Stock Total\n" +
                "○ Obtener el total de unidades en stock de todos los productos, pero solo\n" +
                "considerando aquellos con precio superior al promedio.");
        System.out.println("--------------------------Ejercicio 8--------------------------");
        System.out.println("8. Stock por Categoría\n" +
                "○ Calcular cuántas unidades en stock hay por categoría, excluyendo categorías\n" +
                "con menos de 3 productos.");
        System.out.println("--------------------------Ejercicio 9--------------------------");
        System.out.println("9. Aplicar descuento\n" +
                "○ Crear una nueva lista de productos con un 15% de descuento en su precio,\n" +
                "pero solo si el producto tiene más de 20 unidades en stock.");
        System.out.println("--------------------------Ejercicio 10--------------------------");
        System.out.println("10. Ganancia total inventario\n" +
                "○ Calcular la ganancia total si se vendiera todo el inventario, considerando que\n" +
                "el costo de compra de cada producto es un 45% del valor de venta o de un\n" +
                "65% si pertenece a la categoria Electronica.");


    }
}
