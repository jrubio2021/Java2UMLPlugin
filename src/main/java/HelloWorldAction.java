import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;
import org.jetbrains.annotations.NotNull;

public class HelloWorldAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showInfoMessage("Hello World", "Info");

        Project currentProject = e.getProject();
        StringBuilder message =
                new StringBuilder(e.getPresentation().getText() + "*****");
        Navigatable selectedElement = e.getData(CommonDataKeys.NAVIGATABLE);
        if (selectedElement != null) {
            message.append("\nSelected****:").append(selectedElement);
        }
        String title = e.getPresentation().getDescription();
        Messages.showMessageDialog(currentProject,
                message.toString(),
                title,
                Messages.getInformationIcon());
    }
}
