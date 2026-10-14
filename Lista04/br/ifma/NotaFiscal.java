public class NotaFiscal {
    private String numero;
    private List<ItemNotaFiscal> itens = new ArrayList<>();

    public void adicionarItem(String descricao, double valor) {
        itens.add(new ItemNotaFiscal(descricao, valor));
    }
}