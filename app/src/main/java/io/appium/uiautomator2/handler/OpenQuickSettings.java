package io.appium.uiautomator2.handler;

import android.support.test.uiautomator.UiDevice;

import io.appium.uiautomator2.handler.request.SafeRequestHandler;
import io.appium.uiautomator2.http.AppiumResponse;
import io.appium.uiautomator2.http.IHttpRequest;
import io.appium.uiautomator2.server.WDStatus;
import io.appium.uiautomator2.utils.Logger;

public class OpenQuickSettings extends SafeRequestHandler {

    public OpenQuickSettings(String mappedUri) {
        super(mappedUri);
    }

    @Override
    protected AppiumResponse safeHandle(IHttpRequest request) {
        Logger.info("OpenQuickSettings command");
        String sessionId = getSessionId(request);

        UiDevice.getInstance().openQuickSettings();
        return new AppiumResponse(sessionId, WDStatus.SUCCESS, "OpenQuickSettings command successful");
    }
}
