import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public class lsi
{
  int a = 12440;
  
  public lsi(lsg paramlsg) {}
  
  public EGLContext a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig)
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = this.b.h;
    arrayOfInt[2] = 12344;
    EGLContext localEGLContext = EGL10.EGL_NO_CONTEXT;
    if (this.b.h != 0) {}
    for (;;)
    {
      return paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, localEGLContext, arrayOfInt);
      arrayOfInt = null;
    }
  }
  
  public void a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLContext paramEGLContext)
  {
    if (!paramEGL10.eglDestroyContext(paramEGLDisplay, paramEGLContext))
    {
      String str1 = String.valueOf(paramEGLDisplay);
      String str2 = String.valueOf(paramEGLContext);
      Log.e("DefaultContextFactory", 18 + String.valueOf(str1).length() + String.valueOf(str2).length() + "display:" + str1 + " context: " + str2);
      throw new RuntimeException(lsk.a("eglDestroyContex", paramEGL10.eglGetError()));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsi
 * JD-Core Version:    0.7.0.1
 */