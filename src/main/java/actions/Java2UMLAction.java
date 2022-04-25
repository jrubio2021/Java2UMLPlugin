package actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vcs.checkin.CheckinHandler;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.pom.Navigatable;
import com.thoughtworks.xstream.mapper.Mapper;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Java2UMLAction extends AnAction {



    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project currentProject = e.getProject();
        //ToolWindow window = ToolWindowManager.getInstance(currentProject).getToolWindow("window");
        //window.show();
        //AnAction copy = ActionManager.getInstance().getAction(IdeActions.ACTION_COPY);
        //copy.actionPerformed(e);

        AnAction export = ActionManager.getInstance().getAction(IdeActions.ACTION_EXPORT_TO_TEXT_FILE);
        //export.actionPerformed(e);

        //AnAction enterEditor = ActionManager.getInstance().getAction(IdeActions.ACTION_EDITOR_ENTER);
        //enterEditor.actionPerformed(e);

        //AnAction paste = ActionManager.getInstance().getAction(IdeActions.ACTION_CALL_HIERARCHY);
        //paste.actionPerformed(e);

        AnAction newWindow = ActionManager.getInstance().getAction(IdeActions.ACTION_FILE_STRUCTURE_POPUP);
        //newWindow.actionPerformed(e);

        //AnAction makeMod = ActionManager.getInstance().getAction(IdeActions.ACTION_MAKE_MODULE);
        //makeMod.actionPerformed(e);

        AnAction hierarchy = ActionManager.getInstance().getAction(IdeActions.ACTION_METHOD_HIERARCHY);
        //hierarchy.actionPerformed(e);





        //String stringExport = newWindow.getTemplateText();
        //newWindow.displayTextInToolbar();

        final int answer = Messages.showYesNoCancelDialog(currentProject, "Turn Code into UML?", "Welcome to JAVA2UML!", null);
        if(answer == Messages.YES){
            newWindow.actionPerformed(e);
            //hierarchy.actionPerformed(e);
            //export.actionPerformed(e);

        }

       /* ScriptPython sp = new ScriptPython();
        String msg1 = sp.runScript();
        Messages.showInfoMessage("Info"); */
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        assert project != null;
        e.getPresentation().setEnabledAndVisible(project.isInitialized());
    }
}
