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



class OrgStructure {

	@Given("I want to login to OrangeHRM")
	def loginCredits() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
WebUI.setText(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input_Username_txtPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input_Password_Submit'))
	}

	@When("I want to navigate to Org Structure")
	def navigateJobOrgStructureTitle() {

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/a_Organization'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/a_Structure'))
	}

	@Then("I want to add make changes to org structure")
	def addOrgStructures() {
WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input_x_btnEdit'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/a_'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input__txtName'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input__btnSave'))

WebUI.setText(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input__txtName'), 'testA')

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/a_x'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dialogYes'))
	}

	@And("I want to exit orangeHRM")
	def exitWebsiteHrm() {
WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/a_Welcome Tran'))

WebUI.click(findTestObject('Object Repository/OrganisationStructure/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()
	}
}