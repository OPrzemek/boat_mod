/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package com.emdemeister.boatmod;

import com.emdemeister.boatmod.client.renderer.entity.ReplacedBoatRenderer;
import com.emdemeister.boatmod.entity.ReplacedBoatEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoReplacedEntityRenderer;

@Mod.EventBusSubscriber(modid = GeckoLib.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerRenderers(final FMLClientSetupEvent event) {
        EntityRendererManager renderManager = Minecraft.getInstance().getEntityRenderDispatcher();
        ReplacedBoatRenderer boatRenderer = new ReplacedBoatRenderer(renderManager);
        renderManager.renderers.replace(EntityType.BOAT, boatRenderer);
        GeoReplacedEntityRenderer.registerReplacedEntity(ReplacedBoatEntity.class, boatRenderer);
        }
}