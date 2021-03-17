/*
 * Clase para pruebas.
 */
package tema10.EjerClase1;

import com.github.javafaker.Faker;

/**
 *
 * @author JFSam
 */
public class Test {
    
    public static void main(String[] args) {
        Item it1 = new Item("Prueba1", (short) 1, "Editorial 1", "12-03-2005", "Prueba");
        Biblioteca b1 = new Biblioteca(2, "Biblioteca 1", "Direccion 1", 100);
        Libro l1 = new Libro("Libro 1", (short) 150, "Editorial 2", "15-11-2012", "Aventura", "Fernando", "IFGA21436");
        Revista r1 = new Revista("Revista 1", (short) 50, "Editorial 3", "25-06-2017", "Economia", "127", "DVD");
        Usuario u1 = new Usuario("User1", "12345", 1, 123456789);
        Usuario u2 = new Usuario("User2", "12356", 2, 987654321);
        rellenarBiblioteca(b1);
        
        System.out.println(b1.getNombre());
        System.out.println(b1.getNumItems());
        System.out.println(b1.listarRevistas());
        System.out.println("");
        System.out.println(b1.listarLibros());
        System.out.println("");
        System.out.println(b1.listarTodo());
        System.out.println("");
        b1.altaItem(it1);
        System.out.println(b1.listadoPorTema("Prueba"));
        System.out.println("");
        System.out.println(u1.tomarItem(l1));
        System.out.println(u1.tomarItem(r1));
        System.out.println(u1.listarPrestamos());
        System.out.println("");
        System.out.println(u2.tomarItem(r1));
        System.out.println("");
        System.out.println(u2.listarPrestamos());
        
        
    }
    
    static private void rellenarBiblioteca(Biblioteca b) {
        Faker faker = new Faker();
        Revista r;
        Libro l;
        String isbn, nRevista;
        for (int i = 0; i < 25; i++) {
            r = new Revista();
            nRevista = "" + faker.number().numberBetween(1000, 99999);
            r.setTitulo(faker.name().title().toString());
            r.setNumPaginas((short) faker.number().numberBetween(10, 75));
            r.setNumRevista(nRevista);
            r.setTematica(faker.color().name().toString());
            r.setAdjunto(faker.beer().name().toString());
            b.altaItem(r);   
        }
        for (int i = 0; i < 25; i++) {
            l = new Libro();
            isbn = "" + faker.number().numberBetween(1000, 99999);
            l.setIsbn(isbn);
            l.setTitulo(faker.book().title().toString());
            l.setAutor(faker.book().author().toString());
            l.setEditorial(faker.book().publisher().toString());
            l.setTematica(faker.book().genre().toString());
            b.altaItem(l);
        }
    }
}
