import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class jns
  extends hqe<List<jnx>>
{
  String d;
  private final int e;
  private final String f;
  private final boolean h;
  private final boolean r;
  private jnt s;
  
  public jns(Context paramContext, int paramInt, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
  {
    super(paramContext);
    this.e = paramInt;
    this.f = paramString1;
    this.h = paramBoolean1;
    this.d = paramString2;
    this.r = paramBoolean2;
  }
  
  private List<jnx> r()
  {
    jnt localjnt = new jnt(this.l, this.e, this.f, this.d);
    this.s = localjnt;
    try
    {
      localjnt.i();
      boolean bool1 = localjnt.u;
      if (bool1) {
        return null;
      }
      this.s = null;
      if (localjnt.n())
      {
        localjnt.c("ACMergedPeople");
        return null;
      }
    }
    finally
    {
      this.s = null;
    }
    this.d = localjnt.a;
    ArrayList localArrayList1 = new ArrayList();
    mna[] arrayOfmna = localjnt.b;
    int i = 0;
    mor localmor;
    Object localObject2;
    label136:
    Object localObject3;
    label212:
    label218:
    label250:
    Object localObject4;
    label407:
    label413:
    String str5;
    boolean bool2;
    label445:
    String str6;
    label472:
    mot localmot2;
    int j;
    label522:
    label528:
    label534:
    int k;
    String str7;
    if (i < arrayOfmna.length)
    {
      localmor = arrayOfmna[i].a;
      mot localmot1 = localmor.b;
      mnh[] arrayOfmnh;
      if (localmot1 == null)
      {
        localObject2 = null;
        arrayOfmnh = localmor.f;
        if ((arrayOfmnh == null) || (arrayOfmnh.length <= 0)) {
          break label212;
        }
      }
      for (String str1 = arrayOfmnh[0].a;; str1 = null)
      {
        if ((!this.h) || (!TextUtils.isEmpty((CharSequence)localObject2))) {
          break label218;
        }
        localObject3 = null;
        if (localObject3 != null) {
          localArrayList1.add(localObject3);
        }
        i++;
        break;
        localObject2 = localmot1.a;
        break label136;
      }
      String str13;
      mog[] arrayOfmog;
      if (!TextUtils.isEmpty((CharSequence)localObject2))
      {
        String str12 = String.valueOf(localObject2);
        if (str12.length() != 0)
        {
          str13 = "g:".concat(str12);
          localObject4 = str13;
          arrayOfmog = localmor.c;
          if ((arrayOfmog == null) || (arrayOfmog.length <= 0)) {
            break label407;
          }
        }
      }
      for (mog localmog = arrayOfmog[0];; localmog = null)
      {
        if (localmog != null) {
          break label413;
        }
        localObject3 = null;
        break;
        str13 = new String("g:");
        break label250;
        if (!TextUtils.isEmpty(str1))
        {
          String str3 = String.valueOf(str1);
          if (str3.length() != 0) {}
          for (String str4 = "e:".concat(str3);; str4 = new String("e:"))
          {
            localObject4 = str4;
            break;
          }
        }
        if (Log.isLoggable("ACMergedPeople", 5))
        {
          String str2 = String.valueOf(localmor);
          new StringBuilder(39 + String.valueOf(str2).length()).append("invalid response, no gaiaId nor email: ").append(str2);
        }
        localObject3 = null;
        break;
      }
      str5 = localmog.b;
      if ((localmog.a != null) && (efj.b(localmog.a.a)))
      {
        bool2 = true;
        mov[] arrayOfmov = localmor.d;
        if ((arrayOfmov == null) || (arrayOfmov.length <= 0)) {
          break label522;
        }
        str6 = arrayOfmov[0].a;
        localmot2 = localmor.b;
        if ((localmot2 == null) || (!efj.b(localmot2.c))) {
          break label528;
        }
      }
      for (j = 1;; j = 0)
      {
        if ((!this.r) || (j != 0)) {
          break label534;
        }
        localObject3 = null;
        break;
        bool2 = false;
        break label445;
        str6 = null;
        break label472;
      }
      if (localmot2 == null)
      {
        k = -1;
        mpf[] arrayOfmpf = localmor.e;
        if ((arrayOfmpf == null) || (arrayOfmpf.length <= 0)) {
          break label864;
        }
        str7 = arrayOfmpf[0].a;
        label569:
        if (TextUtils.isEmpty(str7)) {
          break label910;
        }
      }
    }
    for (;;)
    {
      mom[] arrayOfmom = localmor.g;
      String str8;
      label604:
      int m;
      label615:
      String str9;
      label642:
      int n;
      if ((arrayOfmom != null) && (arrayOfmom.length > 0))
      {
        str8 = arrayOfmom[0].a;
        if (TextUtils.isEmpty(str8)) {
          break label876;
        }
        m = 1;
        moi[] arrayOfmoi = localmor.h;
        if ((arrayOfmoi == null) || (arrayOfmoi.length <= 0)) {
          break label882;
        }
        str9 = arrayOfmoi[0].a;
        if (TextUtils.isEmpty(str9)) {
          break label888;
        }
        n = 1;
        label653:
        if ((m != 0) && (n != 0)) {
          this.l.getResources().getString(eb.j, new Object[] { str9, str8 });
        }
        if (m == 0) {
          break label903;
        }
      }
      label903:
      for (String str10 = str8;; str10 = str7)
      {
        if (n != 0) {
          str10 = str9;
        }
        ArrayList localArrayList2 = new ArrayList();
        if (j != 0) {}
        for (int i1 = 2;; i1 = 1)
        {
          localObject3 = new jnx((String)localObject4, (String)localObject2, str5, str6, k, localArrayList2, i1, bool2, str10);
          break;
          switch (localmot2.b)
          {
          default: 
            if (Log.isLoggable("ACMergedPeople", 5))
            {
              int i2 = localmot2.b;
              String str11 = String.valueOf(localmor);
              new StringBuilder(32 + String.valueOf(str11).length()).append("invalid objectType ").append(i2).append(": ").append(str11);
            }
            k = 1;
            break;
          case 0: 
            k = 1;
            break;
          case 1: 
            k = 2;
            break;
            label864:
            str7 = null;
            break label569;
            str8 = null;
            break label604;
            label876:
            m = 0;
            break label615;
            label882:
            str9 = null;
            break label642;
            label888:
            n = 0;
            break label653;
          }
        }
        return localArrayList1;
      }
      label910:
      str7 = "";
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jns
 * JD-Core Version:    0.7.0.1
 */