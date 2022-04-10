package Sex.addon;

import sex.addon.modules.AutoSex;
import sex.addon.modules.hud.Watermark;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.HUD;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class SexAddon extends MeteorAddon {
	public static final Logger LOG = LoggerFactory.getLogger(SexAddon.class);
	public static final Category CATEGORY = new Category("Sex Addon");

	@Override
	public void onInitialize() {
		LOG.info("Initializing Meteor Addon Template");

		// Required when using @EventHandler
		MeteorClient.EVENT_BUS.registerLambdaFactory("meteordevelopment.addons.template", (lookupInMethod, klass) -> (MethodHandles.Lookup) lookupInMethod.invoke(null, klass, MethodHandles.lookup()));

		// Modules
		Modules.get().add(new AutoSex());

		// Commands

		// HUD
        HUD.get().elements.add(new Watermark());
	}

	@Override
	public void onRegisterCategories() {
		Modules.registerCategory(CATEGORY);
	}
}
