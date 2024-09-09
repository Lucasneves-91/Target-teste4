public class Main {

    private static double sp = 67836.43;
    private static double rj = 36678.66;
    private static double mg = 29229.88;
    private static double es = 27165.48;
    private static double outros = 19849.53;

    public static void main(String[] args) {
        double total = sp + rj + mg + es + outros;

        double porcentagemSP = (sp * 100)/total;
        double porcentagemRJ = (rj * 100)/total;
        double porcentagemMG = (mg * 100)/total;
        double porcentagemES = (es * 100)/total;
        double porcentagemOUTROS = (outros * 100)/total;


        System.out.println(porcentagemSP);
        System.out.println(porcentagemRJ);
        System.out.println(porcentagemMG);
        System.out.println(porcentagemES);
        System.out.println(porcentagemOUTROS);
        System.out.println(porcentagemSP+porcentagemRJ+porcentagemMG+porcentagemES+porcentagemOUTROS);
    }
}