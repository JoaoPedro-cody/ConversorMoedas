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
        switch (n){
            case 1 :
                produto = m * 1169.91;
                return "Valor " + m + "[USD] corresponde ao valor final de =>>>" + produto + "[ARS]";
            case 2 :
                produto = m * 0.00085;
                return "Valor " + m + "[ARS] corresponde ao valor final de =>>>" + produto + "[USD]";
            case 3 :
                produto = m * 5.68;
                return "Valor " + m + "[USD] corresponde ao valor final de =>>>" + produto + "[BRl]";
            case 4 :
                produto = m * 0.18;
                return "Valor " + m + "[BRL] corresponde ao valor final de =>>>" + produto + "[USD]";
            case 5 :
                produto = m + 4210.72;
                return "Valor " + m + "[USD] corresponde ao valor final de =>>>" + produto + "[BOB]";
            case 6 :
                produto = m * 0.00024;
                return "Valor " + m + "[BOB] corresponde ao valor final de =>>>" + produto + "[USD]";
            default: return "Opção Inválida";
        }
    }

}
