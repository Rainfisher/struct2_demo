package com.obsidian.library;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.google.inject.struts2.Struts2GuicePluginModule;
import javax.inject.Singleton;
import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

/**
 *
 * @author Alex Chou <xi.zhou at obsidian>
 */
public class GuiceListener extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
                new Struts2GuicePluginModule(),
                new ServletModule() {
                    @Override
                    protected void configureServlets() {
                        // Struts 2 setup
                        bind(StrutsPrepareAndExecuteFilter.class).in(Singleton.class);
                        filter("/*").through(StrutsPrepareAndExecuteFilter.class);
                        // Our app-specific code
                    }
                }
        );
    }

}
