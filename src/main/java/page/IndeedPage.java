package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class IndeedPage {

    private SelenideElement qualVaga = $("#text-input-what"),
                            qualLugar = $(By.name("l")),
                            btnBuscar = $(".yosegi-InlineWhatWhere-primaryButton"),

                            btnGoogle = $(".google-Only-Modal-Upper-Row > button"),
                            btnAceitarCookie = $("#onetrust-accept-btn-handler"),
                                    btnFecharModal = $("#popover-x > button"),
                            modal = $("#popover-foreground");

    private final ElementsCollection pagination = $$(".pn");
    public SelenideElement getBtnFecharModal() {
        return btnFecharModal;
    }

    public SelenideElement getBtnGoogle() {
        return btnGoogle;
    }

    public SelenideElement getModal() {
        return modal;
    }

    public SelenideElement getBtnAceitarCookie() {
        return btnAceitarCookie;
    }

    public ElementsCollection getPagination() {
        return pagination;
    }

    public SelenideElement getQualVaga() {
        return qualVaga;
    }

    public SelenideElement getQualLugar() {
        return qualLugar;
    }

    public SelenideElement getBtnBuscar() {
        return btnBuscar;
    }


}
