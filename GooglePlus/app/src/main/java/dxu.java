import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewDebug.ExportedProperty;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import java.util.ArrayList;
import java.util.List;

public final class dxu
  extends loa
  implements View.OnClickListener, huv, lor
{
  private lol a;
  private String d;
  private String e;
  private String f;
  private int g;
  private StaticLayout h;
  private StaticLayout i;
  private TextView j;
  private lnr k;
  private int l;
  private String m;
  private boolean n;
  private ill o;
  
  public dxu(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dxu(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dxu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    setClickable(true);
    setFocusable(true);
    this.a = new lol(this, do.ba);
    this.a.b = true;
    this.j = new TextView(paramContext, paramAttributeSet, 0);
    ill localill = new ill(paramContext, ((git)mbb.a(paramContext, git.class)).c());
    localill.a.add(ine.class);
    this.o = localill;
  }
  
  public final void D_()
  {
    super.D_();
    this.a.D_();
    lwo.e(this);
    removeAllViews();
    this.j.setBackgroundResource(0);
    this.j.setOnClickListener(null);
    this.j.setClickable(false);
    this.d = null;
    this.e = null;
    this.f = null;
    this.h = null;
    this.i = null;
    this.k = null;
    this.l = 0;
    this.m = null;
    this.n = false;
    this.Q = null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    int i2 = paramInt2 + this.H.aP;
    int i8;
    int i7;
    label106:
    float f1;
    if (!TextUtils.isEmpty(this.d))
    {
      if (this.n)
      {
        i8 = aw.es;
        TextPaint localTextPaint2 = efj.B(getContext(), i8);
        this.h = new StaticLayout(this.d, localTextPaint2, paramInt4, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        i2 += this.h.getHeight();
      }
    }
    else
    {
      if (!TextUtils.isEmpty(this.e))
      {
        if (!this.n) {
          break label268;
        }
        i7 = aw.em;
        TextPaint localTextPaint1 = efj.B(getContext(), i7);
        this.i = new StaticLayout(this.e, localTextPaint1, paramInt4, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        i2 += this.i.getHeight();
      }
      f1 = i2 + this.H.aP;
      if (!this.n) {
        break label276;
      }
    }
    int i3;
    int i4;
    int i5;
    label268:
    label276:
    for (float f2 = this.H.v.getStrokeWidth();; f2 = this.H.u.getStrokeWidth())
    {
      i3 = (int)(f2 + f1);
      this.g = i3;
      i4 = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
      i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
      while (i1 < this.l)
      {
        View localView = getChildAt(i1);
        localView.measure(i4, i5);
        i3 += localView.getMeasuredHeight();
        i1++;
      }
      i8 = aw.er;
      break;
      i7 = aw.el;
      break label106;
    }
    if (!TextUtils.isEmpty(this.f)) {
      if (!this.n) {
        break label363;
      }
    }
    label363:
    for (int i6 = aw.ej;; i6 = aw.eg)
    {
      this.j.setTextAppearance(getContext(), i6);
      this.j.setText(this.f);
      this.j.measure(i4, i5);
      i3 += this.j.getMeasuredHeight();
      return i3;
    }
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = paramInt5 + this.H.aP;
    if (this.h != null)
    {
      paramCanvas.translate(paramInt3, i1);
      this.h.draw(paramCanvas);
      paramCanvas.translate(-paramInt3, -i1);
      i1 += this.h.getHeight();
    }
    if (this.i != null)
    {
      paramCanvas.translate(paramInt3, i1);
      this.i.draw(paramCanvas);
      paramCanvas.translate(-paramInt3, -i1);
      i1 += this.i.getHeight();
    }
    int i2 = i1 + this.H.aP;
    if (this.n) {
      paramCanvas.drawLine(paramInt3, i2, paramInt4, i2, this.H.v);
    }
    for (;;)
    {
      return paramInt5 + getHeight();
      paramCanvas.drawLine(0.0F, i2, this.P, i2, this.H.u);
    }
  }
  
  public final View a(int paramInt, boolean paramBoolean)
  {
    dzr localdzr = new dzr(getContext());
    lmn locallmn = (lmn)this.k.e.get(paramInt);
    int i1 = this.c;
    lob locallob = this.b;
    String str1 = this.m;
    if ((!paramBoolean) || (!TextUtils.isEmpty(this.f))) {}
    for (boolean bool = true;; bool = false)
    {
      localdzr.f = this.N;
      localdzr.c = locallmn;
      localdzr.e = i1;
      localdzr.d = locallob;
      localdzr.g = str1;
      localdzr.h = bool;
      localdzr.removeAllViews();
      lmi locallmi = localdzr.c.c;
      localdzr.a.a(locallmi.a, locallmi.c);
      localdzr.addView(localdzr.a);
      String str2 = localdzr.b();
      localdzr.b.a(str2);
      localdzr.b.setContentDescription(localdzr.c());
      localdzr.addView(localdzr.b);
      if (localdzr.e == 2) {
        efj.a(localdzr, new kuo(pkf.z, locallmn.d, Integer.valueOf(paramInt)));
      }
      return localdzr;
    }
  }
  
  public final List<huu> a(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    if (i1 < this.l)
    {
      View localView = getChildAt(i1);
      dzr localdzr;
      int i2;
      label107:
      String str1;
      if (((localView instanceof dzr)) && (lwo.a(localView, paramView)))
      {
        localdzr = (dzr)localView;
        switch (this.c)
        {
        case 4: 
        case 5: 
        case 7: 
        case 8: 
        case 9: 
        default: 
          i2 = 0;
          str1 = localdzr.d();
          if (localdzr.c != null) {
            break;
          }
        }
      }
      for (String str2 = null;; str2 = localdzr.c.d)
      {
        localArrayList.add(new huu(str1, str2, i2));
        i1++;
        break;
        i2 = 93;
        break label107;
        i2 = 50;
        break label107;
        i2 = 232;
        break label107;
        i2 = 98;
        break label107;
      }
    }
    return localArrayList;
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    int i1 = 2;
    super.a(paramCursor, paramhfa, paramInt);
    byte[] arrayOfByte = paramCursor.getBlob(30);
    boolean bool;
    if (arrayOfByte != null)
    {
      this.k = lnr.a(arrayOfByte);
      ArrayList localArrayList = this.k.e;
      switch (this.c)
      {
      case 4: 
      case 5: 
      case 7: 
      case 8: 
      case 9: 
      default: 
        i1 = 2147483647;
      }
      this.l = Math.min(i1, localArrayList.size());
      if (this.k.d != 0) {
        break label272;
      }
      bool = true;
      this.n = bool;
      this.a.a(localArrayList, this.l);
      this.d = this.k.a;
      this.e = this.k.b;
      this.f = this.k.c;
      git localgit = (git)mbb.b(getContext(), git.class);
      if (localgit != null) {
        this.m = localgit.f().b("domain_name");
      }
      efj.i(this);
      if (!this.n) {
        break label278;
      }
      setOnClickListener(this);
    }
    for (;;)
    {
      this.j.setPadding(this.H.m, this.H.m, this.H.m, this.H.m);
      return;
      label272:
      bool = false;
      break;
      label278:
      this.j.setBackgroundResource(da.aY);
      this.j.setOnClickListener(this);
    }
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    super.a(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i2 = this.g;
    int i3 = View.MeasureSpec.makeMeasureSpec(this.P, 1073741824);
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    while (i1 < this.l)
    {
      View localView = getChildAt(i1);
      localView.measure(i3, i4);
      int i5 = localView.getMeasuredHeight();
      localView.layout(this.M.left, i2, this.M.left + this.P, i2 + i5);
      i2 += i5;
      i1++;
    }
    if (this.j.getParent() == this) {
      this.j.layout(this.M.left, i2, this.M.left + this.P, i2 + this.j.getMeasuredHeight());
    }
  }
  
  public final Drawable d()
  {
    if (this.n) {
      return getResources().getDrawable(ehr.fF);
    }
    return super.d();
  }
  
  protected final boolean e()
  {
    return this.n;
  }
  
  public final void f() {}
  
  public final void g()
  {
    if (!TextUtils.isEmpty(this.f)) {
      addView(this.j);
    }
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
      arrayOfCharSequence1[0] = this.d;
      efj.a(localStringBuilder, arrayOfCharSequence1);
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = this.e;
      efj.a(localStringBuilder, arrayOfCharSequence2);
      return mfx.b(localStringBuilder);
    }
  }
  
  public final int h()
  {
    return this.l;
  }
  
  public final int i()
  {
    return dzr.a(getContext());
  }
  
  public final lol j()
  {
    return this.a;
  }
  
  public final void onClick(View paramView)
  {
    if (((paramView == this) || (paramView == this.j)) && (this.b != null))
    {
      if (!this.o.a()) {
        getContext().startActivity(this.o.b());
      }
    }
    else {
      return;
    }
    this.b.f(this.c);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.a.b(paramMotionEvent)) || (super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.a.a(paramMotionEvent)) || (super.onTouchEvent(paramMotionEvent));
  }
  
  public final gxq v()
  {
    switch (this.c)
    {
    default: 
      return new gxq(pkh.B);
    case 2: 
      return new gxq(pkh.X);
    case 10: 
      return new gxq(pkh.Y);
    }
    return new gxq(pkh.x);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxu
 * JD-Core Version:    0.7.0.1
 */