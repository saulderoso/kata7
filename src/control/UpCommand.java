package control;

import model.Block;

/**
 *
 * @author sauld
 */

public class UpCommand implements Command {
    private final Block block;

    public UpCommand(Block block) {
        this.block = block;
    }
    
    @Override
    public void execute() {
        block.up();
    }
    
}
