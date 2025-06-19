public non-sealed class IngressoMeiaEntrada extends Filme{

    private double valor = getValor();

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
}
