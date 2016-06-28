import android.content.Context;
import android.util.Log;

public class bsq
  implements hsu
{
  public final void a(Context paramContext, int paramInt, Object paramObject)
  {
    if ((paramObject instanceof hdy))
    {
      hdy localhdy = (hdy)paramObject;
      hxj localhxj2 = new hxj(localhdy.b);
      opo localopo2 = localhdy.a;
      bqo.a(paramContext, localhxj2, paramInt);
      bqo.a(paramContext, paramInt, localhxj2, localopo2);
      if (Log.isLoggable("EventsDispatch", 3))
      {
        String str3 = String.valueOf(localhxj2.a());
        if (str3.length() == 0) {
          break label86;
        }
        "Received EventEmbed, eventId: ".concat(str3);
      }
    }
    label86:
    hec localhec;
    do
    {
      do
      {
        hxj localhxj1;
        do
        {
          return;
          new String("Received EventEmbed, eventId: ");
          return;
          if (!(paramObject instanceof hdz)) {
            break;
          }
          hdz localhdz = (hdz)paramObject;
          localhxj1 = new hxj(localhdz.b);
          opo localopo1 = localhdz.a;
          bqo.a(paramContext, localhxj1, paramInt);
          bqo.a(paramContext, paramInt, localhxj1, localopo1);
        } while (!Log.isLoggable("EventsDispatch", 3));
        String str2 = String.valueOf(localhxj1.a());
        if (str2.length() != 0)
        {
          "Received HoaEventEmbed, eventId: ".concat(str2);
          return;
        }
        new String("Received HoaEventEmbed, eventId: ");
        return;
      } while (!(paramObject instanceof hec));
      localhec = (hec)paramObject;
      bqo.a(paramContext, hsb.a(paramContext, paramInt), localhec.a, localhec.b, localhec.c, localhec.d);
    } while (!Log.isLoggable("EventsDispatch", 3));
    String str1 = String.valueOf(localhec.a);
    if (str1.length() != 0)
    {
      "Received PlusOne, activityId: ".concat(str1);
      return;
    }
    new String("Received PlusOne, activityId: ");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bsq
 * JD-Core Version:    0.7.0.1
 */