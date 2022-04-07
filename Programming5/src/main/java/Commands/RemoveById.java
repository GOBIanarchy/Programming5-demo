package Commands;

import Exceptions.CollectorHasEmpty;
import Exceptions.FalseAmountOfElementsException;
import Exceptions.VehicleNotFound;
import Plus.Collector;

public class RemoveById extends BigCommand{
    private Collector collector;
    public RemoveById(Collector collector) {
        super( "remove by id <ID>", "remove item from collection by ID");
        this.collector = collector;
    }
    @Override
    public boolean execute(String argument) {
        try {
            if (argument.isEmpty()) throw new FalseAmountOfElementsException();
            return true;
        } catch (FalseAmountOfElementsException exception) {
            Holder.println("Usage: '" + getName() + "'");
        } catch (FalseAmountOfElementsException exception) {
            Holder.printerror("The collection is empty");
        } catch (NumberFormatException exception) {
            Holder.printerror("ID must be represented by a number");
        } catch (VehicleNotFound exception) {
            Holder.printerror("There is no vehicle with this ID in the collection!");
        }
        return false;
    }
}
