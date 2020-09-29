package com.pb.design_patterns.command;

import com.pb.design_patterns.command.tool.Drawable;

/**
 * @Author pengbin
 * @date 2020/9/22 15:54
 */
public class DrawCanvas implements Drawable {

    private MacrosCommand history;

    private String color;

    private Integer radius;

    public void paint(){

    }

    @Override
    public void draw() {

    }
}
