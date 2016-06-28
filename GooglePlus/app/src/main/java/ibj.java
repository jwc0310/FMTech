public final class ibj
{
  public int[] a = new int[8];
  public int b = 0;
  
  public final void a(int paramInt)
  {
    if (this.a.length == this.b)
    {
      int[] arrayOfInt2 = new int[this.b + this.b];
      System.arraycopy(this.a, 0, arrayOfInt2, 0, this.b);
      this.a = arrayOfInt2;
    }
    int[] arrayOfInt1 = this.a;
    int i = this.b;
    this.b = (i + 1);
    arrayOfInt1[i] = paramInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibj
 * JD-Core Version:    0.7.0.1
 */