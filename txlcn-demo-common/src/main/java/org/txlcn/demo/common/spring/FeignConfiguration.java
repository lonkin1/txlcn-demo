package org.txlcn.demo.common.spring;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * Date: 2019/09/25
 *
 * @author lonkin
 */
@ComponentScan
@Configuration
@EnableFeignClients
public class FeignConfiguration {
}
