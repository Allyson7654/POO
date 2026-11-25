package br.ifma.estoque.persistencia;

import br.ifma.estoque.excecao.PersistenciaException;
import br.ifma.estoque.modelo.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoEstoque {
    private static final String ARQUIVO = "estoque.txt";

    public void salvar(List<Produto> produtos) throws PersistenciaException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(produtos);
        }catch (IOException e) {
            throw new PersistenciaException("Erro ao salvar os produtos no arquivo.", e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Produto> carregar() throws PersistenciaException {
        File file = new File(ARQUIVO);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Produto>) ois.readObject();
        }catch (IOException | ClassNotFoundException e) {
            throw new PersistenciaException("Erro ao carregar os produtos do arquivo.", e);
            

        }
    }
}
