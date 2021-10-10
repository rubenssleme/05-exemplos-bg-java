package br.laramara.ti.sisweb.utilitarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils {
	private static final int TEMPO_ESPERA_EM_SEGUNDOS = 30;

	public static boolean possuiTagComConteudo(WebDriver driver, String tag, String conteudo) {
		boolean resultado = false;

		for (WebElement elemento : obterElementosPorTag(driver, tag)) {
			if (obterTexto(elemento).contains(conteudo)) {
				resultado = true;
			}

		}

		return resultado;
	}

	private static List<WebElement> obterElementosPor(WebDriver driver, By by) {
		try {
			return driver.findElements(by);
		} catch (StaleElementReferenceException e) {
			return obterElementosPor(driver, by);
		}
	}

	public static List<WebElement> obterElementosPorXpath(WebDriver driver, String xpath) {
		return obterElementosPor(driver, By.xpath(xpath));
	}

	public static List<WebElement> obterElementosPorTag(WebDriver driver, String tag) {
		return obterElementosPor(driver, By.tagName(tag));
	}

	private static List<WebElement> obterElementosPor(WebElement elemento, By by) {
		try {
			return elemento.findElements(by);
		} catch (StaleElementReferenceException e) {
			return obterElementosPor(elemento, by);
		}
	}
	
	public static List<WebElement> obterElementosPorTag(WebElement elemento, String tag) {
		return obterElementosPor(elemento, By.tagName(tag));
	}
	
	private static WebElement obterElementoPor(WebDriver driver, By by) {
		try {
			return driver.findElement(by);
		} catch (StaleElementReferenceException e) {
			return obterElementoPor(driver, by);
		}
	}

	public static WebElement obterElementoPorXpath(WebDriver driver, String xpath) {
		return obterElementoPor(driver, By.xpath(xpath));
	}

	public static WebElement obterElementoPorId(WebDriver driver, String id) {
		return obterElementoPor(driver, By.id(id));
	}

	public static void adicionarTexto(WebElement elemento, String texto) {
		elemento.clear();
		elemento.sendKeys(texto);
	}

	public static void clicarEEsperar(WebElement elemento) {
		elemento.click();
		esperar(550);
	}

	public static void clicar(WebElement elemento) {
		elemento.click();
	}

	public static void esperar(long milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void habilitarJavascript(WebDriver driver, boolean ativado) {
		if (driver instanceof HtmlUnitDriver) {
			((HtmlUnitDriver) driver).setJavascriptEnabled(ativado);
		}
	}

	public static Select obterMenu(WebElement elemento) {
		return new Select(elemento);
	}

	public static void selecionarValor(WebDriver driver, WebElement menu, String valor) {
		if (driver instanceof FirefoxDriver) {
			((JavascriptExecutor) driver)
					.executeScript("arguments[0].value='" + valor + "';" + "return arguments[0].value;", menu);
		} else {
			new Select(menu).selectByValue(valor);
		}
	}

	public static List<WebElement> obterOpcoes(WebElement elemento) {
		return obterMenu(elemento).getOptions();
	}

	public static String obterTexto(WebElement elemento) {
		try {
			return elemento.getText();
		} catch (StaleElementReferenceException e) {
			return obterTexto(elemento);
		}
	}

	public static String obterTextoNoAtributo(WebElement elemento, String atributo) {
		try {
			return elemento.getAttribute(atributo);
		} catch (StaleElementReferenceException e) {
			return obterTextoNoAtributo(elemento, atributo);
		}
	}
	
	private static WebElement esperarElementoAparecer(WebDriver driver, By by) {
		return new WebDriverWait(driver, TEMPO_ESPERA_EM_SEGUNDOS)
				.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(by)));
	}

	private static WebElement esperarElementoAparecer(WebDriver driver, WebElement elemento) {
		return new WebDriverWait(driver, TEMPO_ESPERA_EM_SEGUNDOS)
				.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(elemento)));
	}

	public static WebElement esperarElementoAparecerPorElemento(WebDriver driver, WebElement elemento) {
		return esperarElementoAparecer(driver, elemento);
	}

	public static WebElement esperarElementoAparecerPorId(WebDriver driver, String id) {
		return esperarElementoAparecer(driver, By.id(id));
	}

	public static WebElement esperarElementoAparecerPorXpath(WebDriver driver, String xpath) {
		return esperarElementoAparecer(driver, By.xpath(xpath));
	}

	public static boolean esperarElementoTerTexto(WebDriver driver, String xpath, String texto) {
		boolean possui = false;
		while (!possui) {
			WebElement elementoObtido = esperarElementoAparecerPorXpath(driver, xpath);
			String textoObtido = obterTexto(elementoObtido);

			possui = textoObtido.equals(texto);
		}

		return possui;
	}

	public static boolean esperarElementoTerTexto(WebDriver driver, WebElement elemento, String texto) {
		boolean possui = false;
		while (!possui) {
			WebElement elementoObtido = esperarElementoAparecerPorElemento(driver, elemento);
			String textoObtido = obterTexto(elementoObtido);

			possui = textoObtido.equals(texto);
		}

		return possui;
	}

	public static boolean esperarElementoTerValorNoAtributo(WebDriver driver, WebElement elemento, String atributo,
			String valorAtributo) {
		boolean possui = false;
		while (!possui) {
			String elementoObtido = elemento.getAttribute(atributo);

			possui = elementoObtido.equals(valorAtributo);
		}

		return possui;
	}
	
	public static boolean esperarTituloConterTexto(WebDriver driver, String titulo) {
		return new WebDriverWait(driver, TEMPO_ESPERA_EM_SEGUNDOS).pollingEvery(1, TimeUnit.SECONDS).until(ExpectedConditions.titleIs(titulo));
	}
}