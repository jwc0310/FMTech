import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.service.SkyjamPlaybackService;
import java.util.ArrayList;

public final class dzk
  extends View
  implements View.OnClickListener, dni, lxj
{
  private static boolean e;
  private static Bitmap f;
  private static Bitmap g;
  private static Bitmap h;
  private static Paint i;
  private static TextPaint j;
  private static loj k;
  String a;
  String b;
  String c;
  lma d;
  private Rect l;
  private Point m;
  private Rect n;
  private String o;
  private Bitmap p;
  private Point q;
  private lwj r;
  
  public dzk(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dzk(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dzk(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.r = ((lwj)mbb.a(paramContext, lwj.class));
    if (!e)
    {
      Resources localResources = getResources();
      e = true;
      f = efj.a(localResources, efj.oY);
      g = mfo.a(efj.a(localResources, efj.pD), f.getHeight());
      h = mfo.a(efj.a(localResources, efj.qe), f.getHeight());
      Paint localPaint = new Paint();
      i = localPaint;
      localPaint.setAntiAlias(true);
      i.setColor(localResources.getColor(efj.km));
      i.setStyle(Paint.Style.FILL);
      TextPaint localTextPaint = new TextPaint();
      j = localTextPaint;
      localTextPaint.setAntiAlias(true);
      j.setColor(localResources.getColor(efj.kp));
      j.setTextSize(localResources.getDimension(efj.nJ));
      lwj.a(j, efj.nJ);
      k = loj.a(paramContext);
    }
    this.m = new Point();
    this.q = new Point();
    this.l = new Rect();
    this.n = new Rect();
  }
  
  private final void a(String paramString)
  {
    Context localContext = getContext();
    Intent localIntent = new Intent(localContext, SkyjamPlaybackService.class);
    localIntent.setAction(paramString);
    localIntent.putExtra("account_id", ((git)mbb.a(localContext, git.class)).c());
    localIntent.putExtra("music_url", this.b);
    localIntent.putExtra("song", this.o);
    localIntent.putExtra("activity_id", this.a);
    localContext.startService(localIntent);
  }
  
  public final void D_()
  {
    this.a = null;
    this.b = null;
    this.c = null;
    this.o = null;
    this.m.set(0, 0);
    this.q.set(0, 0);
    this.l.setEmpty();
    this.n.setEmpty();
  }
  
  public final void a(String paramString1, boolean paramBoolean, String paramString2)
  {
    Bitmap localBitmap = this.p;
    if ((paramBoolean) && (paramString1 != null) && (paramString1.equals(this.b)))
    {
      this.p = h;
      if ((!this.b.equals(paramString1)) || (this.c.equals(paramString2))) {
        break label100;
      }
    }
    label100:
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        this.c = paramString2;
      }
      if ((localBitmap != this.p) || (i1 != 0)) {
        invalidate();
      }
      b();
      return;
      this.p = g;
      break;
    }
  }
  
  final void b()
  {
    Resources localResources = getResources();
    jr localjr = jr.a();
    String str1 = localjr.a(this.d.c);
    String str2 = localjr.a(this.d.a);
    if (SkyjamPlaybackService.a(this.b)) {}
    String str3;
    for (String str4 = localResources.getString(aau.aR);; str4 = localResources.getString(aau.aQ, new Object[] { str2, str3 }))
    {
      if (!TextUtils.isEmpty(str1)) {
        this.o = str1;
      }
      if (!TextUtils.isEmpty(str2)) {
        this.o = str2;
      }
      setContentDescription(str4);
      return;
      str3 = localjr.a(this.d.b);
    }
  }
  
  public final void c()
  {
    if (SkyjamPlaybackService.a(this.b))
    {
      a("com.google.android.apps.plus.service.SkyjamPlaybackService.STOP");
      return;
    }
    a("com.google.android.apps.plus.service.SkyjamPlaybackService.PLAY");
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    SkyjamPlaybackService.a.add(this);
  }
  
  public final void onClick(View paramView)
  {
    c();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    SkyjamPlaybackService.a.remove(this);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawRect(this.l, i);
    paramCanvas.drawText(this.c, this.m.x, this.m.y, j);
    paramCanvas.drawBitmap(this.p, this.q.x, this.q.y, null);
    paramCanvas.drawBitmap(f, null, this.n, null);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (SkyjamPlaybackService.a(this.b)) {}
    for (Bitmap localBitmap = h;; localBitmap = g)
    {
      this.p = localBitmap;
      int i1 = this.p.getHeight();
      int i2 = lwj.a(j);
      int i3 = f.getWidth();
      int i4 = f.getHeight();
      int i5 = Math.max(Math.max(i1, i2), i4) + 2 * k.m;
      int i6 = View.MeasureSpec.getSize(paramInt1);
      this.l.set(0, 0, i6, i5);
      int i7 = this.l.left + k.m;
      int i8 = this.l.top + (i5 - i1) / 2;
      this.q.set(i7, i8);
      int i9 = i7 + (this.p.getWidth() + k.m);
      int i10 = this.l.top + (i5 - i2) / 2 - (int)j.ascent();
      this.m.set(i9, i10);
      int i11 = this.l.right - i3;
      int i12 = this.l.top + (i5 - i4) / 2;
      this.n.set(i11, i12, i3 + i11, i4 + i12);
      setMeasuredDimension(i6, i5);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzk
 * JD-Core Version:    0.7.0.1
 */