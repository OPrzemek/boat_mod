package com.emdemeister.boatmod.entity;

import com.emdemeister.boatmod.BoatMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

//public class GeoExampleEntity extends CreatureEntity implements IAnimatable
//{
//    private AnimationFactory factory = new AnimationFactory(this);
//
//    public GeoExampleEntity(EntityType<? extends CreatureEntity> type, World worldIn)
//    {
//        super(type, worldIn);
//        this.ignoreFrustumCheck = true;
//    }
//
//    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
//    {
//        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.bat.fly", true));
//        return PlayState.CONTINUE;
//    }
//
//    @Override
//    public void registerControllers(AnimationData data)
//    {
//        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
//    }
//
//    @Override
//    public AnimationFactory getFactory()
//    {
//        return this.factory;
//    }
//}
public class BoatyEntity extends BoatEntity implements IAnimatable
{
    //DO POPRAWY
    //
    //
//    public static final DeferredRegister<EntityType<? extends BoatEntity>> ENTITIES =
//            DeferredRegister.create(ForgeRegistries.ENTITIES, BoatMod.MOD_ID);
//
//    public static final RegistryObject<EntityType<?>> BOATY_ENTITY = ENTITIES.register("boaty_entity",
//            () -> new EntityType<?>().canSummon();
//
    //
    //
    private final AnimationFactory factory = new AnimationFactory(this);


    public BoatyEntity(EntityType<? extends BoatEntity> type, World worldIn)
    {
        super(type, worldIn);
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
    {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.boat.frontflip", true));
        return PlayState.CONTINUE;
    }
    @Override
    public void registerControllers(AnimationData data)
    {
        data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }
    @Override
    public AnimationFactory getFactory()
    {
        return this.factory;
    }
}