package com.ssos.support.preferences.indicator.animation.data.type;

import com.ssos.support.preferences.indicator.animation.data.Value;

public class ThinWormAnimationValue extends WormAnimationValue implements Value {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}