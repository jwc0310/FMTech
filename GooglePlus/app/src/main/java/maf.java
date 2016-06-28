import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public final class maf
  extends loa
  implements View.OnClickListener
{
  private static final gqu a = gqs.b().b(1).a(1);
  private final git d;
  private final giz e;
  private final gqn f;
  private final TextView g;
  private final TextView h;
  private final TextView i;
  private ImageButton j;
  private String k;
  private String l;
  private String m;
  private String n;
  private int o;
  private int p;
  private String q;
  private String r;
  private int s;
  
  public maf(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.f = ((gqn)mbb.a(localContext, gqn.class));
    this.d = ((git)mbb.a(localContext, git.class));
    this.e = ((giz)mbb.a(localContext, giz.class));
    this.o = this.e.a(this.d.c()).a("promo_uxrr_last_dismissed_version", 0);
    this.j = new ImageButton(localContext, null, 0);
    this.j.setPadding(0, 0, 0, 0);
    this.j.setImageResource(efj.aaR);
    this.j.setOnClickListener(new gxn(this));
    this.j.setId(efj.aaT);
    this.j.setContentDescription(localContext.getResources().getText(efj.aaW));
    this.g = new TextView(localContext);
    this.g.setTextAppearance(localContext, az.ad);
    this.g.setPadding(this.H.m, this.H.l, this.H.m, this.H.l);
    this.g.setId(efj.aaV);
    this.h = new TextView(localContext);
    this.h.setTextAppearance(localContext, az.ac);
    this.h.setPadding(this.H.m, this.H.l, this.H.m, this.H.l);
    this.h.setId(efj.aaS);
    this.i = new TextView(localContext);
    this.i.setTextAppearance(localContext, az.ae);
    this.i.setPadding(this.H.m, this.H.l, this.H.m, this.H.l);
    this.i.setOnClickListener(new gxn(this));
    this.i.setId(efj.aaU);
    if (!h()) {}
    for (boolean bool = true;; bool = false)
    {
      setClickable(bool);
      if (efj.B(localContext))
      {
        String str1 = this.k;
        String str2 = this.l;
        setContentDescription(1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " " + str2);
      }
      efj.a(this.j, new gxq(pkh.S));
      efj.a(this.i, new gxq(pkh.U));
      return;
    }
  }
  
  private final void f()
  {
    if (h())
    {
      this.g.setText(this.q);
      this.h.setText(this.r);
      this.j.setVisibility(8);
      this.i.setVisibility(8);
      return;
    }
    this.g.setText(this.k);
    this.h.setText(this.l);
    this.i.setText(this.m);
    this.j.setVisibility(0);
    this.i.setVisibility(0);
  }
  
  private final void g()
  {
    this.o = this.p;
    this.e.b(this.d.c()).b("promo_uxrr_last_dismissed_version", this.p).d();
    f();
    requestLayout();
    mad localmad = new mad(this.d.c(), this.p);
    gzj.a(getContext(), localmad);
  }
  
  private final boolean h()
  {
    return this.o >= this.p;
  }
  
  public final void D_()
  {
    super.D_();
    lwo.e(this);
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt2 + this.H.aP;
    this.s = i1;
    int i2 = i1 + this.g.getMeasuredHeight();
    addView(this.g);
    int i3 = i2 + this.h.getMeasuredHeight();
    addView(this.h);
    if (!h())
    {
      addView(this.j);
      i3 += this.i.getMeasuredHeight();
      addView(this.i);
    }
    return i3;
  }
  
  protected final void a(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a(paramCursor, paramhfa, paramInt);
    try
    {
      rdk localrdk = new rdk();
      byte[] arrayOfByte = paramCursor.getBlob(30);
      if (arrayOfByte != null)
      {
        qat.b(localrdk, arrayOfByte, 0, arrayOfByte.length);
        this.k = localrdk.b;
        this.l = localrdk.c;
        this.m = localrdk.d;
        this.n = localrdk.e;
        this.p = localrdk.f.intValue();
        this.q = localrdk.g;
        this.r = localrdk.h;
        f();
        requestLayout();
      }
      efj.i(this);
      return;
    }
    catch (qas localqas)
    {
      throw new RuntimeException("Invalid promo data message.", localqas);
    }
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    f();
  }
  
  public final void onClick(View paramView)
  {
    if (this.b == null) {}
    do
    {
      return;
      if (paramView == this.j)
      {
        g();
        return;
      }
    } while (paramView != this.i);
    gqn localgqn = this.f;
    gqu localgqu = a;
    localgqu.a = this.n;
    localgqu.b = this.n;
    localgqn.a(localgqu.a());
    g();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.s;
    int i2;
    int i14;
    label33:
    int i15;
    label49:
    int i3;
    label57:
    int i4;
    label84:
    int i5;
    label103:
    int i6;
    int i7;
    if (Build.VERSION.SDK_INT >= 17)
    {
      i2 = 1;
      if (i2 == 0) {
        break label253;
      }
      if (Build.VERSION.SDK_INT < 17) {
        break label241;
      }
      i14 = 1;
      if ((i14 == 0) || (getLayoutDirection() != 1)) {
        break label247;
      }
      i15 = 1;
      if (i15 == 0) {
        break label253;
      }
      i3 = 1;
      if (i3 == 0) {
        break label259;
      }
      i4 = this.P - (this.M.right + this.g.getMeasuredWidth());
      if (i3 == 0) {
        break label271;
      }
      i5 = this.P - this.M.right;
      TextView localTextView1 = this.g;
      i6 = i1 + this.g.getMeasuredHeight();
      localTextView1.layout(i4, i1, i5, i6);
      if (i3 == 0) {
        break label291;
      }
      i7 = this.P - (this.M.right + this.h.getMeasuredWidth());
      label161:
      if (i3 == 0) {
        break label303;
      }
    }
    int i9;
    label259:
    label271:
    label291:
    label303:
    for (int i8 = this.P - this.M.right;; i8 = this.M.left + this.h.getMeasuredWidth())
    {
      TextView localTextView2 = this.h;
      i9 = i6 + this.h.getMeasuredHeight();
      localTextView2.layout(i7, i6, i8, i9);
      if (!h()) {
        break label323;
      }
      removeViewInLayout(this.j);
      removeViewInLayout(this.i);
      return;
      i2 = 0;
      break;
      label241:
      i14 = 0;
      break label33;
      label247:
      i15 = 0;
      break label49;
      label253:
      i3 = 0;
      break label57;
      i4 = this.M.left;
      break label84;
      i5 = this.M.left + this.g.getMeasuredWidth();
      break label103;
      i7 = this.M.left;
      break label161;
    }
    label323:
    int i10;
    int i11;
    label359:
    int i12;
    if (i3 != 0)
    {
      i10 = this.H.m;
      if (i3 == 0) {
        break label487;
      }
      i11 = this.H.m + this.j.getMeasuredWidth();
      this.j.layout(i10, this.H.m, i11, this.H.m + this.j.getMeasuredHeight());
      if (i3 == 0) {
        break label504;
      }
      i12 = this.P - (this.M.right + this.i.getMeasuredWidth());
      label419:
      if (i3 == 0) {
        break label516;
      }
    }
    label516:
    for (int i13 = this.P - this.M.right;; i13 = this.M.left + this.i.getMeasuredWidth())
    {
      this.i.layout(i12, i9, i13, i9 + this.i.getMeasuredHeight());
      return;
      i10 = this.P - (this.H.m + this.j.getMeasuredWidth());
      break;
      label487:
      i11 = this.P - this.H.m;
      break label359;
      label504:
      i12 = this.M.left;
      break label419;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = (int)TypedValue.applyDimension(1, 18.0F, getResources().getDisplayMetrics());
    int i2 = View.MeasureSpec.makeMeasureSpec(resolveSize(2147483647, paramInt1), -2147483648);
    this.g.measure(i2, paramInt2);
    this.h.measure(i2, paramInt2);
    if (!h())
    {
      this.j.measure(i1, i1);
      this.i.measure(i2, paramInt2);
    }
    setMeasuredDimension(paramInt1, this.s + this.H.aP + this.g.getMeasuredHeight() + this.h.getMeasuredHeight() + this.i.getMeasuredHeight());
  }
  
  public final gxq v()
  {
    return new gxq(pkh.T);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     maf
 * JD-Core Version:    0.7.0.1
 */