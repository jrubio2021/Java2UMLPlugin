package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;


public class Java2UMLAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showInfoMessage("", "Java2UML");
       /* ScriptPython sp = new ScriptPython();
        String msg1 = sp.runScript();
        Messages.showInfoMessage("Info"); */
    }

}
