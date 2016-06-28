import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;

public final class jbr
  implements jdu
{
  public final void a(Intent paramIntent, Context paramContext)
  {
    try
    {
      giz localgiz = (giz)mbb.a(paramContext, giz.class);
      izy localizy = (izy)mbb.a(paramContext, izy.class);
      boolean bool = paramIntent.getBooleanExtra("force_redraw", false);
      Iterator localIterator = localgiz.a(new String[] { "logged_in" }).iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        if ((i != -1) && (localgiz.c(i))) {
          localizy.a(i, bool);
        }
      }
    }
    finally
    {
      gk.a(paramIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbr
 * JD-Core Version:    0.7.0.1
 */