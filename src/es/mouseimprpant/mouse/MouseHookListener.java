package es.mouseimprpant.mouse;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser.HHOOK;
import com.sun.jna.platform.win32.WinUser.HOOKPROC;

/**
 * @author penngo(http://www.blogjava.net/pengo/)
 * @version 2011.02.20
 */
public abstract class MouseHookListener implements HOOKPROC {
    public User32 lib = null;
    public HHOOK hhk;

    public LRESULT callback(int nCode, WPARAM wParam, MouseHookStruct lParam) {
        return null;
    }
}
