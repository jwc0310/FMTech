import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class gen
  extends GLSurfaceView
  implements gfc, gfg, gfh
{
  geu a;
  boolean b;
  public final Set<gfe> c = new HashSet();
  public final Set<gfe> d = new HashSet();
  public FilterParameter e;
  gfb f;
  boolean g = true;
  boolean h;
  int i = -16777216;
  private boolean j;
  private Runnable k = new geo(this);
  
  public gen(Context paramContext)
  {
    super(paramContext);
    SurfaceHolder localSurfaceHolder = getHolder();
    if (localSurfaceHolder == null) {
      throw new IllegalStateException("Failed to get the surface holder");
    }
    localSurfaceHolder.setFormat(3);
    setEGLContextClientVersion(2);
    setEGLConfigChooser(8, 8, 8, 8, 0, 0);
    this.a = new geu(this);
    setRenderer(this.a);
    setRenderMode(0);
  }
  
  private static boolean b(int paramInt)
  {
    return (paramInt == 3) || (paramInt == 7) || (paramInt == 107) || (paramInt == 502);
  }
  
  public final void a(FilterParameter paramFilterParameter)
  {
    this.e = paramFilterParameter;
  }
  
  public final void a(gfb paramgfb)
  {
    this.f = ((gfb)paramgfb);
    efj.Cv.a(this.f);
  }
  
  final void a(boolean paramBoolean, int paramInt)
  {
    try
    {
      if (!this.c.isEmpty())
      {
        Iterator localIterator2 = this.c.iterator();
        while (localIterator2.hasNext()) {
          post(new gep(this, (gfe)localIterator2.next()));
        }
        this.c.clear();
      }
    }
    finally {}
    if (!this.d.isEmpty())
    {
      Iterator localIterator1 = this.d.iterator();
      while (localIterator1.hasNext()) {
        post(new gep(this, (gfe)localIterator1.next()));
      }
    }
    if ((!paramBoolean) && (b(paramInt)))
    {
      removeCallbacks(this.k);
      postDelayed(this.k, 200L);
    }
    this.j = false;
  }
  
  public final boolean a()
  {
    if (this.b) {
      return false;
    }
    super.requestRender();
    return true;
  }
  
  /* Error */
  public final boolean a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 156	gen:j	Z
    //   6: ifne +23 -> 29
    //   9: getstatic 166	com/google/android/libraries/photoeditor/core/NativeCore:a	Lcom/google/android/libraries/photoeditor/core/NativeCore;
    //   12: invokevirtual 169	com/google/android/libraries/photoeditor/core/NativeCore:getCompare	()Z
    //   15: ifne +14 -> 29
    //   18: iload_1
    //   19: invokestatic 145	gen:b	(I)Z
    //   22: istore 4
    //   24: iload 4
    //   26: ifne +9 -> 35
    //   29: iconst_1
    //   30: istore_3
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_3
    //   34: ireturn
    //   35: iconst_0
    //   36: istore_3
    //   37: goto -6 -> 31
    //   40: astore_2
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_2
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	gen
    //   0	45	1	paramInt	int
    //   40	4	2	localObject	Object
    //   30	7	3	bool1	boolean
    //   22	3	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	24	40	finally
  }
  
  public final boolean a(gfb paramgfb, int paramInt1, int paramInt2, FilterParameter paramFilterParameter, int paramInt3, gfd paramgfd)
  {
    if (paramgfd == null) {
      throw new NullPointerException("Listener cannot be null");
    }
    queueEvent(new gfa(this, paramgfb, paramInt1, paramInt2, paramFilterParameter.c(), 3, paramgfd));
    return true;
  }
  
  public final boolean a(gfb paramgfb, Rect paramRect, FilterParameter paramFilterParameter, gff paramgff)
  {
    queueEvent(new ger(this, paramgfb, null, paramFilterParameter, paramgff));
    return true;
  }
  
  final void b()
  {
    try
    {
      this.j = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void c()
  {
    if (this.b) {
      return;
    }
    queueEvent(new geq(this));
    this.b = true;
    super.onPause();
  }
  
  public final void queueEvent(Runnable paramRunnable)
  {
    if (!this.b) {
      super.queueEvent(paramRunnable);
    }
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    this.i = paramInt;
    this.h = true;
    requestRender();
  }
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    super.surfaceCreated(paramSurfaceHolder);
    NativeCore.a.b = this;
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    NativeCore.a.b = null;
    efj.Cv.a(null);
    this.c.clear();
    this.d.clear();
    this.f = null;
    this.e = null;
    super.surfaceDestroyed(paramSurfaceHolder);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gen
 * JD-Core Version:    0.7.0.1
 */