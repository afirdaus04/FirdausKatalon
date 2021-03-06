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

WebUI.callTestCase(findTestCase('Common/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Job'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Job Titles'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Titles_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'), 'Atest')

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), 
    'Atestdesc')

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Titles_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'), 'Atest')

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__btnSave'))

WebUI.doubleClick(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'))

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'), 'ABtest')

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), 
    'abtestdesc')

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Titles_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'), 'ABCtest')

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), 
    'abctestdesc')

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input_Job Titles_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__jobTitlejobTitle'), 'ABCDtest')

WebUI.setText(findTestObject('Object Repository/Job Title/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'), 
    'ABCDtestdesc')

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Welcome Hoang'))

WebUI.click(findTestObject('Object Repository/Job Title/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

