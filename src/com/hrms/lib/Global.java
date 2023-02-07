package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//MAINTAIN ALL RELATED TEST DATA AND OBJECTS OF WHOLE APPLICATION
	//**********test data
	//DT     var       vv
	public WebDriver driver;
	public String url="http://183.82.103.245/nareshit/login.php";
	public String username="nareshit";
    public String password="nareshit";
    public String EFN="shaik";
    public String ELN="noor";
   // ................
    // test data
    public String txt_username="txtUserName";
    public String txt_password="txtPassword";
    public String btn_login="Submit";
    public String link_logout="Logout";
    public String frame_empinfo="rightMenu";
    public String btn_Add="//input[@value='Add']";
    public String txt_EFN="txtEmpFirstName";
    public String txt_ELN="txtEmpLastName";
    public String btn_save="btnEdit";
}
