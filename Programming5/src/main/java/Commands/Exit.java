package Commands;

import Exceptions.FalseAmountOfElementsException;

public class Exit extends BigCommand{
    public Exit() {
        super("exit", "terminate program (without saving to file)");
    }

    @Override
    public boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new FalseAmountOfElementsException();
            return true;
        } catch (FalseAmountOfElementsException exception) {
            Holder.println("Usage: '" + getName() + "'");
        }
        return false;
    }
}
