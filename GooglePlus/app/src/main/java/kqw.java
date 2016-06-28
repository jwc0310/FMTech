import android.content.Context;
import java.util.Locale;

public final class kqw
  implements gwv
{
  public final String a(Context paramContext, gwx paramgwx)
  {
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext) {}
  
  public final String toString()
  {
    if (null.b != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < null.b.length; i++)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(null.b[i]);
        localStringBuilder.append(String.format("%d, ", arrayOfObject2));
      }
      Locale localLocale1 = Locale.US;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = localStringBuilder.toString();
      arrayOfObject1[1] = null.b;
      return String.format(localLocale1, "SnapseedFilterDataEvent-filterInteractions filter_type=%d change_parameter=%s", arrayOfObject1);
    }
    Locale localLocale2 = Locale.US;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = null.a;
    return String.format(localLocale2, "SnapseedFilterDataEvent-filterInteractions filter_type=%d ", arrayOfObject3);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqw
 * JD-Core Version:    0.7.0.1
 */