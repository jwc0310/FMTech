import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import java.util.List;

public final class dzr
  extends ViewGroup
  implements View.OnClickListener, View.OnLongClickListener, loq, lxj
{
  AvatarView a;
  CirclesButton b;
  lmn c;
  lob d;
  int e;
  String f;
  String g;
  boolean h;
  private StaticLayout i;
  private StaticLayout j;
  private int k;
  private boolean l = true;
  private final lwj m;
  private final loj n;
  
  public dzr(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dzr(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dzr(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.n = loj.a(paramContext);
    git localgit = (git)mbb.a(paramContext, git.class);
    boolean bool = ((hul)mbb.a(paramContext, hul.class)).a(localgit.c());
    setWillNotDraw(false);
    setFocusable(true);
    setClickable(true);
    setOnClickListener(this);
    this.a = new AvatarView(paramContext, paramAttributeSet, 0);
    this.a.a(1);
    this.a.e = 1;
    this.a.setOnClickListener(this);
    this.b = new CirclesButton(paramContext, paramAttributeSet, 0);
    this.b.b(bool);
    this.b.setOnClickListener(new gxn(this));
    this.b.setOnLongClickListener(new gxo(this));
    this.b.a(7);
    this.m = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public static int a(Context paramContext)
  {
    ((lwj)mbb.a(paramContext, lwj.class));
    int i1 = efj.i(paramContext);
    return Math.max(Math.max(lwj.a(efj.B(paramContext, efj.yI)) + lwj.a(efj.B(paramContext, efj.yD)), i1), 0) + 2 * loj.a(paramContext).m;
  }
  
  private static boolean a(int paramInt)
  {
    return (paramInt != 3) && (paramInt != 10);
  }
  
  public final void D_()
  {
    clearAnimation();
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        lwo.h(this);
        setAlpha(1.0F);
      }
      this.a.ap_();
      this.i = null;
      this.j = null;
      this.k = 0;
      this.c = null;
      this.e = 0;
      this.d = null;
      this.f = null;
      this.h = false;
      return;
    }
  }
  
  public final void a(List<String> paramList)
  {
    this.b.a(paramList);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      this.l = true;
      this.b.a(7);
      this.b.a(b());
      this.b.setContentDescription(c());
    }
    for (;;)
    {
      drawableStateChanged();
      return;
      this.l = false;
    }
  }
  
  final String b()
  {
    if ((this.e == 3) || (this.e == 10)) {}
    for (int i1 = aau.hT;; i1 = aau.bF) {
      return getContext().getResources().getString(i1);
    }
  }
  
  final String c()
  {
    switch (this.e)
    {
    }
    for (int i1 = aau.uE;; i1 = aau.hT) {
      return getContext().getResources().getString(i1);
    }
  }
  
  public final String d()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.e;
  }
  
  protected final void drawableStateChanged()
  {
    invalidate();
    super.drawableStateChanged();
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final void f()
  {
    gwz.a(this, 21);
    if (this.d != null) {
      this.d.a(this.c.e, this.c.d, this.e, this.f);
    }
  }
  
  public final lxc g()
  {
    return this.c;
  }
  
  @ViewDebug.ExportedProperty(category="accessibility")
  public final CharSequence getContentDescription()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder1;
    CharSequence[] arrayOfCharSequence1;
    Object localObject;
    CharSequence[] arrayOfCharSequence2;
    StringBuilder localStringBuilder2;
    if (localmfz.b == 1)
    {
      localStringBuilder1 = localmfz.a;
      if (this.i != null)
      {
        CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
        arrayOfCharSequence3[0] = this.i.getText();
        efj.a(localStringBuilder1, arrayOfCharSequence3);
      }
      if (this.j != null)
      {
        if (!this.c.c.d) {
          break label134;
        }
        arrayOfCharSequence1 = new CharSequence[1];
        localObject = this.j.getText();
        arrayOfCharSequence2 = arrayOfCharSequence1;
        localStringBuilder2 = localStringBuilder1;
      }
    }
    for (;;)
    {
      arrayOfCharSequence1[0] = localObject;
      efj.a(localStringBuilder2, arrayOfCharSequence2);
      return mfx.b(localStringBuilder1);
      localStringBuilder1 = new StringBuilder(256);
      break;
      label134:
      arrayOfCharSequence1 = new CharSequence[1];
      lmn locallmn = this.c;
      Context localContext = getContext();
      if (!TextUtils.isEmpty(locallmn.f))
      {
        localObject = locallmn.f;
        arrayOfCharSequence2 = arrayOfCharSequence1;
        localStringBuilder2 = localStringBuilder1;
      }
      else
      {
        localObject = efj.c(localContext, locallmn.a, locallmn.b);
        arrayOfCharSequence2 = arrayOfCharSequence1;
        localStringBuilder2 = localStringBuilder1;
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((this.d == null) || (this.c == null) || (this.c.c == null)) {}
    do
    {
      return;
      lmi locallmi = this.c.c;
      if ((paramView == this.a) || (paramView == this))
      {
        ((gvj)mbb.a(getContext(), gvj.class)).a(this.a);
        this.d.a(locallmi.a, this.c.d, this.e);
        return;
      }
    } while (paramView != this.b);
    this.d.a(this.c.e, this.c.c.b, a(this.e), this.c.d, this.f, this.e, this.l);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = getWidth();
    int i2 = getHeight();
    paramCanvas.drawColor(this.n.aq);
    int i3 = this.a.c + 2 * this.n.m;
    int i4 = this.k;
    if (this.i != null)
    {
      paramCanvas.translate(i3, i4);
      this.i.draw(paramCanvas);
      paramCanvas.translate(-i3, -i4);
      i4 += this.i.getHeight();
    }
    if (this.c != null)
    {
      lmi locallmi = this.c.c;
      if ((locallmi != null) && (locallmi.d))
      {
        paramCanvas.drawBitmap(this.n.y, i3, i4, null);
        i3 += this.n.y.getWidth() + this.n.k;
      }
    }
    if (this.j != null)
    {
      paramCanvas.translate(i3, i4);
      this.j.draw(paramCanvas);
      paramCanvas.translate(-i3, -i4);
    }
    if (this.h)
    {
      int i5 = (int)(i2 - this.n.u.getStrokeWidth());
      paramCanvas.drawLine(0.0F, i5, i1, i5, this.n.u);
    }
    if ((isPressed()) || (isFocused()))
    {
      this.n.x.setBounds(0, 0, i1, i2);
      this.n.x.draw(paramCanvas);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getMeasuredHeight();
    int i2 = getMeasuredWidth();
    int i3 = this.a.c;
    int i4 = (i1 - i3) / 2;
    this.a.layout(this.n.m, i4, i3 + this.n.m, i4 + i3);
    int i5 = Math.min(i2 - i3 - 4 * this.n.m, this.n.aT);
    this.b.measure(View.MeasureSpec.makeMeasureSpec(i5, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
    int i6 = this.b.getMeasuredHeight();
    int i7 = (i1 - i6) / 2;
    this.b.layout(i2 - this.b.getMeasuredWidth() - this.n.m, i7, i2 - this.n.m, i6 + i7);
  }
  
  public final boolean onLongClick(View paramView)
  {
    if (paramView == this.b) {
      return this.d.a(this.c.e, this.c.c.b, a(this.e), this.c.d, this.f, this.e);
    }
    return false;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = this.a.c;
    int i3 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    this.a.measure(i3, i3);
    int i4 = i1 - i2 - 4 * this.n.m;
    int i5 = Math.min(i4, this.n.aT);
    this.b.measure(View.MeasureSpec.makeMeasureSpec(i5, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
    int i6 = i4 - this.b.getMeasuredWidth();
    Context localContext = getContext();
    String str = this.c.c.b;
    if (!TextUtils.isEmpty(str))
    {
      lwj locallwj2 = this.m;
      TextPaint localTextPaint2 = efj.B(localContext, efj.yr);
      Layout.Alignment localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
      TextUtils.TruncateAt localTruncateAt2 = TextUtils.TruncateAt.END;
      int i11 = Math.max(i6, 0);
      this.i = new StaticLayout(locallwj2.a(str, localTextPaint2, i11, localTruncateAt2, null), localTextPaint2, i11, localAlignment2, 1.0F, 0.0F, false);
    }
    for (int i7 = 0 + this.i.getHeight();; i7 = 0)
    {
      boolean bool = this.c.c.d;
      Object localObject;
      if (bool)
      {
        localObject = this.g;
        if (!bool) {
          break label383;
        }
      }
      label383:
      for (int i8 = i6 - (this.n.y.getWidth() + this.n.k);; i8 = i6)
      {
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          lwj locallwj1 = this.m;
          TextPaint localTextPaint1 = efj.B(localContext, efj.yD);
          Layout.Alignment localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
          TextUtils.TruncateAt localTruncateAt1 = TextUtils.TruncateAt.END;
          int i10 = Math.max(i8, 0);
          this.j = new StaticLayout(locallwj1.a((CharSequence)localObject, localTextPaint1, i10, localTruncateAt1, null), localTextPaint1, i10, localAlignment1, 1.0F, 0.0F, false);
          i7 += this.j.getHeight();
        }
        int i9 = a(localContext);
        this.k = ((i9 - i7) / 2);
        setMeasuredDimension(i1, i9);
        efj.i(this);
        return;
        localObject = this.c.c();
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzr
 * JD-Core Version:    0.7.0.1
 */