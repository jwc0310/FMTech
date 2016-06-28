import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.CropImageView;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;

public final class ajt
  extends akx
{
  private final ToolButton[] a = new ToolButton[3];
  private int b = -1;
  
  private final void V()
  {
    int i = 0;
    if (i < this.a.length)
    {
      ToolButton localToolButton = this.a[i];
      if (localToolButton != null) {
        if (i != this.b) {
          break label43;
        }
      }
      label43:
      for (boolean bool = true;; bool = false)
      {
        localToolButton.setSelected(bool);
        i++;
        break;
      }
    }
  }
  
  protected final void A()
  {
    new ajx(this).execute(new Void[0]);
  }
  
  protected final boolean E()
  {
    return false;
  }
  
  protected final View F()
  {
    return new CropImageView(f());
  }
  
  protected final void G() {}
  
  protected final void H() {}
  
  protected final gfg I()
  {
    return null;
  }
  
  protected final gfh J()
  {
    return null;
  }
  
  protected final gfc K()
  {
    return null;
  }
  
  protected final void L()
  {
    Resources localResources = g();
    int i = localResources.getDimensionPixelOffset(efj.ca);
    int j = localResources.getDimensionPixelOffset(efj.bX);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localLayoutParams.topMargin = i;
    localLayoutParams.bottomMargin = j;
    localLayoutParams.gravity = 17;
    ((CropImageView)this.ai).setLayoutParams(localLayoutParams);
  }
  
  protected final void a(alm paramalm)
  {
    ToolButton[] arrayOfToolButton1 = this.a;
    int i = efj.fd;
    int j = efj.fc;
    int k = efj.gM;
    arrayOfToolButton1[2] = paramalm.a(i, j, 0, g().getString(k), new aju(this));
    ToolButton[] arrayOfToolButton2 = this.a;
    int m = efj.fh;
    int n = efj.fg;
    int i1 = efj.gL;
    arrayOfToolButton2[1] = paramalm.a(m, n, 0, g().getString(i1), new ajv(this));
    ToolButton[] arrayOfToolButton3 = this.a;
    int i2 = efj.ff;
    int i3 = efj.fe;
    int i4 = efj.gK;
    arrayOfToolButton3[0] = paramalm.a(i2, i3, 0, g().getString(i4), new ajw(this));
    V();
  }
  
  protected final void a(ParameterOverlayView paramParameterOverlayView) {}
  
  public final String b(int paramInt, Object paramObject)
  {
    return "";
  }
  
  final void d(int paramInt)
  {
    CropImageView localCropImageView = (CropImageView)this.ai;
    if (localCropImageView == null)
    {
      Log.e("CropFragment", "Illegal update preview image request: the view is not yet initialized!");
      return;
    }
    int i;
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Invalid aspect ratio index");
    case 0: 
      localCropImageView.b(0.0F, false);
      i = 0;
    }
    for (;;)
    {
      a(42, Integer.valueOf(i), false);
      this.b = paramInt;
      V();
      return;
      localCropImageView.a(localCropImageView.b(), true);
      i = 2;
      continue;
      localCropImageView.a(1.0F, true);
      i = 1;
    }
  }
  
  protected final void e_()
  {
    Bitmap localBitmap1 = M().b();
    float f1 = efj.e(M().h.getPostRotation());
    Matrix localMatrix;
    if (f1 != 0.0F)
    {
      localMatrix = new Matrix();
      localMatrix.setRotate(f1, localBitmap1.getWidth() / 2.0F, localBitmap1.getHeight() / 2.0F);
    }
    for (Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, 0, localBitmap1.getWidth(), localBitmap1.getHeight(), localMatrix, false);; localBitmap2 = localBitmap1)
    {
      CropImageView localCropImageView = (CropImageView)this.ai;
      int i;
      if (localCropImageView != null)
      {
        localCropImageView.a(localBitmap2);
        FilterParameter localFilterParameter = N();
        switch (localFilterParameter.getParameterInteger(42))
        {
        default: 
          i = -1;
          d(i);
          float f2 = localFilterParameter.getParameterFloat(43);
          float f3 = localFilterParameter.getParameterFloat(45);
          float f4 = localFilterParameter.getParameterFloat(44);
          float f5 = localFilterParameter.getParameterFloat(46);
          int j = localBitmap2.getWidth();
          int k = localBitmap2.getHeight();
          int m = Math.round(f2 * j);
          int n = Math.round(f3 * k);
          int i1 = Math.round(j * (f4 - f2));
          int i2 = Math.round(k * (f5 - f3));
          float f6 = m;
          float f7 = n;
          float f8 = i1;
          float f9 = i2;
          float f10 = localCropImageView.a.getWidth();
          float f11 = localCropImageView.a.getHeight();
          float f12 = efj.a(f6, 0.0F, f10);
          float f13 = efj.a(f7, 0.0F, f11);
          float f14 = efj.a(f8 + f6, 0.0F, f10);
          float f15 = efj.a(f9 + f7, 0.0F, f11);
          localCropImageView.b.set(f12, f13, f14, f15);
          localCropImageView.c = true;
          localCropImageView.invalidate();
        }
      }
      for (;;)
      {
        j(false);
        bp localbp = f();
        if (localbp != null) {
          localbp.setRequestedOrientation(2);
        }
        return;
        i = 0;
        break;
        i = 1;
        break;
        i = 2;
        break;
        Log.e("CropFragment", "Illegal update preview image request: the view is not yet initialized!");
      }
    }
  }
  
  public final void n()
  {
    CropImageView localCropImageView = (CropImageView)this.ai;
    if (localCropImageView != null)
    {
      RectF localRectF = localCropImageView.a();
      FilterParameter localFilterParameter = N();
      localFilterParameter.setParameterFloat(43, localRectF.left);
      localFilterParameter.setParameterFloat(45, localRectF.top);
      localFilterParameter.setParameterFloat(44, localRectF.right);
      localFilterParameter.setParameterFloat(46, localRectF.bottom);
    }
    super.n();
  }
  
  public final gxq v()
  {
    return new gxq(pjw.g);
  }
  
  public final int w()
  {
    return 6;
  }
  
  protected final boolean x()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajt
 * JD-Core Version:    0.7.0.1
 */