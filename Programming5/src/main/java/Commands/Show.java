package Commands;

import Plus.Collector;

public class Show extends BigCommand{
    private Collector collector;
    public Show(Collector collector) {
        super("show", "show the all element");
        this.collector=collector;
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }
}
