package keystrokesmod.client.clickgui.theme.themes;

import keystrokesmod.client.clickgui.theme.Theme;
import java.awt.Color;

/**
 * Monokai-inspired dark theme with vibrant syntax colors.
 */
public class Monokai implements Theme {
    @Override
    public String getName() {
        return "Monokai";
    }

    @Override
    public Color getTextColour() {
        return new Color(248, 248, 242);
    }

    @Override
    public Color getBackgroundColour() {
        return new Color(39, 40, 34);
    }

    @Override
    public Color getSecondBackgroundColour() {
        return new Color(49, 50, 44);
    }

    @Override
    public Color getForegroundColour() {
        return new Color(117, 113, 94);
    }

    @Override
    public Color getSelectionBackgroundColour() {
        return new Color(73, 72, 62);
    }

    @Override
    public Color getSelectionForegroundColour() {
        return new Color(249, 38, 114);
    }

    @Override
    public Color getButtonColour() {
        return new Color(49, 50, 44);
    }

    @Override
    public Color getDisabledColour() {
        return new Color(90, 90, 80);
    }

    @Override
    public Color getContrastColour() {
        return new Color(249, 38, 114);
    }

    @Override
    public Color getAccentColour() {
        return new Color(166, 226, 46);
    }

    @Override
    public Color getActiveColour() {
        return new Color(59, 60, 54);
    }

    @Override
    public Color getExcludedColour() {
        return getContrastColour();
    }

    @Override
    public Color getNotificationColour() {
        return new Color(59, 60, 54);
    }

    @Override
    public Color getHeadingColour() {
        return new Color(102, 217, 239);
    }

    @Override
    public Color getHighlightColour() {
        return new Color(73, 72, 62);
    }

    @Override
    public Color getBorderColour() {
        return new Color(73, 72, 62);
    }

    @Override
    public Color getBackdropColour() {
        return new Color(39, 40, 34, 100);
    }

    @Override
    public Color getArrayListColour(double currentY, double fullY, double speed) {
        long time = System.currentTimeMillis();
        long scaled = (long) (fullY - currentY) * 8L;
        float cycle = (float) ((time % Math.max(scaled, 1L)) / (double) Math.max(scaled, 1L));
        // High saturation for Monokai vibrancy
        return Color.getHSBColor(cycle, 0.85F, 1.0F);
    }
}
