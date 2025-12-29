package keystrokesmod.client.clickgui.theme.themes;

import keystrokesmod.client.clickgui.theme.Theme;
import java.awt.Color;

/**
 * Psychedelic rainbow theme with rapidly shifting colors.
 */
public class Rainbow implements Theme {
    @Override
    public String getName() {
        return "Rainbow";
    }

    private Color getRainbowColor(float hue) {
        return Color.getHSBColor(hue, 0.9F, 0.95F);
    }

    private float getTimeHue() {
        return ((System.currentTimeMillis() % 5000L) / 5000F) % 1.0F;
    }

    @Override
    public Color getTextColour() {
        return new Color(255, 255, 255);
    }

    @Override
    public Color getBackgroundColour() {
        return new Color(20, 20, 30);
    }

    @Override
    public Color getSecondBackgroundColour() {
        return new Color(30, 30, 45);
    }

    @Override
    public Color getForegroundColour() {
        return getRainbowColor(getTimeHue());
    }

    @Override
    public Color getSelectionBackgroundColour() {
        return getRainbowColor((getTimeHue() + 0.1F) % 1.0F);
    }

    @Override
    public Color getSelectionForegroundColour() {
        return getRainbowColor((getTimeHue() + 0.5F) % 1.0F);
    }

    @Override
    public Color getButtonColour() {
        return new Color(30, 30, 45);
    }

    @Override
    public Color getDisabledColour() {
        return new Color(80, 80, 100);
    }

    @Override
    public Color getContrastColour() {
        return getRainbowColor((getTimeHue() + 0.25F) % 1.0F);
    }

    @Override
    public Color getAccentColour() {
        return getRainbowColor((getTimeHue() + 0.75F) % 1.0F);
    }

    @Override
    public Color getActiveColour() {
        return getRainbowColor((getTimeHue() + 0.3F) % 1.0F);
    }

    @Override
    public Color getExcludedColour() {
        return getRainbowColor((getTimeHue() + 0.6F) % 1.0F);
    }

    @Override
    public Color getNotificationColour() {
        return new Color(30, 30, 45);
    }

    @Override
    public Color getHeadingColour() {
        return getRainbowColor((getTimeHue() + 0.15F) % 1.0F);
    }

    @Override
    public Color getHighlightColour() {
        return getRainbowColor((getTimeHue() + 0.4F) % 1.0F);
    }

    @Override
    public Color getBorderColour() {
        return getRainbowColor(getTimeHue());
    }

    @Override
    public Color getBackdropColour() {
        return new Color(20, 20, 30, 120);
    }

    @Override
    public Color getArrayListColour(double currentY, double fullY, double speed) {
        long time = System.currentTimeMillis();
        long scaled = (long) (fullY - currentY) * 8L;
        float cycle = (float) ((time % Math.max(scaled, 1L)) / (double) Math.max(scaled, 1L));
        // Hyper-saturated rainbow with time offset
        float hue = (cycle + getTimeHue()) % 1.0F;
        return Color.getHSBColor(hue, 1.0F, 1.0F);
    }
}
