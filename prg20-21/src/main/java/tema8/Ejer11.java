/*
 * Ejercicio 11.
 * Escribir un programa que permita gestionar la base de datos de clientes de una empresa. Los
 * clientes se guardarán en un diccionario en el que la clave de cada cliente será su NIF, y el valor
 * será un array de String con los datos del cliente (nombre, dirección, teléfono, correo,
 * preferente), donde preferente tendrá el valor true si se trata de un cliente preferente.
 *
 * El programa debe preguntar al usuario por una opción del siguiente menú:
 *(1) Añadir cliente
 *(2) Eliminar cliente
 *(3) Modificar cliente
 *(4) Mostrar cliente
 *(5) Listar todos los clientes
 *(6) Listar clientes preferentes
 *(7) Terminar.
 * En función de la opción elegida el programa tendrá que hacer lo siguiente:

    1. Se preguntará los datos del cliente y lo añadiremos al diccionario. Si el cliente ya existiese
    se informará previamente al usuario.
    2. Preguntar por el NIF del cliente y eliminar sus datos de la base de datos, en caso de no
    existir se informará al usuario.
    3. Se pide el NIF, se busca el cliente y se muestran los datos (o no existe en caso de no existir).
    Se vuelven a introducir todos los datos menos el NIF y se modifica el nodo en el
    diccionario.
    4. Preguntar por el NIF del cliente y mostrar sus datos o “NO Existe”.
    5. Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
    6. Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
    7. Terminar el programa.

 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer11 {
    public static void main(String[] args) {
        HashMap<String, String[]> baseDatos = new HashMap();
        menu(baseDatos);
    }
    
    private static void menu(HashMap<String, String[]> base){
        Scanner teclado = new Scanner(System.in);
        int seleccion;
        
        System.out.println("(1) Añadir cliente");
        System.out.println("(2) Eliminar cliente");
        System.out.println("(3) Modificar cliente");
        System.out.println("(4) Mostrar cliente");
        System.out.println("(5) Listar todos los clientes");
        System.out.println("(6) Listar clientes preferentes");
        System.out.println("(7) Terminar.");
        seleccion = teclado.nextInt();
        
        switch(seleccion){
            case 1:  base.putAll(añadirCliente(base));
                     menu(base);
                     break;
            case 2:  eliminarCliente(base);
                     break;
            case 3:  modificarCliente(base);
                     menu(base);
                     break;
            case 4:  mostrarCliente(base);
                     menu(base);
                     break;
            case 5:  listarClientes(base);
                     menu(base);
                     break;
            case 6:  listarClientesPrefe(base);
                     menu(base);
                     break;
            case 7:  terminar();
                     break;
            default: System.out.println("Introduce un apartado del menu.");
                     System.out.println("");
                     menu(base);
                     break;
        }
    }

    private static Map añadirCliente(HashMap<String, String[]> base) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, String[]> aux = new HashMap();
        String NIF, nombre, dirección, teléfono, correo, preferente;
        String[] valores;
        
        do {
            System.out.println("Introduce el NIF del cliente, para finalizar introduce la palabra 'fin'");
            NIF = teclado.next();
            if (NIF.equals("fin")) {
                break;
            }
            if (!base.containsKey(NIF)) {
                valores = new String[5];
                
                System.out.println("Introduce el nombre del cliente.");
                nombre = teclado.next();
                valores[0] = nombre;

                System.out.println("Introduce la dirección del cliente.");
                dirección = teclado.next();
                valores[1] = dirección;

                System.out.println("Introduce el tlf del cliente");
                teléfono = teclado.next();
                valores[2] = teléfono;

                System.out.println("Introduce el correo del cliente.");
                correo = teclado.next();
                valores[3] = correo;

                System.out.println("Di si el clientes es preferente 'SI' o 'No' ");
                preferente = teclado.next();
                valores[4] = preferente;

            } else {
                System.out.println("El cliente que intento introducir ya existe en la base de datos.");
                System.out.println("");
                break;
            }
            aux.put(NIF, valores);
        } while (true);
        return aux;
    }
    
    private static void eliminarCliente(HashMap<String, String[]> base){
        Scanner teclado = new Scanner(System.in);
        String NIF;
        System.out.println("Introduce el NIF del cliente que desea borrar");
        NIF = teclado.next();
        if(base.containsKey(NIF)){
            base.remove(NIF);
            System.out.println("Cliente borrado.");
            System.out.println("");
            menu(base);
        }
        if(!base.containsKey(NIF)){
            System.out.println("El cliente introducido no esta en la base de datos.");
            System.out.println("");
            menu(base);
        }
    }
    
    private static void modificarCliente(HashMap<String, String[]> base){
        Scanner teclado = new Scanner(System.in);
        String NIF, nombre, dirección, teléfono, correo, preferente;
        String[] valores = new String[5];
        
        System.out.println("Introduce el NIF del cliente que desea modificar.");
        NIF = teclado.next();
        if(!base.containsKey(NIF)){
            System.out.println("No se encuentra el cliente que busca.");
        }else{
            System.out.println("Datos del cliente: "+ NIF + "["+ Arrays.toString(base.get(NIF)) +"]" );
                System.out.println("Edite el nombre del cliente.");
                nombre = teclado.next();
                valores[0] = nombre;

                System.out.println("Edite la dirección del cliente.");
                dirección = teclado.next();
                valores[1] = dirección;

                System.out.println("Edite el tlf del cliente");
                teléfono = teclado.next();
                valores[2] = teléfono;

                System.out.println("Edite el correo del cliente.");
                correo = teclado.next();
                valores[3] = correo;

                System.out.println("Edite si el clientes es preferente 'SI' o 'No' ");
                preferente = teclado.next();
                valores[4] = preferente;
        }
        base.replace(NIF, valores);
        System.out.println("");
        
    }
    
    private static void mostrarCliente(HashMap<String, String[]> base){
        Scanner teclado = new Scanner(System.in);
        String NIF;
        
        System.out.println("Introduce el NIF del cliente que desea mostrar.");
        NIF = teclado.next();
        if(!base.containsKey(NIF)){
            System.out.println("No se encuentra el cliente que busca.");
        }else{
            System.out.println("Datos del cliente: "+ NIF + "["+ Arrays.toString(base.get(NIF)) +"]" );
        }
        System.out.println("");
    }
    
    private static void listarClientes(HashMap<String, String[]> base) {
        if(base.isEmpty()){
            System.out.println("Base de datos vacia.");
            menu(base);
        }
        Set s = base.keySet();
        Iterator it = s.iterator();
        System.out.println("Base de clientes");
        while(it.hasNext()){
            String indx = (String) it.next();
            System.out.println(indx + " : " + Arrays.toString(base.get(indx)));
        }
        System.out.println("");
    }
    
    private static void listarClientesPrefe(HashMap<String, String[]> base){
        String[] valores;
        Set aux = base.keySet();
        Iterator it = aux.iterator();
        String indx;
        
        while(it.hasNext()){
            indx = (String) it.next();
            valores = base.get(indx);
            if(valores[4].equals("SI")){
                System.out.println("Cliente: " + indx + " Nombre : " + valores[0]);
            }
        }
        System.out.println("");
    }
    
    private static void terminar(){
        System.out.println("Adios");
    }
    
}
