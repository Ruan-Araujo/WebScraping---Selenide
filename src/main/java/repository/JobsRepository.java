package repository;

import jobBuilder.IndeedJob;

import java.io.*;
import java.util.List;

public class JobsRepository {

    private final String JOBS_PATH = "/home/tecmobile/Documents/ProjetoWebScraping/src/main/resources/jobs.csv";
    private IndeedJob job;

    public JobsRepository(IndeedJob indeedJob) {
        this.job = indeedJob;
    }

    public Thread threadEscreveArquivo = new Thread(() -> {

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new OutputStreamWriter(
                                     new FileOutputStream(JOBS_PATH, true)))){

            bw.append("JobTitle\n");
            job.getJobTitle().forEach(text -> {
                try {
                    bw.append(text);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bw.newLine();
            bw.append("CompanyName\n");
            job.getJobCompanyName().forEach(text -> {
                try {
                    bw.append(text);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bw.newLine();
            bw.append("JobLocation\n");
            job.getJobLocation().forEach(text -> {
                try {
                    bw.append(text);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    });

}
