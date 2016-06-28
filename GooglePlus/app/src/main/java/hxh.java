import java.util.TimeZone;

public final class hxh
  extends mab
  implements lxc
{
  public String a;
  public String b;
  public Long c;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  public int i;
  public String j;
  boolean k;
  
  public hxh(String paramString1, String paramString2, Long paramLong, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt, String paramString8, boolean paramBoolean)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramLong;
    this.d = paramString3;
    if (paramString3 != null) {
      TimeZone.getTimeZone(paramString3);
    }
    for (;;)
    {
      this.e = paramString4;
      this.f = paramString5;
      this.g = paramString6;
      this.h = paramString7;
      this.i = efj.i(paramInt);
      this.j = paramString8;
      this.k = paramBoolean;
      return;
      TimeZone.getDefault();
    }
  }
  
  public hxh(qbv paramqbv, qbu paramqbu)
  {
    this.a = paramqbv.b;
    this.b = paramqbv.c;
    String str1;
    label80:
    String str2;
    label96:
    String str3;
    if (paramqbv.e != null)
    {
      this.c = paramqbv.e.a;
      this.d = paramqbv.e.b;
      if (this.d != null)
      {
        TimeZone.getTimeZone(this.d);
        if (paramqbv.d == null) {
          break label197;
        }
        str1 = paramqbv.d.a;
        this.e = str1;
        if (paramqbu == null) {
          break label203;
        }
        str2 = paramqbu.b;
        this.f = str2;
        if (paramqbu == null) {
          break label209;
        }
        str3 = paramqbu.c;
        label112:
        this.g = str3;
        String str4 = null;
        if (paramqbu != null) {
          str4 = paramqbu.d;
        }
        this.h = str4;
        if (paramqbv.g == null) {
          break label215;
        }
      }
    }
    label197:
    label203:
    label209:
    label215:
    for (int m = paramqbv.g.b;; m = -2147483648)
    {
      this.i = m;
      this.j = paramqbv.f;
      this.k = false;
      return;
      TimeZone.getDefault();
      break;
      this.c = null;
      this.d = null;
      TimeZone.getDefault();
      break;
      str1 = null;
      break label80;
      str2 = null;
      break label96;
      str3 = null;
      break label112;
    }
  }
  
  public final boolean a()
  {
    return this.k;
  }
  
  public final String b()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxh
 * JD-Core Version:    0.7.0.1
 */