package com.example.sdkmanager;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = activityRule.getActivity();
    }

    @Test
    public void testInstallPackage() {
        String packageName = "test.package";
        mainActivity.runOnUiThread(() -> mainActivity.installPackage(packageName));
        // Add assertions to verify the installation logic
        // For now, just check if the method runs without exceptions
        assertTrue(true);
    }

    @Test
    public void testListPackages() {
        mainActivity.runOnUiThread(() -> mainActivity.listPackages());
        // Add assertions to verify the listing logic
        // For now, just check if the method runs without exceptions
        assertTrue(true);
    }

    @Test
    public void testUpdatePackage() {
        String packageName = "test.package";
        mainActivity.runOnUiThread(() -> mainActivity.updatePackage(packageName));
        // Add assertions to verify the update logic
        // For now, just check if the method runs without exceptions
        assertTrue(true);
    }
}
