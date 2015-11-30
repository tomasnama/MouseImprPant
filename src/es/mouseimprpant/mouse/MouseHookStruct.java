package es.mouseimprpant.mouse;

import com.sun.jna.Structure;

import com.sun.jna.platform.win32.BaseTSD.ULONG_PTR;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser.POINT;

/**
 *
 * @author pengo(http://www.blogjava.net/pengo/)
 * @version 2011.02.20
 */
public class MouseHookStruct extends Structure {
    public static class ByReference extends MouseHookStruct implements Structure.ByReference {
    }
    public POINT pt;
    public HWND hwnd;
    public int wHitTestCode;
    public ULONG_PTR dwExtraInfo;
}
