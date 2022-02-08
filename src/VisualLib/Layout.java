package VisualLib;

import com.fs.starfarer.api.ui.CustomPanelAPI;
import com.fs.starfarer.api.ui.PositionAPI;

public interface Layout extends Component {
    public PositionAPI render(CustomPanelAPI panel, float width, float height);
}
