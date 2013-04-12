package com.pardot.qpservice;

import com.pardot.qpservice.config.QpServiceConfiguration;
import com.pardot.qpservice.resources.QpEncodeResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public final class QpService extends Service<QpServiceConfiguration> {
        
    @Override
    public void initialize(Bootstrap<QpServiceConfiguration> bootstrap) {
        // set up any required state or warm caches here
        
    }

    @Override
    public void run(QpServiceConfiguration config, Environment env) throws Exception {
        env.addResource(new QpEncodeResource());
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        new QpService().run(args);
    }

}
