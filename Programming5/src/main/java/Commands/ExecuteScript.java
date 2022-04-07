package Commands;

public class ExecuteScript extends BigCommand{
    public ExecuteScript(){
        super("execute script <filename>", "execute script from specified file");
    }


    @Override
    public boolean execute(String argument) {
        return false;
    }
}
