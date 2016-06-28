import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;

public final class ggs
  extends ghp
{
  public float a;
  private final Rect b = new Rect();
  private Bitmap c;
  private final Paint d = new Paint();
  private float e = 1.0F;
  private Paint f;
  private final Matrix g = new Matrix();
  
  public ggs(ParameterOverlayView paramParameterOverlayView)
  {
    super(paramParameterOverlayView);
    this.d.setFilterBitmap(true);
  }
  
  @UsedByNative
  private final float getPreviewAlpha()
  {
    return this.e;
  }
  
  @UsedByNative
  private final void setPreviewAlpha(float paramFloat)
  {
    this.e = paramFloat;
    this.n.invalidate();
  }
  
  public final void a(int paramInt)
  {
    if ((0xFF000000 & paramInt) != 0)
    {
      this.f = new Paint();
      this.f.setColor(paramInt);
    }
    for (;;)
    {
      this.n.invalidate();
      return;
      this.f = null;
    }
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.c = paramBitmap;
    if (paramBitmap != null) {
      this.b.set(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    }
    this.n.invalidate();
  }
  
  public final void a(Canvas paramCanvas)
  {
    if (this.f == null) {
      return;
    }
    this.f.setAlpha((int)(255.0F * this.e));
    RectF localRectF = this.n.b();
    if ((this.c == null) || (localRectF == null) || (localRectF.isEmpty()))
    {
      paramCanvas.drawRect(0.0F, 0.0F, this.n.getWidth(), this.n.getHeight(), this.f);
      return;
    }
    paramCanvas.save(2);
    paramCanvas.clipRect(localRectF, Region.Op.DIFFERENCE);
    paramCanvas.drawRect(0.0F, 0.0F, this.n.getWidth(), this.n.getHeight(), this.f);
    paramCanvas.restore();
    int i = this.c.getWidth();
    int j = this.c.getHeight();
    float f1 = i / 2.0F;
    float f2 = j / 2.0F;
    this.g.setTranslate(-f1, -f2);
    this.g.postRotate(this.a);
    int k;
    if ((this.a == 90.0F) || (this.a == 270.0F))
    {
      k = 1;
      if (k == 0) {
        break label307;
      }
      this.g.postTranslate(f2, f1);
      label218:
      this.g.postTranslate(localRectF.left, localRectF.top);
      if (k == 0) {
        break label322;
      }
    }
    label307:
    label322:
    for (float f3 = localRectF.height() / i;; f3 = localRectF.width() / i)
    {
      this.g.postScale(f3, f3, localRectF.left, localRectF.top);
      this.d.setAlpha((int)(255.0F * this.e));
      paramCanvas.drawBitmap(this.c, this.g, this.d);
      return;
      k = 0;
      break;
      this.g.postTranslate(f1, f2);
      break label218;
    }
  }
  
  @TargetApi(11)
  public final void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (Build.VERSION.SDK_INT >= 11))
    {
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this, "previewAlpha", new float[] { 1.0F, 0.0F });
      localObjectAnimator.setInterpolator(new AccelerateInterpolator());
      localObjectAnimator.setDuration(300L);
      localObjectAnimator.addListener(new ggt(this));
      localObjectAnimator.start();
      return;
    }
    a(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggs
 * JD-Core Version:    0.7.0.1
 */