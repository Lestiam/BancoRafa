package aplicacao.entidade;

public class ContaCorrente {
    private double saldo;
    private Integer numero;
    private Cliente cliente;

    public ContaCorrente( ){
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public  String toString(){
        return "O seu saldo é " + saldo;
    }

}

