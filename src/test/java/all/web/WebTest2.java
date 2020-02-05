package all.web;

import config.WebBase;
import enums.Interaction;
import enums.Language;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class WebTest2 extends WebBase {

    @Test
    public void WebTest2(){
        page.home
                .selectLanguage(Language.ENGLISH);

        page.sideMenu
                .clickLink(Interaction.ABOUT_WIKIPEDIA)
                .clickLink(Interaction.COMMUNITY_PORTAL);

        assertThat(page.communityPortal.getFirstHeaderText())
                .isEqualTo("Wikipedia:Community portal");
    }
}
