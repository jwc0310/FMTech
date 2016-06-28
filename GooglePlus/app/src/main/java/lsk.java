import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

final class lsk
{
  WeakReference<lsg> a;
  EGL10 b;
  EGLDisplay c;
  EGLSurface d;
  EGLConfig e;
  EGLContext f;
  
  public lsk(WeakReference<lsg> paramWeakReference)
  {
    this.a = paramWeakReference;
  }
  
  public static String a(String paramString, int paramInt)
  {
    return 20 + String.valueOf(paramString).length() + paramString + " failed: " + paramInt;
  }
  
  final void a()
  {
    if ((this.d != null) && (this.d != EGL10.EGL_NO_SURFACE))
    {
      this.b.eglMakeCurrent(this.c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
      lsg locallsg = (lsg)this.a.get();
      if (locallsg != null) {
        locallsg.g.a(this.b, this.c, this.d);
      }
      this.d = null;
    }
  }
  
  public final void b()
  {
    if (this.f != null)
    {
      lsg locallsg = (lsg)this.a.get();
      if (locallsg != null) {
        locallsg.f.a(this.b, this.c, this.f);
      }
      this.f = null;
    }
    if (this.c != null)
    {
      this.b.eglTerminate(this.c);
      this.c = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsk
 * JD-Core Version:    0.7.0.1
 */