
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Juan
 * @descripcion Examen final <3
 */
public class eje1 {

    static String[] nombresalumno = new String[10];
    static String[] months = new String[12];
    static int[][] sales = new int[10][12];
    static TreeMap<String, Integer> tree = new TreeMap<String, Integer>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bucle = false;
        int opciones = 0;
        Scanner sc1 = new Scanner(System.in);
        String messtring;
        String nombrestring;

        do {
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    System.out.println("Cual es tu nombre");
                    nombrestring = sc1.nextLine();
                    System.out.println("Cual es el mes");
                    messtring = sc1.nextLine();
                    System.out.println("Datos introducidos correctamente");
                    break;
                case 2:
                    estadisticasVendedores();
                    break;
                case 3:
                    System.out.println("Vendedor con menor ventas: " + menorVendedor());
                    break;
                case 4:
                    bucle = true;
                    break;
            }

        } while (bucle);
    }
//3

    static int consulta(String nombre, String mes) {
        int aux;
        int aux1;
        for (int i = 0; i < 10; i++) {
            if (nombresalumno[i].equals(nombre)) {
                aux = i;
            }
        }
        for (int i = 0; i < 12; i++) {
            if (months[i].equals(mes)) {
                aux1 = i;
            }
        }

        return 0;

    }

    static void estadisticasVendedores() {
        for (int i = 0; i < nombresalumno.length; i++) {
            int ventaMaxima = 0;
            for (int o = 0; o < months.length; o++) {
                ventaMaxima += sales[i][o];
            }
            tree.put(nombresalumno[i], ventaMaxima);
        }
    }

    static String menorVendedor() {
        int aux[] = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int o = 0; i < 12; o++) {
                aux[i] += sales[i][o];
            }
        }
        int menor = 0;
        for (int i = 0; i < aux.length; i++) {

            if (aux[i] < menor) {
                menor = aux[i];
            }
        }
        int indice = 0;
        for (int i = 0; i < 4; i++) {
            if (aux[i] == menor) {
                indice = i;
            }

        }
        return nombresalumno[indice];
    }

}

