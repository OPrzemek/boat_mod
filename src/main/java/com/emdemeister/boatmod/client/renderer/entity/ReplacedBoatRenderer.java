package com.emdemeister.boatmod.client.renderer.entity;

import com.emdemeister.boatmod.entity.ReplacedBoatEntity;
import com.emdemeister.boatmod.model.entity.ReplacedBoatModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import software.bernie.geckolib3.renderers.geo.GeoReplacedEntityRenderer;

public class ReplacedBoatRenderer extends GeoReplacedEntityRenderer<ReplacedBoatEntity> {
    public ReplacedBoatRenderer(EntityRendererManager renderManager) {
        super(renderManager, new ReplacedBoatModel(), new ReplacedBoatEntity());
    }
}
