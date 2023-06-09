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

WebUI.callTestCase(findTestCase('TSLog 01 Verifikasi menu login/Positive/TCLog - 01 User menginput username dan password valid'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Appoinment/select_Hospital'), 'Seoul CURA Healthcare Center', false)

WebUI.click(findTestObject('Appoinment/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Appoinment/label_Medicare'))

WebUI.click(findTestObject('Appoinment/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Appoinment/th_April 2023'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Appoinment/span_Nov'))

WebUI.click(findTestObject('Object Repository/Appoinment/td_29'))

WebUI.setText(findTestObject('Object Repository/Appoinment/textarea_Comment_comment'), 'I wanna checkup')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Appoinment/button_Book Appointment'))

WebUI.takeFullPageScreenshot()

