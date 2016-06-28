import android.net.Uri;

final class jap
  extends jar
{
  private final Integer a;
  private final Integer b;
  private final Integer c;
  private final Uri d;
  private final boolean e;
  private final boolean f;
  private final Integer g;
  private final boolean h;
  
  jap(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Uri paramUri, boolean paramBoolean1, boolean paramBoolean2, Integer paramInteger4, boolean paramBoolean3)
  {
    if (paramInteger1 == null) {
      throw new NullPointerException("Null iconResourceId");
    }
    this.a = paramInteger1;
    if (paramInteger2 == null) {
      throw new NullPointerException("Null appNameResourceId");
    }
    this.b = paramInteger2;
    this.c = paramInteger3;
    this.d = paramUri;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.g = paramInteger4;
    this.h = paramBoolean3;
  }
  
  public final Integer a()
  {
    return this.a;
  }
  
  public final Integer b()
  {
    return this.b;
  }
  
  public final Integer c()
  {
    return this.c;
  }
  
  public final Uri d()
  {
    return this.d;
  }
  
  public final boolean e()
  {
    return this.e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label141:
    label158:
    label173:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof jar)) {
        break;
      }
      jar localjar = (jar)paramObject;
      if ((this.a.equals(localjar.a())) && (this.b.equals(localjar.b())))
      {
        if (this.c != null) {
          break label124;
        }
        if (localjar.c() == null)
        {
          if (this.d != null) {
            break label141;
          }
          if (localjar.d() == null) {
            label75:
            if ((this.e == localjar.e()) && (this.f == localjar.f()))
            {
              if (this.g != null) {
                break label158;
              }
              if (localjar.g() != null) {}
            }
          }
        }
      }
      for (;;)
      {
        if (this.h == localjar.h()) {
          break label173;
        }
        label124:
        do
        {
          do
          {
            do
            {
              return false;
            } while (!this.c.equals(localjar.c()));
            break;
          } while (!this.d.equals(localjar.d()));
          break label75;
        } while (!this.g.equals(localjar.g()));
      }
    }
    return false;
  }
  
  public final boolean f()
  {
    return this.f;
  }
  
  public final Integer g()
  {
    return this.g;
  }
  
  public final boolean h()
  {
    return this.h;
  }
  
  public final int hashCode()
  {
    int i = 1231;
    int j = 1000003 * (1000003 * (0xF4243 ^ this.a.hashCode()) ^ this.b.hashCode());
    int k;
    int n;
    label56:
    int i2;
    label76:
    int i4;
    label96:
    int i6;
    label120:
    int i7;
    if (this.c == null)
    {
      k = 0;
      int m = 1000003 * (k ^ j);
      if (this.d != null) {
        break label153;
      }
      n = 0;
      int i1 = 1000003 * (n ^ m);
      if (!this.e) {
        break label165;
      }
      i2 = i;
      int i3 = 1000003 * (i2 ^ i1);
      if (!this.f) {
        break label173;
      }
      i4 = i;
      int i5 = 1000003 * (i4 ^ i3);
      Integer localInteger = this.g;
      i6 = 0;
      if (localInteger != null) {
        break label181;
      }
      i7 = 1000003 * (i5 ^ i6);
      if (!this.h) {
        break label193;
      }
    }
    for (;;)
    {
      return i7 ^ i;
      k = this.c.hashCode();
      break;
      label153:
      n = this.d.hashCode();
      break label56;
      label165:
      i2 = 1237;
      break label76;
      label173:
      i4 = 1237;
      break label96;
      label181:
      i6 = this.g.hashCode();
      break label120;
      label193:
      i = 1237;
    }
  }
  
  public final String toString()
  {
    String str1 = String.valueOf("SystemTrayConfig{iconResourceId=");
    String str2 = String.valueOf(this.a);
    String str3 = String.valueOf(this.b);
    String str4 = String.valueOf(this.c);
    String str5 = String.valueOf(this.d);
    boolean bool1 = this.e;
    boolean bool2 = this.f;
    String str6 = String.valueOf(this.g);
    boolean bool3 = this.h;
    return 118 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + str1 + str2 + ", appNameResourceId=" + str3 + ", colorResourceId=" + str4 + ", ringtone=" + str5 + ", ringtoneEnabled=" + bool1 + ", vibrate=" + bool2 + ", ledColor=" + str6 + ", pushEnabled=" + bool3 + "}";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jap
 * JD-Core Version:    0.7.0.1
 */