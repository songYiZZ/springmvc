package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass()); //lombok이 제공하는 Slf4j가 알아서 해준다.

    @RequestMapping("/log-test")
    public String logTest(){

        String name = "Spring";
        System.out.println("name = " + name);
        log.trace("trace log{}",name);
        log.debug("debug log{}",name);
        log.info("info log{}",name);
        log.warn("warn log{}",name);
        log.error("error log = {}", name);
        return "ok";
    }
}
