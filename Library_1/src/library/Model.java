
package library;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;

public class Model extends Exception  {

	
public static boolean validateuser(String name,String pass) throws SQLException
{
	PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.log());
	boolean b=false;
	ps.setString(1,name);
	ps.setString(2,pass);
	
	ResultSet rs =ps.executeQuery();
	if(rs.next())
		b=true;
	else
		b=false;
	return b;
	}



static boolean insert(int bn,String bt,String btp,String au,String q,String dt,String e,String p,String shn) 
   {
       boolean bool=false;
    try {
        
        // PreparedStatement ps=dbconnect.ConnectDB().prepareStatement(r.insert());
        PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.insert_book());
        ps.setInt(1, bn);
        ps.setString(2, bt);
        ps.setString(3, btp);
        ps.setString(4, au);
        ps.setString(5, q);
        ps.setString(6, dt);
        ps.setString(7, e);
        ps.setString(8, p);
        ps.setString(9, shn);
        
        JOptionPane.showMessageDialog(null, "done");
        
        int rs=ps.executeUpdate();
        
        if(rs>0)
            bool=true;
        
        
    } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, ex);
    }
    return bool;
   }

static boolean insert1(int cno, String sname,String cla, String roll,String ct,String add )throws SQLException
{
boolean bool1=false;
PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.insert_s_reg());

       ps.setInt(1, cno);
       ps.setString(2, sname);
       ps.setString(3, cla);
      ps.setString(4, roll);
      ps.setString(5, ct);
      ps.setString(6, add);
       

       JOptionPane.showMessageDialog(null, "done");
       
       int rs=ps.executeUpdate();

       if(rs>0)
       bool1=true;


return bool1;

}

static boolean insert2(int mno, String mname,String mt, String language,int shelfno)throws SQLException
{
boolean bool2=false;
PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.insert_magazine());

       ps.setInt(1, mno);
       ps.setString(2, mname);
       ps.setString(3, mt);
       ps.setString(4, language);
       ps.setInt(5, shelfno);
      

       JOptionPane.showMessageDialog(null, "done");
       
       int rs=ps.executeUpdate();

       if(rs>0)
       bool2=true;


return bool2;

}    

static boolean insert3(String name,String dte, String sh)throws SQLException
{
boolean bool3=false;
PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.insert_newspaper());

       ps.setString(1, name);
       ps.setString(2, dte);
        ps.setString(3, sh);
       JOptionPane.showMessageDialog(null, "done");
       
       int rs=ps.executeUpdate();

       if(rs>0)
       bool3=true;


return bool3;

}   

static boolean insert4(int sl,String cn,String bn, String bti,String q, String dt, String d)throws SQLException
{
boolean bool4=false;
PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.insert_issue());

        ps.setInt(1, sl);
        ps.setString(2, cn);
        ps.setString(3, bn);
        ps.setString(4, bti);
        ps.setString(5, q);
        ps.setString(6, dt);
        ps.setString(7, d);
       JOptionPane.showMessageDialog(null, "done");
       
       int rs=ps.executeUpdate();

       if(rs>0)
       bool4=true;


return bool4;

}   
static boolean update(String x,String y,String i,String j,String k,String l,String m) throws Exception
    {
       
        boolean bool5=false;
     
         PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.update_issue());
        
            ps.setString(1, x);
       
            ps.setString(2, i);
            ps.setString(3, j);
            ps.setString(4, k);
            ps.setString(5, l);
            ps.setString(6, m);
  
            
             
            int rs=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, rs);
           if(rs>0)
               bool5=true;
            
       return bool5; 
    }



static boolean update1(String x,String y,String i,String j,String k,String l,String m,String n,String o) throws Exception
    {
       
        boolean bool8=false;
     
         PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.update_book());
        
           ps.setString(1, x);
            ps.setString(2, y);
            ps.setString(3, i);
            ps.setString(4, j);
            ps.setString(5, k);
            ps.setString(6, l);
            ps.setString(7, m);
            ps.setString(8, n);
            ps.setString(9, o);
            
  
            
            
          /*  // ps.setString(1, x);
            ps.setString(1, y);
            ps.setString(2, i);
            ps.setString(3, j);
            ps.setString(4, k);
            ps.setString(5, l);
            ps.setString(6, m);
            ps.setString(7, n);
            ps.setString(8, o);
            
            */
             
            int rs=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, rs);
           if(rs>0)
               bool8=true;
           
            
       return bool8; 
    }



static boolean update2(String x,String y,String i,String j,String k,String l) throws Exception
    {
       
        boolean bool9=false;
     
         PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.update_student());
        
            //ps.setString(1, x);
       
           /* ps.setString(1, y);
            ps.setString(2, i);
            ps.setString(3, j);
            ps.setString(4, k);
            ps.setString(5, l);
       */
            
            ps.setString(6, x);
            ps.setString(1, y);
            ps.setString(2, i);
            ps.setString(3, j);
            ps.setString(4, k);
            ps.setString(5, l);
            
         
            int rs=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, rs);
           if(rs>0)
               bool9=true;
            
       return bool9; 
    }

//
//static boolean update1(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

static boolean insert6(int cno, int bno,String btitle, String issue,String rdate,String du,String fine)throws SQLException
{
boolean bool6=false;
PreparedStatement ps=connect.retrieveConnection().prepareStatement(qu.insert_due());

       ps.setInt(1, cno);
       ps.setInt(2, bno);
       ps.setString(3, btitle);
      ps.setString(4, issue);
      ps.setString(5, rdate);
      ps.setString(6, du);
      ps.setString(7, fine);
       

       JOptionPane.showMessageDialog(null, "done");
       
       int rs=ps.executeUpdate();

       if(rs>0)
       bool6=true;


return bool6;

}

//    static boolean insert6(int i, int i0, String text, String string, String string0, String string1, String text0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    

}

