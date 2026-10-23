package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import modelo.Produto;

public class ArquivoProdutoCSV {
    private String nomeArquivo = "produtos.csv";

    public void inserir(Produto produto){
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);//cria arquivo ou acrescenta - false cria o arquivo vazio
            PrintWriter escritor = new PrintWriter(arquivo);
            escritor.println(produto.getId()+","+produto.getNome()+","+produto.getPreco());
            escritor.close();

        
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo "+e.getMessage());
        }
        
    }

    public ArrayList<Produto> listar(){
        ArrayList<Produto> produtos = new ArrayList<>();
        File arquivo = new File(nomeArquivo);
        //se não existe arquivo em disco é porque não há produtos cadastrados
        if(!arquivo.exists()){
            return produtos;
        }
        //try with resources - neste caso o leitor.close() fica implícito
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
            String linha = leitor.readLine();
            while (linha!=null) {
                String[] dados = linha.split(",");
                Produto produto = new Produto();
                produto.setId(Integer.parseInt(dados[0]));
                produto.setNome(dados[1]);
                produto.setPreco(Double.parseDouble(dados[2]));
                produtos.add(produto);
                linha = leitor.readLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo "+e.getMessage());
       }

            return produtos;
        }

        public ArrayList<Integer> deletar(ArrayList<Integer> ids){
            ArrayList<Produto> produtos = listar();

            // 1) find the IDs that do not exist
            ArrayList<Integer> naoEncontrados = new ArrayList<>(ids);
            for (Produto p : produtos) {
                naoEncontrados.remove(Integer.valueOf(p.getId()));
            }

            // 2) removes the existing ones
            produtos.removeIf(p -> ids.contains(p.getId()));

            // 3) re-record just if something changed
            if (naoEncontrados.size() < ids.size()) {
                try (PrintWriter escritor = new PrintWriter(new FileWriter(nomeArquivo, false))) {
                    for (Produto p : produtos) {
                        escritor.println(p.getId()+","+p.getNome()+","+p.getPreco());
                    }
                } catch (IOException e) {
                    System.out.println("Erro ao acessar arquivo "+e.getMessage());
                }
            }
            return naoEncontrados;
        }

        public boolean alterar(Produto novoProduto){
    ArrayList<Produto> produtos = listar();
    boolean encontrado = false;

    for (Produto produto : produtos) {
        if (produto.getId() == novoProduto.getId()) {
            produto.setNome(novoProduto.getNome());
            produto.setPreco(novoProduto.getPreco());
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(nomeArquivo, false))) {
            for (Produto p : produtos) {
                escritor.println(p.getId()+","+p.getNome()+","+p.getPreco());
            }
        } catch (IOException e) {
            System.out.println("Erro ao acessar arquivo "+e.getMessage());
        }
    }

    return encontrado; // false = id not fid
}

    }
