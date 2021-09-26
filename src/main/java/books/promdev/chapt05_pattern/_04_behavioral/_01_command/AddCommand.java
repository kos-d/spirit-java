package books.promdev.chapt05_pattern._04_behavioral._01_command;

import books.promdev.chapt05_pattern._04_behavioral._01_command.receiver.ArrayOperation;

public class AddCommand extends Command {
    private ArrayOperation ao;
    
    public AddCommand(ArrayOperation ao) {
        this.ao = ao;
    }
    
    @Override
    public void execute() {
        this.ao.product();
    }
}