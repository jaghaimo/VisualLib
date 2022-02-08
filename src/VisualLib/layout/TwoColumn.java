package VisualLib.layout;

import VisualLib.Layout;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.ui.CustomPanelAPI;
import com.fs.starfarer.api.ui.PositionAPI;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.ui.UIComponentAPI;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TwoColumn implements Layout {

    private Column firstColumn;
    private Column secondColumn;
    private float padding;

    @Override
    public UIComponentAPI render(TooltipMakerAPI tooltip) {
        float width = tooltip.getPosition().getWidth();
        float height = tooltip.getPosition().getHeight();
        CustomPanelAPI panel = Global.getSettings().createCustom(width, height, null);
        render(panel, width, height);
        tooltip.addCustom(panel, 0);
        return tooltip.getPrev();
    }

    @Override
    public PositionAPI render(CustomPanelAPI panel, float width, float height) {
        PositionAPI firstPosition = firstColumn.render(panel, width / 2, height);
        PositionAPI secondPosition = firstColumn.render(panel, width / 2, height);
        secondPosition.inTL(firstPosition.getWidth() + padding, 0);
        return secondPosition;
    }
}
