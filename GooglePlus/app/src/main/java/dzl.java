import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.apps.plus.service.SkyjamPlaybackService;
import java.nio.ByteBuffer;

public final class dzl
  extends eab
{
  private dzm V;
  private dzk W;
  boolean a;
  private int aa;
  lma b;
  
  public dzl(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dzl(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dzl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.V = new dzm(this, paramContext, paramAttributeSet, 0);
    this.V.setOnClickListener(this);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.V.D_();
    this.a = false;
    if (this.W != null)
    {
      this.W.D_();
      this.W = null;
    }
    this.aa = 0;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.C = paramInt2;
    int i = View.MeasureSpec.makeMeasureSpec(paramInt3, -2147483648);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.V.measure(i, j);
    int k = paramInt2 + this.V.getMeasuredHeight();
    if (this.W != null)
    {
      this.aa = k;
      dzk localdzk1 = this.W;
      lma locallma = this.b;
      localdzk1.a = this.N;
      localdzk1.d = locallma;
      String str1 = localdzk1.d.e;
      String str2 = localdzk1.d.f;
      boolean bool = TextUtils.isEmpty(localdzk1.d.a);
      int m = str1.indexOf("https://");
      if (m < 0) {
        m = str1.indexOf("http://");
      }
      String str5;
      dzk localdzk2;
      Context localContext;
      String str7;
      if (m >= 0) {
        if (bool)
        {
          str5 = str1.substring(m);
          localdzk2 = localdzk1;
          localdzk2.b = str5;
          localContext = localdzk1.getContext();
          String str6 = localdzk1.b;
          if ((SkyjamPlaybackService.d == null) || (!SkyjamPlaybackService.d.equals(str6)) || (SkyjamPlaybackService.h == null)) {
            break label377;
          }
          str7 = SkyjamPlaybackService.h;
          label216:
          localdzk1.c = str7;
          localdzk1.b();
        }
      }
      for (;;)
      {
        localdzk1.setOnClickListener(localdzk1);
        this.W.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        addView(this.W);
        return k + this.W.getMeasuredHeight();
        localdzk1.b = str2.substring(m);
        if (localdzk1.b.contains("mode=inline"))
        {
          str5 = localdzk1.b.replace("mode=inline", "mode=streaming");
          localdzk2 = localdzk1;
          break;
        }
        String str3 = String.valueOf(localdzk1.b);
        String str4 = String.valueOf("&mode=streaming");
        if (str4.length() != 0)
        {
          str5 = str3.concat(str4);
          localdzk2 = localdzk1;
          break;
        }
        str5 = new String(str3);
        localdzk2 = localdzk1;
        break;
        label377:
        str7 = localContext.getString(aau.tL);
        break label216;
        localdzk1.c = "";
      }
    }
    return k;
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    int i = paramInt + this.V.getMeasuredHeight();
    if (this.W != null) {
      i += this.W.getMeasuredHeight();
    }
    return i;
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = super.a(paramCanvas, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    if (this.W != null) {
      i += this.W.getMeasuredHeight();
    }
    return i;
  }
  
  protected final void a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(26);
    lma locallma;
    if (arrayOfByte == null) {
      locallma = null;
    }
    for (;;)
    {
      this.b = locallma;
      return;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      locallma = new lma();
      locallma.a = lma.d(localByteBuffer);
      locallma.b = lma.d(localByteBuffer);
      locallma.c = lma.d(localByteBuffer);
      locallma.d = lma.d(localByteBuffer);
      locallma.e = lma.d(localByteBuffer);
      locallma.f = lma.d(localByteBuffer);
    }
  }
  
  protected final void a(StringBuilder paramStringBuilder)
  {
    CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
    arrayOfCharSequence1[0] = this.b.a;
    efj.a(paramStringBuilder, arrayOfCharSequence1);
    CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
    arrayOfCharSequence2[0] = this.b.c;
    efj.a(paramStringBuilder, arrayOfCharSequence2);
    CharSequence[] arrayOfCharSequence3 = new CharSequence[1];
    arrayOfCharSequence3[0] = this.b.b;
    efj.a(paramStringBuilder, arrayOfCharSequence3);
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt == aaw.h)
    {
      String str = this.b.e;
      if (!TextUtils.isEmpty(str))
      {
        this.o.a(Uri.decode(str));
        return true;
      }
    }
    else if ((paramInt == aaw.k) && (this.W != null))
    {
      this.W.c();
      return true;
    }
    return super.a(paramInt);
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    super.a_(paramCursor, paramhfa, paramInt);
    removeView(this.V);
    addView(this.V);
    Resources localResources;
    jr localjr;
    String str2;
    String str3;
    String str4;
    String str5;
    label155:
    String str6;
    String str7;
    if (this.b != null)
    {
      this.a = TextUtils.isEmpty(this.b.a);
      if (!this.a) {
        this.W = new dzk(getContext());
      }
      String str1 = this.b.d;
      if (!TextUtils.isEmpty(str1)) {
        this.V.c = ipf.a(getContext(), str1, ipm.a);
      }
      localResources = getResources();
      localjr = jr.a();
      str2 = this.b.a;
      if (TextUtils.isEmpty(str2))
      {
        str3 = "";
        str4 = this.b.b;
        if (!TextUtils.isEmpty(str4)) {
          break label299;
        }
        str5 = "";
        str6 = this.b.c;
        if (!TextUtils.isEmpty(str6)) {
          break label335;
        }
        str7 = "";
        label176:
        StringBuilder localStringBuilder = new StringBuilder();
        efj.a(localStringBuilder, new CharSequence[] { str3, str7, str5 });
        this.V.setContentDescription(localStringBuilder.toString());
      }
    }
    else
    {
      if (this.V.c == null) {
        break label371;
      }
    }
    label299:
    label335:
    label371:
    for (int i = a(paramhfa, this.K);; i = 0)
    {
      dzm localdzm = this.V;
      localdzm.e = i;
      localdzm.f = i;
      return;
      int j = aau.bf;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localjr.a(str2);
      str3 = localResources.getString(j, arrayOfObject1);
      break;
      int k = aau.aW;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localjr.a(str4);
      str5 = localResources.getString(k, arrayOfObject2);
      break label155;
      int m = aau.aV;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = localjr.a(str6);
      str7 = localResources.getString(m, arrayOfObject3);
      break label176;
    }
  }
  
  public final void ap_()
  {
    if (this.V != null) {
      this.V.ap_();
    }
    super.ap_();
  }
  
  public final void b()
  {
    super.b();
    if ((lwo.a(this)) && (this.V != null)) {
      this.V.b();
    }
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    Resources localResources = getResources();
    jr localjr = jr.a();
    if (this.b != null)
    {
      String str1 = localjr.a(this.b.c);
      String str2 = localResources.getString(aau.aG, new Object[] { str1 });
      localla.put(Integer.valueOf(aaw.h), str2);
      if ((!TextUtils.isEmpty(this.b.a)) && (this.W != null)) {
        if (!SkyjamPlaybackService.a(this.W.b)) {
          break label122;
        }
      }
    }
    label122:
    String str3;
    String str4;
    for (String str5 = localResources.getString(aau.aR);; str5 = localResources.getString(aau.aQ, new Object[] { str3, str4 }))
    {
      localla.put(Integer.valueOf(aaw.k), str5);
      return localla;
      str3 = localjr.a(this.b.a);
      str4 = localjr.a(this.b.b);
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (this.R == 0)) {
      ((gil)mbb.a(getContext(), gil.class)).b(this);
    }
    String str;
    do
    {
      return;
      if ((paramView != this.V) || (this.o == null))
      {
        super.onClick(paramView);
        return;
      }
      str = this.b.e;
    } while (TextUtils.isEmpty(str));
    this.o.a(Uri.decode(str));
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.V.layout(this.B, this.C, this.B + this.V.getMeasuredWidth(), this.C + this.V.getMeasuredHeight());
    if (this.W != null) {
      this.W.layout(this.B, this.aa, this.B + this.W.getMeasuredWidth(), this.aa + this.W.getMeasuredHeight());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzl
 * JD-Core Version:    0.7.0.1
 */