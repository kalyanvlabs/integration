package hello;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
	
    @RequestMapping(value = "/ietest", produces = "text/plain", method = RequestMethod.POST)
    public String index(@RequestBody MyName myName) {
    	logger.info("Hi in rest controller!!!!");
        return myName.getName()+" Welcome!!";
    }
    
}
