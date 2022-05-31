package indeed;

import jobBuilder.IndeedJob;
import page.IndeedPage;
import page.JobsPage;
import repository.JobsRepository;
import java.io.IOException;
import java.util.Scanner;

import static com.codeborne.selenide.Selenide.*;


public class WebScraping {

    public static void main(String[] args) throws InterruptedException, IOException {

        IndeedPage indeedPage = new IndeedPage();
        open("https://br.indeed.com/");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Você está procurando qual vaga? ");
        String qualVaga = myScanner.nextLine();
        System.out.println("Em qual lugar? ");
        String qualLugar = myScanner.nextLine();
        indeedPage.getBtnAceitarCookie().click();
        indeedPage.getQualVaga().setValue(qualVaga);
        indeedPage.getQualLugar().setValue(qualLugar);
        indeedPage.getBtnBuscar().click();

        int pgSize = indeedPage.getPagination().size();
        JobsPage jobsPage = new JobsPage();
        IndeedJob indeedJob = new IndeedJob();
        System.out.println(pgSize);

        for (int j = 0; j <= pgSize; j++) {

            Thread.sleep(500);
            indeedPage.getPagination().get(j).click();

            Thread.sleep(1500);
            if (indeedPage.getModal().isDisplayed()) {
                indeedPage.getBtnFecharModal().click();
            }

            Thread.sleep(1000);
            jobsPage.getJobTitle().texts().forEach(indeedJob::addTitle);
            jobsPage.getJobCompany().texts().forEach(indeedJob::addCompanyName);
            jobsPage.getJobLocation().texts().forEach(indeedJob::addLocation);
        }
        JobsRepository repository = new JobsRepository(indeedJob);
        repository.threadEscreveArquivo.start();
        System.out.println(Thread.activeCount());
    }
}
