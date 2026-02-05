package org.example.componentscan.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration // previously xml using bean tags in (filename.xml)ioc container
// now using annotation
@ComponentScan(basePackages = "org.example.componentscan.annotations")//previously we used xml context tag and component scan attribute in (filename.xml)ioc container
// now using annotation in new class to scan components
public class AppConfig {
}
