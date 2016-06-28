import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

final class ldi
  extends lhh
{
  private final String s;
  private final String[] t;
  private final int u;
  
  public ldi(Context paramContext, int paramInt1, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString, int paramInt2)
  {
    super(paramContext, paramInt1, paramString1, paramString2);
    this.s = paramString3;
    this.t = paramArrayOfString;
    this.u = paramInt2;
  }
  
  private lhi r()
  {
    if ((TextUtils.isEmpty(this.f)) || (this.f.length() < this.u)) {
      return new lhi();
    }
    ldj localldj = new ldj(this.l, new kcg(this.l, this.e), this.s, this.f, this.h, 50);
    this.r = localldj;
    try
    {
      localldj.i();
      if (localldj.u)
      {
        lhi locallhi = d;
        return locallhi;
      }
      this.r = null;
      if (!localldj.n()) {
        break label149;
      }
      localldj.c("SquareMemberSearch");
      if (localldj.q != null) {
        return new lhi(localldj.q);
      }
    }
    finally
    {
      this.r = null;
    }
    return null;
    label149:
    qat localqat;
    odl localodl;
    label204:
    String[] arrayOfString;
    odu[] arrayOfodu;
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    hqr localhqr;
    int i2;
    label249:
    String str7;
    if (localldj.x)
    {
      localqat = localldj.w;
      mzo localmzo = (mzo)localqat;
      if ((localmzo == null) || (localmzo.a == null) || (localmzo.a.a.length <= 0)) {
        break label289;
      }
      localodl = localmzo.a.a[0];
      arrayOfString = this.t;
      arrayOfodu = localodl.d;
      i = 0;
      j = -1;
      k = -1;
      m = -1;
      n = -1;
      i1 = -1;
      localhqr = new hqr(arrayOfString);
      i2 = 0;
      if (i2 >= arrayOfString.length) {
        break label363;
      }
      str7 = arrayOfString[i2];
      if (!"_id".equals(str7)) {
        break label295;
      }
      j = i2;
    }
    for (;;)
    {
      i2++;
      break label249;
      localqat = null;
      break;
      label289:
      localodl = null;
      break label204;
      label295:
      if ("qualified_id".equals(str7)) {
        k = i2;
      } else if ("name".equals(str7)) {
        m = i2;
      } else if ("avatar".equals(str7)) {
        n = i2;
      } else if ("membership_status".equals(str7)) {
        i1 = i2;
      }
    }
    label363:
    int i3;
    Object[] arrayOfObject;
    int i4;
    label384:
    odu localodu;
    String str4;
    String str6;
    if (arrayOfodu != null)
    {
      i3 = arrayOfodu.length;
      arrayOfObject = new Object[arrayOfString.length];
      i4 = 0;
      if (i4 >= i3) {
        break label652;
      }
      Arrays.fill(arrayOfObject, null);
      localodu = arrayOfodu[i4];
      if (j >= 0)
      {
        int i5 = i + 1;
        arrayOfObject[j] = Integer.valueOf(i);
        i = i5;
      }
      if (k >= 0)
      {
        if (localodu.e == null) {
          break label581;
        }
        str4 = String.valueOf("t:");
        String str5 = String.valueOf(localodu.e.a);
        if (str5.length() == 0) {
          break label567;
        }
        str6 = str4.concat(str5);
        label479:
        arrayOfObject[k] = str6;
      }
      if (m >= 0)
      {
        if (localodu.e == null) {
          break label639;
        }
        arrayOfObject[m] = localodu.e.b;
      }
    }
    for (;;)
    {
      if (n >= 0) {
        arrayOfObject[n] = hdo.a(localodu.b);
      }
      if (i1 >= 0) {
        arrayOfObject[i1] = Integer.valueOf(localodu.d);
      }
      localhqr.a(arrayOfObject);
      i4++;
      break label384;
      i3 = 0;
      break;
      label567:
      str6 = new String(str4);
      break label479;
      label581:
      String str1 = String.valueOf("g:");
      String str2 = String.valueOf(localodu.a);
      if (str2.length() != 0) {}
      for (String str3 = str1.concat(str2);; str3 = new String(str1))
      {
        arrayOfObject[k] = str3;
        break;
      }
      label639:
      arrayOfObject[m] = localodu.c;
    }
    label652:
    return new lhi(localhqr, this.h, localodl.c, this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldi
 * JD-Core Version:    0.7.0.1
 */