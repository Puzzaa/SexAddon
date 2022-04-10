package sex.addon.modules.hud;

import meteordevelopment.meteorclient.systems.hud.HUD;
import meteordevelopment.meteorclient.systems.hud.modules.DoubleTextHudElement;

public class Watermark extends DoubleTextHudElement {
    public Watermark() {
        super(HUD.get(), "Watermark", "Watermark for sex addon", "Sex Addon", true);
    }

    @Override
    protected String getRight() {
        return "1.0";
    }
}
