// Mi clase en Java

public class HolaMundo {

    public static void main(String argrs[]) {

        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // Se realiza la suma de números.
        System.out.println(i + j + usuario); // Evaluación de izq a der, realiza suma. 
        System.out.println(usuario + i + j); // Contexto cadena, tudo es cadena.
        System.out.println(usuario + (i + j));  // Uso de parentesis modifican la prioridad en la evaluación.
    }
}
