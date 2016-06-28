public final class lyd
{
  public int a;
  public long b = -1L;
  public int c;
  public int d;
  public int[] e;
  
  public final int a(int paramInt)
  {
    if (this.e == null) {
      return 0;
    }
    return this.e[(paramInt << 1)];
  }
  
  public final void a()
  {
    if (this.e == null) {
      this.e = new int[this.d << 1];
    }
  }
  
  public final int b(int paramInt)
  {
    if (this.e == null) {
      return 0;
    }
    return this.e[(1 + (paramInt << 1))];
  }
  
  public final String toString()
  {
    int i = this.a;
    long l = this.b;
    int j = this.c;
    int k = this.d;
    String str1 = 81 + "LayoutRecord{c=" + i + ", id=" + l + " sz=" + j + " sp=" + k;
    if (this.e != null)
    {
      String str2 = String.valueOf(str1).concat(" margins[before, after](");
      for (int m = 0; m < this.e.length; m += 2)
      {
        String str3 = String.valueOf(str2);
        int n = this.e[m];
        int i1 = this.e[(m + 1)];
        str2 = 26 + String.valueOf(str3).length() + str3 + "[" + n + ", " + i1 + "]";
      }
      str1 = String.valueOf(str2).concat(")");
    }
    return String.valueOf(str1).concat("}");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyd
 * JD-Core Version:    0.7.0.1
 */