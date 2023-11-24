/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.RefacotringGuruExample;

import Command.RefacotringGuruExample.Editor.Editor;

/**
 *
 * @author fa20-bse-044
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    public CopyCommand(Editor editor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}