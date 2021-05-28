import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.lang.Thread

WebUI.callTestCase(findTestCase('Test Cases/Common Test Cases/Login'),['Username':username,'Password':password])
TestObject object = findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_cxtuan_style--none sidebar-header-dropdown__icon')
Boolean bool = false
try {
 bool = WebUI.verifyElementPresent(object, 0)

}catch(Exception ex) {
	
} finally {
	if(bool && username.length()<10) {
		WebUI.click(object)
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Account Settings'))
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Display'))
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/div_Clock DisplayEdit'))
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/label_24-hour clock (example 1600)'))
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Save'))
		WebUI.click(findTestObject('Object Repository/IFObject/Page_TEST CHANNEL - TEAM NAME Mattermost/button_Close'))
		WebUI.closeBrowser()
	}
	else {
		WebUI.closeBrowser()
	}
}