package kodillagoodpatterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WatcherFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* kodillagoodpatterns2.facade.api.OrderFacade.processOrder(..))" + "&&target(object)")
    public void logEvent(Object object) {
        LOGGER.info("Method from class:  " + object.getClass().getName());
    }
}
