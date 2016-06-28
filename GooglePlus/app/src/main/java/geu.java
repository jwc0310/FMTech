import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.util.Log;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.core.Tile;
import com.google.android.libraries.photoeditor.core.TilesProvider;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

final class geu
  implements GLSurfaceView.Renderer
{
  ges a;
  private final FilterParameter c = efj.Cv.a(1);
  private EGLContext d = EGL10.EGL_NO_CONTEXT;
  private EGLSurface e = EGL10.EGL_NO_SURFACE;
  private EGLDisplay f = EGL10.EGL_NO_DISPLAY;
  private final Rect g = new Rect();
  private final RectF h = new RectF();
  private final Matrix i = new Matrix();
  private final float[] j = new float[9];
  
  geu(gen paramgen) {}
  
  final void a()
  {
    EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
    this.d = localEGL10.eglGetCurrentContext();
    this.e = localEGL10.eglGetCurrentSurface(12377);
    this.f = localEGL10.eglGetCurrentDisplay();
    if ((this.d == EGL10.EGL_NO_CONTEXT) || (this.e == EGL10.EGL_NO_SURFACE) || (this.f == EGL10.EGL_NO_DISPLAY)) {
      throw new IllegalStateException("Failed to store the EGL context");
    }
  }
  
  final void a(int paramInt)
  {
    if ((paramInt == 7) || (paramInt == 3)) {
      NativeCore.deactivateOffScreenFilter();
    }
    a();
    NativeCore.initOffscreenContext();
    NativeCore.offscreenContextMakeCurrent();
    NativeCore.a.activateOffScreenFilter(paramInt);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b.f != null)
    {
      this.b.f.b();
      this.b.f = null;
    }
    efj.Cv.cleanUp();
  }
  
  final boolean a(gff paramgff)
  {
    if (this.b.b)
    {
      this.b.post(new gev(this, paramgff));
      return true;
    }
    return false;
  }
  
  final void b()
  {
    EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
    if (!localEGL10.eglMakeCurrent(this.f, this.e, this.e, this.d))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(localEGL10.eglGetError());
      Log.e("ImageViewGL", String.format("ImageViewGL restoreEGL failed: %d", arrayOfObject));
      throw new IllegalStateException("Failed to restore the EGL context");
    }
  }
  
  final void b(int paramInt)
  {
    if ((paramInt == 7) || (paramInt == 3)) {
      NativeCore.deactivateOffScreenFilter();
    }
    b();
  }
  
  public final void onDrawFrame(GL10 paramGL10)
  {
    for (;;)
    {
      boolean bool2;
      TilesProvider localTilesProvider;
      Matrix localMatrix;
      float[] arrayOfFloat;
      int i3;
      float f1;
      float f2;
      try
      {
        if ((this.b.f == null) || (this.b.e == null)) {
          break label773;
        }
        if (this.b.b) {
          return;
        }
        if (this.b.h)
        {
          GLES20.glClearColor((0xFF & this.b.i >> 16) / 255.0F, (0xFF & this.b.i >> 8) / 255.0F, (0xFF & this.b.i) / 255.0F, 1.0F);
          this.b.h = false;
        }
        GLES20.glClear(16384);
        NativeCore.setRenderScaleMode(2);
        gfb localgfb = this.b.f;
        if (!this.b.g)
        {
          bool1 = true;
          localgfb.a(true, bool1);
          int k = this.b.e.getParameterInteger(616);
          FilterParameter localFilterParameter = this.b.e;
          if (this.b.g)
          {
            localFilterParameter = this.c;
            localFilterParameter.setParameterInteger(616, k);
            this.b.requestRender();
          }
          if (this.b.b) {
            break label773;
          }
          bool2 = NativeCore.a.activateOnScreenFilterChecked(localFilterParameter, false);
          int m = localFilterParameter.getFilterType();
          if (m != 1) {
            break label644;
          }
          NativeCore.deactivateOffScreenFilter();
          localTilesProvider = this.b.f.f();
          Tile localTile = this.b.f.g();
          int n = localFilterParameter.getParameterInteger(616);
          localMatrix = this.i;
          localMatrix.reset();
          switch (n)
          {
          default: 
            this.i.getValues(this.j);
            arrayOfFloat = this.j;
            if (arrayOfFloat.length != 9) {
              break label693;
            }
            System.arraycopy(arrayOfFloat, 0, localTile.a, 0, arrayOfFloat.length);
            int i1 = this.b.getWidth();
            int i2 = this.b.getHeight();
            if (k == 1) {
              break label774;
            }
            i3 = 0;
            if (k == 3) {
              break label774;
            }
            if (i3 == 0) {
              break label750;
            }
            f1 = localTilesProvider.getScaledHeight();
            f2 = localTilesProvider.getScaledWidth();
            double d1 = Math.min(i1 / f1, i2 / f2);
            int i4 = (int)(d1 * f1);
            int i5 = (int)(d1 * f2);
            this.g.left = ((i1 - i4) / 2);
            this.g.top = ((i2 - i5) / 2);
            this.g.right = (i4 + this.g.left);
            this.g.bottom = (i5 + this.g.top);
            Rect localRect = this.g;
            boolean bool3 = this.b.a(m);
            int i6 = NativeCore.onscreenFilterTileToScreen(localFilterParameter, localTilesProvider, localTile, i1, i2, true, bool3, localRect.left, localRect.top, localRect.width(), localRect.height());
            if ((!this.b.g) && (i6 == m)) {
              this.b.a(bool3, m);
            }
            this.b.g = false;
            if (this.a == null) {
              break label773;
            }
            ges localges = this.a;
            localges.a = (1 + localges.a);
            return;
          }
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      boolean bool1 = false;
      continue;
      label644:
      if (bool2)
      {
        continue;
        localMatrix.preRotate(90.0F);
        continue;
        localMatrix.preRotate(180.0F);
        continue;
        localMatrix.preRotate(270.0F);
        continue;
        label693:
        String str = String.valueOf(String.valueOf(arrayOfFloat.length));
        throw new IllegalArgumentException(50 + String.valueOf(str).length() + "TransformMatrix requires 9 elements, but" + str + "are given.");
        label750:
        f1 = localTilesProvider.getScaledWidth();
        int i7 = localTilesProvider.getScaledHeight();
        f2 = i7;
        continue;
        label773:
        return;
        label774:
        i3 = 1;
      }
    }
  }
  
  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    GLES20.glViewport(0, 0, this.b.getWidth(), this.b.getHeight());
    this.b.h = true;
    NativeCore.onSurfaceChanged();
    if (this.a != null)
    {
      ges localges = this.a;
      localges.b = System.currentTimeMillis();
      localges.a = 0;
    }
  }
  
  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    GLES20.glPixelStorei(3333, 1);
    GLES20.glPixelStorei(3317, 1);
    GLES20.glDisable(2884);
    GLES20.glDisable(3042);
    GLES20.glDisable(3024);
    GLES20.glDisable(2960);
    GLES20.glDisable(2929);
    GLES20.glDisable(3089);
    GLES20.glDepthMask(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     geu
 * JD-Core Version:    0.7.0.1
 */