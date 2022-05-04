import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            escreverConsole("Digite o valor em segundos para conversão: ");
            try {
                long valor = lerValor();
                ConversorTempo conversorTempo = new ConversorTempo(valor);
                long horas = conversorTempo.getHoras();
                long minutos = conversorTempo.getMinutos();
                long sec = conversorTempo.getSegundos();
                escreverConsole(String.format("O valor digitado corresponde a %d horas, %d minutos e %d segundos",
                        horas,minutos,sec));
            }catch (InputMismatchException ex){
                escreverConsole("O valor digitado é inválido");
            }
    }

    private static void escreverConsole(String string){
        System.out.println(string);
    }

    private static long lerValor(){
        try(Scanner in = new Scanner(System.in);){
            return in.nextLong();
        }
    }

}
