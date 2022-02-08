package VisualLib.color;

import com.fs.starfarer.api.util.Misc;
import java.awt.Color;

public class ButtonText implements ColorProvider {

    @Override
    public Color get() {
        return Misc.getButtonTextColor();
    }
}
