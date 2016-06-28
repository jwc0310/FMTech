import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class lqf
  extends ViewGroup
  implements View.OnClickListener, loq, lxj
{
  public lob a;
  public hxh b;
  public String c;
  public AvatarView d;
  public int e;
  String f;
  String g;
  String h;
  private loj i;
  private StaticLayout j;
  private StaticLayout k;
  private StaticLayout l;
  private StaticLayout m;
  private StaticLayout n;
  private int o;
  
  public lqf(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private lqf(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private lqf(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.i = loj.a(paramContext);
    setWillNotDraw(false);
    setFocusable(true);
    setClickable(true);
    setOnClickListener(this);
    this.d = new AvatarView(paramContext, paramAttributeSet, 0);
    this.d.a(2);
  }
  
  public static int a(Context paramContext)
  {
    loj localloj = loj.a(paramContext);
    ((lwj)mbb.a(paramContext, lwj.class));
    return lwj.a(efj.B(paramContext, aw.eq)) + localloj.l + 3 * lwj.a(efj.B(paramContext, aw.el)) + localloj.m + lwj.a(efj.B(paramContext, aw.ee)) + 2 * localloj.m;
  }
  
  public final void D_()
  {
    this.a = null;
    this.d.ap_();
    this.j = null;
    this.k = null;
    this.l = null;
    this.m = null;
    this.n = null;
    this.e = 0;
    this.o = 0;
    this.f = null;
    this.g = null;
    this.h = null;
    clearAnimation();
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 0;
    if (i1 >= 14) {
      i2 = 1;
    }
    if (i2 != 0)
    {
      lwo.h(this);
      setAlpha(1.0F);
    }
  }
  
  protected final void drawableStateChanged()
  {
    invalidate();
    super.drawableStateChanged();
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public final void f()
  {
    if (this.a != null) {
      this.a.a(this.b.a, null, 9, this.c);
    }
  }
  
  public final lxc g()
  {
    return this.b;
  }
  
  @ViewDebug.ExportedProperty(category="accessibility")
  public final CharSequence getContentDescription()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.b.b;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.g;
      efj.a(localStringBuilder, arrayOfCharSequence2);
      CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
      arrayOfCharSequence3[0] = this.b.e;
      efj.a(localStringBuilder, arrayOfCharSequence3);
      CharSequence[] arrayOfCharSequence4 = new CharSequence[1];
      arrayOfCharSequence4[0] = this.h;
      efj.a(localStringBuilder, arrayOfCharSequence4);
      CharSequence[] arrayOfCharSequence5 = new CharSequence[1];
      arrayOfCharSequence5[0] = this.f;
      efj.a(localStringBuilder, arrayOfCharSequence5);
      return mfx.b(localStringBuilder);
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.a != null) {
      this.a.f(this.b.a, this.b.j);
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = this.d.c + 2 * this.i.m;
    int i4 = this.o;
    if (this.j != null)
    {
      paramCanvas.translate(i3, i4);
      this.j.draw(paramCanvas);
      paramCanvas.translate(-i3, -i4);
      i4 += this.j.getHeight() + this.i.l;
    }
    if (this.k != null)
    {
      paramCanvas.translate(i3, i4);
      this.k.draw(paramCanvas);
      paramCanvas.translate(-i3, -i4);
      i4 += this.k.getHeight();
    }
    if (this.l != null)
    {
      paramCanvas.translate(i3, i4);
      this.l.draw(paramCanvas);
      paramCanvas.translate(-i3, -i4);
      i4 += this.l.getHeight();
    }
    if (this.m != null)
    {
      paramCanvas.translate(i3, i4);
      this.m.draw(paramCanvas);
      paramCanvas.translate(-i3, -i4);
      i4 += this.m.getHeight();
    }
    if (this.n != null)
    {
      int i5 = i4 + this.i.m;
      paramCanvas.drawBitmap(this.i.ao, i3, i5, null);
      int i6 = i3 + (this.i.ao.getWidth() + this.i.k);
      paramCanvas.translate(i6, i5);
      this.n.draw(paramCanvas);
      paramCanvas.translate(-i6, -i5);
      this.i.ao.getWidth();
      this.n.getHeight();
    }
    paramCanvas.drawLine(0.0F, i2, i1, i2, this.i.u);
    if ((isPressed()) || (isFocused()))
    {
      this.i.x.setBounds(0, 0, i1, i2);
      this.i.x.draw(paramCanvas);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.d.c;
    this.d.layout(this.i.m, this.o, i1 + this.i.m, i1 + this.o);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = this.d.c;
    int i3 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    this.d.measure(i3, i3);
    int i4 = i1 - i2 - 3 * this.i.m;
    Context localContext = getContext();
    lwj locallwj = (lwj)mbb.a(localContext, lwj.class);
    String str1 = this.b.b;
    TextPaint localTextPaint1 = efj.B(localContext, aw.eq);
    Layout.Alignment localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
    TextUtils.TruncateAt localTruncateAt1 = TextUtils.TruncateAt.END;
    int i5 = Math.max(i4, 0);
    this.j = new StaticLayout(locallwj.a(str1, localTextPaint1, i5, localTruncateAt1, null), localTextPaint1, i5, localAlignment1, 1.0F, 0.0F, false);
    int i6 = 0 + (this.j.getHeight() + this.i.l);
    TextPaint localTextPaint2 = efj.B(localContext, aw.el);
    if (this.g != null)
    {
      String str5 = this.g;
      Layout.Alignment localAlignment5 = Layout.Alignment.ALIGN_NORMAL;
      TextUtils.TruncateAt localTruncateAt5 = TextUtils.TruncateAt.END;
      int i12 = Math.max(i4, 0);
      this.k = new StaticLayout(locallwj.a(str5, localTextPaint2, i12, localTruncateAt5, null), localTextPaint2, i12, localAlignment5, 1.0F, 0.0F, false);
      i6 += this.k.getHeight();
    }
    String str2 = this.b.e;
    if (str2 != null)
    {
      Layout.Alignment localAlignment4 = Layout.Alignment.ALIGN_NORMAL;
      TextUtils.TruncateAt localTruncateAt4 = TextUtils.TruncateAt.END;
      int i11 = Math.max(i4, 0);
      this.l = new StaticLayout(locallwj.a(str2, localTextPaint2, i11, localTruncateAt4, null), localTextPaint2, i11, localAlignment4, 1.0F, 0.0F, false);
      i6 += this.l.getHeight();
    }
    if (this.h != null)
    {
      String str4 = this.h;
      Layout.Alignment localAlignment3 = Layout.Alignment.ALIGN_NORMAL;
      TextUtils.TruncateAt localTruncateAt3 = TextUtils.TruncateAt.END;
      int i10 = Math.max(i4, 0);
      this.m = new StaticLayout(locallwj.a(str4, localTextPaint2, i10, localTruncateAt3, null), localTextPaint2, i10, localAlignment3, 1.0F, 0.0F, false);
      i6 += this.m.getHeight();
    }
    int i7 = i4 - this.i.ao.getWidth() - this.i.k;
    if ((this.f != null) && (i7 > 0))
    {
      int i8 = i6 + this.i.m;
      TextPaint localTextPaint3 = efj.B(localContext, aw.ee);
      String str3 = this.f;
      Layout.Alignment localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
      TextUtils.TruncateAt localTruncateAt2 = TextUtils.TruncateAt.END;
      int i9 = Math.max(i7, 0);
      this.n = new StaticLayout(locallwj.a(str3, localTextPaint3, i9, localTruncateAt2, null), localTextPaint3, i9, localAlignment2, 1.0F, 0.0F, false);
      i6 = i8 + this.n.getHeight();
    }
    setMeasuredDimension(i1, this.e);
    this.o = ((this.e - i6) / 2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lqf
 * JD-Core Version:    0.7.0.1
 */