package control;

import model.Block;

/**
 *
 * @author sauld
 */

public class LeftCommand implements Command {
    private final Block block;

    public LeftCommand(Block block) {
        this.block = block;
    }
    
    @Override
    public void execute() {
        block.left();
    }
    
}
