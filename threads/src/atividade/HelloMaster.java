package atividade;

import modelo.HelloFromThread;

public class HelloMaster {

    public void GetSomeHellos(){
        System.out.println("Hello from the master ");
        final int tamanho = 12;
        //int max_threads = Runtime.getRuntime().availableProcessors()*2;
        int max_threads = 3;
        int[] vet = new int[tamanho];
        Thread[] th = new Thread[max_threads];
        int pedaco = tamanho/max_threads;
        for (int i = 0; i < max_threads; i++) {
            th[i] = new Thread(new HelloFromThread(i, vet, pedaco));
            th[i].run();
        }
        for (int i = 0; i < th.length; i++) {
            try {
                th[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("teste que vai ate o tamanho do vetor e imprime oq  tem dentro dele (num da thread que preencheu o indice do vetor)");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(i+":"+vet[i]);
        }
        
    }

}
