import android.content.Context;
import java.util.Locale;

public class kqx
  implements gwv
{
  public final String a(Context paramContext, gwx paramgwx)
  {
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext) {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Locale localLocale1 = Locale.US;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = null.b;
    arrayOfObject1[1] = null.c;
    localStringBuilder.append(String.format(localLocale1, "SnapseedStackDataEvent-stackInteractions total_elements=%d unselected_elements=%d\n", arrayOfObject1));
    if (null.a != null) {
      for (rnr localrnr : null.a)
      {
        Locale localLocale2 = Locale.US;
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = localrnr.a;
        arrayOfObject2[1] = localrnr.b;
        arrayOfObject2[2] = Integer.valueOf(localrnr.c);
        localStringBuilder.append(String.format(localLocale2, "\tSnapseedStackItemInteraction filter_Type=%d filter_position=%d filter_action=%d\n", arrayOfObject2));
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kqx
 * JD-Core Version:    0.7.0.1
 */