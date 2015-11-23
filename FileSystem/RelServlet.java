package middle;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.io.FilenameUtils;

/**
 * Servlet implementation class RelServlet
 */
@WebServlet("/RelServlet")
public class RelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RelServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("abc"));
		Object fileObject = request.getAttribute("ipfile");
		FileItem fileitem = (FileItem) fileObject;
		System.out.println(fileObject);
		/*
		Part filePart = request.getPart("ipfile");
		InputStream filecontent = filePart.getInputStream();
		System.out.println(filecontent);*/
		
		/*String[][] a = new String[20][20];
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(request.getParameter("ipfile"));
    	System.out.println("enter the way to sort (name/number)");
    	Scanner scr = new Scanner ( System.in );
    	String sort = scr.nextLine(); 
    		//Some code goes here
    	int i=0,j=0;
    	while (file1.readLine())
    	{
    		String b = file1.next();
    		a[i][j]=b;
    		if(j==0 || j==1)
    			j++;
    		else 
    		{
    			j=0;
    			i++;
    		}  		
    	}
    	file1.close();
    	Connection con;
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://localhost;integratedSecurity=true;");
		
		Statement s0 = con.createStatement();
		Statement s1 = con.createStatement();
		s0.executeUpdate("delete from practice.dbo.rel_nos");
		for(int k=0;k<a.length && a[k][0]!= null ;k++)
    	{
    		String name1 = a[k][0];
    		String no1 = a[k][2];
            s1.executeUpdate("INSERT INTO practice.dbo.rel_nos VALUES ('"+name1+"','"+no1+"')");
        }
		s1.close();
		PreparedStatement s2 = con.prepareStatement("exec practice.dbo.rel_nos_sort ?");
		s2.setString(1, sort);
		ResultSet rs = s2.executeQuery();
		while (rs.next()){
			System.out.println();
			System.out.format("%-14s%-10s", rs.getString("rel_name"), rs.getString("rel_no"));
			//System.out.print(rs.getString("rel_name"));
            //System.out.println("\t"+rs.getString("rel_no"));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
