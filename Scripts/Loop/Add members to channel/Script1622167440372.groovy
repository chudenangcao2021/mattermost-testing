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
import java.util.Arrays as Arrays
import java.util.List as List

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Username') : 'nttuan', ('Password') : '12345678zZ@'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ChanelMember/Page_Channel to test add  remove members - TEAM NAME Mattermost/span_Channel to test add  remove members'))

List<String> usernames = Arrays.asList('cxtuan', 'nguyenvana', 'nguyenvanb')

for (int i = 0; i < usernames.size(); i++) {
    String username = usernames.get(i)

    WebUI.click(findTestObject('Object Repository/ChanelMember/Page_Channel to test add  remove members - _a376a4/span_Channel to test add  remove members'))

    WebUI.click(findTestObject('Object Repository/ChanelMember/Page_Channel to test add  remove members - _a376a4/span_Add Members'))

    WebUI.click(findTestObject('ChanelMember/Page_Channel to test add  remove members - _a376a4/div_Search for people'))

    WebUI.setText(findTestObject('Object Repository/ChanelMember/Page_Channel to test add  remove members - _a376a4/input_Search for people_react-select-2-input'), 
        username)

    try {
        WebUI.verifyTextNotPresent('No results found matching', false)

        WebUI.sendKeys(findTestObject('ChanelMember/Page_Channel to test add  remove members - _a376a4/div_Search for people'), 
            Keys.chord(Keys.ENTER))

        WebUI.click(findTestObject('Object Repository/ChanelMember/Page_Channel to test add  remove members - _a376a4/button_Add'))
    }
    catch (Exception e) {
        WebUI.click(findTestObject('ChanelMember/Page_Channel to test add  remove members - TEAM NAME Mattermost/div_CloseAdd search'))
    } 
}

WebUI.closeBrowser()

