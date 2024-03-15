package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Banco {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/test/driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.bancolombia.com/");
        driver.manage().window().maximize();

        //Verificar menú y algunos botones de navegación

        driver.findElement(By.id("menu-necesidades")).click();
        driver.findElement(By.id("Para-los-niños")).click();

        // realizar click en el boton "Productos y Servicios"

        driver.findElement(By.id("menu-productos")).click();

        // dar click en botón "tarjetas de credito" al igual el botón de "filtrar y ordenar", selecionar el produco de TC "Avianca Lifemiles"

        driver.findElement(By.xpath("//*[@id=\"header-productos-tdc\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[6]/section/div[3]/div[2]/app-root/div/app-tabs-menu/app-filter-modal/section/div[1]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[6]/section/div[3]/div[2]/app-root/div/app-tabs-menu/app-filter-modal/section/div[2]/div/div[2]/div[2]/div[2]/label[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[6]/section/div[3]/div[2]/app-root/div/app-tabs-menu/app-filter-modal/section/div[2]/div/div[2]/div[3]/div/div/button[2]")).click();

        // hacer click sobre el producto para revisar el boton "caracteristicas"

        driver.findElement(By.xpath("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[6]/section/div[3]/div[2]/app-root/div/app-tabs-menu/app-filter-modal/app-cards-list/section/div/div/div/div/div/div[4]/a/button")).click();
        driver.findElement(By.id("btn-home-ayuda")).click();

        //driver.close();


    }
}