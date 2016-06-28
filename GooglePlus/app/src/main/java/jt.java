final class jt
{
  private static final byte[] f = new byte[1792];
  final String a;
  final boolean b;
  final int c;
  int d;
  char e;
  
  static
  {
    for (int i = 0; i < 1792; i++) {
      f[i] = Character.getDirectionality(i);
    }
  }
  
  jt(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = false;
    this.c = paramString.length();
  }
  
  static byte a(char paramChar)
  {
    if (paramChar < '܀') {
      return f[paramChar];
    }
    return Character.getDirectionality(paramChar);
  }
  
  final byte a()
  {
    byte b1 = 12;
    this.e = this.a.charAt(-1 + this.d);
    if (Character.isLowSurrogate(this.e))
    {
      int i2 = Character.codePointBefore(this.a, this.d);
      this.d -= Character.charCount(i2);
      b1 = Character.getDirectionality(i2);
      return b1;
    }
    this.d = (-1 + this.d);
    byte b2 = a(this.e);
    if (this.b)
    {
      if (this.e == '>')
      {
        int k = this.d;
        for (;;)
        {
          label104:
          if (this.d <= 0) {
            break label237;
          }
          String str2 = this.a;
          int m = -1 + this.d;
          this.d = m;
          this.e = str2.charAt(m);
          if (this.e == '<') {
            break;
          }
          if (this.e == '>') {
            break label237;
          }
          if ((this.e == '"') || (this.e == '\''))
          {
            int n = this.e;
            if (this.d > 0)
            {
              String str3 = this.a;
              int i1 = -1 + this.d;
              this.d = i1;
              char c1 = str3.charAt(i1);
              this.e = c1;
              if (c1 != n) {
                break label104;
              }
            }
          }
        }
        label237:
        this.d = k;
        this.e = '>';
        return 13;
      }
      if (this.e == ';')
      {
        int i = this.d;
        do
        {
          if (this.d <= 0) {
            break label322;
          }
          String str1 = this.a;
          int j = -1 + this.d;
          this.d = j;
          this.e = str1.charAt(j);
          if (this.e == '&') {
            break;
          }
        } while (this.e != ';');
        label322:
        this.d = i;
        this.e = ';';
        return 13;
      }
    }
    return b2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jt
 * JD-Core Version:    0.7.0.1
 */