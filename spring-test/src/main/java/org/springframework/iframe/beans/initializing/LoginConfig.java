package org.springframework.iframe.beans.initializing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author songsy
 * @date 2020/8/11 16:29
 */
@Configuration
public class LoginConfig {

    @Bean(initMethod = "init")
    public UserBean userBean () {
        return new UserBean();
    }

    @Bean
    public PostConstructBean postConstructBean() {
        return new PostConstructBean();
    }

}
