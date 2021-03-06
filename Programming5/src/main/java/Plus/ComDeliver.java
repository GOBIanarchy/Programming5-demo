package Plus;

import Commands.Command;

import java.util.List;

public class ComDeliver {
    private final int COMMAND_HISTORY_SIZE = 7;
    private String[] commandHistory = new String[COMMAND_HISTORY_SIZE];
    private List<Command> commands = new ArrayList<>();
    private Command helpCommand;
    private Command infoCommand;
    private Command showCommand;
    private Command addCommand;
    private Command updateCommand;
    private Command removeByIdCommand;
    private Command clearCommand;
    private Command saveCommand;
    private Command executeScriptCommand;
    private Command exitCommand;
    private Command headCommand;
    private Command removeHeadCommand;
    private Command historyCommand;
    private Command averageOfEnginePowerCommand;
    private Command filterGreaterThanEnginePowerCommand;
    private Command printAscendingCommand;


    public ComDeliver(Command helpCommand, Command infoCommand, Command showCommand, Command addCommand, Command updateCommand,
                      Command removeByIdCommand, Command clearCommand, Command saveCommand, Command executeScriptCommand,Command exitCommand, Command headCommand,
                      Command removeHeadCommand, Command historyCommand, Command averageOfEnginePowerCommand, Command filterGreaterThanEnginePowerCommand,
                      Command printAscendingCommand) {
        this.helpCommand = helpCommand;
        this.infoCommand = infoCommand;
        this.showCommand = showCommand;
        this.addCommand = addCommand;
        this.updateCommand = updateCommand;
        this.removeByIdCommand = removeByIdCommand;
        this.clearCommand = clearCommand;
        this.saveCommand = saveCommand;
        this.exitCommand = exitCommand;
        this.executeScriptCommand = executeScriptCommand;
        this.headCommand = headCommand;
        this.removeHeadCommand = removeHeadCommand;
        this.historyCommand = historyCommand;
        this.averageOfEnginePowerCommand = averageOfEnginePowerCommand;
        this.filterGreaterThanEnginePowerCommand = filterGreaterThanEnginePowerCommand;
        this.printAscendingCommand = printAscendingCommand;

        commands.add(infoCommand);
        commands.add(showCommand);
        commands.add(addCommand);
        commands.add(updateCommand);
        commands.add(removeByIdCommand);
        commands.add(clearCommand);
        commands.add(saveCommand);
        commands.add(exitCommand);
        commands.add(executeScriptCommand);
        commands.add(headCommand);
        commands.add(removeHeadCommand);
        commands.add(historyCommand);
        commands.add(averageOfEnginePowerCommand);
        commands.add(filterGreaterThanEnginePowerCommand);
        commands.add(printAscendingCommand);
    }


    public String[] getCommandHistory() {
        return commandHistory;
    }


    public List<Command> getCommands() {
        return commands;
    }

    public void addToHistory(String commandToStore) {

        for (Command command : commands) {
            if (command.getName().split(" ")[0].equals(commandToStore)) {
                for (int i = COMMAND_HISTORY_SIZE-1; i>0; i--) {
                    commandHistory[i] = commandHistory[i-1];
                }
                commandHistory[0] = commandToStore;
            }
        }
    }


    public boolean noSuchCommand(String command) {
        Console.println("Command '" + command + "' not found. Type 'help' for help.");
        return false;
    }

    public boolean help(String argument) {
        if (helpCommand.execute(argument)) {
            for (Command command : commands) {
                Console.printtable(command.getName(), command.getDescription());
            }
            return true;
        } else return false;
    }

    public boolean info(String argument) {
        return infoCommand.execute(argument);
    }


    public boolean show(String argument) {
        return showCommand.execute(argument);
    }


    public boolean add(String argument) {
        return addCommand.execute(argument);
    }


    public boolean update(String argument) {
        return updateCommand.execute(argument);
    }


    public boolean removeById(String argument) {
        return removeByIdCommand.execute(argument);
    }


    public boolean clear(String argument) {
        return clearCommand.execute(argument);
    }


    public boolean save(String argument) {
        return saveCommand.execute(argument);
    }


    public boolean exit(String argument) {
        return exitCommand.execute(argument);
    }


    public boolean executeScript(String argument) {
        return executeScriptCommand.execute(argument);
    }


    public boolean addIfMin(String argument) { return headCommand.execute(argument); }


    public boolean removeGreater(String argument) {
        return removeHeadCommand.execute(argument);
    }

    public boolean sumOfHealth(String argument) {
        return averageOfEnginePowerCommand.execute(argument);
    }


    public boolean maxByMeleeWeapon(String argument) {
        return filterGreaterThanEnginePowerCommand.execute(argument);
    }


    public boolean filterByWeaponType(String argument) { return printAscendingCommand.execute(argument);}

    @Override
    public String toString() {
        return "CommandManager (helper class for working with commands)";
    }
}


