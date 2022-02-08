package VisualLib.button;

import com.fs.starfarer.api.ui.ButtonAPI;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.ui.UIComponentAPI;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ShortcutButton implements Button {

    private Button button;
    private int key;
    private boolean putLast;

    @Override
    public UIComponentAPI render(TooltipMakerAPI tooltip) {
        button.render(tooltip);
        ButtonAPI buttonAPI = getButton();
        buttonAPI.setShortcut(key, putLast);
        return buttonAPI;
    }

    @Override
    public ButtonAPI getButton() {
        return button.getButton();
    }
}
