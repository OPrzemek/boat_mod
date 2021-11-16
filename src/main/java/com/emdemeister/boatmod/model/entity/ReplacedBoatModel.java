package com.emdemeister.boatmod.model.entity;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class ReplacedBoatModel extends AnimatedGeoModel
{
    @Override
    public ResourceLocation getModelLocation(Object object)
    {
        return new ResourceLocation(GeckoLib.ModID, "geo/boat.geo.json");
    }
    @Override
    public ResourceLocation getTextureLocation(Object object)
    {
        return new ResourceLocation(GeckoLib.ModID, "textures/item/boat.png");
    }
    @Override
    public ResourceLocation getAnimationFileLocation(Object object)
    {
        return new ResourceLocation(GeckoLib.ModID, "animations/boat.animation.json");
    }
}
