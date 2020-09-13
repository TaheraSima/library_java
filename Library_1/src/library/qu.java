/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

public class qu {
public static String log()
{
	String l;
	l="select * from login where user=? and pass=?";
	return l;
	
	}


static String insert_book()
    {
        String r;
       r="INSERT INTO book Values (?,?,?,?,?,?,?,?,?)";
        return r;
    }


static String insert_s_reg()
    {
        String s;
       s="INSERT INTO s_reg Values (?,?,?,?,?,?)";
        return s;
    }

static String insert_magazine()
    {
        String m;
       m="INSERT INTO magazine Values (?,?,?,?,?)";
        return m;
    }
static String insert_newspaper()
    {
        String n;
       n="INSERT INTO news Values (?,?,?)";
        return n;
    }


//static String delete()
//  {
//     String q= "delete from issue where c_no=?";
//      
//     return q;
//  }
static String insert_issue()
    {
        String i;
       i="INSERT INTO issue Values (?,?,?,?,?,?,?)";
        return i;
    }

static String update_issue()
  {
     String q= "UPDATE issue SET c_no=?,b_title=?,quan=?,issue=?,due=? WHERE b_no=?";
      
     return q;
  }  


static String update_book()
  {
     String b= "UPDATE book SET book_title=?,book_type=?,author_name=?,quantity=?,date=?,edition=?,price=?,shelf_no=? WHERE book_no=?";
      
     return b;
  }  

static String update_student()
  {
     String s= "UPDATE s_reg SET s_name=?,class=?,roll=?,c_teacher_name=?,address=? WHERE c_no=?";
     
     return s;
  }  




static String insert_due()
    {
        String re;
       re="INSERT INTO due Values (?,?,?,?,?,?,?)";
        return re;
    }

}
