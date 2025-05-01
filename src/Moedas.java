public class Moedas {
    private double usd;
    private double brl;
    private double bob;
    private double ars;
    private double cpl;

    public Moedas() {
    }

    public String calculaMoeda(int n, double m){
        double produto;
        return switch (n) {
            case 1 -> {
                produto = m * 1169.91;
                yield "Valor " + m + "[USD] corresponde ao valor final de =>>>" + produto + "[ARS]";
            }
            case 2 -> {
                produto = m * 0.00085;
                yield "Valor " + m + "[ARS] corresponde ao valor final de =>>>" + produto + "[USD]";
            }
            case 3 -> {
                produto = m * 5.68;
                yield "Valor " + m + "[USD] corresponde ao valor final de =>>>" + produto + "[BRl]";
            }
            case 4 -> {
                produto = m * 0.18;
                yield "Valor " + m + "[BRL] corresponde ao valor final de =>>>" + produto + "[USD]";
            }
            case 5 -> {
                produto = m + 4210.72;
                yield "Valor " + m + "[USD] corresponde ao valor final de =>>>" + produto + "[BOB]";
            }
            case 6 -> {
                produto = m * 0.00024;
                yield "Valor " + m + "[BOB] corresponde ao valor final de =>>>" + produto + "[USD]";
            }
            default -> "Opção Inválida";
        };
    }

}
