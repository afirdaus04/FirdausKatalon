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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Username_txtPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/a_Job'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/a_Job Titles'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnAdd'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))

WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__jobTitlejobTitle'), 
    'ATester')

WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), 
    'Atester Description')

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__jobTitlejobTitle'), 
    'BTester')

WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), 
    'BTester Description')

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__jobTitlejobTitle'), 
    'Ctester')

WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), 
    'Ctester Description')

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Description_chkSelectRow'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnDelete'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dia_9fc7db'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Automation Tester_chkSelectRow'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Content Specialist_chkSelectRow'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnDelete'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dia_9fc7db'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/a_Welcome Rahul'))

WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

