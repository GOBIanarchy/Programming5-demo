package Commands;

import Plus.Collector;

public class Update extends BigCommand{
    private Collector collector;

    public Update(Collector collector){
        super("update <ID> {element}", "update collection element value by ID");
        this.collector=collector;
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }
}
