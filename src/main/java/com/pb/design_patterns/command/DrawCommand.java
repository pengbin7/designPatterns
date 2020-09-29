package com.pb.design_patterns.command;

import com.pb.design_patterns.command.tool.Drawable;
import com.pb.design_patterns.command.tool.Position;

/**
 * @Author pengbin
 * @date 2020/9/22 15:50
 */
public class DrawCommand implements Command {

    private Drawable drawable;

    private Position position;

    @Override
    public void execute() {

    }

}
