package modelo;

public class HelloFromThread implements Runnable{
    private int tId;
    private int pedaco;
    private int [] vet;

    public HelloFromThread(int id, int[] vet, int pedaco){
        this.tId = id;
        this.vet = vet;
        this.pedaco = pedaco;
    }

    public void rodar(){
        int inicio = this.tId * this.pedaco;
        int fim = inicio + this.pedaco-1;

        System.out.println("sou caio: "+this.tId+" (inicio: "+inicio+" fim: "+fim+")");
        for (int i = inicio; i <= fim; i++) {
            vet[i] = this.tId;
        }
    }

    @Override
    public void run() {
        this.rodar();
    }
}
 
