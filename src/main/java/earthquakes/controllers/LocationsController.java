package earthquakes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import java.util.HashMap;
import earthquakes.geojson.FeatureCollection;
import earthquakes.osm.Place;
import earthquakes.services.EarthquakeQueryService;
import earthquakes.searches.LocSearch;
import earthquakes.services.LocationQueryService;
import com.nimbusds.oauth2.sdk.client.ClientReadRequest;
import java.util.List;
import earthquakes.repositories.LocationRepository;
import earthquakes.entities.Location;

@Controller
public class LocationsController {
    private LocationRepository locationsrepo;

    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;
    @Autowired
    public LocationsController(LocationRepository l) {
        this.locationsrepo = l;   
    }

    @GetMapping("/locations/search")
    public String getLocationSearch(Model model, OAuth2AuthenticationToken oAuth2AuthenticationToken,
            LocSearch locSearch) {
                return "locations/search";
    }

    @GetMapping("/locations/results")
    public String getLocationResults(Model model, OAuth2AuthenticationToken oAuth2AuthenticationToken,
            LocSearch locSearch) {
                LocationQueryService e =
                new LocationQueryService();
        model.addAttribute("locSearch", locSearch);
        // TODO: Actually do the search here and add results to the model
        String json = e.getJSON(locSearch.getLocation());
        model.addAttribute("json", json);
        List<Place> place = Place.listFromJson(json);
        model.addAttribute("place", place);
        return "locations/results";
    }
    @GetMapping("/locations")
    public String index(Model model) {
        Iterable<Location> location = locationsrepo.findAll();
        model.addAttribute("location", location);
        return "locations/index";
}
}