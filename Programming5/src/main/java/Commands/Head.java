package Commands;

public class Head extends BigCommand{
    public Head(){
        super("head", "get the first element of the collection");
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }
}
