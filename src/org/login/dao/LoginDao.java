package org.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.login.entity.*;

public class LoginDao {
	public static Login LoginQuery(String uname,String pwd) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlist?serverTimezone=GMT%2B8&useSSL=false&autoReconnect=true", "root", "1025338403");
			String sql="select * from user where username=? and passwd=?";
			Login login=new Login();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,uname);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				login=new Login(rs.getInt("id"),rs.getString("username"),rs.getString("passwd"),rs.getString("name"),rs.getInt("age"),rs.getString("address"));
				return login;
			}else {
				return null;
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void RegisterAddUser(Login login) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlist?serverTimezone=GMT%2B8&useSSL=false&autoReconnect=true", "root", "1025338403");
			String sql=" insert into user (id,username,passwd) values(?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,login.getId());
			ps.setString(2, login.getUsername());
			ps.setString(3, login.getPasswd());
			ps.executeUpdate();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
