import android.graphics.RectF;

public class ipk
  extends kba
{
  private int a;
  public ipk b;
  ipf c;
  int d;
  int e;
  public int f;
  int g;
  RectF h;
  ioy i;
  
  public ipk()
  {
    super((byte)0);
  }
  
  public String a()
  {
    switch (this.d)
    {
    default: 
      return "";
    case 0: 
      int m = this.f;
      int n = this.g;
      return 23 + m + "x" + n;
    case 2: 
      return "thumbnail";
    case 3: 
      return "large";
    case 1: 
      return "full";
    case 4: 
      return "original";
    }
    int j = this.f;
    int k = this.g;
    return 29 + "auto(" + j + "x" + k + ")";
  }
  
  public final void a(int paramInt1, ipf paramipf, int paramInt2, int paramInt3, int paramInt4, int paramInt5, RectF paramRectF, ioy paramioy)
  {
    a(paramInt1, paramipf.f);
    this.c = paramipf;
    this.d = paramInt2;
    this.e = paramInt5;
    this.f = paramInt3;
    this.g = paramInt4;
    this.h = paramRectF;
    this.i = paramioy;
    this.a = 0;
  }
  
  public final int b()
  {
    return this.j;
  }
  
  public final int c()
  {
    int j = Math.max(this.f, this.g);
    if ((j == 0) || (j > iph.m)) {
      return 6;
    }
    if (j > iph.n) {
      return 7;
    }
    return 8;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label214:
    label252:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof ipk)) {
        return false;
      }
      ipk localipk = (ipk)paramObject;
      int j;
      ioy localioy1;
      ioy localioy2;
      boolean bool;
      if ((this.j == localipk.j) && (this.e == localipk.e) && (this.c.equals(localipk.c)))
      {
        if (this.d == localipk.d) {
          break label127;
        }
        j = 0;
        if (j != 0)
        {
          localioy1 = this.i;
          localioy2 = localipk.i;
          if ((localioy1 != null) || (localioy2 != null)) {
            break label214;
          }
          bool = true;
        }
      }
      for (;;)
      {
        if ((bool) && ((this.h == null) || (this.h.equals(localipk.h)))) {
          break label252;
        }
        return false;
        label127:
        switch (this.d)
        {
        default: 
          j = 1;
          break;
        case 5: 
          if (c() == localipk.c())
          {
            j = 1;
            break;
          }
          j = 0;
          break;
        case 0: 
          if ((this.f == localipk.f) && (this.g == localipk.g))
          {
            j = 1;
            break;
          }
          j = 0;
          break;
          if (((localioy1 == null) && (localioy2 != null)) || ((localioy1 != null) && (localioy2 == null))) {
            bool = false;
          } else {
            bool = localioy1.a(localioy2);
          }
          break;
        }
      }
    }
  }
  
  public int hashCode()
  {
    if (this.a == 0) {
      this.a = efj.a(this.c, this.d + 31 * efj.a(this.h, 527 + this.j));
    }
    return this.a;
  }
  
  public String toString()
  {
    String str1 = a();
    String str4;
    label32:
    String str5;
    label134:
    String str6;
    switch (this.d)
    {
    default: 
      str4 = "";
      if (this.h != null)
      {
        float f1 = this.h.left;
        float f2 = this.h.top;
        float f3 = this.h.right;
        float f4 = this.h.bottom;
        str5 = 74 + ", crop(" + f1 + ", " + f2 + ", " + f3 + ", " + f4 + ")";
        str6 = "";
        if ((0x1 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" no-disk-cache");
        }
        if ((0x2 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" download-only");
        }
        if ((0x4 & this.j) != 0)
        {
          str6 = String.valueOf(str6).concat(" accept-animation");
          if ((0x20 & this.j) != 0) {
            str6 = String.valueOf(str6).concat("-disable-webp");
          }
        }
        if ((0x8 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" disable-decoding");
        }
        if ((0x10 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" disable-recycling");
        }
        if ((0x20 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" disable-webp");
        }
        if ((0x40 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" accept-bitmap-container");
        }
        if ((0x80 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" disable-loading");
        }
        if ((0x100 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" disable-smart-crop");
        }
        if ((0x200 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" disable-upscale");
        }
        if ((0x400 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" long-term-cache");
        }
        if ((0x800 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" keep-partial-download");
        }
        if ((0x1000 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" disable-automatic-high-res-download");
        }
        if ((0x2000 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" allow-large-file-download");
        }
        if ((0x4000 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" for-media-sync");
        }
        if ((0x8000 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" prefer-high-res-download");
        }
        if ((0x10000 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" convert-webp-to-jpeg");
        }
        if ((0x20000 & this.j) != 0) {
          str6 = String.valueOf(str6).concat(" include-exif");
        }
        if (this.i == null) {
          break label803;
        }
      }
      break;
    }
    label782:
    label803:
    for (boolean bool = true;; bool = false)
    {
      String str7 = String.valueOf(this.c);
      return 22 + String.valueOf(str7).length() + String.valueOf(str1).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + "{" + str7 + " (" + str1 + str4 + str5 + ") hasEdits: " + bool + " " + str6 + "}";
      if (this.e == -1) {
        break;
      }
      String str2;
      switch (this.e)
      {
      default: 
        str2 = "";
      }
      for (;;)
      {
        String str3 = String.valueOf(str2);
        if (str3.length() == 0) {
          break label782;
        }
        str4 = "-".concat(str3);
        break;
        str2 = "H";
        continue;
        str2 = "S";
        continue;
        str2 = "L";
        continue;
        str2 = "VL";
      }
      str4 = new String("-");
      break label32;
      str5 = "";
      break label134;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ipk
 * JD-Core Version:    0.7.0.1
 */