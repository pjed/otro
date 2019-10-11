package javaappotro;

/**
 *
 * @author daw201
 */
public class Ayuda {

    private static String help = "esto es una ayudaaaaaaaaaaaa";

    public Ayuda() {

    }

    public static String getHelp() {
        return help;
    }

    public static void main(String[] args) {
        System.out.println(getHelp());
    }

    @Override
    public String toString() {
        return "Ayuda{" + "help=" + help + '}';
    }

    public void setHelp(String help) {
        this.help = help;
    }

}
