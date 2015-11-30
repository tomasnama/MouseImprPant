package es.mouseimprpant;


import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;

import es.mouseimprpant.mouse.MouseHook;
import es.mouseimprpant.mouse.MouseHookListener;
import es.mouseimprpant.mouse.MouseHookStruct;
import es.mouseimprpant.thread.Captura;


public class Main {

    public static void main(String[] args) {
        
        try {
            MouseHook mouseHook = new MouseHook();
            mouseHook.addMouseHookListener(new MouseHookListener() {
                    public LRESULT callback(int nCode, WPARAM wParam,
                                            MouseHookStruct lParam) {
                        if (nCode >= 0) {
                            switch (wParam.intValue()) {
                            case MouseHook.WM_MOUSEMOVE:
                                break;
                            case MouseHook.WM_LBUTTONDOWN:
                            	Model model = new Model();
                            	Captura captura = new Captura(model.getFileName());
                            	captura.start();
                                break;
                            case MouseHook.WM_MBUTTONDOWN:
                                break;
                            case MouseHook.WM_MBUTTONUP:
                                break;
                            }
                        }
                        return lib.CallNextHookEx(hhk, nCode, wParam,
                                                  lParam.getPointer());
                    }
                });
            mouseHook.startWindowsHookEx();

            Thread.sleep(20000);
            mouseHook.stopWindowsHookEx();

        } catch (Exception e) {
            System.exit(0);
        }
    }
}
