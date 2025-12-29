package keystrokesmod.client.clickgui.theme.themes;

import keystrokesmod.client.clickgui.theme.Theme;
import java.awt.Color;

/**
 * Solarized Dark palette for balanced contrast.
 */
public class SolarizedDark implements Theme {
    @Override
    public String getName() {
        return "Solarized Dark";
    }

    @Override
    public Color getTextColour() {
        return new Color(253, 246, 227);
    }

    @Override
    public Color getBackgroundColour() {
        return new Color(0, 43, 54);
    }

    @Override
    public Color getSecondBackgroundColour() {
        return new Color(7, 54, 66);
    }

    @Override
    public Color getForegroundColour() {
        return new Color(147, 161, 161);
    }

    @Override
    public Color getSelectionBackgroundColour() {
        return new Color(38, 139, 210);
    }

    @Override
    public Color getSelectionForegroundColour() {
        return new Color(253, 246, 227);
    }

    @Override
    public Color getButtonColour() {
        return new Color(7, 54, 66);
    }

    @Override
    public Color getDisabledColour() {
        return new Color(88, 110, 117);
    }

    @Override
    public Color getContrastColour() {
        return new Color(211, 54, 130);
    }

    @Override
    public Color getAccentColour() {
        return new Color(133, 153, 0);
    }

    @Override
    public Color getActiveColour() {
        return new Color(0, 43, 54);
    }

    @Override
    public Color getExcludedColour() {
        return getContrastColour();
    }

    @Override
    public Color getNotificationColour() {
        return new Color(7, 54, 66);
    }

    @Override
    public Color getHeadingColour() {
        return new Color(203, 75, 22);
    }

    @Override
    public Color getHighlightColour() {
        return new Color(42, 161, 152);
    }

    @Override
    public Color getBorderColour() {
        return new Color(0, 43, 54);
    }

    @Override
    public Color getBackdropColour() {
        return new Color(0, 43, 54, 35);
    }

    @Override
    public Color getArrayListColour(double currentY, double fullY, double speed) {
        long time = System.currentTimeMillis();
        long scaled = (long) (fullY - currentY) * 7L;
        float cycle = (float) ((time % Math.max(scaled, 1L)) / (double) Math.max(scaled, 1L));
        // Use higher saturation for array list to keep visibility strong
        return Color.getHSBColor(cycle, 0.55F, 0.98F);
    }
}
