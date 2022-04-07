package Commands;

public class AverageOfEnginePower extends BigCommand{
    public AverageOfEnginePower(){
        super("Average of engine power", "display the average value of the enginePower " +
                "field for all elements of the collection");
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }
}
