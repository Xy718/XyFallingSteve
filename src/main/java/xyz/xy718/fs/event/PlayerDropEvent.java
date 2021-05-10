package xyz.xy718.fs.event;

import org.slf4j.Logger;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.cause.entity.damage.DamageTypes;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.entity.DamageEntityEvent;
import org.spongepowered.api.event.filter.Getter;
import org.spongepowered.api.event.filter.cause.Root;
import xyz.xy718.fs.FallingStevePlugin;

import java.util.Collections;

/**
 * 有关玩家掉落地面受到伤害的事件
 * @author Xy718
 * @date 2021-05-05 19:56:19
 */
public class PlayerDropEvent {

    
    private static final Logger LOGGER = FallingStevePlugin.LOGGER;
    
    @Listener
    public void onFall(
            DamageEntityEvent event,
            @Root DamageSource source,
            @Getter("getTargetEntity") Player subject
    ) {
        if(source.getType().equals(DamageTypes.FALL)){
            //免伤Metadata
            event.setCancelled(subject.getOption("xyfs."+subject.getWorld().getName()).isPresent());
        }
    }
}