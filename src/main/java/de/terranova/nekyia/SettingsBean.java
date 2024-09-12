package de.terranova.nekyia;

import java.io.Serializable;

public class SettingsBean implements Serializable {

    private boolean showAdvancements;

    public SettingsBean(boolean showAdvancements) {
        this.showAdvancements = showAdvancements;
    }

    public boolean isShowAdvancements() {
        return showAdvancements;
    }

    public void setShowAdvancements(boolean showAdvancements) {
        this.showAdvancements = showAdvancements;
    }
}
