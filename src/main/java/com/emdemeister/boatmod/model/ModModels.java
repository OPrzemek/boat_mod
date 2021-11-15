package com.emdemeister.boatmod.model;

import com.emdemeister.boatmod.entity.BoatyEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class ModModels extends AnimatedGeoModel<BoatyEntity>
{
    @Override
    public ResourceLocation getModelLocation(BoatyEntity boatItem)
    {
        return new ResourceLocation(GeckoLib.ModID, "geo/boat.geo.json");
    }
    @Override
    public ResourceLocation getTextureLocation(BoatyEntity boatItem)
    {
        return new ResourceLocation(GeckoLib.ModID, "textures/item/boat.png");
    }
    @Override
    public ResourceLocation getAnimationFileLocation(BoatyEntity boatItem)
    {
        return new ResourceLocation(GeckoLib.ModID, "animations/frontflip.animation.json");
    }
}
