package ice_stepDefinitions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class oracleconnect {
		int xconn = 2;		
		int xprod = 2;		
		String selstmt = "";
		Statement stmt;
		ResultSet rset;
		
		String xusername = "gtracey";
		String xpassword = "Ba$eball77";
		String xservice = "stagerac";
		String xin = "10.241.5.83";
		String xout = "209.116.117.153";
		String xvpn = "10.241.5.83";
		String xovh = "51.254.42.44";
		String xovhservice = "pzinteg";
		String xuatrac = "uatrac-cluster.stats.com";
		
		String idname = "";
		String xcnt_string = "";{
		
		//1 = IN
		//2 = OUT
		//3 = VPN
		
		if (xprod == 2) {
		  idname = "stag_ops_OPER_AGENT";
		} else if (xprod == 3) {
		  idname = "globalora9test";
		    } else if (xprod == 4) {
		 //     idname = "globaltestrac";
		  idname = "trac_ops_OPER_AGENT";
		} else if (xprod == 5) {
		    idname = "urac_ops_OPER_AGENT";
		} else {
		 // idname = "srac_OPER_AGENT";
		idname = "brac_ops_OAPP_AGENT";
		}
		
		if (xconn == 1) {
		  xcnt_string = "jdbc:oracle:oci:@bladerac_oap";
		  //xcnt_string = "jdbc:oracle:thin:@" + xin + ":1521:" + xservice; //+ "_N1";
		} else if (xconn == 2) {
		  xcnt_string = "jdbc:oracle:thin:@" + xout + ":1521:" + xservice + "_N1";
		} else if (xconn == 3) {
		  xcnt_string = "jdbc:oracle:thin:@" + xvpn + ":1521:" + xservice + "_N1";
		} else if (xconn == 4) {
		    xcnt_string = "jdbc:oracle:thin:@" + xovh + ":1521:" + xovhservice;
		} else if (xconn == 5){
			xcnt_string = "jdbc:oracle:thin:@" + xuatrac + ":1521:uatrac2"; 
		    }
		} 
}