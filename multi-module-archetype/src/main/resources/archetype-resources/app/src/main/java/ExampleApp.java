#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.tccc.kos.core.service.app.BaseAppConfig;
import com.tccc.kos.core.service.app.SystemApplication;

public class ExampleApp extends SystemApplication<BaseAppConfig> {
    /**
     * Called when the application loads. Any beans that the application wants to create
     * that need to be autowired / configured, should be created here and added to the context.
     * When this method returns, all the beans in the context will be autowired and configured,
     * making them available for use in the {@code start()} method.
     */
    @Override
    public void load() {
    }

    /**
     * Called when the application is started. If this application had any
     * services, controllers or other beans to add to the application {@code BeanContext}
     * then we would create these in {@code load()}. This would allow kOS to autowire,
     * initialize and configure the beans before {@code start()} is called.
     */
    @Override
    public void start() throws Exception {
    }

    /**
     * Called when the application is fully started and ready for use. While {@code start()} is
     * responsible for installing hardware, configuring VFS and other initialization steps, kOS
     * will prevent any endpoint or VFS access to the application until {@code start()} returns.
     * Once all application services are fully available, {@code started()} is called to notify
     * the application that it is fully available and running.
     */
    @Override
    public void started() throws Exception {
    }
}
