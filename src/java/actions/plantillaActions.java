/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author jidc28
 */
public class plantillaActions extends org.apache.struts.action.Action {
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";
    private static final String COORDINADOR = "coordinador";
    private static final String DECANATO = "decanto";
    private static final String MODULOUNO = "modulouno";
    
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int a = 2;
        int b = 2;
        
        if (a==b)
        return mapping.findForward(SUCCESS);
        
        return mapping.findForward(FAILURE);
        
//        Recuerden que esto es una plantilla trabajada con condicionales
//        dentro de su sistema ustedes deben modelar tal cual si fuera un programa
//        comun y corriente, es decir, pueden usar IF, ELSE, WHILE, entre otras
//        herramientas que provea java para realizar su flujo en el sistema.
    }
    
}
