package control;

import model.Block;

/**
 *
 * @author sauld
 */

public class DownCommand implements Command {
    private final Block block;

    public DownCommand(Block block) {
        this.block = block;
    }
    
    @Override
    public void execute() {
        block.down();
    }
}
