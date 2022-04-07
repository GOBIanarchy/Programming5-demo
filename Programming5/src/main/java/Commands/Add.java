package Commands;

import Exceptions.FalseAmountOfElementsException;
import Plus.Collector;

public class Add extends BigCommand{
    private Collector collector;

    public Add(Collector collector){
        super("Add {element}", "add new element to collection");
        this.collector = collector;
    }

    @Override
    public boolean execute(String argument) {
        try{
            if(!argument.isEmpty()) throw new FalseAmountOfElementsException();
        } catch (FalseAmountOfElementsException e) {
            e.printStackTrace();
        }
        return false;
    }
}
