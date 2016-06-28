import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View.MeasureSpec;

public final class bov
  extends eab
  implements gik
{
  private int V;
  private int W;
  private hmw a;
  private int aa;
  private final hif b;
  
  public bov(Context paramContext)
  {
    super(paramContext);
    this.b = new hif(paramContext);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.b.D_();
    this.a = null;
  }
  
  public final void E_()
  {
    ((gil)mbb.a(getContext(), gil.class)).b(this);
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.C = paramInt2;
    this.aa = paramInt3;
    this.V = View.MeasureSpec.makeMeasureSpec(paramInt3, -2147483648);
    this.W = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.b.measure(this.V, this.W);
    return paramInt2 + this.b.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt + this.b.getMeasuredHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    this.a = hmw.a(paramCursor.getBlob(26));
    this.b.b = this;
    this.b.a(this.a, this.N);
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt == efj.zd)
    {
      this.b.a(this.b);
      return true;
    }
    return super.a(paramInt);
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    addView(this.b);
  }
  
  public final boolean f()
  {
    return this.R == 0;
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    if (this.a != null)
    {
      String str1 = this.a.b;
      if (!TextUtils.isEmpty(str1))
      {
        Resources localResources = getResources();
        int i = ehr.a;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = jr.a().a(str1);
        String str2 = localResources.getString(i, arrayOfObject);
        localla.put(Integer.valueOf(efj.zd), str2);
      }
    }
    return localla;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.b.layout(this.B, this.C, this.B + this.b.getMeasuredWidth(), this.C + this.b.getMeasuredHeight());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    this.b.measure(this.V, this.W);
    setMeasuredDimension(this.aa, this.J);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bov
 * JD-Core Version:    0.7.0.1
 */