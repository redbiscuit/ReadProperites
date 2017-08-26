package com.bj.useOwn;

import org.aeonbits.owner.ConfigFactory;

/**
 * Created by JACKSON on 2017/8/26.
 */
public class ReadProperites {

    public static void main(String[] args) {
        ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
        System.out.println("Server " + cfg.hostname() + ":" + cfg.port() + " will run " + cfg.maxThreads());
    }
}
