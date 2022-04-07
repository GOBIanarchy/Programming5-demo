package Commands;
import Exceptions.*;
public class Help extends BigCommand{

    public Help(){super("help", "display help on available commands");}
    @Override
    public boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new FalseAmountOfElementsException();
            return true;
        } catch (FalseAmountOfElementsException exception) {
            Holder.println("Using: '" + getName() + "'");
        }
        return false;
    }
}
