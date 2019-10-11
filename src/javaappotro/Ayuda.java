package javaappotro;

/**
 *
 * @author daw201
 * @since 2019
 */
public class Ayuda {

    private static String help = "esto es una ayuda";
    private static String help2 = "esto es otra ayuda";

    public Ayuda() {

    }

    /**
     * Get the value of help
     *
     * @return the value of help
     */
    public static String getHelp() {
        return help;
    }

    public static void main(String[] args) {
        System.out.println(getHelp());
    }

    @Override
    public String toString() {
        return "Ayuda{" + "help=ALIOLI" + help + '}';
    }

    /**
     * Set the value of help
     *
     * @param help new value of help
     */
    public void setHelp(String help) {
        this.help = help;
    }

}
