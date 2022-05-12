import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class OrangeHRMLogin {

	@Given("I want to login and navigate to Job Titles")
	def loginCredentials() {

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
	}

	@When("I want to add Job Titles (.*) and (.*)")
	def navigateJobTitle(String title, String description) {

		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnAdd'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))
		WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__jobTitlejobTitle'),
				title)
		WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'),
				description)
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnAdd'))
		WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__jobTitlejobTitle'),
				title)
		WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'),
				description)
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnAdd'))
		WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__jobTitlejobTitle'),
				title)
		WebUI.setText(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/textarea_Job Description_jobTitlejobDescription'),
				description)
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input__btnSave'))
	}

	@Then("I delete the jobs created")
	def addJobTitles() {
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Description_chkSelectRow'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnDelete'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dia_9fc7db'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Automation Tester_chkSelectRow'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Content Specialist_chkSelectRow'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_Job Titles_btnDelete'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dia_9fc7db'))
	}

	@And("I want to exit")
	def exitWebsite() {
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/a_Welcome Rahul'))
		WebUI.click(findTestObject('Object Repository/Orange HRM Rep/Page_OrangeHRM/a_Logout'))
		WebUI.closeBrowser()
	}
}
