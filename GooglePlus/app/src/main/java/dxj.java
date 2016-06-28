import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View.MeasureSpec;

public final class dxj
  extends eab
  implements lqa
{
  private static final gqu a = gqs.b().b(1).a(1);
  private int V;
  private llu W;
  private llu aa;
  private llx ab;
  private lli ac;
  private hfc ad;
  private hfp ae;
  private lpz b;
  
  public dxj(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    if (this.w)
    {
      this.ad = ((hfc)mbb.a(localContext, hfc.class));
      this.ae = new hfp(localContext);
      return;
    }
    this.b = new lpz(localContext);
    this.ac = ((lli)mbb.a(localContext, lli.class));
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    if (this.w)
    {
      this.ae.b();
      this.ae.D_();
    }
    for (;;)
    {
      this.W = null;
      this.aa = null;
      this.ab = null;
      return;
      this.b.D_();
      this.V = 0;
    }
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.w) && (this.ae.getParent() == this))
    {
      this.B = 0;
      this.V = paramInt2;
      this.ae.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      paramInt2 += this.ae.getMeasuredHeight();
    }
    do
    {
      return paramInt2;
      this.B = paramInt1;
      this.b.e = false;
      this.V = paramInt2;
    } while (this.b.getParent() != this);
    this.b.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    return paramInt2 + this.b.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    if ((this.w) && (this.ae.getParent() == this)) {
      paramInt += this.ae.getMeasuredHeight();
    }
    while ((this.w) || (this.b.getParent() != this)) {
      return paramInt;
    }
    return paramInt + this.b.getHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    long l = paramCursor.getLong(11);
    byte[] arrayOfByte1 = paramCursor.getBlob(26);
    if (arrayOfByte1 != null) {
      this.ab = llx.a(arrayOfByte1);
    }
    if (this.ab == null) {}
    byte[] arrayOfByte2;
    do
    {
      do
      {
        return;
        if ((0x2000 & l) != 0L)
        {
          byte[] arrayOfByte3 = paramCursor.getBlob(28);
          if (arrayOfByte3 != null) {
            this.W = llu.a(arrayOfByte3);
          }
        }
      } while ((l & 0x800) == 0L);
      arrayOfByte2 = paramCursor.getBlob(27);
    } while (arrayOfByte2 == null);
    this.aa = llu.a(arrayOfByte2);
  }
  
  public final void a(String paramString, llu paramllu)
  {
    if ((efj.B(getContext())) && (this.R == 0))
    {
      ((gil)mbb.a(getContext(), gil.class)).b(this);
      return;
    }
    this.ac.a(this.N, this.e, this.f, paramString, paramllu);
  }
  
  public final void a(StringBuilder paramStringBuilder)
  {
    String str1 = getResources().getString(aau.jm);
    CharSequence[] arrayOfCharSequence = new CharSequence[1];
    String str2 = String.valueOf(str1);
    String str3 = String.valueOf(this.ab.a);
    if (str3.length() != 0) {}
    for (String str4 = str2.concat(str3);; str4 = new String(str2))
    {
      arrayOfCharSequence[0] = str4;
      efj.a(paramStringBuilder, arrayOfCharSequence);
      return;
    }
  }
  
  public final void a(llu paramllu)
  {
    this.ac.a(this.N, this.e, this.f, paramllu);
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt == aaw.g)
    {
      String str = this.ab.c;
      llu localllu = this.b.c;
      if (str != null)
      {
        this.ac.a(this.N, this.e, this.f, str, this.b.b);
        return true;
      }
      if (localllu != null)
      {
        this.ac.a(this.N, this.e, this.f, localllu);
        return true;
      }
    }
    return super.a(paramInt);
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    removeView(this.b);
    if (this.ab == null) {
      return;
    }
    if (this.w)
    {
      gqu localgqu = a;
      localgqu.a = this.ab.c;
      localgqu.b = this.ab.c;
      gqs localgqs = localgqu.a();
      hez localhez = new hez();
      localhez.g = localgqs;
      localhez.d = this.ab.d;
      localhez.a = this.ab.a;
      localhez.b = this.ab.b;
      localhez.c = this.ab.e;
      localhez.e = this.ab.k;
      localhez.f = this.ab.l;
      hfc.a(new hey(localhez), this.ae);
      addView(this.ae);
      return;
    }
    this.b.a(this.ab, this.W, this.aa, this.e, this.d, paramhfa.a(this.K), this.K, false, this);
    addView(this.b);
  }
  
  public final Intent b(boolean paramBoolean)
  {
    Intent localIntent = super.b(paramBoolean);
    lpz locallpz;
    if ((localIntent != null) && (this.b != null))
    {
      locallpz = this.b;
      if (!TextUtils.isEmpty(locallpz.a)) {
        localIntent.putExtra("link_title", locallpz.a);
      }
      if (locallpz.c != null) {
        break label96;
      }
    }
    label96:
    for (Object localObject = null;; localObject = locallpz.c.a(locallpz.getContext()))
    {
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        localIntent.putExtra("deep_link_label", (String)localObject);
      }
      if (!TextUtils.isEmpty(locallpz.d)) {
        localIntent.putExtra("link_url", locallpz.d);
      }
      return localIntent;
    }
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    String str1 = this.ab.c;
    Resources localResources;
    if ((str1 != null) || (this.W != null))
    {
      localResources = getResources();
      if (this.W != null) {
        break label68;
      }
    }
    label68:
    for (String str2 = localResources.getString(aau.aM, new Object[] { str1 });; str2 = localResources.getString(aau.aH))
    {
      localla.put(Integer.valueOf(aaw.g), str2);
      return localla;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.w) && (this.ae.getParent() == this)) {
      this.ae.layout(this.B, this.V, this.B + this.ae.getMeasuredWidth(), this.V + this.ae.getMeasuredHeight());
    }
    while (this.b.getParent() != this) {
      return;
    }
    this.b.layout(this.B, this.V, this.B + this.b.getMeasuredWidth(), this.V + this.b.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxj
 * JD-Core Version:    0.7.0.1
 */