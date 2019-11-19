import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://103.119.145.68:30000/login?from=%2F')

WebUI.setText(findTestObject('Object Repository/Page_Sign in Jenkins/input_Welcome to Jenkins_j_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in Jenkins/input_Welcome to Jenkins_j_password'), 'b87sCAFRcQNO46ao9Ovxcg==')

WebUI.click(findTestObject('Object Repository/Page_Sign in Jenkins/input_Welcome to Jenkins_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard Jenkins/b_log out'))

WebUI.closeBrowser()

