package Commands;

import Exceptions.FalseAmountOfElementsException;
import Plus.Collector;

public class Save extends BigCommand{
    private Collector collector;

    public Save(Collector collector) {
        super("save", "save file");
        this.collector = collector;
    }

    @Override
    public boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new FalseAmountOfElementsException();
            collector.saveCollection();
            return true;
        } catch (FalseAmountOfElementsException exception) {
            Holder.println("Использование: '" + getName() + "'");
        }
        return false;
    }
}
