import java.util.Scanner;

public class Decoder {
    private static int casos;
    private static String[] input;
    private static String[] casosLetras = {"1234567","123457","123567","123459","135790","12456","12569","13457","13459","12357","12347","12467","13567","23456","1580","1249","3567","3579","1458","1379","1347","456","156","278","37","90","0"};
    private static String[] letras = {"B","A","O","R","W","E","G","H","K","M","Q","S","U","Z","D","F","J","N","P","V","Y","C","L","T","I","X"," "};

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        casos = sc.nextInt()+1;
        input = new String[casos];
        for (int i = 0; i < casos ; i++){
            input[i] = sc.nextLine();
        }
        System.out.println();
        for (int i = 1; i < casos ; i++){
            System.out.println(reemplazar("Phrase "+i+": "+input[i]));
        }
    }
    public static String reemplazar(String linea){
        String lineab = linea;
        for(int i=0; i<27;i++){
            if (lineab.contains(casosLetras[i])) {
                lineab = lineab.replace(casosLetras[i], letras[i]);
            }
        }
        return lineab;
    }
}