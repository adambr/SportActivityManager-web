/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pa165.sportactivitymanager.web;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import org.apache.taglibs.standard.functions.Functions;

/**
 * Base actionBean implementing the required methods for setting and getting context.
 *
 * @author Dobes Kuba
 */
public abstract class BaseActionBean implements ActionBean {
    private ActionBeanContext context;

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    public static String escapeHTML(String s) {
        return Functions.escapeXml(s);
    }
}
