package Apoio;

public class Calculos {

    private double sp = 67836.43;
    private double rj = 36678.66;
    private double mg = 29229.88;
    private double es = 27165.48;
    private double outros = 19849.53;
    private double total = sp + rj + mg + es + outros;



    private double porcentagemSP = (sp * 100)/total;
    private double porcentagemRJ = (rj * 100)/total;
    private double porcentagemMG = (mg * 100)/total;
    private double porcentagemES = (es * 100)/total;
    private double porcentagemOUTROS = (outros * 100)/total;

    void exibeValores(){

    }

}
