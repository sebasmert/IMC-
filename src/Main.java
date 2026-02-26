import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        double peso;
        double estatura;
        double imc;
        String situacion;
        System.out.println("Digite su peso");
        peso=teclado.nextDouble();
        System.out.println("Digite su estatura");
        estatura=teclado.nextDouble();
        imc= peso/(estatura*2);
        if (imc<18.5) {
            situacion="Peso bajo";
        } else if (imc<=24.9) {
            situacion="Peso normal";
        } else if (imc<=26.9) {
            situacion="Sobrepeso grado 1";
        } else if (imc<=29.9) {
            situacion = "Sobrepeso grado 2";
        } else if (imc<=34.9) {
            situacion = "Obesidad tipo 1";
        } else if (imc<=39.9) {
            situacion="Obesidad tipo 2";
        } else if (imc<=49.9) {
            situacion="Obesidad mórbida";
        } else{
            situacion="Obesidad extrema";
        }
        System.out.println("su indice de masa corporal(IMC) es de: "+imc);
        System.out.println("su clasificacion es de: "+ situacion);
    }
}