public class OperacaoBasicaTeste {

    public static boolean testar_soma() {
        if (OperacaoBasica.somar(5, 3) == 8) {
            return true;
        }
        return false;
    }

    public static boolean testar_subtracao() {
        if (OperacaoBasica.subtrair(5, 3) == 2) {
            return true;
        }
        return false;
    }

    public static boolean testar_multiplicacao() {
        if (OperacaoBasica.multiplicar(5, 3) == 15) {
            return true;
        }
        return false;
    }

    public static boolean testar_divisao() {
        if (OperacaoBasica.dividir(9, 3) == 3) {
            return true;
        }
        return false;
    }

    public static boolean testar_sqrt() {
        return OperacaoBasica.sqrt(49) == 7;
    }

    public static boolean testar_primo() {
        return OperacaoBasica.numero_primo(7).equals("Numero válido, o numero é primo");
    }

    public static boolean testar_nao_primo() {
        return !OperacaoBasica.numero_primo(4).equals("Número válido, mas o numero não é primo");
    }

    public static boolean testar_primo_menor_zero() {
        return !OperacaoBasica.numero_primo(-2).equals("Número invalido. Numero menor ou igual a 1 não é primo");
    }

}
