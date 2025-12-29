package keystrokesmod.client.clickgui.theme.themes;

import keystrokesmod.client.clickgui.theme.Theme;
import java.awt.Color;

/**
 * Dracula-inspired dark theme.
 */
public class Dracula implements Theme {
    @Override
    public String getName() {
        return "Dracula";
    }

    @Override
    public Color getTextColour() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color getBackgroundColour() {
        return new Color(40, 42, 54);
    }

    @Override
    public Color getSecondBackgroundColour() {
        return new Color(50, 52, 64);
    }

    @Override
    public Color getForegroundColour() {
        return new Color(189, 147, 249);
    }

    @Override
    public Color getSelectionBackgroundColour() {
        return new Color(68, 71, 90);
    }

    @Override
    public Color getSelectionForegroundColour() {
        return new Color(80, 250, 123);
    }

    @Override
    public Color getButtonColour() {
        return new Color(50, 52, 64);
    }

    @Override
    public Color getDisabledColour() {
        return new Color(80, 80, 80);
    }

    @Override
    public Color getContrastColour() {
        return new Color(255, 121, 198);
    }

    @Override
    public Color getAccentColour() {
        return new Color(139, 233, 253);
    }

    @Override
    public Color getActiveColour() {
        return new Color(68, 71, 90);
    }

    @Override
    public Color getExcludedColour() {
        return getContrastColour();
    }

    @Override
    public Color getNotificationColour() {
        return new Color(50, 52, 64);
    }

    @Override
    public Color getHeadingColour() {
        return new Color(255, 184, 108);
    }

    @Override
    public Color getHighlightColour() {
        return new Color(68, 71, 90);
    }

    @Override
    public Color getBorderColour() {
        return new Color(33, 34, 45);
    }

    @Override
    public Color getBackdropColour() {
        return new Color(40, 42, 54, 50);
    }

    @Override
    public Color getArrayListColour(double currentY, double fullY, double speed) {
        long time = System.currentTimeMillis();
        long scaled = (long) (fullY - currentY) * 8L;
        float cycle = (float) ((time % Math.max(scaled, 1L)) / (double) Math.max(scaled, 1L));
        return Color.getHSBColor(cycle, 0.8F, 1.0F);
    }
}
