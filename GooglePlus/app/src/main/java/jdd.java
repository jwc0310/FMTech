import android.content.Context;
import android.util.SparseArray;

public final class jdd
{
  private static jdd a;
  private SparseArray<jdc> b = new SparseArray();
  private Context c;
  
  private jdd(Context paramContext)
  {
    this.c = paramContext;
    mbb.a(paramContext, giz.class);
  }
  
  public static jdd a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new jdd(paramContext);
      }
      jdd localjdd = a;
      return localjdd;
    }
    finally {}
  }
  
  public final jdc a(int paramInt)
  {
    jdc localjdc;
    if (paramInt == -1) {
      localjdc = null;
    }
    for (;;)
    {
      return localjdc;
      try
      {
        localjdc = (jdc)this.b.get(paramInt);
        if (localjdc != null) {
          continue;
        }
        localjdc = new jdc(this.c, paramInt);
        this.b.put(paramInt, localjdc);
      }
      finally {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jdd
 * JD-Core Version:    0.7.0.1
 */