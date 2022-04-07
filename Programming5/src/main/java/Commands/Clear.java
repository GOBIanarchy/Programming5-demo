package Commands;

import Exceptions.FalseAmountOfElementsException;
import Plus.Collector;

public class Clear extends BigCommand{
    private Collector collector;
    public Clear(Collector collector){
        super("clear", "cleared collention");
        this.collector = collector;
    }
    @Override
    public boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new FalseAmountOfElementsException();
            collector.clearCollection();
            Holder.println("Collection cleared");
            return true;
        } catch (FalseAmountOfElementsException exception) {
            Holder.println("Usage: '" + getName() + "'");
        }
        return false;
    }
}
