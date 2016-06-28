import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.Button;
import com.google.android.libraries.social.media.ui.MediaView;

public final class lpz
  extends ViewGroup
  implements View.OnClickListener, gxs, lxj
{
  private int A;
  private final lwj B;
  public String a;
  public llu b;
  public llu c;
  public String d;
  public boolean e;
  public boolean f;
  private loj g;
  private String h;
  private String i;
  private lqa j;
  private StaticLayout k;
  private StaticLayout l;
  private Button m;
  private int n;
  private int o;
  private StaticLayout p;
  private MediaView q;
  private Rect r;
  private Rect s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public lpz(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.g = loj.a(localContext);
    this.r = new Rect();
    this.s = new Rect();
    this.B = ((lwj)mbb.a(localContext, lwj.class));
    setWillNotDraw(false);
    setFocusable(true);
    setClickable(true);
    setOnClickListener(new gxn(this));
    this.e = false;
    this.q = new MediaView(localContext);
    this.q.E = 2;
    this.q.s = 0;
    this.q.b(1);
    this.q.N = 0.5F;
    this.q.p = null;
    this.q.b(false);
    this.q.setVisibility(8);
    addView(this.q);
  }
  
  private final void b()
  {
    removeAllViews();
    this.q.D_();
    this.q.setVisibility(8);
    this.a = null;
    this.i = null;
    this.h = null;
    this.b = null;
    this.c = null;
    this.j = null;
    this.k = null;
    this.l = null;
    this.n = 0;
    this.o = 0;
    this.d = null;
    this.p = null;
    this.r.setEmpty();
    this.s.setEmpty();
    this.u = 0;
    this.v = 0;
    this.t = 0;
    this.A = 0;
    this.m = null;
    this.w = 0;
    this.x = 0;
    this.f = false;
    this.e = false;
  }
  
  public final void D_()
  {
    b();
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, llu paramllu1, llu paramllu2, String paramString6, String paramString7, int paramInt1, int paramInt2, boolean paramBoolean, lqa paramlqa, int paramInt3, int paramInt4)
  {
    b();
    this.a = paramString1;
    this.h = paramString3;
    this.c = paramllu1;
    label80:
    int i3;
    label152:
    boolean bool2;
    label167:
    Button localButton1;
    label284:
    label331:
    Button localButton2;
    if (paramllu2 != null)
    {
      this.b = paramllu2;
      Context localContext = getContext();
      if (TextUtils.isEmpty(paramString2)) {
        break label431;
      }
      ipf localipf = ipf.a(localContext, paramString2, ipm.a);
      if (paramInt2 <= 0) {
        break label392;
      }
      mbb.b(localContext).a(log.class);
      this.y = log.a(paramInt2);
      this.t = (this.y / 4);
      this.u = paramInt3;
      this.v = paramInt4;
      int i1 = this.u;
      int i2 = this.v;
      if (i1 < 400) {
        break label401;
      }
      double d1 = i1 / i2;
      if ((d1 > 2.5D) || (d1 < 0.5555555555555556D)) {
        break label401;
      }
      i3 = 1;
      if ((i3 == 0) || (this.c != null)) {
        break label407;
      }
      bool2 = true;
      this.f = bool2;
      if (this.f)
      {
        if (this.u / this.v < 0.5625D)
        {
          this.v = ((int)(this.u / 0.5625D));
          this.z = ((int)(this.y / 0.5625D));
        }
        this.i = paramString5;
      }
      if (localipf != null)
      {
        this.q.setVisibility(0);
        this.q.a(localipf);
        addView(this.q);
        if (!this.f) {
          break label413;
        }
        this.q.b(this.y, this.z);
      }
      this.d = paramString4;
      this.j = paramlqa;
      if (this.m != null) {
        removeView(this.m);
      }
      if (this.c != null)
      {
        if (this.m == null) {
          break label444;
        }
        localButton1 = this.m;
        addView(localButton1);
        localButton2 = this.m;
        if (paramlqa == null) {
          break label602;
        }
      }
    }
    label392:
    label401:
    label407:
    label413:
    label431:
    label444:
    label602:
    for (boolean bool1 = true;; bool1 = false)
    {
      localButton2.setEnabled(bool1);
      if ((paramBoolean) || (this.c != null)) {
        this.i = paramString5;
      }
      efj.i(this);
      requestLayout();
      return;
      paramllu2 = paramllu1;
      break;
      this.y = paramInt1;
      break label80;
      i3 = 0;
      break label152;
      bool2 = false;
      break label167;
      this.q.b(this.t, this.t);
      break label284;
      this.t = 0;
      this.y = 0;
      break label284;
      this.m = new Button(getContext());
      this.m.setSingleLine(true);
      this.m.setEllipsize(TextUtils.TruncateAt.END);
      this.m.setTextAppearance(getContext(), aw.eg);
      this.m.setGravity(16);
      this.m.setBackgroundResource(ehr.gC);
      this.m.setCompoundDrawablesWithIntrinsicBounds(ehr.fP, 0, 0, 0);
      this.m.setCompoundDrawablePadding(this.g.n);
      this.m.setPadding(this.g.aQ, 0, this.g.aQ, 0);
      this.m.setOnClickListener(new gxn(this));
      efj.a(this.m, new gxq(pkh.e));
      localButton1 = this.m;
      break label331;
    }
  }
  
  public final void a(llx paramllx, llu paramllu1, llu paramllu2, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean, lqa paramlqa)
  {
    a(paramllx.a, paramllx.e, paramllx.c, paramllx.d, paramllx.b, paramllu1, paramllu2, paramString1, paramString2, paramInt1, paramInt2, false, paramlqa, paramllx.k, paramllx.l);
  }
  
  protected final void drawableStateChanged()
  {
    invalidate();
    super.drawableStateChanged();
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
      arrayOfCharSequence1[0] = getContext().getString(do.aT);
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.a;
      efj.a(localStringBuilder, arrayOfCharSequence2);
      CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
      arrayOfCharSequence3[0] = this.i;
      efj.a(localStringBuilder, arrayOfCharSequence3);
      return mfx.b(localStringBuilder);
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.j == null) {}
    do
    {
      return;
      if (paramView == this)
      {
        this.j.a(this.h, this.b);
        return;
      }
    } while (paramView != this.m);
    this.j.a(this.c);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    if (this.f)
    {
      if ((!this.e) && (this.q.getVisibility() == 0)) {
        paramCanvas.drawRect(this.s, this.g.aW);
      }
      int i8 = getWidth();
      int i9 = this.g.aZ;
      int i10 = this.x + this.g.aX;
      if (this.k != null)
      {
        paramCanvas.translate(i9, i10);
        this.k.draw(paramCanvas);
        paramCanvas.translate(-i9, -i10);
        i10 += this.k.getHeight() + this.g.aX;
      }
      if (this.p != null)
      {
        paramCanvas.translate(i9, i10);
        this.p.draw(paramCanvas);
        paramCanvas.translate(-i9, -i10);
        i10 += this.p.getHeight() + this.g.bb;
      }
      if (this.l != null)
      {
        paramCanvas.translate(i9, i10);
        this.l.draw(paramCanvas);
        paramCanvas.translate(-i9, -i10);
        this.l.getHeight();
      }
      if ((this.j != null) && ((isPressed()) || (isFocused())))
      {
        this.g.x.setBounds(0, 0, i8, getHeight());
        this.g.x.draw(paramCanvas);
      }
      return;
    }
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = this.g.m;
    int i4 = this.g.m;
    float f1 = this.g.u.getStrokeWidth() / 2.0F;
    paramCanvas.drawLine(i3, f1, i1 - i3, f1, this.g.u);
    if (this.q.getVisibility() == 0) {}
    for (int i5 = i3 + (this.g.m + this.t);; i5 = i3)
    {
      if (this.k != null)
      {
        paramCanvas.translate(i5, i4);
        this.k.draw(paramCanvas);
        paramCanvas.translate(-i5, -i4);
      }
      for (int i6 = i4 + (this.k.getHeight() + this.g.m);; i6 = i4)
      {
        if (this.l != null)
        {
          int i7 = Math.max(i6, this.t + 2 * this.g.m);
          paramCanvas.translate(i3, i7);
          this.l.draw(paramCanvas);
          paramCanvas.translate(-i3, -i7);
          i6 = i7 + (this.l.getHeight() + this.g.m);
        }
        for (;;)
        {
          if (this.p != null)
          {
            paramCanvas.translate(i3, i6);
            this.p.draw(paramCanvas);
            paramCanvas.translate(-i3, -i6);
            this.p.getHeight();
          }
          if ((this.j == null) || ((!isPressed()) && (!isFocused()))) {
            break;
          }
          this.g.x.setBounds(0, 0, i1, i2);
          this.g.x.draw(paramCanvas);
          return;
          i3 = i5;
        }
      }
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.m != null) && (this.m.getParent() == this)) {
      this.m.layout(this.n, this.o, this.n + this.m.getMeasuredWidth(), this.o + this.m.getMeasuredHeight());
    }
    if (this.q.getVisibility() == 0) {
      this.q.layout(this.r.left, this.r.top, this.r.right, this.r.bottom);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i19;
    int i20;
    Context localContext2;
    int i21;
    int i22;
    label70:
    TextPaint localTextPaint6;
    lwj locallwj6;
    String str6;
    Layout.Alignment localAlignment6;
    TextUtils.TruncateAt localTruncateAt6;
    int i37;
    Object localObject4;
    label130:
    StaticLayout localStaticLayout4;
    if (this.f)
    {
      i19 = View.MeasureSpec.getSize(paramInt1);
      i20 = i19 - this.g.aZ - this.g.ba;
      localContext2 = getContext();
      if ((this.c != null) && (this.m != null))
      {
        i21 = 1;
        if (i21 == 0) {
          break label517;
        }
        i22 = this.g.U;
        if (TextUtils.isEmpty(this.a)) {
          break label2251;
        }
        localTextPaint6 = efj.B(localContext2, aw.eq);
        locallwj6 = this.B;
        str6 = this.a;
        localAlignment6 = Layout.Alignment.ALIGN_NORMAL;
        localTruncateAt6 = TextUtils.TruncateAt.END;
        i37 = Math.max(i20, 0);
        if (i22 != 0) {
          break label529;
        }
        localObject4 = "";
        localStaticLayout4 = new StaticLayout((CharSequence)localObject4, localTextPaint6, i37, localAlignment6, 1.0F, 0.0F, false);
        label150:
        this.k = localStaticLayout4;
      }
    }
    label517:
    label529:
    label1172:
    label1186:
    label1834:
    label1840:
    label2230:
    label2251:
    for (int i23 = 0 + (this.k.getHeight() + this.g.aX);; i23 = 0)
    {
      if (!TextUtils.isEmpty(this.d))
      {
        TextPaint localTextPaint5 = efj.B(localContext2, aw.ek);
        lwj locallwj5 = this.B;
        String str5 = this.d;
        Layout.Alignment localAlignment5 = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt localTruncateAt5 = TextUtils.TruncateAt.END;
        int i36 = Math.max(i20, 0);
        this.p = new StaticLayout(locallwj5.a(str5, localTextPaint5, i36, localTruncateAt5, null), localTextPaint5, i36, localAlignment5, 1.0F, 0.0F, false);
      }
      for (int i24 = i23 + (this.p.getHeight() + this.g.bb);; i24 = i23)
      {
        int i33;
        TextPaint localTextPaint4;
        lwj locallwj4;
        String str4;
        Layout.Alignment localAlignment4;
        TextUtils.TruncateAt localTruncateAt4;
        int i34;
        Object localObject3;
        label348:
        StaticLayout localStaticLayout3;
        if (!TextUtils.isEmpty(this.i))
        {
          i33 = this.g.bd;
          localTextPaint4 = efj.B(localContext2, aw.el);
          locallwj4 = this.B;
          str4 = this.i;
          localAlignment4 = Layout.Alignment.ALIGN_NORMAL;
          localTruncateAt4 = TextUtils.TruncateAt.END;
          i34 = Math.max(i20, 0);
          if (i33 == 0)
          {
            localObject3 = "";
            localStaticLayout3 = new StaticLayout((CharSequence)localObject3, localTextPaint4, i34, localAlignment4, 1.0F, 0.0F, false);
            label368:
            this.l = localStaticLayout3;
          }
        }
        for (int i25 = i24 + (this.l.getHeight() + this.g.aX);; i25 = i24)
        {
          if (i21 != 0)
          {
            this.m.setText(this.c.a(localContext2));
            this.m.setMaxWidth(i20);
            this.m.measure(View.MeasureSpec.makeMeasureSpec(i20, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.n = (2 * this.g.m + this.t);
            this.o = i25;
            i25 += this.m.getMeasuredHeight() + this.g.m;
          }
          if ((this.u != 0) && (this.v != 0)) {
            break label889;
          }
          setMeasuredDimension(i19, i25);
          return;
          i21 = 0;
          break;
          i22 = this.g.bc;
          break label70;
          if (i22 == 1)
          {
            localObject4 = locallwj6.a(str6, localTextPaint6, i37, localTruncateAt6, null);
            break label130;
          }
          localStaticLayout4 = new StaticLayout(str6, localTextPaint6, i37, localAlignment6, 1.0F, 0.0F, false);
          if (localStaticLayout4.getLineCount() <= i22) {
            break label150;
          }
          int i38 = localStaticLayout4.getLineEnd(i22 - 2);
          SpannableStringBuilder localSpannableStringBuilder4 = new SpannableStringBuilder(str6.subSequence(0, i38));
          boolean bool4 = str6 instanceof Spanned;
          if (bool4) {
            efj.k();
          }
          for (lwm locallwm4 = locallwj6.b;; locallwm4 = null)
          {
            localSpannableStringBuilder4.append(locallwj6.a(str6.subSequence(i38, str6.length()), localTextPaint6, i37, localTruncateAt6, locallwm4));
            if (bool4) {
              lwj.a((Spanned)str6, i38, localSpannableStringBuilder4, locallwm4);
            }
            localObject4 = localSpannableStringBuilder4;
            break;
          }
          if (i33 == 1)
          {
            localObject3 = locallwj4.a(str4, localTextPaint4, i34, localTruncateAt4, null);
            break label348;
          }
          localStaticLayout3 = new StaticLayout(str4, localTextPaint4, i34, localAlignment4, 1.0F, 0.0F, false);
          if (localStaticLayout3.getLineCount() <= i33) {
            break label368;
          }
          int i35 = localStaticLayout3.getLineEnd(i33 - 2);
          SpannableStringBuilder localSpannableStringBuilder3 = new SpannableStringBuilder(str4.subSequence(0, i35));
          boolean bool3 = str4 instanceof Spanned;
          if (bool3) {
            efj.k();
          }
          for (lwm locallwm3 = locallwj4.b;; locallwm3 = null)
          {
            localSpannableStringBuilder3.append(locallwj4.a(str4.subSequence(i35, str4.length()), localTextPaint4, i34, localTruncateAt4, locallwm3));
            if (bool3) {
              lwj.a((Spanned)str4, i35, localSpannableStringBuilder3, locallwm3);
            }
            localObject3 = localSpannableStringBuilder3;
            break;
          }
          this.l = null;
        }
        label889:
        if (!this.e) {}
        for (int i26 = i19 - 2 * this.g.aY;; i26 = i19)
        {
          int i27 = i26 * this.v / this.u;
          if ((i26 != this.w) || (i27 != this.x))
          {
            this.w = i26;
            this.x = i27;
          }
          if (this.e) {}
          for (int i28 = 0;; i28 = this.g.aY)
          {
            this.r.set(i28, this.g.aY, i28 + this.w, this.g.aY + this.x);
            int i29 = View.MeasureSpec.makeMeasureSpec(this.w, 1073741824);
            int i30 = View.MeasureSpec.makeMeasureSpec(this.x, 1073741824);
            this.q.measure(i29, i30);
            int i31 = i25 + (this.g.aX + this.x);
            int i32 = (int)this.g.t.getStrokeWidth();
            this.s.set(this.r.left, this.r.top, this.r.right, i31 - i32);
            setMeasuredDimension(i19, i31);
            return;
          }
          int i1 = View.MeasureSpec.getSize(paramInt1);
          int i2 = i1 - 2 * this.g.m;
          Context localContext1 = getContext();
          int i3;
          int i4;
          int i5;
          int i6;
          if ((this.c != null) && (this.m != null))
          {
            i3 = 1;
            if (TextUtils.isEmpty(this.d)) {
              break label1834;
            }
            i4 = 1;
            if (i3 == 0) {
              break label1840;
            }
            i5 = this.g.U;
            i6 = 2 * this.g.m;
            if (this.t > 0)
            {
              this.r.set(this.g.m, this.g.m, this.g.m + this.t, this.g.m + this.t);
              int i18 = View.MeasureSpec.makeMeasureSpec(this.t, 1073741824);
              this.q.measure(i18, i18);
            }
            if (this.t <= 0) {
              break label2230;
            }
          }
          for (int i7 = i2 - (this.g.m + this.t);; i7 = i2)
          {
            TextPaint localTextPaint3;
            lwj locallwj3;
            String str3;
            Layout.Alignment localAlignment3;
            TextUtils.TruncateAt localTruncateAt3;
            int i16;
            Object localObject2;
            label1356:
            StaticLayout localStaticLayout2;
            if (!TextUtils.isEmpty(this.a))
            {
              localTextPaint3 = efj.B(localContext1, aw.en);
              locallwj3 = this.B;
              str3 = this.a;
              localAlignment3 = Layout.Alignment.ALIGN_NORMAL;
              localTruncateAt3 = TextUtils.TruncateAt.END;
              i16 = Math.max(i7, 0);
              if (i5 == 0)
              {
                localObject2 = "";
                localStaticLayout2 = new StaticLayout((CharSequence)localObject2, localTextPaint3, i16, localAlignment3, 1.0F, 0.0F, false);
                label1376:
                this.k = localStaticLayout2;
              }
            }
            for (int i8 = i6 + (this.k.getHeight() + this.g.m);; i8 = i6)
            {
              TextPaint localTextPaint2;
              lwj locallwj2;
              String str2;
              int i13;
              Layout.Alignment localAlignment2;
              TextUtils.TruncateAt localTruncateAt2;
              int i14;
              Object localObject1;
              label1492:
              StaticLayout localStaticLayout1;
              label1512:
              int i9;
              if (!TextUtils.isEmpty(this.i))
              {
                int i12 = Math.max(i8, this.t + 2 * this.g.m);
                localTextPaint2 = efj.B(localContext1, aw.ex);
                locallwj2 = this.B;
                str2 = this.i;
                i13 = this.g.T;
                localAlignment2 = Layout.Alignment.ALIGN_NORMAL;
                localTruncateAt2 = TextUtils.TruncateAt.END;
                i14 = Math.max(i2, 0);
                if (i13 == 0)
                {
                  localObject1 = "";
                  localStaticLayout1 = new StaticLayout((CharSequence)localObject1, localTextPaint2, i14, localAlignment2, 1.0F, 0.0F, false);
                  this.l = localStaticLayout1;
                  i9 = i12 + (this.l.getHeight() + this.g.m);
                  if (i4 == 0) {
                    break label2216;
                  }
                  TextPaint localTextPaint1 = efj.B(getContext(), aw.el);
                  lwj locallwj1 = this.B;
                  String str1 = this.d;
                  Layout.Alignment localAlignment1 = Layout.Alignment.ALIGN_NORMAL;
                  TextUtils.TruncateAt localTruncateAt1 = TextUtils.TruncateAt.END;
                  int i11 = Math.max(i2, 0);
                  this.p = new StaticLayout(locallwj1.a(str1, localTextPaint1, i11, localTruncateAt1, null), localTextPaint1, i11, localAlignment1, 1.0F, 0.0F, false);
                }
              }
              for (int i10 = i9 + (this.p.getHeight() + this.g.m);; i10 = i9)
              {
                if (i3 != 0)
                {
                  this.m.setText(this.c.a(localContext1));
                  this.m.setMaxWidth(i2);
                  this.m.measure(View.MeasureSpec.makeMeasureSpec(i2, -2147483648), View.MeasureSpec.makeMeasureSpec(0, 0));
                  this.n = (2 * this.g.m + this.t);
                  this.o = i10;
                  i10 += this.m.getMeasuredHeight() + this.g.m;
                }
                if (this.t == 0)
                {
                  this.A = Math.max((this.g.aa + 2 * this.g.m - i10) / 2, this.g.m);
                  if (this.m != null) {
                    this.o += this.A;
                  }
                }
                setMeasuredDimension(i1, Math.max(i10 + 2 * this.A, this.t + 2 * this.g.m));
                return;
                i3 = 0;
                break;
                i4 = 0;
                break label1172;
                i5 = this.g.S;
                break label1186;
                if (i5 == 1)
                {
                  localObject2 = locallwj3.a(str3, localTextPaint3, i16, localTruncateAt3, null);
                  break label1356;
                }
                localStaticLayout2 = new StaticLayout(str3, localTextPaint3, i16, localAlignment3, 1.0F, 0.0F, false);
                if (localStaticLayout2.getLineCount() <= i5) {
                  break label1376;
                }
                int i17 = localStaticLayout2.getLineEnd(i5 - 2);
                SpannableStringBuilder localSpannableStringBuilder2 = new SpannableStringBuilder(str3.subSequence(0, i17));
                boolean bool2 = str3 instanceof Spanned;
                if (bool2) {
                  efj.k();
                }
                for (lwm locallwm2 = locallwj3.b;; locallwm2 = null)
                {
                  localSpannableStringBuilder2.append(locallwj3.a(str3.subSequence(i17, str3.length()), localTextPaint3, i16, localTruncateAt3, locallwm2));
                  if (bool2) {
                    lwj.a((Spanned)str3, i17, localSpannableStringBuilder2, locallwm2);
                  }
                  localObject2 = localSpannableStringBuilder2;
                  break;
                }
                if (i13 == 1)
                {
                  localObject1 = locallwj2.a(str2, localTextPaint2, i14, localTruncateAt2, null);
                  break label1492;
                }
                localStaticLayout1 = new StaticLayout(str2, localTextPaint2, i14, localAlignment2, 1.0F, 0.0F, false);
                if (localStaticLayout1.getLineCount() <= i13) {
                  break label1512;
                }
                int i15 = localStaticLayout1.getLineEnd(i13 - 2);
                SpannableStringBuilder localSpannableStringBuilder1 = new SpannableStringBuilder(str2.subSequence(0, i15));
                boolean bool1 = str2 instanceof Spanned;
                if (bool1) {
                  efj.k();
                }
                for (lwm locallwm1 = locallwj2.b;; locallwm1 = null)
                {
                  localSpannableStringBuilder1.append(locallwj2.a(str2.subSequence(i15, str2.length()), localTextPaint2, i14, localTruncateAt2, locallwm1));
                  if (bool1) {
                    lwj.a((Spanned)str2, i15, localSpannableStringBuilder1, locallwm1);
                  }
                  localObject1 = localSpannableStringBuilder1;
                  break;
                }
                this.l = null;
                i2 = i7;
                i9 = i8;
                break label1538;
              }
            }
          }
        }
      }
    }
  }
  
  public final gxq v()
  {
    return new gxq(pkh.o);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpz
 * JD-Core Version:    0.7.0.1
 */