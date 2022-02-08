package VisualLib.button;

import com.fs.starfarer.api.ui.ButtonAPI;
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

    private ButtonAPI button;
    private Handler handler;

    @Override
    public UIComponentAPI render(TooltipMakerAPI tooltip) {
        button = tooltip.addButton(text, handler, width, height, pad);
        return button;
    }

    @Override
    public ButtonAPI getButton() {
        return button;
    }
}
