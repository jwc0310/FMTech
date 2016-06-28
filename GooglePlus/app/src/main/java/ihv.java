public final class ihv
{
  public final int[] a;
  public final ihk[] b;
  public final ihh[] c;
  public final ihh[] d;
  
  public ihv(int[] paramArrayOfInt, ihk[] paramArrayOfihk, ihh[] paramArrayOfihh)
  {
    this.a = paramArrayOfInt;
    this.b = paramArrayOfihk;
    this.c = paramArrayOfihh;
    this.d = new ihh[paramArrayOfihh.length];
    for (int i = 0; i < paramArrayOfihh.length; i++) {
      this.d[i] = paramArrayOfihh[(-1 + paramArrayOfihh.length - i)];
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihv
 * JD-Core Version:    0.7.0.1
 */