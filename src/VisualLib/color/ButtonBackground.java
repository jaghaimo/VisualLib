package VisualLib.color;

import com.fs.starfarer.api.Global;
import java.awt.Color;

public class ButtonBackground implements ColorProvider {

    @Override
    public Color get() {
        return Global.getSettings().getColor("buttonBg");
    }
}
