import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import java.nio.ByteBuffer;

public final class dyz
  extends eab
  implements gik
{
  private lly V;
  private boolean W;
  private jtv a;
  private int aa;
  private jtw b;
  
  public dyz(Context paramContext)
  {
    super(paramContext);
    this.b = ((jtw)mbb.b(paramContext, jtw.class));
    if (this.b != null) {
      this.a = this.b.a(paramContext);
    }
    this.aa = View.MeasureSpec.makeMeasureSpec(0, 0);
  }
  
  private final boolean x()
  {
    if ((this.a.b() == null) || (this.a.c() == null)) {
      return false;
    }
    lly locallly = this.V;
    if ((locallly.i >= 2) && ((locallly.c()) || (locallly.d()) || (locallly.e()) || (locallly.f()) || (locallly.g()))) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        break label150;
      }
      if (!Log.isLoggable("PollCardViewGroup", 3)) {
        break;
      }
      int j = this.V.i;
      int k = this.V.j;
      new StringBuilder(81).append("Invalid poll : pollOptionsCount ").append(j).append(" pollOptionsWithMediaCount ").append(k);
      new Exception();
      return false;
    }
    label150:
    return true;
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    if (this.a != null) {
      this.a.D_();
    }
    this.V = null;
  }
  
  public final void E_()
  {
    ((gil)mbb.a(getContext(), gil.class)).b(this);
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.V == null) || (this.a == null)) {
      return super.a(paramInt1, paramInt2, paramInt3);
    }
    this.B = paramInt1;
    this.C = paramInt2;
    if (this.W)
    {
      View localView = this.a.d();
      localView.measure(this.aa, this.aa);
      return paramInt2 + (localView.getMeasuredHeight() + this.H.m);
    }
    if (!x()) {
      return super.a(paramInt1, paramInt2, paramInt3);
    }
    jtu localjtu1 = this.a.b();
    localjtu1.a(paramInt3);
    localjtu1.measure(this.aa, this.aa);
    int i = paramInt2 + localjtu1.getMeasuredHeight();
    jtu localjtu2 = this.a.c();
    localjtu2.a(paramInt3);
    localjtu2.measure(this.aa, this.aa);
    return i + localjtu2.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    if ((this.V == null) || (this.a == null)) {}
    do
    {
      return paramInt;
      if (this.W) {
        return paramInt + this.a.d().getMeasuredHeight() + this.H.m;
      }
    } while (!x());
    return paramInt + this.a.b().getMeasuredHeight() + this.a.c().getMeasuredHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    int i = 1;
    if (this.a == null) {
      return;
    }
    byte[] arrayOfByte = this.b.a(this.N);
    label28:
    Object localObject;
    label39:
    label59:
    jtv localjtv;
    lly locallly2;
    String str;
    if (arrayOfByte != null)
    {
      if (arrayOfByte == null) {
        break label114;
      }
      localObject = null;
      if (arrayOfByte != null) {
        break label116;
      }
      this.V = localObject;
      if (this.V.l == i) {
        break label466;
      }
      int i2 = i;
      this.W = i2;
      localjtv = this.a;
      locallly2 = this.V;
      str = this.N;
      if (this.R == i) {
        break label472;
      }
    }
    for (;;)
    {
      localjtv.a(locallly2, str, i);
      return;
      arrayOfByte = paramCursor.getBlob(26);
      break label28;
      label114:
      break;
      label116:
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      localObject = null;
      if (localByteBuffer == null) {
        break label39;
      }
      lly locallly1 = new lly();
      locallly1.i = localByteBuffer.getInt();
      locallly1.j = localByteBuffer.getInt();
      label243:
      int i4;
      label311:
      llz localllz;
      if (localByteBuffer.get() == i)
      {
        int k = i;
        locallly1.a = lly.d(localByteBuffer);
        locallly1.b = lly.d(localByteBuffer);
        locallly1.c = lly.d(localByteBuffer);
        locallly1.d = lly.d(localByteBuffer);
        locallly1.k = localByteBuffer.getInt();
        locallly1.e = localByteBuffer.getLong();
        if (localByteBuffer.get() != i) {
          break label427;
        }
        int n = i;
        locallly1.f = n;
        locallly1.l = localByteBuffer.getInt();
        if (k != 0)
        {
          locallly1.g = new llx();
          locallly1.g.a(localByteBuffer);
        }
        if (locallly1.i <= 0) {
          break label439;
        }
        locallly1.h = new llz[locallly1.i];
        i4 = 0;
        if (i4 >= locallly1.i) {
          break label439;
        }
        locallly1.h[i4] = new llz();
        localllz = locallly1.h[i4];
        if (localByteBuffer.get() != i) {
          break label433;
        }
      }
      label427:
      label433:
      int i6;
      for (int i5 = i;; i6 = 0)
      {
        localllz.a = llz.d(localByteBuffer);
        localllz.b = llz.d(localByteBuffer);
        localllz.c = localByteBuffer.getLong();
        if (i5 != 0)
        {
          localllz.d = new llx();
          localllz.d.a(localByteBuffer);
        }
        i4++;
        break label311;
        int m = 0;
        break;
        int i1 = 0;
        break label243;
      }
      label439:
      locallly1.m = localByteBuffer.getInt();
      locallly1.n = localByteBuffer.getInt();
      localObject = locallly1;
      break label39;
      label466:
      int i3 = 0;
      break label59;
      label472:
      int j = 0;
    }
  }
  
  protected final void a(StringBuilder paramStringBuilder)
  {
    if (this.a != null)
    {
      String str = this.a.i();
      if (!TextUtils.isEmpty(str)) {
        paramStringBuilder.append(jr.a().a(str));
      }
    }
  }
  
  public final boolean a(int paramInt)
  {
    return ((this.a != null) && (this.a.a(paramInt))) || (super.a(paramInt));
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    if ((this.V == null) || (this.a == null)) {}
    do
    {
      return;
      if (this.W)
      {
        addView(this.a.d());
        return;
      }
    } while (!x());
    jtu localjtu1 = this.a.b();
    localjtu1.b();
    addView(localjtu1);
    jtu localjtu2 = this.a.c();
    if (this.R == 0) {}
    for (boolean bool = true;; bool = false)
    {
      localjtu2.e = bool;
      localjtu2.c();
      localjtu2.b();
      addView(localjtu2);
      this.a.a(this);
      return;
    }
  }
  
  public final boolean f()
  {
    return this.R == 0;
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    if ((!this.W) && (this.a != null)) {
      this.a.a(localla);
    }
    return localla;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.V == null) || (this.a == null)) {}
    int i;
    do
    {
      return;
      i = this.C;
      if (this.W)
      {
        View localView = this.a.d();
        localView.layout(this.B + this.H.m, i, this.B + this.H.m + localView.getMeasuredWidth(), i + localView.getMeasuredHeight());
        return;
      }
    } while (!x());
    jtu localjtu1 = this.a.b();
    localjtu1.layout(this.B, i, this.B + localjtu1.getMeasuredWidth(), i + localjtu1.getMeasuredHeight());
    int j = i + localjtu1.getMeasuredHeight();
    jtu localjtu2 = this.a.c();
    localjtu2.layout(this.B, j, this.B + localjtu2.getMeasuredWidth(), j + localjtu2.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyz
 * JD-Core Version:    0.7.0.1
 */