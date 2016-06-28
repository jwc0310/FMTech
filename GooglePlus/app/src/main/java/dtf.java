import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;

public final class dtf
  extends eab
{
  private final dtg a = new dtg(getContext());
  private lmb b;
  
  public dtf(Context paramContext)
  {
    super(paramContext);
    this.a.setOnClickListener(this);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.a.D_();
    this.b = null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.C = paramInt2;
    int i = View.MeasureSpec.makeMeasureSpec(paramInt3, -2147483648);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.a.measure(i, j);
    return paramInt2 + this.a.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt + this.a.getMeasuredHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    this.b = lmb.a(paramCursor.getBlob(26));
    this.a.a = this.b;
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt == eyg.o)
    {
      this.o.c(this.b.a, null);
      return true;
    }
    return super.a(paramInt);
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a_(paramCursor, paramhfa, paramInt);
    removeView(this.a);
    addView(this.a);
    String str = this.b.c;
    if (!TextUtils.isEmpty(str)) {
      this.a.c = ipf.a(getContext(), str, ipm.a);
    }
    int i = a(paramhfa, this.K);
    dtg localdtg = this.a;
    int j = i * 9 / 16;
    localdtg.e = i;
    localdtg.f = j;
    StringBuilder localStringBuilder = new StringBuilder();
    CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
    arrayOfCharSequence1[0] = this.b.b;
    efj.a(localStringBuilder, arrayOfCharSequence1);
    if (this.b.d)
    {
      CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
      arrayOfCharSequence2[0] = getContext().getString(efj.Bu);
      efj.a(localStringBuilder, arrayOfCharSequence2);
    }
    this.a.setContentDescription(localStringBuilder.toString());
  }
  
  public final void ap_()
  {
    if (this.a != null) {
      this.a.ap_();
    }
    super.ap_();
  }
  
  public final void b()
  {
    super.b();
    if ((lwo.a(this)) && (this.a != null)) {
      this.a.b();
    }
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    if (this.b != null)
    {
      String str1 = jr.a().a(this.b.b);
      String str2 = getResources().getString(efj.Bi, new Object[] { str1 });
      localla.put(Integer.valueOf(eyg.o), str2);
    }
    return localla;
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (this.R == 0))
    {
      ((gil)mbb.a(getContext(), gil.class)).b(this);
      return;
    }
    if ((paramView != this.a) || (this.o == null))
    {
      super.onClick(paramView);
      return;
    }
    this.o.c(this.b.a, null);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.layout(this.B, this.C, this.B + this.a.getMeasuredWidth(), this.C + this.a.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtf
 * JD-Core Version:    0.7.0.1
 */