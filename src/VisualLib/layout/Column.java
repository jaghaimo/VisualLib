package VisualLib.layout;

import VisualLib.Component;
import VisualLib.Layout;
import com.fs.starfarer.api.ui.CustomPanelAPI;
import com.fs.starfarer.api.ui.PositionAPI;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.ui.UIComponentAPI;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Column implements Layout {

    private List<Component> elements;
    private float columnWidth;
    private float columnHeight;
    private boolean withScroller;

    @Override
    public UIComponentAPI render(TooltipMakerAPI tooltip) {
        for (Component element : elements) {
            element.render(tooltip);
        }
        return tooltip.getPrev();
    }

    @Override
    public PositionAPI render(CustomPanelAPI panel, float width, float height) {
        verifySize(width, height);
        TooltipMakerAPI tooltip = panel.createUIElement(columnWidth, columnHeight, withScroller);
        render(tooltip);
        return panel.addUIElement(tooltip);
    }

    private void verifySize(float width, float height) {
        if (columnWidth <= 0) {
            columnWidth = width;
        }
        if (columnHeight <= 0) {
            columnHeight = height;
        }
    }
}
