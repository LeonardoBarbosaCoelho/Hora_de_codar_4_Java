public class CrescimentoAnacletoFelisberto {
    public static void main(String[] args) {

        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;

        int crescimentoAnacleto = 2;
        int crescimentoFelisberto = 3;

        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {

            alturaAnacleto += crescimentoAnacleto / 100.0; 
            alturaFelisberto += crescimentoFelisberto / 100.0; 

            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
    }
}