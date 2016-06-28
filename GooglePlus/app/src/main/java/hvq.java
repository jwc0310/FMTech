public final class hvq
{
  public int a;
  public int b;
  
  public hvq()
  {
    this.a = -1;
    this.b = 0;
  }
  
  public hvq(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final String toString()
  {
    int i = this.a;
    int j = this.b;
    return 36 + "type: " + i + "; index=" + j;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvq
 * JD-Core Version:    0.7.0.1
 */