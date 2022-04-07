package Commands;

public class PrintAscending extends BigCommand{
    public PrintAscending(){
        super("print ascending", "display the elements of the collection in ascending order");

    }

    @Override
    public boolean execute(String argument) {
        return false;
    }
}
