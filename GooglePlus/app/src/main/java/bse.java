import android.content.Context;

final class bse
  implements bsb
{
  private final Context a;
  private final int b;
  private final bsn c;
  private final int d;
  private final String e;
  
  public bse(Context paramContext, int paramInt, bsn parambsn, String paramString)
  {
    this.a = paramContext;
    this.b = paramInt;
    this.c = parambsn;
    this.e = paramString;
    switch (bsa.a[parambsn.ordinal()])
    {
    case 3: 
    case 4: 
    default: 
      this.d = 0;
      return;
    case 2: 
      this.d = 2;
      return;
    case 5: 
      this.d = 1;
      return;
    }
    this.d = 3;
  }
  
  public final bsc a(String paramString)
  {
    bjr localbjr = new bjr(this.a, this.b, paramString, this.e, this.d, this.c.g);
    localbjr.i();
    localbjr.d("EsTileSync");
    return new bsc(localbjr);
  }
  
  public final String toString()
  {
    String str1 = String.valueOf("DeltaAllPhotosPageFetcher, requestReason: ");
    int i = this.d;
    String str2 = this.e;
    return 24 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + i + ", syncToken: " + str2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bse
 * JD-Core Version:    0.7.0.1
 */