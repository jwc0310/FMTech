import android.content.Context;

public final class kkr
  extends kde<myt, myu>
{
  private final myt a;
  
  public kkr(Context paramContext, int paramInt, myt parammyt, kbo paramkbo)
  {
    super(paramContext, new kcg(paramContext, paramInt, null), a(parammyt), new myt(), new myu());
    this.a = parammyt;
  }
  
  private static String a(myt parammyt)
  {
    if ((parammyt.a != null) && (parammyt.a.q != null) && (parammyt.a.q.a != null))
    {
      int[] arrayOfInt = parammyt.a.q.a;
      int i = arrayOfInt.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfInt[j] == 408) {
          return "pollspostactivity";
        }
      }
    }
    return "postactivity";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkr
 * JD-Core Version:    0.7.0.1
 */