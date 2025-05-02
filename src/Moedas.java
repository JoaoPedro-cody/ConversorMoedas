public class Moedas {
    private double brl;
    private double ars;
    private double cop;

    public Moedas() {
    }

    public Moedas(double brl, double ars, double bob) {
        this.brl = brl;
        this.ars = ars;
        this.cop = bob;
    }

    public String calculaMoeda(int n, double m){
        double produto;
        ConsultaAPI c = new ConsultaAPI();

        Moedas mo = c.consulta();

        return switch (n) {
            case 1 -> {
                produto = m * mo.ars;
                yield "Valor " + m + "[USD] corresponde ao valor final de =>>> " + produto + "[ARS]";
            }
            case 2 -> {
                produto = m / mo.ars;
                yield "Valor " + m + "[ARS] corresponde ao valor final de =>>> " + produto + "[USD]";
            }
            case 3 -> {
                produto = m * mo.brl;
                yield "Valor " + m + "[USD] corresponde ao valor final de =>>> " + produto + "[BRl]";
            }
            case 4 -> {
                produto = m / mo.brl;
                yield "Valor " + m + "[BRL] corresponde ao valor final de =>>> " + produto + "[USD]";
            }
            case 5 -> {
                produto = m * mo.cop;
                yield "Valor " + m + "[USD] corresponde ao valor final de =>>> " + produto + "[BOB]";
            }
            case 6 -> {
                produto = m / mo.cop;
                yield "Valor " + m + "[BOB] corresponde ao valor final de =>>> " + produto + "[USD]";
            }
            default -> "Opção Inválida";
        };
    }

}
