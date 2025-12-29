package keystrokesmod.client.clickgui.theme.themes;

import keystrokesmod.client.clickgui.theme.Theme;
import java.awt.Color;

/**
 * Clean light theme with soft grays and muted accents.
 */
public class Light implements Theme {
    @Override
    public String getName() {
        return "Light";
    }

    @Override
    public Color getTextColour() {
        return new Color(60, 60, 60);
    }

    @Override
    public Color getBackgroundColour() {
        return new Color(245, 245, 245);
    }

    @Override
    public Color getSecondBackgroundColour() {
        return new Color(235, 235, 235);
    }

    @Override
    public Color getForegroundColour() {
        return new Color(150, 150, 150);
    }

    @Override
    public Color getSelectionBackgroundColour() {
        return new Color(220, 220, 220);
    }

    @Override
    public Color getSelectionForegroundColour() {
        return new Color(70, 130, 200);
    }

    @Override
    public Color getButtonColour() {
        return new Color(235, 235, 235);
    }

    @Override
    public Color getDisabledColour() {
        return new Color(200, 200, 200);
    }

    @Override
    public Color getContrastColour() {
        return new Color(220, 50, 80);
    }

    @Override
    public Color getAccentColour() {
        return new Color(70, 160, 200);
    }

    @Override
    public Color getActiveColour() {
        return new Color(225, 225, 225);
    }

    @Override
    public Color getExcludedColour() {
        return getContrastColour();
    }

    @Override
    public Color getNotificationColour() {
        return new Color(240, 240, 240);
    }

    @Override
    public Color getHeadingColour() {
        return new Color(100, 180, 100);
    }

    @Override
    public Color getHighlightColour() {
        return new Color(220, 220, 220);
    }

    @Override
    public Color getBorderColour() {
        return new Color(220, 220, 220);
    }

    @Override
    public Color getBackdropColour() {
        return new Color(255, 255, 255, 60);
    }

    @Override
    public Color getArrayListColour(double currentY, double fullY, double speed) {
        long time = System.currentTimeMillis();
        long scaled = (long) (fullY - currentY) * 8L;
        float cycle = (float) ((time % Math.max(scaled, 1L)) / (double) Math.max(scaled, 1L));
        // More pastel for light theme
        return Color.getHSBColor(cycle, 0.4F, 0.85F);
    }
}
