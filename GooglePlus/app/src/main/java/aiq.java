import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.RectF;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import java.security.InvalidParameterException;

public final class aiq
{
  public static final FilterChain c = new FilterChain();
  public int a = 2048;
  public int b = 2048;
  public Bitmap d;
  public Bitmap e;
  public Bitmap f;
  public Bitmap g;
  public FilterChain h;
  public boolean i = true;
  public boolean j;
  
  public static boolean a(int paramInt)
  {
    return (paramInt == 6) || (paramInt == 5);
  }
  
  public final Bitmap a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null)) {
      return this.e;
    }
    if (paramBoolean)
    {
      if ((this.h != null) && ((this.h.getRotationAngle() != 0.0F) || (this.h.getCropRectX() > 0.0F) || (this.h.getCropRectY() > 0.0F) || (this.h.getCropRectWidth() < 1.0F) || (this.h.getCropRectHeight() < 1.0F) || (this.h.getPostRotation() != 0))) {}
      for (int k = 1; k != 0; k = 0)
      {
        FilterChain localFilterChain = new FilterChain();
        RectF localRectF = new RectF(0.0F, 0.0F, this.h.getCropRectWidth(), this.h.getCropRectHeight());
        localRectF.offsetTo(this.h.getCropRectX(), this.h.getCropRectY());
        localFilterChain.a(localRectF, this.h.getRotationAngle(), this.h.getAspectRatio(), this.h.getPostRotation(), this.d.getWidth(), this.d.getHeight());
        this.e = BitmapHelper.a(NativeCore.a.renderFilterChain(this.d, localFilterChain, 3, false), this.a, this.b);
        return this.e;
      }
    }
    return BitmapHelper.a(this.d, this.a, this.b);
  }
  
  public final void a()
  {
    if (this.f != null)
    {
      if (this.f != this.g) {
        this.f.recycle();
      }
      this.f = null;
    }
    this.g = null;
  }
  
  public final void a(Bitmap paramBitmap, FilterChain paramFilterChain, ais paramais)
  {
    int k;
    label49:
    boolean bool1;
    if (paramBitmap != null) {
      for (;;)
      {
        try
        {
          if (!paramBitmap.sameAs(this.d)) {
            break label49;
          }
        }
        finally {}
        if ((k != 0) && (this.d == null))
        {
          throw new InvalidParameterException("Invalid source bitmap reference (cannot be null during the initial call)");
          k = 0;
        }
        else
        {
          if ((paramBitmap != null) && (paramBitmap.getConfig() != Bitmap.Config.ARGB_8888))
          {
            paramBitmap = paramBitmap.copy(Bitmap.Config.ARGB_8888, false);
            if (paramBitmap == null) {
              throw new IllegalStateException("Failed to convert the image pixel format");
            }
          }
          this.e = null;
          if ((k == 0) && (this.d != null))
          {
            this.d.recycle();
            this.d = null;
          }
          a();
          this.h = null;
          if (k == 0) {
            this.d = paramBitmap;
          }
          this.j = false;
          if (paramFilterChain == null) {
            break label228;
          }
          int m = paramFilterChain.size();
          bool1 = false;
          if (m == 0)
          {
            boolean bool2 = paramFilterChain.c();
            bool1 = false;
            if (!bool2) {
              break label228;
            }
          }
        }
      }
    }
    for (;;)
    {
      this.i = bool1;
      if (paramais == null) {
        a(paramFilterChain);
      }
      for (;;)
      {
        return;
        new air(this, paramais).execute(new Object[] { paramFilterChain });
      }
      k = 1;
      break;
      label228:
      bool1 = true;
    }
  }
  
  public final void a(FilterChain paramFilterChain)
  {
    try
    {
      if (this.d == null) {
        throw new IllegalStateException("The source image was not yet set up");
      }
    }
    finally {}
    a();
    this.e = null;
    if (paramFilterChain == null) {
      this.h = new FilterChain();
    }
    for (;;)
    {
      b();
      return;
      this.h = paramFilterChain;
      this.f = NativeCore.a.renderFilterChain(this.d, paramFilterChain, 3, false);
      a(true);
    }
  }
  
  public final Bitmap b()
  {
    if (this.g != null) {
      return this.g;
    }
    this.g = BitmapHelper.a(c(), this.a, this.b);
    return this.g;
  }
  
  public final Bitmap c()
  {
    if (this.f != null) {
      return this.f;
    }
    return this.d;
  }
  
  public final boolean d()
  {
    return (this.h != null) && ((this.h.size() > 0) || (this.h.c()));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aiq
 * JD-Core Version:    0.7.0.1
 */