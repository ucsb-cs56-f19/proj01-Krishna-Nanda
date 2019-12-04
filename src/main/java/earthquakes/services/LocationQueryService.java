package earthquakes.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class  LocationQueryService {

    private Logger logger = LoggerFactory.getLogger(LocationQueryService.class);

    public String getJSON(String distance) {
        String fakeJson = "{ \"key\": \"value\" }";
        String json = fakeJson;
        logger.info("json=" + json);
        return json;
    }

} 