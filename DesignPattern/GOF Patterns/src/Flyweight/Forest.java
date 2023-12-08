/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

import Flyweight.Tree;
import Flyweight.TreeFactory;
import Flyweight.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author fa20-bse-044
 */

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    
      @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
        tree.draw(graphics);
        }
    }

    void plantTree(int random, int random0, String summer_Oak, Color GREEN, String oak_texture_stub, boolean b, int i, Color ORANGE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}