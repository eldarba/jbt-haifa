package com.eldar.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.eldar.aopdemo")
@EnableAspectJAutoProxy // AOP support
public class MyConfig {

}
