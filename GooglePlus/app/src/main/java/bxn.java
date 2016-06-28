import android.text.TextUtils;
import java.io.Serializable;

public final class bxn
  implements Serializable
{
  public String a;
  public String b;
  public int c;
  public boolean d;
  public boolean e;
  public boolean f;
  
  public bxn()
  {
    this.a = "";
    this.b = "";
    this.f = false;
    this.c = 2;
    this.d = true;
    this.e = false;
  }
  
  public bxn(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this("", "", paramInt, paramBoolean1, paramBoolean2, true);
  }
  
  public bxn(bxn parambxn)
  {
    if (parambxn != null)
    {
      this.a = parambxn.a;
      this.b = parambxn.b;
      this.f = parambxn.f;
      this.c = parambxn.c;
      this.d = parambxn.d;
      this.e = parambxn.e;
    }
  }
  
  public bxn(String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramString1, paramString2, paramInt, true, paramBoolean1, paramBoolean2);
  }
  
  private bxn(String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.f = paramBoolean3;
    this.c = paramInt;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof bxn;
    boolean bool2 = false;
    if (bool1)
    {
      bxn localbxn = (bxn)paramObject;
      boolean bool3 = TextUtils.equals(this.a, localbxn.a);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = TextUtils.equals(this.b, localbxn.b);
        bool2 = false;
        if (bool4)
        {
          boolean bool5 = this.f;
          boolean bool6 = localbxn.f;
          bool2 = false;
          if (bool5 == bool6)
          {
            int i = this.c;
            int j = localbxn.c;
            bool2 = false;
            if (i == j)
            {
              boolean bool7 = this.e;
              boolean bool8 = localbxn.e;
              bool2 = false;
              if (bool7 == bool8) {
                bool2 = true;
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = 31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode());
    int j;
    int k;
    int m;
    if (this.f)
    {
      j = 0;
      k = 31 * (31 * (j + i) + this.c);
      boolean bool = this.e;
      m = 0;
      if (!bool) {
        break label74;
      }
    }
    for (;;)
    {
      return k + m;
      j = 1;
      break;
      label74:
      m = 1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxn
 * JD-Core Version:    0.7.0.1
 */