package packageOne;

//public class DatabaseTesting {
//
//}

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DatabaseTesting {

	@Test
public void jdbcconection() throws SQLException, ClassNotFoundException {

// TODO Auto-generated method stub

String host="localhost";

String port= "3306";

Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/demo", "root", "root"); //1st "root" is username and 2nd "root" is the password

Statement s=con.createStatement(); //Consider it as route

ResultSet rs=s.executeQuery("select * from credentials where scenario ='rewardscard'");  // Consider it as vehicle

while(rs.next())

{

WebDriver driver= new FirefoxDriver();

driver.get("https://login.salesforce.com");

driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));

driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));

}

}

}
