package com.ulife.platform.utils

import org.apache.commons.lang3.Validate
import org.slf4j.LoggerFactory
import org.springframework.beans.BeansException
import org.springframework.beans.factory.DisposableBean
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service

/**
 * Created by Rocky on 9/13/16.
 */
@Service
@Lazy(false)
class SpringContextHolder implements ApplicationContextAware,DisposableBean{

    static def applicationContext = null
    static def logger = LoggerFactory.getLogger(SpringContextHolder)

    @Override
    void destroy() throws Exception {
        SpringContextHolder.clearHolder();
    }

    @SuppressWarnings("unchecked")
    def static <T> T getBean(String name) {
        assertContextInjected();
        return (T) applicationContext.getBean(name)
    }

    def static <T> T getBean(Class<T> clazz){
        assertContextInjected()
        return applicationContext.getBean(clazz)
    }

    @Override
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        if (SpringContextHolder.applicationContext != null){
            logger.info("SpringContextHolder中的ApplicationContext被覆盖, 原有ApplicationContext为:" + SpringContextHolder.applicationContext);
        }

        SpringContextHolder.applicationContext = applicationContext
    }

    static void clearHolder() {
        if (logger.isDebugEnabled()){
            logger.debug("清除SpringContextHolder中的ApplicationContext:" + applicationContext);
        }
        applicationContext = null;
    }

    static void assertContextInjected() {
        Validate.validState(applicationContext != null, "applicaitonContext属性未注入, 请在applicationContext.xml中定义SpringContextHolder.");
    }
}
