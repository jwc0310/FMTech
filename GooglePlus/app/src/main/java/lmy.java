import android.content.Context;
import android.util.Log;

public final class lmy
  implements hsu
{
  public final void a(Context paramContext, int paramInt, Object paramObject)
  {
    if ((paramObject instanceof qdt))
    {
      qdt localqdt = (qdt)paramObject;
      byte[] arrayOfByte2 = qat.a(localqdt);
      int j = lmp.a(paramContext, paramInt, localqdt.g, arrayOfByte2, false);
      if (Log.isLoggable("StreamDispatch", 3))
      {
        String str3 = String.valueOf(localqdt.g);
        new StringBuilder(64 + String.valueOf(str3).length()).append("Received PlusEventV2, eventId: ").append(str3).append(", activities updated: ").append(j);
      }
    }
    hec localhec;
    do
    {
      do
      {
        qdj localqdj;
        int i;
        do
        {
          return;
          if (!(paramObject instanceof qdj)) {
            break;
          }
          localqdj = (qdj)paramObject;
          byte[] arrayOfByte1 = qat.a(localqdj);
          i = lmp.a(paramContext, paramInt, localqdj.g, arrayOfByte1, true);
        } while (!Log.isLoggable("StreamDispatch", 3));
        String str2 = String.valueOf(localqdj.g);
        new StringBuilder(67 + String.valueOf(str2).length()).append("Received HoaPlusEventV2, eventId: ").append(str2).append(", activities updated: ").append(i);
        return;
      } while (!(paramObject instanceof hec));
      localhec = (hec)paramObject;
      lmp.a(paramContext, paramInt, localhec);
    } while (!Log.isLoggable("StreamDispatch", 3));
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
 * Qualified Name:     lmy
 * JD-Core Version:    0.7.0.1
 */