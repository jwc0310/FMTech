public final class ipi
  implements ipj
{
  public final int a(int paramInt)
  {
    if (paramInt == -1) {
      return -1;
    }
    return 0;
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      return paramInt2;
    }
    return paramInt2 | 0x20;
  }
  
  public final int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 3: 
      return 0;
    case 2: 
      return 1;
    case 1: 
      return 2;
    }
    return 3;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ipi
 * JD-Core Version:    0.7.0.1
 */