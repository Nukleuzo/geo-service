package netology.geo;

import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

class GeoServiceTest {
    @org.junit.jupiter.api.Test
    void testGeoServiceUSA() {
        ru.netology.geo.GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = new Location("New York", Country.USA, null, 0);
        Location locationGeo = geoService.byIp("96.44.183.149");
        Assertions.assertEquals(location.getCity(), locationGeo.getCity());
    }
    @org.junit.jupiter.api.Test
    void testGeoServiceRussia() {
        ru.netology.geo.GeoServiceImpl geoService = new GeoServiceImpl();
        Location location = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Location locationGeo = geoService.byIp("172.0.32.11");
        Assertions.assertEquals(location.getCity(), locationGeo.getCity());
    }




}
