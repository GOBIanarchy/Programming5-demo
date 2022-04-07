package Commands;

import Plus.Collector;

public class Info extends BigCommand{
    private Collector collector;

    public Info(Collector collector){
        super("info", "display information about the collection");
        this.collector = collector;
    }


    @Override
    public boolean execute(String argument) {
        return false;
    }
}
