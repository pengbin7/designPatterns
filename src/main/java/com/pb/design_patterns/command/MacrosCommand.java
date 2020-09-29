package com.pb.design_patterns.command;

import java.util.Stack;

/**
 * @Author pengbin
 * @date 2020/9/22 15:52
 */
public class MacrosCommand implements Command {

    private Stack<Command> commands;

    void append(Command command){
        commands.push(command);
    }

    void undo(){
        commands.pop();
    }

    void clear(){
        commands.clear();
    }

    @Override
    public void execute() {

    }
}
