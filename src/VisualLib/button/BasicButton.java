package VisualLib.button;

import VisualLib.color.ButtonBackground;
import VisualLib.color.ButtonText;
import VisualLib.color.ColorProvider;
import com.fs.starfarer.api.ui.Alignment;
import com.fs.starfarer.api.ui.ButtonAPI;
import com.fs.starfarer.api.ui.CutStyle;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.ui.UIComponentAPI;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BasicButton implements Button {

    @NonNull
    private String text;

    @NonNull
    private float width;

    @NonNull
    private float height;

    @NonNull
    private float pad;

    private Object data;
    private ColorProvider base = new ButtonText();
    private ColorProvider bg = new ButtonBackground();
    private Alignment align = Alignment.MID;
    private CutStyle style = CutStyle.ALL;
    private ButtonAPI button;

    @Override
    public UIComponentAPI render(TooltipMakerAPI tooltip) {
        button = tooltip.addButton(text, data, base.get(), bg.get(), align, style, width, height, pad);
        return button;
    }

    @Override
    public ButtonAPI getButton() {
        return button;
    }
}
