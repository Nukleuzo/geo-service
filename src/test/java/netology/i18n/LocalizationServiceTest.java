package netology.i18n;

import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

class LocalizationServiceTest {
    @org.junit.jupiter.api.Test
    void testLocalizationServiceUSA() {
        ru.netology.i18n.LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        Country country = Country.USA;
        Assertions.assertEquals("Welcome", localizationService.locale(country));
    }
    @org.junit.jupiter.api.Test
    void testLocalizationServiceRussia() {
        ru.netology.i18n.LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        Country country = Country.RUSSIA;
        Assertions.assertEquals("Добро пожаловать", localizationService.locale(country));
    }


}
