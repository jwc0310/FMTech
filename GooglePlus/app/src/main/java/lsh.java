import android.annotation.TargetApi;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public class lsh
{
  int[] a;
  int[] b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  
  public lsh(lsg paramlsg, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.a = a(new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, paramInt5, 12326, 0, 12344 });
    this.b = new int[1];
    this.c = 8;
    this.d = 8;
    this.e = 8;
    this.f = 0;
    this.g = paramInt5;
    this.h = 0;
  }
  
  int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt1, int paramInt2)
  {
    boolean bool = paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt1, this.b);
    int j = 0;
    if (bool) {
      j = this.b[0];
    }
    return j;
  }
  
  public EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
  {
    int[] arrayOfInt = new int[1];
    if (!paramEGL10.eglChooseConfig(paramEGLDisplay, this.a, null, 0, arrayOfInt)) {
      throw new IllegalArgumentException("eglChooseConfig failed");
    }
    int j = arrayOfInt[0];
    if (j <= 0) {
      throw new IllegalArgumentException("No configs match configSpec");
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[j];
    if (!paramEGL10.eglChooseConfig(paramEGLDisplay, this.a, arrayOfEGLConfig, j, arrayOfInt)) {
      throw new IllegalArgumentException("eglChooseConfig#2 failed");
    }
    EGLConfig localEGLConfig = a(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
    if (localEGLConfig == null) {
      throw new IllegalArgumentException("No config chosen");
    }
    return localEGLConfig;
  }
  
  public EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    int j = paramArrayOfEGLConfig.length;
    for (int k = 0; k < j; k++)
    {
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[k];
      int m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325, 0);
      int n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326, 0);
      if ((m >= this.g) && (n >= this.h))
      {
        int i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324, 0);
        int i2 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323, 0);
        int i3 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322, 0);
        int i4 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321, 0);
        if ((i1 == this.c) && (i2 == this.d) && (i3 == this.e) && (i4 == this.f)) {
          return localEGLConfig;
        }
      }
    }
    return null;
  }
  
  @TargetApi(18)
  int[] a(int[] paramArrayOfInt)
  {
    if ((this.i.h != 2) && (this.i.h != 3)) {
      return paramArrayOfInt;
    }
    int[] arrayOfInt = new int[15];
    System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, 12);
    arrayOfInt[12] = 12352;
    if (this.i.h == 2) {
      arrayOfInt[13] = 4;
    }
    for (;;)
    {
      arrayOfInt[14] = 12344;
      return arrayOfInt;
      arrayOfInt[13] = 64;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsh
 * JD-Core Version:    0.7.0.1
 */