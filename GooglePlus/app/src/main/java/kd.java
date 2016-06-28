final class kd
  implements kf
{
  public static final kd a = new kd(true);
  private final boolean b;
  
  static
  {
    new kd(false);
  }
  
  private kd(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public final int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = paramInt1 + paramInt2;
    int k = 0;
    label11:
    if (paramInt1 < j)
    {
      int m;
      switch (Character.getDirectionality(paramCharSequence.charAt(paramInt1)))
      {
      default: 
        m = 2;
      }
      for (;;)
      {
        switch (m)
        {
        default: 
          paramInt1++;
          break label11;
          m = i;
          continue;
          m = 0;
        }
      }
      if (this.b) {
        i = 0;
      }
    }
    do
    {
      do
      {
        return i;
        k = i;
        break;
      } while (!this.b);
      k = i;
      break;
      if (k == 0) {
        break label147;
      }
    } while (this.b);
    return 0;
    label147:
    return 2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kd
 * JD-Core Version:    0.7.0.1
 */