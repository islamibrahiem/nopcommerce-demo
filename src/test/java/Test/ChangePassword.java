package Test;

import Pages.MyAccount;

public class ChangePassword extends TestBase {

	MyAccount myAccountObject;
	MyAccountTest myAccountTestObject;

	public void UserChangePassword() throws InterruptedException {

		myAccountObject = new MyAccount(driver);
		MyAccount.changeThePassword(myAccountTestObject.oldpassword_MyAccount,
				myAccountTestObject.newPassword_MyAccount, myAccountTestObject.confirmnewPassword_MyAccount);
	}
}
