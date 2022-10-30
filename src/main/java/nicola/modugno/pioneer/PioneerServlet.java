package nicola.modugno.pioneer;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nicola.modugno.pioneer.enums.PioneerCommand;
import nicola.modugno.telnetclient.MyTelnetClient;

/**
 * Servlet implementation class PioneerServlet
 */
@WebServlet("/pioneerservlet")
public class PioneerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext ctx;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PioneerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	ctx=config.getServletContext();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String command=null;
		command=request.getParameter("command");
		
		//https://www.tylerwatt12.com/vsx-822k-telnet-interface/
		
		String output=null;
		
		PioneerCommand pc=PioneerCommand.getPioneerCommandFromLabel(command);
		output=sendCommand(pc.getCode());
		
		HttpSession session=request.getSession();
		session.setAttribute("output", output);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	private String sendCommand(final String command) {
		String output=null;
		MyTelnetClient myTelnetClient=new MyTelnetClient();
		myTelnetClient.connect(ctx.getInitParameter("pioneer_ip"), Integer.parseInt(ctx.getInitParameter("pioneer_port")));
		output=myTelnetClient.sendCommand(command);
		myTelnetClient.disconnect();
		return output;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
