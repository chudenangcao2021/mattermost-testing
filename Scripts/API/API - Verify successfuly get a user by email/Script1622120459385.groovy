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
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// login to get access token
'Get token'
loginResponse = WS.sendRequest(findTestObject('API/Login'))
String token = loginResponse.getHeaderField('Token')
System.out.println('Token: ' + token)

// include token in header
'Scope to a project'
RequestObject ScopeToProject = findTestObject('API/Get a user by email')

'Create new ArrayList'
ArrayList<TestObjectProperty> HTTPHeader = new ArrayList<TestObjectProperty>()

'Send token in HTTP header'
HTTPHeader.add(new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token))

'Set that token'
ScopeToProject.setHttpHeaderProperties(HTTPHeader)

// call api get a user by username
'Get response text'
response = WS.sendRequest(ScopeToProject)
System.out.println('Body content: ' + response.getResponseBodyContent())

// verify get successfuly
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'email', 'tttung468@gmail.com')