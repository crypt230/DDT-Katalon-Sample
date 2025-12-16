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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Page_DEMOQA/Positive/input_Name_firstName'), firstName)

WebUI.setText(findTestObject('Page_DEMOQA/Positive/input_Email_userEmail'), email)

WebUI.click(findTestObject('Page_DEMOQA/Positive/label_Male'))

WebUI.setText(findTestObject('Page_DEMOQA/Positive/input_userNumber'), mobile)

WebUI.click(findTestObject('Page_DEMOQA/Positive/label_Music'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/valueSubject/body_Subject'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/valueSubject/input_Subjects'), 'a')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/valueSubject/div_Maths'))

WebUI.uploadFile(findTestObject('Page_DEMOQA/Positive/input_uploadPicture'), Pict)

WebUI.click(findTestObject('Page_DEMOQA/Positive/textarea_Current Address'))

WebUI.setText(findTestObject('Page_DEMOQA/Positive/textarea_Current Address'), address)

WebUI.click(findTestObject('Page_DEMOQA/Positive/div_Select State'))

WebUI.click(findTestObject('Page_DEMOQA/state_Value/state_NCR'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/div_Select City'))

WebUI.click(findTestObject('Page_DEMOQA/state_Value/city_Delhi'))

// Submit form
WebUI.click(findTestObject('Page_DEMOQA/Positive/button_Submit'))

// Cek lastName invalid
String lastNameBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/Positive/input_Name_lastName'), 'border-color')

assert lastNameBorder.contains('220, 53, 69') || lastNameBorder.contains('rgba(220, 53, 69')

// Cek firstName valid
String firstNameBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/Positive/input_Name_firstName'), 'border-color')

assert firstNameBorder.contains('40, 167, 69') || firstNameBorder.contains('rgba(40, 167, 69')

// Cek Email valid
String emailBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/Positive/input_Email_userEmail'), 'border-color')

assert emailBorder.contains('40, 167, 69') || emailBorder.contains('rgba(40, 167, 69')

// Cek gender valid
String genderBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/Positive/label_Male'), 'border-color')

assert genderBorder.contains('40, 167, 69') || genderBorder.contains('rgba(40, 167, 69')

// Cek mobile valid
String mobileBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/Positive/input_userNumber'), 'border-color')

assert mobileBorder.contains('40, 167, 69') || mobileBorder.contains('rgba(40, 167, 69')

// Cek Date Of Birth valid
String dateOfBirthBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/succed/succed_dateOfBirthInput'), 'border-color')

assert dateOfBirthBorder.contains('40, 167, 69') || dateOfBirthBorder.contains('rgba(40, 167, 69')

// Cek hobbies valid
String hobbiesBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/Positive/label_Music'), 'border-color')

assert hobbiesBorder.contains('40, 167, 69') || hobbiesBorder.contains('rgba(40, 167, 69')

// Cek address valid
String addressBorder = WebUI.getCSSValue(findTestObject('Page_DEMOQA/succed/succed_currentAddress'), 'border-color')

assert addressBorder.contains('40, 167, 69') || addressBorder.contains('rgba(40, 167, 69')

WebUI.closeBrowser()

