package com.itdot.a.cprdroid;

import android.graphics.drawable.Drawable;

public class AgeList {

    private String TargetScreen;
    private String AgeScreen;
    private Drawable TargetIcon;

    public AgeList(String targetScreen, String ageScreen, Drawable targetIcon) {
        TargetScreen = targetScreen;
        AgeScreen = ageScreen;
        TargetIcon = targetIcon;
    }

    public Drawable getTargetIcon() {
        return TargetIcon;
    }

    public void setTargetIcon(Drawable targetIcon) {
        TargetIcon = targetIcon;
    }

    public String getTargetScreen() {
        return TargetScreen;
    }

    public void setTargetScreen(String targetScreen) {
        TargetScreen = targetScreen;
    }

    public String getAgeScreen() {
        return AgeScreen;
    }

    public void setAgeScreen(String ageScreen) {
        AgeScreen = ageScreen;
    }

}
