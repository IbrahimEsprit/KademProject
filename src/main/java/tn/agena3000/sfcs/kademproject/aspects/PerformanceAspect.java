package tn.agena3000.sfcs.kademproject.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {

    @Around("execution(* tn.agena3000.sfcs.kademproject.services.IEtudiantServicesImp.*(..))")
    public Object executionTime(ProceedingJoinPoint pjp) throws Throwable {
        long t1 = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long executionTime = System.currentTimeMillis() - t1;

        String methodName = pjp.getSignature().getName();

        log.info("The runtime of the method ( "+ methodName +") = " + executionTime + "milliseconds. ");
        return obj;
    }
}
