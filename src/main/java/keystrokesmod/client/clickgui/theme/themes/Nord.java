package keystrokesmod.client.clickgui.theme.themes;

import keystrokesmod.client.clickgui.theme.Theme;
import java.awt.Color;

/**
 * Nord palette for a calm, cool UI.
 */
public class Nord implements Theme {
    @Override
    public String getName() {
        return "Nord";
    }

    @Override
    public Color getTextColour() {
        return new Color(236, 239, 244);
    }

    @Override
    public Color getBackgroundColour() {
        return new Color(46, 52, 64);
    }

    @Override
    public Color getSecondBackgroundColour() {
        return new Color(59, 66, 82);
    }

    @Override
    public Color getForegroundColour() {
        return new Color(143, 188, 187);
    }

    @Override
    public Color getSelectionBackgroundColour() {
        return new Color(67, 76, 94);
    }

    @Override
    public Color getSelectionForegroundColour() {
        return new Color(129, 161, 193);
    }

    @Override
    public Color getButtonColour() {
        return new Color(59, 66, 82);
    }

    @Override
    public Color getDisabledColour() {
        return new Color(76, 86, 106);
    }

    @Override
    public Color getContrastColour() {
        return new Color(191, 97, 106);
    }

    @Override
    public Color getAccentColour() {
        return new Color(136, 192, 208);
    }

    @Override
    public Color getActiveColour() {
        return new Color(67, 76, 94);
    }

    @Override
    public Color getExcludedColour() {
        return getContrastColour();
    }

    @Override
    public Color getNotificationColour() {
        return new Color(59, 66, 82);
    }

    @Override
    public Color getHeadingColour() {
        return new Color(180, 142, 173);
    }

    @Override
    public Color getHighlightColour() {
        return new Color(94, 129, 172);
    }

    @Override
    public Color getBorderColour() {
        return new Color(36, 42, 52);
    }

    @Override
    public Color getBackdropColour() {
        return new Color(46, 52, 64, 45);
    }

    @Override
    public Color getArrayListColour(double currentY, double fullY, double speed) {
        long time = System.currentTimeMillis();
        long scaled = (long) (fullY - currentY) * 9L;
        float cycle = (float) ((time % Math.max(scaled, 1L)) / (double) Math.max(scaled, 1L));
        // Slightly desaturated rainbow to match Nord tones
        return Color.getHSBColor(cycle, 0.35F, 0.95F);
    }
}
