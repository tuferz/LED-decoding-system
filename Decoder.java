import java.util.Scanner;

public class Decoder {

    private static int casos;
    private static String[] input;
    private static String[] casosLetras = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","0"};
    private static String[] letras = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","0"};
    private static String[] output;
    public static void main(String[] args) {
        Scanner aranda  = new Scanner(System.in);

        casos = aranda.nextInt();
        input = new String[casos];
        for (int i = 0; i < casos ; i++){
            input[i] = aranda.next(); //find in line
        }
        for (int j = 0; j < input.length; j++){
            for(int k = 0; k < 26; k++){
                if (input[j].contains(casosLetras[k])){
                    input[j].replace("si","ok k");
                }
            }
        }

    }

}
