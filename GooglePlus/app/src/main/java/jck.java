import android.content.Context;
import android.util.SparseArray;

public final class jck
{
  private final Context a;
  private SparseArray<jci> b = new SparseArray();
  
  public jck(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final jci a(int paramInt)
  {
    try
    {
      jci localjci = (jci)this.b.get(paramInt);
      if (localjci == null)
      {
        localjci = new jci(this.a, paramInt);
        this.b.put(paramInt, localjci);
      }
      return localjci;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jck
 * JD-Core Version:    0.7.0.1
 */