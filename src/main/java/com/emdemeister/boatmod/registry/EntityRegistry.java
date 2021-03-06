package com.emdemeister.boatmod.registry;

import com.emdemeister.boatmod.BoatMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BoatMod.MOD_ID);

    //    public static <T extends Entity> RegistryObject<EntityType<T>> buildEntity(EntityType.IFactory<T> entity,
//                                                                               Class<T> entityClass, float width, float height) {
//        String name = entityClass.getSimpleName().toLowerCase();
//        return ENTITIES.register(name,
//                () -> EntityType.Builder.of(entity, EntityClassification.CREATURE).sized(width, height).build(name));
//    }
    public static <T extends Entity> RegistryObject<EntityType<T>> buildEntity(EntityType.IFactory<T> entity,
                                                                               Class<T> entityClass, float width, float height) {
        String name = entityClass.getSimpleName().toLowerCase();
        return ENTITIES.register(name,
                () -> EntityType.Builder.of(entity, EntityClassification.MISC).sized(width, height).build(name));

    }
}