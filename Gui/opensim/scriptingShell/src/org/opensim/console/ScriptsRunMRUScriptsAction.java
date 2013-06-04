/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.console;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.openide.awt.ActionRegistration;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionID;
import org.openide.awt.DynamicMenuContent;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.CallableSystemAction;

@ActionID(category = "Edit",
id = "org.opensim.console.ScriptsRunMRUScriptsAction")
@ActionRegistration(displayName = "#CTL_RunMRUScriptsAction1")
@ActionReferences({
    @ActionReference(path = "Scripts", position = 1362, separatorBefore = 1356, separatorAfter = 1368)
})
@Messages("CTL_RunMRUScriptsAction1=Run Recent")
public final class ScriptsRunMRUScriptsAction extends CallableSystemAction {
 
    /** {@inheritDoc}
     * do nothing
     */
    public void performAction() {
        // do nothing
    }
 
    /** {@inheritDoc} */
    public String getName() {
        return NbBundle.getMessage(ScriptsRunMRUScriptsAction.class, "CTL_RunMRUScriptsAction");
    }
 
 
    /** {@inheritDoc} */
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }
 
    /** {@inheritDoc} */
    protected boolean asynchronous() {
        return false;
    }
 
    /** {@inheritDoc}
     * Overide to provide SubMenu for MRUFiles (Most Recently Used Files)
     */
    public JMenuItem getMenuPresenter() {
        JMenu menu = new MRUFilesMenu(getName());
        return menu;
    }
 
 
 
    class MRUFilesMenu extends JMenu implements DynamicMenuContent {
 
        public MRUFilesMenu(String s) {
            super(s);
 
            MRUScriptsOptions opts = MRUScriptsOptions.getInstance();
            opts.addPropertyChangeListener(new PropertyChangeListener() {
                public void propertyChange(PropertyChangeEvent evt) {
                    if (!evt.getPropertyName().equals(MRUScriptsOptions.MRU_SCRIPT_LIST_PROPERTY)) {
                       return;
                    }
                    updateMenu();
                }
            });
 
            updateMenu();
        }
 
        public JComponent[] getMenuPresenters() {
            return new JComponent[] {this};
        }
 
        public JComponent[] synchMenuPresenters(JComponent[] items) {
            return getMenuPresenters();
        }
 
        private void updateMenu() {
            removeAll();
            MRUScriptsOptions opts = MRUScriptsOptions.getInstance();
            List<String> list = opts.getMRUFileList();
            for (String name : list) {
                Action action = createAction(name);
                action.putValue(Action.NAME,name);
                JMenuItem menuItem = new JMenuItem(action);
                add(menuItem);
            }
        }
 
 
        private Action createAction(String actionCommand) {
            Action action = new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    menuItemActionPerformed(e);
                }
            };
 
            action.putValue(Action.ACTION_COMMAND_KEY, actionCommand);
            return action;
        }
 
        private void menuItemActionPerformed(ActionEvent evt) {
            String command = evt.getActionCommand();
            File file = new File(command);
            if (file.exists())
                ScriptingShellTopComponent.getDefault().getConsole().executeFile(command);
        }
    }
}