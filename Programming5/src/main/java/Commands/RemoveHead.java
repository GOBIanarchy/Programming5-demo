package Commands;

public class RemoveHead extends BigCommand{
    public RemoveHead(){
        super("Remove head","print the first element of the collection and remove it");
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }
}
