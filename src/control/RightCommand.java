package control;

import model.Block;

/**
 *
 * @author sauld
 */

public class RightCommand implements Command {
    private final Block block;

    public RightCommand(Block block) {
        this.block = block;
    }
    
    @Override
    public void execute() {
        block.right();
    }
    
}
