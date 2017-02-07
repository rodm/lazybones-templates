package example.teamcity;

import jetbrains.buildServer.serverSide.BuildServerAdapter;
import jetbrains.buildServer.serverSide.SBuildServer;
import jetbrains.buildServer.web.openapi.PluginDescriptor;
import org.apache.log4j.Logger;

public class ExampleServerPlugin extends BuildServerAdapter {

    private static Logger logger = Logger.getLogger("jetbrains.buildServer.SERVER");

    private final SBuildServer server;

    private final PluginDescriptor descriptor;

    public ExampleServerPlugin(SBuildServer server, PluginDescriptor descriptor) {
        this.server = server;
        this.descriptor = descriptor;
    }

    public void register() {
        server.addListener(this);
        logger.info(String.format("Plugin: %s (version: %s) registered", descriptor.getPluginName(), descriptor.getPluginVersion()));
    }
}
