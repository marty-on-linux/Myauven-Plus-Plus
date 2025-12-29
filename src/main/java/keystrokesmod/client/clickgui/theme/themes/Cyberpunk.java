package keystrokesmod.client.clickgui.theme.themes;

import keystrokesmod.client.clickgui.theme.Theme;
import java.awt.Color;

/**
 * Warm retro dark theme inspired by cyberpunk aesthetics.
 */
public class Cyberpunk implements Theme {
    @Override
    public String getName() {
        return "Cyberpunk";
    }

    @Override
    public Color getTextColour() {
        return new Color(0, 255, 200);
    }

    @Override
    public Color getBackgroundColour() {
        return new Color(13, 27, 42);
    }

    @Override
    public Color getSecondBackgroundColour() {
        return new Color(20, 35, 55);
    }

    @Override
    public Color getForegroundColour() {
        return new Color(255, 0, 127);
    }

    @Override
    public Color getSelectionBackgroundColour() {
        return new Color(30, 60, 90);
    }

    @Override
    public Color getSelectionForegroundColour() {
        return new Color(0, 255, 255);
    }

    @Override
    public Color getButtonColour() {
        return new Color(20, 35, 55);
    }

    @Override
    public Color getDisabledColour() {
        return new Color(60, 80, 100);
    }

    @Override
    public Color getContrastColour() {
        return new Color(255, 0, 127);
    }

    @Override
    public Color getAccentColour() {
        return new Color(0, 255, 200);
    }

    @Override
    public Color getActiveColour() {
        return new Color(30, 50, 75);
    }

    @Override
    public Color getExcludedColour() {
        return getContrastColour();
    }

    @Override
    public Color getNotificationColour() {
        return new Color(30, 50, 75);
    }

    @Override
    public Color getHeadingColour() {
        return new Color(255, 0, 127);
    }

    @Override
    public Color getHighlightColour() {
        return new Color(30, 60, 90);
    }

    @Override
    public Color getBorderColour() {
        return new Color(255, 0, 127);
    }

    @Override
    public Color getBackdropColour() {
        return new Color(13, 27, 42, 120);
    }

    @Override
    public Color getArrayListColour(double currentY, double fullY, double speed) {
        long time = System.currentTimeMillis();
        long scaled = (long) (fullY - currentY) * 8L;
        float cycle = (float) ((time % Math.max(scaled, 1L)) / (double) Math.max(scaled, 1L));
        // Intense cyberpunk neon colors
        return Color.getHSBColor(cycle, 1.0F, 1.0F);
    }
}
