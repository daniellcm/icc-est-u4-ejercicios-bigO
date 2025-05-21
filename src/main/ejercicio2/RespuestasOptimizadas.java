package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimiz  ada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)"; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] lista) {
        HashSet<Integer> vis = new HashSet<>();
        for (int numero1 : lista) {
            if (vis.contains(numero1)) {
                return true; 
            }
            vis.add(numero1);
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "O(n)"; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] lista, int x) {
        int contar = 0;
        for (int numero1 : lista) {
            if (numero1 > x) {
                contar++;
            }
        }   
        return contar;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = "O(n)"; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] lista) {
        int maximo = lista[0]; 
        for (int i = 1; i < lista.length; i++) { 
            if (lista[i] > maximo) {
                maximo = lista[i]; 
            }
        }
        return maximo;
    }
}
