import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class hfm
  extends ViewGroup
  implements lxj
{
  hfu a;
  public gqw b;
  public gqw c;
  boolean d;
  private final int e;
  private final int f;
  private final int g;
  private final int h;
  private final Drawable i;
  private final Drawable j;
  private final Paint k;
  private final int l;
  private final int m;
  private final int n;
  private final int o;
  private hfo p;
  private AvatarView q;
  private TextView r;
  private TextView s;
  private boolean t;
  private int u;
  private ImageView v;
  private boolean w;
  private boolean x;
  
  public hfm(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.h = localResources.getDimensionPixelSize(aau.yx);
    this.f = localResources.getDimensionPixelSize(aau.yz);
    this.g = localResources.getDimensionPixelSize(aau.yt);
    this.e = localResources.getInteger(efj.Gh);
    this.j = localResources.getDrawable(aau.yE);
    this.k = new Paint();
    this.k.setColor(localResources.getColor(aau.yg));
    this.k.setStyle(Paint.Style.STROKE);
    this.k.setStrokeWidth(localResources.getDimension(aau.yy));
    this.l = localResources.getDimensionPixelSize(aau.yu);
    ColorDrawable localColorDrawable = new ColorDrawable(localResources.getColor(aau.ym));
    Drawable localDrawable = localResources.getDrawable(aau.yH);
    this.i = efj.a(localColorDrawable, ColorStateList.valueOf(localResources.getColor(aau.yh)), localDrawable);
    setBackgroundDrawable(this.i);
    this.x = false;
    this.d = true;
    this.o = localResources.getDimensionPixelSize(aau.yA);
    this.m = localResources.getColor(aau.yo);
    this.n = localResources.getColor(aau.yi);
    this.q = new AvatarView(localContext);
    this.q.e = 1;
    this.q.a(0);
    this.p = new hfo(localContext);
    hfo localhfo = this.p;
    AvatarView localAvatarView = this.q;
    if (localhfo.a != null) {
      localhfo.removeView(localhfo.a);
    }
    localhfo.a = localAvatarView;
    if (localAvatarView != null) {
      localhfo.addView(localAvatarView);
    }
    this.p.setVisibility(8);
    addView(this.p);
    this.c = new gqw(this.p, this.q);
    this.r = new TextView(localContext);
    this.r.setTextAppearance(localContext, aau.yK);
    this.r.setMaxLines(this.e);
    this.r.setFocusableInTouchMode(true);
    this.r.setVisibility(8);
    addView(this.r);
    this.s = new TextView(localContext);
    this.s.setTextAppearance(localContext, aau.yN);
    this.s.setMaxLines(this.e);
    this.s.setVisibility(8);
    addView(this.s);
    this.a = new hfu(localContext);
    this.a.setTextAppearance(localContext, aau.yJ);
    this.a.a(true);
    this.a.setMovementMethod(lxy.a());
    this.a.setGravity(16);
    this.a.setMinWidth(this.l);
    this.a.setVisibility(8);
    addView(this.a);
    this.v = new ImageView(localContext);
    this.v.setImageDrawable(this.j);
    this.v.setVisibility(8);
    addView(this.v);
    this.b = new gqw(this);
  }
  
  public final void D_()
  {
    this.b.a(null);
    this.c.a(null);
    this.p.D_();
  }
  
  public final void a(int paramInt)
  {
    this.a.setMaxLines(paramInt);
    this.a.setEllipsize(TextUtils.TruncateAt.END);
    requestLayout();
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    if (this.t) {
      return;
    }
    int i1;
    int i2;
    label37:
    AvatarView localAvatarView;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      i1 = 1;
      this.r.setText(paramCharSequence);
      TextView localTextView = this.r;
      i2 = 0;
      if (i1 == 0) {
        break label82;
      }
      localTextView.setVisibility(i2);
      localAvatarView = this.q;
      if (i1 == 0) {
        break label89;
      }
    }
    label82:
    label89:
    for (String str = paramCharSequence.toString();; str = null)
    {
      localAvatarView.h = str;
      b();
      requestLayout();
      return;
      i1 = 0;
      break;
      i2 = 8;
      break label37;
    }
  }
  
  public final void a(CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    int i1 = 1;
    if ((this.t) || (this.w)) {
      return;
    }
    int i2 = Math.max(0, paramInt);
    int i3;
    int i5;
    label138:
    int i6;
    label164:
    label216:
    hfu localhfu;
    int i8;
    if (i2 > 0)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      if (!TextUtils.isEmpty(paramCharSequence))
      {
        i3 = i1;
        if (i3 != 0) {
          localSpannableStringBuilder.append(paramCharSequence).append("  ");
        }
        Resources localResources = getResources();
        int i4 = aw.eB;
        Object[] arrayOfObject = new Object[i1];
        arrayOfObject[0] = Integer.valueOf(i2);
        localSpannableStringBuilder.append(localResources.getString(i4, arrayOfObject));
        TextAppearanceSpan localTextAppearanceSpan = new TextAppearanceSpan(null, i1, this.o, null, null);
        if (!paramBoolean) {
          break label260;
        }
        i5 = this.n;
        ForegroundColorSpan localForegroundColorSpan = new ForegroundColorSpan(i5);
        if (i3 == 0) {
          break label269;
        }
        i6 = 1 + paramCharSequence.length();
        int i7 = localSpannableStringBuilder.length();
        localSpannableStringBuilder.setSpan(localTextAppearanceSpan, i6, i7, 33);
        localSpannableStringBuilder.setSpan(localForegroundColorSpan, i6, i7, 33);
        paramCharSequence = localSpannableStringBuilder.subSequence(0, localSpannableStringBuilder.length());
      }
    }
    else
    {
      if (TextUtils.isEmpty(paramCharSequence)) {
        break label275;
      }
      this.a.setText(paramCharSequence);
      localhfu = this.a;
      i8 = 0;
      if (i1 == 0) {
        break label281;
      }
    }
    for (;;)
    {
      localhfu.setVisibility(i8);
      b();
      requestLayout();
      return;
      i3 = 0;
      break;
      label260:
      i5 = this.m;
      break label138;
      label269:
      i6 = 0;
      break label164;
      label275:
      i1 = 0;
      break label216;
      label281:
      i8 = 8;
    }
  }
  
  public final void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if ((this.t) || (this.w)) {
      return;
    }
    int i1;
    TextView localTextView;
    int i2;
    if (!TextUtils.isEmpty(paramCharSequence1))
    {
      i1 = 1;
      this.s.setText(paramCharSequence1);
      localTextView = this.s;
      i2 = 0;
      if (i1 == 0) {
        break label74;
      }
    }
    for (;;)
    {
      localTextView.setVisibility(i2);
      this.s.setContentDescription(paramCharSequence2);
      b();
      requestLayout();
      return;
      i1 = 0;
      break;
      label74:
      i2 = 8;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.q.a(paramString1, paramString2);
    this.p.setVisibility(0);
    requestLayout();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.t = paramBoolean;
    if (paramBoolean)
    {
      Resources localResources = getResources();
      this.r.setText(localResources.getString(efj.Go));
      this.r.setVisibility(0);
      this.a.setText(localResources.getString(efj.Gn));
      this.a.setVisibility(0);
      this.s.setVisibility(8);
      this.v.setVisibility(0);
    }
    for (;;)
    {
      requestLayout();
      return;
      this.v.setVisibility(8);
    }
  }
  
  public final void b()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
      arrayOfCharSequence1[0] = this.r.getText();
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.s.getContentDescription();
      efj.a(localStringBuilder, arrayOfCharSequence2);
      CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
      arrayOfCharSequence3[0] = this.a.getText();
      efj.a(localStringBuilder, arrayOfCharSequence3);
      gqw localgqw = this.b;
      int i1;
      if ((localgqw.a == null) && (localgqw.b == null))
      {
        gqm localgqm = localgqw.c;
        i1 = 0;
        if (localgqm == null) {}
      }
      else
      {
        i1 = 1;
      }
      if (i1 != 0) {
        localStringBuilder.append(getContext().getString(efj.Gl));
      }
      setContentDescription(mfx.b(localStringBuilder));
      return;
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    this.w = paramBoolean;
    if (paramBoolean)
    {
      Resources localResources = getResources();
      this.a.setText(localResources.getString(efj.Gm));
      this.a.setVisibility(0);
      this.s.setVisibility(8);
      this.v.setVisibility(0);
    }
    for (;;)
    {
      requestLayout();
      return;
      this.v.setVisibility(8);
    }
  }
  
  public final void c()
  {
    c(false);
    this.p.D_();
    this.p.setVisibility(8);
    this.u = 0;
    this.c.a(null);
    a(false);
    b(false);
    a(null);
    a(null, null);
    a(null, 0, false);
    this.b.a(null);
    b();
  }
  
  public final void c(boolean paramBoolean)
  {
    int i1 = 1;
    this.x = paramBoolean;
    int i2;
    int i4;
    label40:
    int i5;
    label60:
    int i6;
    label80:
    int i7;
    label100:
    label105:
    int i3;
    if (this.p.getVisibility() != 8)
    {
      i2 = i1;
      if (i2 == 0)
      {
        if (this.r.getVisibility() == 8) {
          break label124;
        }
        i4 = i1;
        if (i4 == 0)
        {
          if (this.s.getVisibility() == 8) {
            break label130;
          }
          i5 = i1;
          if (i5 == 0)
          {
            if (this.a.getVisibility() == 8) {
              break label136;
            }
            i6 = i1;
            if (i6 == 0)
            {
              if (this.v.getVisibility() == 8) {
                break label142;
              }
              i7 = i1;
              if (i7 == 0) {
                break label148;
              }
            }
          }
        }
      }
      i3 = 0;
      if (i1 == 0) {
        break label153;
      }
    }
    for (;;)
    {
      setVisibility(i3);
      return;
      i2 = 0;
      break;
      label124:
      i4 = 0;
      break label40;
      label130:
      i5 = 0;
      break label60;
      label136:
      i6 = 0;
      break label80;
      label142:
      i7 = 0;
      break label100;
      label148:
      i1 = 0;
      break label105;
      label153:
      i3 = 8;
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.d) {
      return;
    }
    int i1 = getWidth();
    int i2 = getHeight();
    if (aau.a(getContext()))
    {
      paramCanvas.drawLine(0.0F, i2, i1 - this.g, i2, this.k);
      return;
    }
    paramCanvas.drawLine(this.g, i2, i1, i2, this.k);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = aau.a(getContext());
    int i1 = paramInt3 - paramInt1;
    int i2;
    int i3;
    int i4;
    label50:
    int i17;
    int i18;
    label116:
    int i5;
    label145:
    label190:
    int i6;
    int i7;
    label211:
    int i8;
    int i9;
    label233:
    int i15;
    int i14;
    if (bool)
    {
      i2 = this.h;
      i3 = i1 - this.f;
      if (this.p.getVisibility() == 8) {
        break label503;
      }
      i4 = 1;
      if (i4 != 0)
      {
        i17 = this.h - this.p.b();
        i18 = this.p.getMeasuredWidth();
        if (!bool) {
          break label509;
        }
        int i20 = i3 + this.p.b();
        this.p.layout(i20 - i18, i17, i20, i18 + i17);
      }
      if ((this.t) || (this.w))
      {
        if (this.v.getVisibility() == 8) {
          break label545;
        }
        i5 = 1;
        if (i5 != 0)
        {
          if (!bool) {
            break label551;
          }
          this.v.layout(i2, this.u, i2 + this.v.getMeasuredWidth(), this.u + this.v.getMeasuredHeight());
        }
      }
      i6 = this.h;
      if (this.r.getVisibility() == 8) {
        break label589;
      }
      i7 = 1;
      if (!bool) {
        break label595;
      }
      int i16 = i1 - this.g;
      i8 = i2;
      i9 = i16;
      if (i7 == 0) {
        break label722;
      }
      if (!bool) {
        break label608;
      }
      i15 = i9 - this.r.getMeasuredWidth();
      i14 = i9;
      label259:
      this.r.layout(i15, i6, i14, i6 + this.r.getMeasuredHeight());
    }
    label323:
    label337:
    label722:
    for (int i10 = i6 + this.r.getMeasuredHeight();; i10 = i6)
    {
      int i12;
      int i13;
      if ((!this.t) && (!this.w))
      {
        if (this.s.getVisibility() == 8) {
          break label627;
        }
        i12 = 1;
        if (i12 != 0)
        {
          if (i7 == 0) {
            break label633;
          }
          i13 = i10;
          if (!bool) {
            break label648;
          }
          this.s.layout(i8, i13 - this.s.getMeasuredHeight(), i8 + this.s.getMeasuredWidth(), i13);
        }
      }
      label373:
      int i11;
      if (this.a.getVisibility() != 8)
      {
        i11 = 1;
        if (i11 != 0)
        {
          if (!bool) {
            break label688;
          }
          this.a.layout(i9 - this.a.getMeasuredWidth(), i10, i9, i10 + this.a.getMeasuredHeight());
        }
      }
      for (;;)
      {
        if (efj.B(getContext()))
        {
          TextView localTextView1 = this.s;
          nj.a.c(localTextView1, 2);
          TextView localTextView2 = this.r;
          nj.a.c(localTextView2, 2);
          hfo localhfo = this.p;
          nj.a.c(localhfo, 2);
        }
        return;
        i2 = this.f;
        i3 = i1 - this.h;
        break;
        label503:
        i4 = 0;
        break label50;
        label509:
        int i19 = i2 - this.p.b();
        this.p.layout(i19, i17, i19 + i18, i18 + i17);
        break label116;
        i5 = 0;
        break label145;
        this.v.layout(i3 - this.v.getMeasuredWidth(), this.u, i3, this.u + this.v.getMeasuredHeight());
        break label190;
        i7 = 0;
        break label211;
        label595:
        i8 = this.g;
        i9 = i3;
        break label233;
        label608:
        i14 = i8 + this.r.getMeasuredWidth();
        i15 = i8;
        break label259;
        label627:
        i12 = 0;
        break label323;
        label633:
        i13 = i10 + this.s.getMeasuredHeight();
        break label337;
        this.s.layout(i9 - this.s.getMeasuredWidth(), i13 - this.s.getMeasuredHeight(), i9, i13);
        break label373;
        i11 = 0;
        break label388;
        this.a.layout(i8, i10, i8 + this.a.getMeasuredWidth(), i10 + this.a.getMeasuredHeight());
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (!this.x)
    {
      String str = String.valueOf(getClass().getCanonicalName());
      throw new IllegalStateException(64 + String.valueOf(str).length() + str + " expected to have been bound with valid data. Was bind() called?");
    }
    if (getVisibility() == 8)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int i1 = aau.a(getContext(), paramInt1);
    int i2 = 2 * this.h;
    int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i4;
    int i5;
    int i16;
    label172:
    int i7;
    int i8;
    if (this.p.getVisibility() != 8)
    {
      i4 = 1;
      if (i4 != 0) {
        this.p.measure(i3, i3);
      }
      i5 = i1 - this.h - this.g;
      if ((this.t) || (this.w)) {
        break label453;
      }
      if (this.s.getVisibility() == 8) {
        break label447;
      }
      i16 = 1;
      if (i16 == 0) {
        break label453;
      }
      this.s.measure(View.MeasureSpec.makeMeasureSpec(i5, -2147483648), i3);
      i7 = i5 - (this.s.getMeasuredWidth() + this.h);
      i8 = 0 + this.s.getMeasuredHeight();
    }
    for (;;)
    {
      int i9;
      label237:
      int i10;
      int i11;
      label295:
      int i15;
      if (this.r.getVisibility() != 8)
      {
        i9 = 1;
        if (i9 != 0)
        {
          this.r.measure(View.MeasureSpec.makeMeasureSpec(i7, -2147483648), i3);
          i8 = Math.max(i8, this.r.getMeasuredHeight());
        }
        i10 = i2 + i8;
        if (this.a.getVisibility() == 8) {
          break label533;
        }
        i11 = 1;
        if (i11 == 0) {
          break label545;
        }
        boolean bool = efj.B(getContext());
        hfu localhfu = this.a;
        if (!bool) {
          break label539;
        }
        i15 = this.l;
        label326:
        localhfu.setMinHeight(i15);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), i3);
      }
      label533:
      label539:
      label545:
      for (int i12 = i10 + this.a.getMeasuredHeight();; i12 = i10)
      {
        int i13 = this.p.getVisibility();
        int i14 = 0;
        if (i13 != 8) {
          i14 = 1;
        }
        if (i14 != 0) {
          i12 = Math.max(i12, this.p.getMeasuredHeight());
        }
        if ((this.t) || (this.w)) {
          this.u = ((i12 - this.v.getMeasuredHeight()) / 2);
        }
        setMeasuredDimension(i1, i12);
        return;
        i4 = 0;
        break;
        label447:
        i16 = 0;
        break label172;
        label453:
        if ((!this.t) && (!this.w)) {
          break label552;
        }
        if (this.v.getVisibility() != 8) {}
        for (int i6 = 1;; i6 = 0)
        {
          if (i6 == 0) {
            break label552;
          }
          this.v.measure(i3, i3);
          i7 = i5 - (this.v.getMeasuredWidth() + this.h);
          i8 = 0;
          break;
        }
        i9 = 0;
        break label237;
        i11 = 0;
        break label295;
        i15 = 0;
        break label326;
      }
      label552:
      i7 = i5;
      i8 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfm
 * JD-Core Version:    0.7.0.1
 */