package VisualLib.button;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Builder
@RequiredArgsConstructor
public class ButtonBuilder {

    @NonNull
    private Button button;

    private Shortcut shortcut;

    public Button build() {
        Button currentButton = button;
        if (shortcut != null) {
            currentButton = new ShortcutButton(currentButton, shortcut);
        }
        return currentButton;
    }
}
