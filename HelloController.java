package beans;

import javax.servlet.http.*;

import org.apache.struts.action.*;

public class HelloController extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm from,
			HttpServletRequest request, HttpServletResponse response)
	        throws Exception {
		 String name = request.getParameter("name");    //requests the name for the printing
		 request.setAttribute("res", "Hello...."+name);  //For setting some result msg   
		
		return mapping.findForward("success");  //Sending the output
		
	}

}
