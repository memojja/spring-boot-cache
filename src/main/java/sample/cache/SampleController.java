package sample.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    ComplexClient complexClient;

    @RequestMapping("/country")
    public Country geCountry() {
        return complexClient.retrieveCountry();
    }

    @RequestMapping("/overload")
    public void overload() {
        complexClient.overload();
    }
}


