package glsid.salaheddine.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogAspect {
    private long t1,t2;
    private Logger logger=Logger.getLogger(LogAspect.class.getName());

    public LogAspect() throws Exception{
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(false);
    }
    @Around("@annotation(MyLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        t1=System.currentTimeMillis();
        logger.info("before "+ joinPoint.getSignature());
        Object object=joinPoint.proceed();
        logger.info("after "+ joinPoint.getSignature());
        t2=System.currentTimeMillis();
        logger.info("Duration : "+ (t2-t1)+"mss");
        return object;
    }

}