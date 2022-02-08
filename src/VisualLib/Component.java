package VisualLib;

import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.ui.UIComponentAPI;

public interface Component {
    public UIComponentAPI render(TooltipMakerAPI tooltip);
}
