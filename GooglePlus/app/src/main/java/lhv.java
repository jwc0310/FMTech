import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.squares.membership.JoinButton;
import java.text.NumberFormat;

public final class lhv
  extends ViewGroup
  implements View.OnClickListener, gxs, loq, lxj
{
  final loj a;
  lob b;
  int c;
  Bitmap d;
  lnt e;
  String f;
  int g;
  private StaticLayout h;
  private StaticLayout i;
  private StaticLayout j;
  private int k;
  private int l;
  private final int m;
  private MediaView n;
  private int o;
  private JoinButton p;
  private lfr q;
  private final lwj r;
  
  public lhv(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    mbb localmbb = mbb.b(localContext);
    this.a = loj.a(localContext);
    this.m = getResources().getInteger(efj.Yw);
    this.q = ((lfr)localmbb.a(lfr.class));
    this.p = new JoinButton(localContext);
    this.p.setPadding(this.a.aQ, this.a.aQ, this.a.aQ, this.a.aQ);
    this.p.setTextAppearance(localContext, eyg.bM);
    this.p.b = true;
    this.n = new MediaView(localContext);
    this.n.s = 0;
    this.n.b(1);
    this.n.N = 0.5F;
    this.n.n = true;
    this.r = ((lwj)localmbb.a(lwj.class));
    setWillNotDraw(false);
    setFocusable(true);
    setClickable(true);
    setOnClickListener(this);
  }
  
  public static int a(Context paramContext)
  {
    loj localloj = loj.a(paramContext);
    ((lwj)mbb.a(paramContext, lwj.class));
    int i1 = lwj.a(efj.B(paramContext, eyg.bP));
    int i2 = lwj.a(efj.B(paramContext, eyg.bN));
    int i3 = lwj.a(efj.B(paramContext, eyg.bN)) * paramContext.getResources().getInteger(efj.Yw);
    return lwj.a(efj.B(paramContext, eyg.bO)) + (i3 + (i2 + (i1 + localloj.l) + localloj.l) + localloj.l) + 2 * localloj.m;
  }
  
  @TargetApi(11)
  public final void D_()
  {
    removeAllViews();
    clearAnimation();
    if (Build.VERSION.SDK_INT >= 14) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        lwo.h(this);
        setAlpha(1.0F);
      }
      this.b = null;
      this.e = null;
      this.g = 0;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = 0;
      this.l = 0;
      this.n.ap_();
      this.o = 0;
      return;
    }
  }
  
  protected final void drawableStateChanged()
  {
    invalidate();
    super.drawableStateChanged();
  }
  
  public final boolean e()
  {
    return this.g == 8;
  }
  
  public final void f()
  {
    if (this.b != null) {
      this.b.a(this.e.a, this.e.g, this.g, this.f);
    }
  }
  
  public final lxc g()
  {
    return this.e;
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
      arrayOfCharSequence1[0] = this.e.b;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      if (this.i != null)
      {
        CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
        arrayOfCharSequence3[0] = this.i.getText();
        efj.a(localStringBuilder, arrayOfCharSequence3);
      }
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.e.c;
      efj.a(localStringBuilder, arrayOfCharSequence2);
      return mfx.b(localStringBuilder);
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.b != null)
    {
      lob locallob = this.b;
      String str = this.e.a;
      if (!TextUtils.isEmpty(this.e.f)) {}
      locallob.e(str, this.e.g);
    }
    gwz.a(this, 4);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = this.o + 2 * this.a.m;
    int i2 = this.k;
    if (this.h != null)
    {
      paramCanvas.translate(i1, i2);
      this.h.draw(paramCanvas);
      paramCanvas.translate(-i1, -i2);
      i2 += this.h.getHeight() + this.a.l;
    }
    if (this.i != null)
    {
      int i5 = Math.max(this.d.getHeight(), this.i.getHeight());
      int i6 = (i5 - this.d.getHeight()) / 2;
      paramCanvas.drawBitmap(this.d, i1, i6 + i2, null);
      int i7 = i1 + (this.d.getWidth() + this.a.k);
      int i8 = (i5 - this.i.getHeight()) / 2;
      paramCanvas.translate(i7, i2 + i8);
      this.i.draw(paramCanvas);
      paramCanvas.translate(-i7, -(i8 + i2));
      i1 = i7 - (this.d.getWidth() + this.a.k);
      i2 += this.i.getHeight() + this.a.l;
    }
    if (this.j != null)
    {
      paramCanvas.translate(i1, i2);
      this.j.draw(paramCanvas);
      paramCanvas.translate(-i1, -i2);
      this.j.getHeight();
    }
    int i3 = getWidth();
    int i4 = getHeight();
    paramCanvas.drawLine(0.0F, i4, i3, i4, this.a.u);
    if ((isPressed()) || (isFocused()))
    {
      this.a.x.setBounds(0, 0, i3, i4);
      this.a.x.draw(paramCanvas);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.n.getParent() == this) {
      this.n.layout(this.a.m, this.l, this.a.m + this.o, this.l + this.o);
    }
    if (this.p.getParent() == this)
    {
      int i1 = (this.a.m << 1) + this.o;
      int i2 = this.k;
      if (this.h != null) {
        i2 += this.h.getHeight() + this.a.l;
      }
      if (this.i != null) {
        i2 += this.i.getHeight() + this.a.l;
      }
      if (this.j != null) {
        i2 += this.j.getHeight() + this.a.l;
      }
      this.p.layout(i1, i2, i1 + this.p.getMeasuredWidth(), i2 + this.p.getMeasuredHeight());
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = i1 - 2 * this.a.m;
    this.o = Math.min(i2 / 4, this.c - 2 * this.a.m);
    removeView(this.n);
    String str1 = this.e.d;
    if (!TextUtils.isEmpty(str1))
    {
      this.n.b(this.o, this.o);
      this.n.a(ipf.a(getContext(), str1, ipm.a));
      addView(this.n);
    }
    Context localContext = getContext();
    Resources localResources = getResources();
    int i3 = i2 - this.o - this.a.m;
    if (!TextUtils.isEmpty(this.e.b))
    {
      lwj locallwj3 = this.r;
      TextPaint localTextPaint2 = efj.B(localContext, eyg.bP);
      String str6 = this.e.b;
      Layout.Alignment localAlignment3 = Layout.Alignment.ALIGN_NORMAL;
      TextUtils.TruncateAt localTruncateAt3 = TextUtils.TruncateAt.END;
      int i17 = Math.max(i3, 0);
      this.h = new StaticLayout(locallwj3.a(str6, localTextPaint2, i17, localTruncateAt3, null), localTextPaint2, i17, localAlignment3, 1.0F, 0.0F, false);
    }
    for (int i4 = 0 + (this.h.getHeight() + this.a.l);; i4 = 0)
    {
      int i5;
      TextPaint localTextPaint1;
      String str3;
      label312:
      int i9;
      lwj locallwj2;
      String str5;
      int i13;
      Layout.Alignment localAlignment2;
      TextUtils.TruncateAt localTruncateAt2;
      int i14;
      Object localObject;
      label477:
      StaticLayout localStaticLayout;
      if (!TextUtils.isEmpty(this.e.f))
      {
        i5 = 1;
        localTextPaint1 = efj.B(localContext, eyg.bN);
        if (i5 == 0) {
          break label686;
        }
        int i16 = aau.CK;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.e.f;
        str3 = localResources.getString(i16, arrayOfObject);
        int i7 = i3 - this.d.getWidth() - this.a.k;
        lwj locallwj1 = this.r;
        Layout.Alignment localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt localTruncateAt1 = TextUtils.TruncateAt.END;
        int i8 = Math.max(i7, 0);
        this.i = new StaticLayout(locallwj1.a(str3, localTextPaint1, i8, localTruncateAt1, null), localTextPaint1, i8, localAlignment1, 1.0F, 0.0F, false);
        i9 = i4 + (this.i.getHeight() + this.a.l);
        if ((i5 != 0) || (TextUtils.isEmpty(this.e.c))) {
          break label920;
        }
        locallwj2 = this.r;
        str5 = this.e.c;
        i13 = this.m;
        localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
        localTruncateAt2 = TextUtils.TruncateAt.END;
        i14 = Math.max(i3, 0);
        if (i13 != 0) {
          break label730;
        }
        localObject = "";
        localStaticLayout = new StaticLayout((CharSequence)localObject, localTextPaint1, i14, localAlignment2, 1.0F, 0.0F, false);
        label497:
        this.j = localStaticLayout;
      }
      label920:
      for (int i10 = i9 + (this.j.getHeight() + this.a.l);; i10 = i9)
      {
        if (this.p.getParent() == null) {
          addView(this.p);
        }
        JoinButton localJoinButton = this.p;
        String str4 = this.e.a;
        kxg localkxg = efj.e(this.e.k, this.e.j);
        localJoinButton.a = str4;
        localJoinButton.a(localkxg);
        this.q.a(this.p);
        this.p.measure(View.MeasureSpec.makeMeasureSpec(i3, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
        int i11 = i10 + this.p.getMeasuredHeight();
        setMeasuredDimension(i1, this.c);
        this.k = ((this.c - i11) / 2);
        if (i11 >= this.o) {}
        for (int i12 = this.k;; i12 = (this.c - this.o) / 2)
        {
          this.l = i12;
          efj.i(this);
          return;
          i5 = 0;
          break;
          label686:
          int i6 = this.e.e;
          String str2 = NumberFormat.getIntegerInstance().format(i6);
          str3 = localResources.getQuantityString(efj.Yx, i6, new Object[] { str2 });
          break label312;
          label730:
          if (i13 == 1)
          {
            localObject = locallwj2.a(str5, localTextPaint1, i14, localTruncateAt2, null);
            break label477;
          }
          localStaticLayout = new StaticLayout(str5, localTextPaint1, i14, localAlignment2, 1.0F, 0.0F, false);
          if (localStaticLayout.getLineCount() <= i13) {
            break label497;
          }
          int i15 = localStaticLayout.getLineEnd(i13 - 2);
          SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(str5.subSequence(0, i15));
          boolean bool = str5 instanceof Spanned;
          if (bool) {
            efj.k();
          }
          for (lwm locallwm = locallwj2.b;; locallwm = null)
          {
            localSpannableStringBuilder.append(locallwj2.a(str5.subSequence(i15, str5.length()), localTextPaint1, i14, localTruncateAt2, locallwm));
            if (bool) {
              lwj.a((Spanned)str5, i15, localSpannableStringBuilder, locallwm);
            }
            localObject = localSpannableStringBuilder;
            break;
          }
        }
      }
    }
  }
  
  public final gxq v()
  {
    return new kuw(pjo.u, this.e.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhv
 * JD-Core Version:    0.7.0.1
 */