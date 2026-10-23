import csv.ArquivoProdutoCSV;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArquivoProdutoCSV arquivo = new ArquivoProdutoCSV();
        int op;
        
        do { 
            
            System.out.println("Escolha a Opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Deletar Produto");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    Produto produto = new Produto();
                    System.out.println("Cadastrar Produto");
                    System.out.print("Id: ");
                    produto.setId(teclado.nextInt());
                    teclado.nextLine();//get the last Enter;
                    System.out.print("Nome: ");
                    produto.setNome(teclado.nextLine());
                    System.out.print("Preço: ");
                    produto.setPreco(teclado.nextDouble());
                    arquivo.inserir(produto);
                    break;
                case 2:
                    ArrayList<Produto> produtos = arquivo.listar();
                        System.out.println("====================");
                        System.out.println("Listagem de Produtos");
                        System.out.println("====================");
                    for (Produto prod : produtos) {
                        
                        System.out.println(prod.getId()+"    "+prod.getNome()+"    R$"+prod.getPreco());
                        System.out.println("---------------------");
                    }
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                case 3:
                    System.out.println("====================");
                    System.out.println("Remoção de Produtos");
                    System.out.println("====================");
                    ArrayList<Integer> ids = new ArrayList<>();
                    while (true) {
                        System.out.println("digite o(s) id(s), ao terminar digite 0");
                            int id = teclado.nextInt();
                            if (id==0) {
                                break;
                            }
                            ids.add(id);
                        }
                        ArrayList<Integer> idsNaoExistente = arquivo.deletar(ids);
                        if(idsNaoExistente.isEmpty()){
                            System.out.println("id(s) removido(s) com sucesso");
                        }else{
                            System.out.println("id(s) não removido(s)");
                            for (Integer id : idsNaoExistente) {
                                System.out.print(id+" ");
                            }
                            System.out.println();
                    }
                    break;
                case 4:

                default:
                    throw new AssertionError();
            }
            
        } while (op!=5);

        
    }
}