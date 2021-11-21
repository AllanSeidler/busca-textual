package atividades;

public class TarefaImprimeNumeros implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<50;i++) {
            Thread threadAtual = Thread.currentThread();
            System.out.println(threadAtual.getId() + " - " + i);
        }
    }
}