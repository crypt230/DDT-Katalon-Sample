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

String firstName = firstName

String lastName = lastName

WebUI.setText(findTestObject('Page_DEMOQA/Positive/input_Name_firstName'), firstName)

WebUI.setText(findTestObject('Page_DEMOQA/Positive/input_Name_lastName'), lastName)

String fullName = (firstName + ' ') + lastName

String expectedEmail = email

String expectedGender = 'Male' // Karena kamu pilih Male

String expectedMobile = mobile

String expectedDOB = '19 July,2001' // format DEMOQA

String expectedSubject = 'Maths'

String expectedHobbies = 'Music'

String expectedAddress = address

String expectedStateCity = 'NCR Delhi'

WebUI.setText(findTestObject('Page_DEMOQA/Positive/input_Email_userEmail'), email)

WebUI.click(findTestObject('Page_DEMOQA/Positive/label_Male'))

WebUI.setText(findTestObject('Page_DEMOQA/Positive/input_userNumber'), mobile)

WebUI.click(findTestObject('Page_DEMOQA/Positive/input_DateofBirth'))

String cMonth = WebUI.getText(findTestObject('Page_DEMOQA/Positive/select_Month'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/select_Month'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/div_July'))

String cYears = WebUI.getText(findTestObject('Page_DEMOQA/Positive/select_Years'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/select_Years'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/div_2001'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/div_19'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/label_Music'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/valueSubject/body_Subject'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/valueSubject/input_Subjects'), 'a')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/valueSubject/div_Maths'))

//System.print((cMonth + '****') + cYears)
WebUI.uploadFile(findTestObject('Page_DEMOQA/Positive/input_uploadPicture'), Pict)

WebUI.click(findTestObject('Page_DEMOQA/Positive/textarea_Current Address'))

WebUI.setText(findTestObject('Page_DEMOQA/Positive/textarea_Current Address'), address)

WebUI.click(findTestObject('Page_DEMOQA/Positive/div_Select State'))

WebUI.click(findTestObject('Page_DEMOQA/state_Value/state_NCR'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/div_Select City'))

WebUI.click(findTestObject('Page_DEMOQA/state_Value/city_Delhi'))

WebUI.click(findTestObject('Page_DEMOQA/Positive/button_Submit'))

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_studentName'), fullName)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_studentEmail'), expectedEmail)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_gender'), expectedGender)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_mobile'), expectedMobile)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_dateOfBirth'), expectedDOB)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_subjects'), expectedSubject)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_hobbies'), expectedHobbies)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_address'), expectedAddress)

WebUI.verifyElementText(findTestObject('Page_DEMOQA/verifySubmit/value_stateAndCity'), expectedStateCity)

WebUI.click(findTestObject('Page_DEMOQA/Positive/button_Close'))

WebUI.closeBrowser()

