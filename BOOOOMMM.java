public class ContagemRegressiva {
    public static void main(String[] args) {
        System.out.println("Iniciando contagem regressiva...");

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000); // Aguarda 1 segundo (1000 milissegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("EXPLOSÃO!");
    }
}