import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

public final class lhm
  extends lhh
{
  private final String[] s;
  private final int t;
  
  public lhm(Context paramContext, int paramInt1, String paramString1, String paramString2, String[] paramArrayOfString, int paramInt2)
  {
    super(paramContext, paramInt1, paramString1, paramString2);
    this.s = paramArrayOfString;
    this.t = 2;
  }
  
  private lhi r()
  {
    if ((TextUtils.isEmpty(this.f)) || (this.f.length() < this.t)) {
      return new lhi();
    }
    lhn locallhn = new lhn(this.l, new kch().a(this.l, this.e).a(), this.f, this.h);
    this.r = locallhn;
    try
    {
      locallhn.i();
      if (locallhn.u)
      {
        lhi locallhi = d;
        return locallhi;
      }
      this.r = null;
      if (!locallhn.n()) {
        break label149;
      }
      locallhn.c("SquareSearch");
      if (locallhn.q != null) {
        return new lhi(locallhn.q);
      }
    }
    finally
    {
      this.r = null;
    }
    return null;
    label149:
    qat localqat;
    nzt localnzt;
    label190:
    oad[] arrayOfoad2;
    label213:
    oad[] arrayOfoad1;
    String str1;
    if (locallhn.x)
    {
      localqat = locallhn.w;
      nam localnam = (nam)localqat;
      if ((localnam == null) || (localnam.a == null)) {
        break label326;
      }
      localnzt = localnam.a.a;
      if (localnzt == null) {
        break label752;
      }
      if (localnzt.c == null) {
        break label746;
      }
      arrayOfoad2 = localnzt.c.a;
      if (localnzt.a == null) {
        break label736;
      }
      String str3 = localnzt.a.b;
      arrayOfoad1 = arrayOfoad2;
      str1 = str3;
    }
    for (;;)
    {
      String[] arrayOfString = this.s;
      int i = 0;
      int j = -1;
      int k = -1;
      int m = -1;
      int n = -1;
      int i1 = -1;
      int i2 = -1;
      int i3 = -1;
      int i4 = -1;
      hqr localhqr = new hqr(arrayOfString);
      int i5 = 0;
      label286:
      if (i5 < arrayOfString.length)
      {
        String str2 = arrayOfString[i5];
        if ("_id".equals(str2)) {
          j = i5;
        }
        for (;;)
        {
          i5++;
          break label286;
          localqat = null;
          break;
          label326:
          localnzt = null;
          break label190;
          if ("square_id".equals(str2)) {
            k = i5;
          } else if ("square_name".equals(str2)) {
            m = i5;
          } else if ("photo_url".equals(str2)) {
            n = i5;
          } else if ("post_visibility".equals(str2)) {
            i1 = i5;
          } else if ("member_count".equals(str2)) {
            i2 = i5;
          } else if ("membership_status".equals(str2)) {
            i3 = i5;
          } else if ("joinability".equals(str2)) {
            i4 = i5;
          }
        }
      }
      int i6;
      Object[] arrayOfObject;
      int i7;
      label472:
      oad locaload;
      int i8;
      if (arrayOfoad1 != null)
      {
        i6 = arrayOfoad1.length;
        arrayOfObject = new Object[arrayOfString.length];
        i7 = 0;
        if (i7 >= i6) {
          break label709;
        }
        Arrays.fill(arrayOfObject, null);
        locaload = arrayOfoad1[i7];
        if (j < 0) {
          break label729;
        }
        i8 = i + 1;
        arrayOfObject[j] = Integer.valueOf(i);
      }
      for (;;)
      {
        if (k >= 0) {
          arrayOfObject[k] = locaload.a.b.a;
        }
        if (m >= 0) {
          arrayOfObject[m] = locaload.a.b.b.a;
        }
        if (n >= 0) {
          arrayOfObject[n] = locaload.a.b.b.c;
        }
        if (i1 >= 0) {
          arrayOfObject[i1] = Integer.valueOf(locaload.a.b.c.a);
        }
        if ((i2 >= 0) && (locaload.a.d != null)) {
          arrayOfObject[i2] = locaload.a.d.a;
        }
        if (i3 >= 0) {
          arrayOfObject[i3] = Integer.valueOf(locaload.a.f);
        }
        if (i4 >= 0) {
          arrayOfObject[i4] = Integer.valueOf(locaload.a.b.d);
        }
        localhqr.a(arrayOfObject);
        i7++;
        i = i8;
        break label472;
        i6 = 0;
        break;
        label709:
        return new lhi(localhqr, this.h, str1, this.f);
        label729:
        i8 = i;
      }
      label736:
      arrayOfoad1 = arrayOfoad2;
      str1 = null;
      continue;
      label746:
      arrayOfoad2 = null;
      break label213;
      label752:
      str1 = null;
      arrayOfoad1 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhm
 * JD-Core Version:    0.7.0.1
 */