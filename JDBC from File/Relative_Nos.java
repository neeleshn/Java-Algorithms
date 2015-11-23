import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.sql.*;

class Relative_Nos {
    public static void main(String[] args) throws FileNotFoundException, SQLException {
    	String[][] a = new String[20][20];
    	Scanner file1 =
    		new Scanner(new File("rel_nos.txt"));
    	System.out.println("enter the way to sort (name/number)");
    	Scanner scr = new Scanner ( System.in );
    	String sort = scr.nextLine(); 
    		//Some code goes here
    	int i=0,j=0;
    	while (file1.hasNext())
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
    	Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;integratedSecurity=true;");
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
    }
}