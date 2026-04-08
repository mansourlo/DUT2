public class TerminalException extends RuntimeException {
    public TerminalException(int num){
        super("Seul le type int est autorise!");
    }
}