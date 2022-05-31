package page;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
public class JobsPage {
    private ElementsCollection jobTitle = $$(".jobTitle-color-purple > a > span");

    private ElementsCollection jobCompany = $$(".companyName");
    private ElementsCollection jobLocation = $$(".companyLocation");

    public ElementsCollection getJobCompany() {
        return jobCompany;
    }

    public ElementsCollection getJobLocation() {
        return jobLocation;
    }

    public ElementsCollection getJobTitle() {
        return jobTitle;
    }
}
