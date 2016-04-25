package io.clickhandler.logglyGwt.client;

import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "_LTracker")
public class Loggly {
    private static native void push(Object object);

    @JsOverlay
    public static void push(String logLevel, String message, Object... data) {
        push(wrap(logLevel, message, data));
    }

    @JsOverlay
    private static native JavaScriptObject wrap(String logLevel, String message, Object... data) /*-{
        return {
            logLevel: logLevel,
            message: message,
            data: data
        }
    }-*/;
}
