package jobBuilder;

import java.util.ArrayList;
import java.util.List;

public class IndeedJob {

    private List<String> jobTitle = new ArrayList<>();
    private List<String> jobCompanyName = new ArrayList<>();
    private List<String> jobLocation = new ArrayList<>();

    public void addTitle(String titulos) {
        jobTitle.add(titulos);
    }

    public void addCompanyName(String nomeEmpresa) {
        jobCompanyName.add(nomeEmpresa);
    }

    public void addLocation(String localizacao) {
        jobLocation.add(localizacao);
    }

    public List<String> getJobCompanyName() {
        return jobCompanyName;
    }

    public List<String> getJobLocation() {
        return jobLocation;
    }

    public List<String> getJobTitle() {
        return jobTitle;
    }
}
