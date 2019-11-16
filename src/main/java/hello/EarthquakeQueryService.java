package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EarthquakeQueryService {

    private Logger logger = LoggerFactory.getLogger(EarthquakeQueryService.class);

    public String getJSON(int distance, int minmag) {
        String fakeJson = "{ \"key\": \"value\" }";
        String json = fakeJson;
        logger.info("json=" + json);
        return json;
    }

} 