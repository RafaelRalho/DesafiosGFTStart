public class Main {
    public static void main(String[] args){
        Pagamento generico = new Pagamento();
        PagamentoBoleto boleto = new PagamentoBoleto();
        PagamentoCartao cartao = new PagamentoCartao();

        generico.processarPagamento();
        boleto.processarPagamento();
        cartao.processarPagamento();
    }

}
