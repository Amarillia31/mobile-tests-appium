package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/local.properties")

public interface LocalConfig extends Config {

    String appActivity();
    String appPackage();
    String platformVersion();
    String deviceName();
    String platformName();
    String urlLocal();
}
