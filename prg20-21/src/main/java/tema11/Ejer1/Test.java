/*
 * Clase para Pruebas.
 */
package tema11.Ejer1;

/**
 *
 * @author JFSam
 */
public class Test {

    public static void main(String[] args) {
        PilaArrays pA = new PilaArrays(3);
        PilaLinkedList pL = new PilaLinkedList();
        String s1 = "Prueba 1";
        String s2 = "Prueba 2";
        String s3 = "Prueba 3";

        pA.crear();
        System.out.println(pA.apilar(s1));
        System.out.println(pA.apilar(s2));
        System.out.println(pA.apilar(s3));
        System.out.println(pA.desapilar());
        System.out.println(pA.cima());
        System.out.println(pA.cima());
        pA.desapilar();
        pA.desapilar();
        System.out.println("Esta vacia la PilaArray: " + pA.vacia());
        pA.desapilar();
        pA.desapilar();
        pA.apilar(s1);
        System.out.println(pA.cima());
        System.out.println("");
        pL.apilar(s1);
        pL.apilar(s2);
        pL.apilar(s3);
        System.out.println(pL.desapilar());
        System.out.println(pL.cima());
        pL.desapilar();
        pL.desapilar();
        System.out.println("Esta vacia la PilaLinkedList: " + pL.vacia());
        pL.desapilar();
        pL.desapilar();
        pL.apilar(s1);
        System.out.println(pL.cima());

    }
}
