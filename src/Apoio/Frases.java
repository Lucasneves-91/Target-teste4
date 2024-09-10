package Apoio;

import java.text.DecimalFormat;

public class Frases extends Calculos {

    DecimalFormat decimal = new DecimalFormat("0.00");

    private final String mensagemSp = "O valor de faturamento mensal de São Paulo é R$" + getSp() + " esse valor representa " + decimal.format(getPorcentagemSP()) + "%";
    private final String mensagemRj = "O valor de faturamento mensal do Rio de Janeiro é R$" + getRj() + " esse valor representa " + decimal.format(getPorcentagemRJ()) + "%";
    private final String mensagemMg = "O valor de faturamento mensal de Minas Gerais é R$" + getMg() + " esse valor representa " + decimal.format(getPorcentagemMG()) + "%";
    private final String mensagemEs = "O valor de faturamento mensal do Espirito Santo é R$" + getEs() + " esse valor representa " + decimal.format(getPorcentagemES()) + "%";
    private final String mensagemOutros = "O valor de faturamento mensal dos Outros Estados é R$" + getOutros() + " esse valor representa " + decimal.format(getPorcentagemOUTROS()) + "%";
    private final String valorTotal = "O valor total do faturamento é de R$" + getTotal() + " esse valor representa " + decimal.format(getPorcentagemTotal()) + "%";

    public String getMensagemSp() {
        return mensagemSp;
    }

    public String getMensagemRj() {
        return mensagemRj;
    }

    public String getMensagemMg() {
        return mensagemMg;
    }

    public String getMensagemEs() {
        return mensagemEs;
    }

    public String getMensagemOutros() {
        return mensagemOutros;
    }

    public String getValorTotal() {
        return valorTotal;
    }
}


