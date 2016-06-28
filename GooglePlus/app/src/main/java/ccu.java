import android.content.Context;

final class ccu
{
  int a;
  private String b = null;
  
  public ccu(Context paramContext, int paramInt)
  {
    this.a = paramInt;
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.b = paramContext.getString(aau.gW);
      return;
    }
    this.b = paramContext.getString(aau.gX);
  }
  
  public final String toString()
  {
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccu
 * JD-Core Version:    0.7.0.1
 */