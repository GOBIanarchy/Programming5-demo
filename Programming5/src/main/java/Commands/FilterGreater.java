package Commands;

public class FilterGreater extends BigCommand{
    public FilterGreater(){
        super("average of engine power", "display the average value of the enginePower" +
                " field for all elements of the collection");
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }
}
