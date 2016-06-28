import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;
import android.util.Log;

public final class bxd
  extends hqj
{
  public static final MatrixCursor r = new MatrixCursor(new String[0]);
  private final int s;
  private final String[] t;
  private final String u;
  private final int v;
  private volatile bht w;
  private final String x;
  
  public bxd(Context paramContext, int paramInt1, String[] paramArrayOfString, String paramString1, int paramInt2, boolean paramBoolean, String paramString2)
  {
    super(paramContext);
    this.s = paramInt1;
    this.t = paramArrayOfString;
    this.u = paramString1;
    this.v = 2;
    if (paramBoolean) {}
    for (String str = "gaia_id IS NOT NULL";; str = null)
    {
      this.f = str;
      this.x = null;
      return;
    }
  }
  
  private static mog a(mor parammor)
  {
    mog[] arrayOfmog = parammor.c;
    if ((arrayOfmog != null) && (arrayOfmog.length > 0)) {
      return arrayOfmog[0];
    }
    return null;
  }
  
  private final void p()
  {
    bht localbht = this.w;
    if (localbht != null) {
      localbht.j();
    }
    this.w = null;
  }
  
  public final boolean k()
  {
    p();
    return super.k();
  }
  
  public final void l()
  {
    p();
  }
  
  public final Cursor o()
  {
    hqr localhqr = new hqr(this.t);
    if ((TextUtils.isEmpty(this.u)) || (this.u.length() < this.v)) {
      return localhqr;
    }
    bht localbht = new bht(this.l, this.s, this.u, this.x);
    this.w = localbht;
    try
    {
      localbht.i();
      if (localbht.u)
      {
        MatrixCursor localMatrixCursor = r;
        return localMatrixCursor;
      }
      this.w = null;
      if (localbht.n())
      {
        localbht.c("ACMergedPeople");
        return null;
      }
    }
    finally
    {
      this.w = null;
    }
    Object[] arrayOfObject1 = new Object[this.t.length];
    arrayOfObject1[0] = this.x;
    arrayOfObject1[1] = null;
    localhqr.a(arrayOfObject1);
    mna[] arrayOfmna = localbht.a;
    int i = 0;
    if (i < arrayOfmna.length)
    {
      mna localmna = arrayOfmna[i];
      mor localmor1 = localmna.a;
      mot localmot1 = localmor1.b;
      Object localObject2;
      label194:
      String str1;
      if (localmot1 == null)
      {
        localObject2 = null;
        mnh[] arrayOfmnh = localmor1.f;
        if ((arrayOfmnh == null) || (arrayOfmnh.length <= 0)) {
          break label312;
        }
        str1 = arrayOfmnh[0].a;
        label221:
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) || (!TextUtils.isEmpty(str1))) {
          break label318;
        }
        if (Log.isLoggable("ACMergedPeople", 5))
        {
          String str8 = String.valueOf(localmor1);
          new StringBuilder(39 + String.valueOf(str8).length()).append("invalid response, no gaiaId nor email: ").append(str8);
        }
      }
      label312:
      label318:
      Object[] arrayOfObject2;
      for (Object localObject3 = null;; localObject3 = arrayOfObject2)
      {
        if (localObject3 != null) {
          localhqr.a((Object[])localObject3);
        }
        i++;
        break;
        localObject2 = localmot1.a;
        break label194;
        str1 = null;
        break label221;
        arrayOfObject2 = new Object[this.t.length];
        int j = 0;
        if (j < arrayOfObject2.length)
        {
          String str2 = this.t[j];
          Object localObject4;
          if (("_id".equals(str2)) || ("auto_complete_index".equals(str2))) {
            localObject4 = Integer.valueOf(i);
          }
          for (;;)
          {
            arrayOfObject2[j] = localObject4;
            j++;
            break;
            mor localmor2 = localmna.a;
            if ("gaia_id".equals(str2))
            {
              localObject4 = localObject2;
            }
            else if ("person_id".equals(str2))
            {
              if (!TextUtils.isEmpty((CharSequence)localObject2))
              {
                String str7 = String.valueOf(localObject2);
                if (str7.length() != 0) {
                  localObject4 = "g:".concat(str7);
                } else {
                  localObject4 = new String("g:");
                }
              }
              else if (!TextUtils.isEmpty(str1))
              {
                String str6 = String.valueOf(str1);
                if (str6.length() != 0) {
                  localObject4 = "e:".concat(str6);
                } else {
                  localObject4 = new String("e:");
                }
              }
              else
              {
                localObject4 = null;
              }
            }
            else
            {
              if ("name".equals(str2))
              {
                mog localmog2 = a(localmor2);
                if (localmog2 != null) {
                  localObject4 = localmog2.b;
                }
              }
              else
              {
                if ("verified".equals(str2))
                {
                  mog localmog1 = a(localmor2);
                  Boolean localBoolean2;
                  label583:
                  boolean bool2;
                  if (localmog1 == null)
                  {
                    localBoolean2 = null;
                    if (localBoolean2 != null) {
                      break label636;
                    }
                    bool2 = false;
                    label591:
                    if (!bool2) {
                      break label646;
                    }
                  }
                  label646:
                  for (int i2 = 1;; i2 = 0)
                  {
                    localObject4 = Integer.valueOf(i2);
                    break;
                    if (localmog1.a == null)
                    {
                      localBoolean2 = null;
                      break label583;
                    }
                    localBoolean2 = localmog1.a.a;
                    break label583;
                    label636:
                    bool2 = localBoolean2.booleanValue();
                    break label591;
                  }
                }
                if ("profile_type".equals(str2))
                {
                  mot localmot3 = localmor2.b;
                  if (localmot3 == null)
                  {
                    localObject4 = Integer.valueOf(1);
                    continue;
                  }
                  switch (localmot3.b)
                  {
                  default: 
                    if (Log.isLoggable("ACMergedPeople", 5))
                    {
                      int i1 = localmot3.b;
                      String str5 = String.valueOf(localmor2);
                      new StringBuilder(32 + String.valueOf(str5).length()).append("invalid objectType ").append(i1).append(": ").append(str5);
                    }
                    localObject4 = Integer.valueOf(1);
                    break;
                  case 0: 
                    localObject4 = Integer.valueOf(1);
                    break;
                  case 1: 
                    localObject4 = Integer.valueOf(2);
                    break;
                  }
                }
                if ("avatar".equals(str2))
                {
                  mov[] arrayOfmov = localmor2.d;
                  if ((arrayOfmov != null) && (arrayOfmov.length > 0)) {}
                  for (String str4 = arrayOfmov[0].a;; str4 = null)
                  {
                    localObject4 = hdo.a(str4);
                    break;
                  }
                }
                if ("snippet".equals(str2))
                {
                  mpf[] arrayOfmpf = localmor2.e;
                  label891:
                  int m;
                  label926:
                  label937:
                  String str3;
                  if ((arrayOfmpf != null) && (arrayOfmpf.length > 0))
                  {
                    localObject4 = arrayOfmpf[0].a;
                    if (!TextUtils.isEmpty((CharSequence)localObject4)) {
                      break label1034;
                    }
                    mom[] arrayOfmom = localmor2.g;
                    if ((arrayOfmom == null) || (arrayOfmom.length <= 0)) {
                      break label1036;
                    }
                    localObject4 = arrayOfmom[0].a;
                    if (TextUtils.isEmpty((CharSequence)localObject4)) {
                      break label1042;
                    }
                    m = 1;
                    moi[] arrayOfmoi = localmor2.h;
                    if ((arrayOfmoi == null) || (arrayOfmoi.length <= 0)) {
                      break label1048;
                    }
                    str3 = arrayOfmoi[0].a;
                    label964:
                    if (TextUtils.isEmpty(str3)) {
                      break label1054;
                    }
                  }
                  label1034:
                  label1036:
                  label1042:
                  label1048:
                  label1054:
                  for (int n = 1;; n = 0)
                  {
                    if ((m != 0) && (n != 0)) {
                      this.l.getResources().getString(aau.mA, new Object[] { str3, localObject4 });
                    }
                    if (m != 0) {
                      break;
                    }
                    if (n == 0) {
                      break label1060;
                    }
                    localObject4 = str3;
                    break;
                    localObject4 = null;
                    break label891;
                    break;
                    localObject4 = null;
                    break label926;
                    m = 0;
                    break label937;
                    str3 = null;
                    break label964;
                  }
                  label1060:
                  localObject4 = null;
                  continue;
                }
                if ("in_same_visibility_group".equals(str2))
                {
                  mot localmot2 = localmor2.b;
                  Boolean localBoolean1;
                  label1092:
                  boolean bool1;
                  if (localmot2 == null)
                  {
                    localBoolean1 = null;
                    if (localBoolean1 != null) {
                      break label1128;
                    }
                    bool1 = false;
                    label1100:
                    if (!bool1) {
                      break label1138;
                    }
                  }
                  label1128:
                  label1138:
                  for (int k = 1;; k = 0)
                  {
                    localObject4 = Integer.valueOf(k);
                    break;
                    localBoolean1 = localmot2.c;
                    break label1092;
                    bool1 = localBoolean1.booleanValue();
                    break label1100;
                  }
                }
                if ("auto_complete_suggestion".equals(str2))
                {
                  localObject4 = localmna.b;
                  continue;
                }
              }
              localObject4 = null;
            }
          }
        }
      }
    }
    return localhqr;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxd
 * JD-Core Version:    0.7.0.1
 */