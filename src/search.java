

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{HttpSession session = request.getSession();
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ResumeServlet","root","password"); 
			String name = (String) session.getAttribute("FullNameSession");		
			String Searchquery = ("SELECT FullName, Email FROM Person"
					+ " WHERE FullName = '"+name+"'"); 
		
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery(Searchquery);  //cursor pointer to the row of the table

		
		String message = "" ;

	
		//PrintWriter out = response.getWriter();
		while(rs.next()){
			
			//out.println();
			//System.out.println(total);
			// from the current pointer till the end of the table
			message+=(rs.getString(2)+"\t"+rs.getString(1) + "<br>"	
					+rs.getString(5) + "\t" + rs.getString(6) +"<br>" 
					+ rs.getString(7) +rs.getString(8) + "<br>"
					+ rs.getString(9) + "<br>"
					+ rs.getString(10) + "  "+ rs.getString(11) + "<br> ID: " + rs.getString(12)+"<br><br>"); } 
		session.setAttribute("message", message);
	}catch (Exception e) {
		System.out.println("ERROR");
	}
	}
}
