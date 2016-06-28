import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;

public final class cox
  extends hqj
{
  public static final MatrixCursor r = new MatrixCursor(new String[0]);
  final String s;
  private final int t;
  private final String[] u;
  private final String v;
  private final int w;
  private volatile bko x;
  private boolean y = true;
  
  public cox(Context paramContext, int paramInt1, String[] paramArrayOfString, String paramString1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    super(paramContext);
    this.t = paramInt1;
    this.u = paramArrayOfString;
    this.v = paramString1;
    this.w = 2;
    this.y = paramBoolean1;
    if (paramBoolean2) {}
    for (String str = "gaia_id IS NOT NULL";; str = null)
    {
      this.f = str;
      this.s = paramString2;
      return;
    }
  }
  
  private final void p()
  {
    bko localbko = this.x;
    if (localbko != null) {
      localbko.j();
    }
    this.x = null;
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
    if ((TextUtils.isEmpty(this.v)) || (this.v.length() < this.w)) {
      return new hqr(this.u);
    }
    int i = this.t;
    bko localbko = new bko(this.l, i, this.v, this.s, this.y);
    this.x = localbko;
    try
    {
      localbko.i();
      if (localbko.u)
      {
        MatrixCursor localMatrixCursor = r;
        return localMatrixCursor;
      }
      this.x = null;
      if (localbko.n())
      {
        localbko.c("PublicProfileSearch");
        return null;
      }
    }
    finally
    {
      this.x = null;
    }
    hqr localhqr = new hqr(this.u);
    nzr[] arrayOfnzr = localbko.b;
    String str1 = localbko.a;
    Resources localResources = this.l.getResources();
    Object[] arrayOfObject1 = new Object[this.u.length];
    arrayOfObject1[0] = this.s;
    arrayOfObject1[1] = str1;
    localhqr.a(arrayOfObject1);
    int j;
    if (arrayOfnzr != null) {
      j = arrayOfnzr.length;
    }
    label293:
    label584:
    label720:
    for (int k = 0;; k++)
    {
      if (k >= j) {
        break label747;
      }
      nzr localnzr = arrayOfnzr[k];
      orn localorn = localnzr.b;
      orm localorm = localnzr.a;
      label594:
      if ((localorm != null) && (localorn != null))
      {
        Object[] arrayOfObject2 = new Object[this.u.length];
        int m = 0;
        label252:
        if (m < this.u.length)
        {
          String str2 = this.u[m];
          int i1;
          int n;
          Object[] arrayOfObject3;
          if ("_id".equals(str2))
          {
            i1 = k;
            n = m;
            arrayOfObject3 = arrayOfObject2;
          }
          for (;;)
          {
            arrayOfObject3[n] = Integer.valueOf(i1);
            do
            {
              for (;;)
              {
                m++;
                break label252;
                j = 0;
                break;
                if ("gaia_id".equals(str2))
                {
                  arrayOfObject2[m] = localorm.c;
                }
                else
                {
                  if ("person_id".equals(str2))
                  {
                    String str4 = String.valueOf(localorm.c);
                    if (str4.length() != 0) {}
                    for (String str5 = "g:".concat(str4);; str5 = new String("g:"))
                    {
                      arrayOfObject2[m] = str5;
                      break;
                    }
                  }
                  if ("name".equals(str2))
                  {
                    arrayOfObject2[m] = localorn.a;
                  }
                  else
                  {
                    if ("profile_type".equals(str2))
                    {
                      if (localorn.p != null)
                      {
                        arrayOfObject2[m] = localorn.p.a;
                        continue;
                      }
                      i1 = 1;
                      n = m;
                      arrayOfObject3 = arrayOfObject2;
                      break label293;
                    }
                    if (!"avatar".equals(str2)) {
                      break label496;
                    }
                    arrayOfObject2[m] = hdo.a(localorn.c);
                  }
                }
              }
              if ("snippet".equals(str2))
              {
                String str3 = localnzr.c;
                if (str3 == null)
                {
                  if (localorn.l == null) {
                    break label594;
                  }
                  if (localorn.m == null) {
                    break label584;
                  }
                  int i3 = aau.mA;
                  Object[] arrayOfObject4 = new Object[2];
                  arrayOfObject4[0] = localorn.m;
                  arrayOfObject4[1] = localorn.l;
                  str3 = localResources.getString(i3, arrayOfObject4);
                }
                for (;;)
                {
                  arrayOfObject2[m] = str3;
                  break;
                  str3 = localorn.l;
                  continue;
                  str3 = localorn.m;
                }
              }
              if ("in_same_visibility_group".equals(str2))
              {
                Boolean localBoolean2 = localorn.f;
                boolean bool2;
                if (localBoolean2 == null)
                {
                  bool2 = false;
                  if (!bool2) {
                    break label660;
                  }
                }
                for (int i2 = 1;; i2 = 0)
                {
                  arrayOfObject2[m] = Integer.valueOf(i2);
                  break;
                  bool2 = localBoolean2.booleanValue();
                  break label629;
                }
              }
            } while (!"verified".equals(str2));
            Boolean localBoolean1 = localorn.i;
            if (localBoolean1 == null) {}
            for (boolean bool1 = false;; bool1 = localBoolean1.booleanValue())
            {
              if (!bool1) {
                break label720;
              }
              i1 = 1;
              n = m;
              arrayOfObject3 = arrayOfObject2;
              break;
            }
            n = m;
            arrayOfObject3 = arrayOfObject2;
            i1 = 0;
          }
        }
        label496:
        label629:
        localhqr.a(arrayOfObject2);
      }
    }
    label660:
    label747:
    return localhqr;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cox
 * JD-Core Version:    0.7.0.1
 */