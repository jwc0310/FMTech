import android.content.Context;

final class bsg
  implements bsb
{
  private final Context a;
  private final int b;
  private final bsn c;
  private final int d;
  
  public bsg(Context paramContext, int paramInt, bsn parambsn)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.c = parambsn;
    switch (bsa.a[parambsn.ordinal()])
    {
    default: 
      this.d = 0;
      return;
    case 1: 
      this.d = 3;
      return;
    case 2: 
      this.d = 2;
      return;
    }
    this.d = 1;
  }
  
  public final bsc a(String paramString)
  {
    bjs localbjs = new bjs(this.a, this.b, paramString, this.d, this.c.g);
    localbjs.i();
    localbjs.d("EsTileSync");
    return new bsc(localbjs);
  }
  
  public final String toString()
  {
    String str = String.valueOf("InitialAllPhotosFetcher, requestReason: ");
    int i = this.d;
    return 11 + String.valueOf(str).length() + str + i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsg
 * JD-Core Version:    0.7.0.1
 */