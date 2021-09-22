package com.pageobjectmodel.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {
 public ActiPage(WebDriver oBrowser)
 {
	 PageFactory.initElements(oBrowser, this);
 }
 
//User Name Text Field
 private WebElement username;
 public WebElement getUserName()
 {
	return username;
 }
 
//Password Text Field
 
 private WebElement pwd;
 public WebElement getPassword()
 {
	 return pwd;
 }
 
 // //Login button Field
 @FindBy(xpath="//*[@id=\'loginButton\']/div")
 private WebElement oLogin;
 public WebElement getLoginButton()
 {
	 return oLogin;
 }
 
//Fly Out Window Field
 private WebElement gettingStartedShortcutsPanelId;
 public WebElement getFlyoutWin()
 {
	 return gettingStartedShortcutsPanelId;
 }
 
 // CreateUser
 @FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
 private WebElement oUsers;
 public WebElement getUsers() 
 {
	return  oUsers;
 }
 // AddUser
 @FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
 private WebElement oAddUser;
 public WebElement getAddUser()
 {
	 return oAddUser;
 }
 
 //User Details
 private WebElement userDataLightBox_firstNameField;
 public WebElement getFirstname()
 {
	return  userDataLightBox_firstNameField;
 }
 
 private WebElement userDataLightBox_lastNameField;
 public WebElement getLastName()
 {
	return  userDataLightBox_lastNameField;
 }
 
 private WebElement userDataLightBox_emailField;
 public WebElement getmailid()
 {
	return  userDataLightBox_emailField;                    
 }
 
 private WebElement userDataLightBox_usernameField;
 public WebElement getLogname()
 {
	return  userDataLightBox_usernameField;                    
 }
 
 private WebElement userDataLightBox_passwordField;
 public WebElement getPwd()
 {
	return  userDataLightBox_passwordField;                    
 }
 
 private WebElement userDataLightBox_passwordCopyField;
 public WebElement getRePwd()
 {
	return  userDataLightBox_passwordCopyField;                    
 }
 
 
 @FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
 private WebElement oCreate;
 public WebElement getNewuser()
 {
	return  oCreate;                    
 }
 
 
 // Modify User
 @FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
 private WebElement oModify;
 public WebElement getModify()
 {
	 return oModify;
 }
 
 @FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
 private WebElement oSaveChanges;
 public WebElement getSaveChange() 
 {
	 return oSaveChanges;
 }

 

 //Delete User

 @FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
 private WebElement oclick;
 public WebElement getclick()
 {
	 return oclick;
 }

 private WebElement userDataLightBox_deleteBtn;
 public WebElement getdelete()
 {
	return  userDataLightBox_deleteBtn;                    
 }
 
 //Create Task
 @FindBy(xpath="//tbody/tr[1]/td[3]/a[@class='content tasks']")
 private WebElement oTask;
 public WebElement getTask()
 {
	 return oTask;
 }
 
 @FindBy(xpath="//*[@id='taskListBlock']/div/div/div[3]/div")
 private WebElement oAddCus;
 public WebElement getNewCus()
 {
	 return oAddCus;
 }
 
 @FindBy(xpath="//*[@class='item createNewTask ellipsis']")
 private WebElement oCreateCus;
 public WebElement getCreateCus()
 {
	 return oCreateCus;
 }
 
 @FindBy(xpath="//*[@id=\'ext-gen23\']")
 private WebElement  oSelNewCus;
 public WebElement getSelNewCust()
 {
	 return oSelNewCus;
 }
 
 @FindBy(xpath="//*[@id=\'ext-gen159\']")
 private WebElement oSelNewCust1;
 public WebElement getSelNewCust1()
 {
	 return oSelNewCust1;
 }
 
 @FindBy(xpath="//*[@id='createTasksPopup_newCustomer']")
 private WebElement EntCstNme;
 public WebElement getCstNme()
 {
	 return EntCstNme;
 }
 
 @FindBy(xpath="//*[@id='createTasksPopup_newProject']")
 private WebElement ProjNme;
 public WebElement getProjNme()
 {
	 return ProjNme;
 }
 
 @FindBy(xpath="//tbody/tr[1]/td/input[@class='inputFieldWithPlaceholder']")
 private WebElement TaskNme;
 public WebElement getTaskNme()
 {
	 return TaskNme;
 }
 @FindBy(xpath="//*[@id='createTasksPopup_commitBtn']")
 private WebElement CreateTsk;
 public WebElement getCreateTsk()
 {
	 return CreateTsk;
 }
 
 
 //Create Customer
 
 @FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div/div[2]/div[@class='addNewButton']")
 private WebElement CreateCustomer;
 public WebElement getCreateCustomer()
 {
	 return CreateCustomer;
 }
 
 @FindBy(xpath="/html/body/div[14]/div[1]")
 private WebElement AddCust;
 public WebElement getAddCust()
 {
	 return AddCust;
 }

//*[@id="customerLightBox_nameField"]
 @FindBy(xpath="//*[@id='customerLightBox_nameField']")
 private WebElement AddCustNme;
 public WebElement getAddCustNme()
 {
	 return AddCustNme;
			
 }
 
 //Delete Customer
 
 @FindBy(xpath="//*[@*='node customerNode selected']")
 private WebElement DeleteSetopt;
 public WebElement getDeleteSetopt()
 {
	 return DeleteSetopt;
 }
 
 @FindBy(xpath="//*[@*='editButton available']")
 private WebElement SetOpt;
 public WebElement getSetOpt()
 {
	 return SetOpt;
 }
 @FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
 private WebElement CreateCust;
 public WebElement getCreateCust()
 {
	 return CreateCust;
 }
//Logout Link Field
 private WebElement logoutLink;
 public WebElement getLogout()
 {
	 return logoutLink;
 }
 
}
