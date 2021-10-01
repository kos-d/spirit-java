package books.promdev.part_01_core.chapt05_pattern._04_behavioral._01_command.invoker;
// invoker - инициатор

import books.promdev.part_01_core.chapt05_pattern._04_behavioral._01_command.Command;
public class ManagerCommands {
    private Command command;
    
    public ManagerCommands(Command command) {
        this.command = command;
    }
    
    public void setManager(Command command) {
        this.command = command;
    }
    public void exec() {
        command.execute();
    }
}