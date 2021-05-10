package xyz.xy718.fs;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.EventManager;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.GameReloadEvent;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import xyz.xy718.fs.event.PlayerDropEvent;

@Plugin(
id = FallingStevePlugin.PLUGIN_ID,
name = FallingStevePlugin.NAME,
description = FallingStevePlugin.DESCRIPTION
)
public class FallingStevePlugin {
    @Getter public static final String PLUGIN_ID = "xyfs";
    @Getter public static final String NAME = "XyFallingSteve";
    @Getter public static final String DESCRIPTION = "一个简单的控制玩家摔落事件的插件";

    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    @Listener
    public void onGameStarting(GameInitializationEvent event) {
        LOGGER.info("配置加载完成,{}开始注册事件与指令~",NAME);
        Sponge.getEventManager().registerListeners(this,new PlayerDropEvent());
    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        LOGGER.info("XYFS STARTED");
    }

    @Listener
    public void onPluginsReload(GameReloadEvent event) {
        LOGGER.warn("{}重新加载~",NAME);
    }
}
