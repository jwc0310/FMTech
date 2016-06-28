import android.content.Context;
import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class deu
{
  private static SimpleDateFormat b;
  private static String c;
  public final Calendar a = Calendar.getInstance();
  private String d;
  
  public deu(Context paramContext, Calendar paramCalendar)
  {
    this.a.set(paramCalendar.get(1), paramCalendar.get(2), 1);
    if (b == null)
    {
      b = new SimpleDateFormat(paramContext.getResources().getString(aau.mU));
      c = paramContext.getResources().getString(aau.ve);
    }
  }
  
  public final boolean a(Calendar paramCalendar)
  {
    return (this.a.get(1) == paramCalendar.get(1)) && (this.a.get(2) == paramCalendar.get(2));
  }
  
  public final String toString()
  {
    if (this.a.getTimeInMillis() > 0L)
    {
      if (this.d == null) {
        this.d = b.format(this.a.getTime());
      }
      return this.d;
    }
    return c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     deu
 * JD-Core Version:    0.7.0.1
 */