package Commands;

import Exceptions.FalseAmountOfElementsException;

public class History extends BigCommand{
    public History() {
        super("history", "display last 7 history of used commands");
    }

    @Override
    public boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new FalseAmountOfElementsException();
            return true;
        } catch (FalseAmountOfElementsException exception) {
            Holder.println("Использование: '" + getName() + "'");
        }
        return false;
    }
}
