package com.test.micronaut;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class TestController {
    Logger logger= LoggerFactory.getLogger(TestController.class);
    ConfigProperties cfgPros=null;

    @Value("${app.name}")
    String appName;

    public TestController(ConfigProperties cfgPros){
        this.cfgPros=cfgPros;
    }
    @Get("welcome")
    public HttpResponse<ConfigProperties> welcome(){
        logger.info(appName);
        return HttpResponse.ok(cfgPros);
    }
}
