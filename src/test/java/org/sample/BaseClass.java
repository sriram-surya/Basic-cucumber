package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLanuch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	public static void lanuchUrl(String url) {
		driver.get(url);
	}

	public static void getTitle() {
		String t = driver.getTitle();
		System.out.println("Title;" + t);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl;" + currentUrl);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void close() {
		driver.close();
	}

	public static void passValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void webelementClick(WebElement element) {
		element.click();
	}

	public static void takeScreenshot(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\sha\\eclipse-workspace 2\\Cucumber\\Screenshot" + fileName + ".png");
		FileUtils.copyFile(src, des);
	}

	public static Actions a;

	public static void mousehover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void clickaction (WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}

	public static void drageandDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void keyUp(CharSequence Element) {
		Actions a = new Actions(driver);
		a.keyUp(Element).perform();
	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void contextClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static Alert a1;

	public static void acceptAlert() {
		Alert a1 = driver.switchTo().alert();
		a1.accept();
	}

	public static void dismissAlert() {
		Alert a1 = driver.switchTo().alert();
		a1.dismiss();
	}

	public static void gettextAlert() {
		Alert a1 = driver.switchTo().alert();
		a1.getText();
	}

	public static void sendKeysAlert(String value) {
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys(value);
	}

	public static JavascriptExecutor js;

	public static void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollUP(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static String readcellValue(String sheet,int row, int cell) throws IOException {
		File f = new File("C:\\Users\\sha\\eclipse-workspace 2\\FrameWork\\excel\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet s = w.getSheet(sheet);

		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		int cellType = c.getCellType();
		String value;
		if (cellType == 1) {
			value = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {
			Date format = c.getDateCellValue();
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			value = df.format(format);
		}

		else {
			double numcell = c.getNumericCellValue();
			long l = (long) numcell;
			value = String.valueOf(l);

		}
		System.out.println(value);
		return value;

	}
	private void toFindTheCountofRowandCell(String sheet,int row, int cell) throws IOException {
		File f = new File("C:\\Users\\sha\\eclipse-workspace 2\\FrameWork\\excel\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet s = w.getSheet("Courses");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		

		 
	}

}