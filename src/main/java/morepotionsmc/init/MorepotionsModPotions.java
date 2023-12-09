
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package morepotionsmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import morepotionsmc.MorepotionsMod;

public class MorepotionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MorepotionsMod.MODID);
	public static final RegistryObject<Potion> BLIND_POT = REGISTRY.register("blind_pot", () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true)));
	public static final RegistryObject<Potion> MINING_FATIGUE_POT = REGISTRY.register("mining_fatigue_pot", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, false, true)));
	public static final RegistryObject<Potion> DECAY_POT = REGISTRY.register("decay_pot", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 900, 0, false, true)));
	public static final RegistryObject<Potion> NAUSEA_POT = REGISTRY.register("nausea_pot", () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 900, 0, false, true)));
	public static final RegistryObject<Potion> HUNGER_POT = REGISTRY.register("hunger_pot", () -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 600, 0, false, true)));
	public static final RegistryObject<Potion> LEVITATION_POT = REGISTRY.register("levitation_pot", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 400, 0, false, true)));
}
