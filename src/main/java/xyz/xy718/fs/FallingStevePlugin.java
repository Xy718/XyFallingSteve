package xyz.xy718.fs;

import com.google.inject.Inject;
import lombok.Getter;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "fs",
        name = "XyFallingSteve",
        description = "一个简单的控制掉落事件的插件",
        url = "https://xy718.xyz",
        authors = {
                "Xy718"
        }
)
public class FallingStevePlugin {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
