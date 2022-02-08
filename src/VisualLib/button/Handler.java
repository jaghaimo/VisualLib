package VisualLib.button;

import com.fs.starfarer.api.ui.IntelUIAPI;
import com.fs.starfarer.api.ui.TooltipMakerAPI;

public interface Handler {
    public boolean hasPrompt();

    public void onCancel(IntelUIAPI ui);

    public void onConfirm(IntelUIAPI ui);

    public void onPrompt(TooltipMakerAPI prompt);
}
