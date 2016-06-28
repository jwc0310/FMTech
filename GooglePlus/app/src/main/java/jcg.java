import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

public final class jcg
{
  private static final String a = jdr.a(jcg.class);
  
  public static void a(Context paramContext, int paramInt, mjd[] paramArrayOfmjd, jan paramjan)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfmjd != null) && (paramArrayOfmjd.length > 0)) {
      for (int j = 0; j < paramArrayOfmjd.length; j++)
      {
        mjd localmjd2 = paramArrayOfmjd[j];
        if ((localmjd2.i != null) || ("df".equals(localmjd2.b))) {
          localArrayList.add(localmjd2);
        }
      }
    }
    if (!localArrayList.isEmpty())
    {
      String str1 = a;
      int i = localArrayList.size();
      jdr.a(str1, 42 + "Reporting notifications, size: " + i);
      Iterator localIterator = localArrayList.iterator();
      if (localIterator.hasNext())
      {
        mjd localmjd1 = (mjd)localIterator.next();
        String str2 = a;
        String str3 = String.valueOf(localmjd1.a);
        if (str3.length() != 0) {}
        for (String str4 = "NotificationKey: ".concat(str3);; str4 = new String("NotificationKey: "))
        {
          jdr.a(str2, str4);
          break;
        }
      }
      gzj.a(paramContext, new jcf(paramContext, paramInt, localArrayList, paramjan));
    }
  }
  
  public static mjd[] a(mjd[] paramArrayOfmjd)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfmjd != null) && (paramArrayOfmjd.length > 0)) {
      for (int i = 0; i < paramArrayOfmjd.length; i++)
      {
        mjd localmjd = paramArrayOfmjd[i];
        if (!"df".equals(localmjd.b)) {
          localArrayList.add(localmjd);
        }
      }
    }
    return (mjd[])localArrayList.toArray(new mjd[localArrayList.size()]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcg
 * JD-Core Version:    0.7.0.1
 */