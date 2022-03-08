public class Pessoa {

    public static boolean emailValido(String emal) {
        if (emal.contains("@") && emal.length() < 50) {
            return true;
        }
        return false;
    }
}
