import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gyg
  implements kbz
{
  public final kbw a(Context paramContext, kbw paramkbw)
  {
    if (!(paramkbw instanceof kcv)) {
      if ((paramkbw.a_("oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native")) && (!(paramkbw instanceof gyj))) {}
    }
    label233:
    label239:
    for (;;)
    {
      return paramkbw;
      kcv localkcv2 = kdg.b(paramContext, paramkbw.k);
      localkcv2.a(paramkbw);
      Object localObject = localkcv2;
      kcg localkcg = paramkbw.k;
      String str = localkcg.a;
      int j = ((giz)mbb.a(paramContext, giz.class)).a(str);
      List localList;
      if (j != -1)
      {
        localList = gyh.a(paramContext, j, 1500);
        if ((localList != null) && (!localList.isEmpty())) {
          if (Log.isLoggable("LogAppender", 3))
          {
            int k = localList.size();
            new StringBuilder(39).append("ClientOzEvents piggybacked: ").append(k);
          }
        }
      }
      for (gyj localgyj = new gyj(paramContext, localkcg, localList);; localgyj = null)
      {
        if (localgyj == null) {
          break label239;
        }
        ((kcv)localObject).a(localgyj);
        return localObject;
        kcv localkcv1 = (kcv)paramkbw;
        Iterator localIterator = localkcv1.e.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((kbw)localIterator.next() instanceof gyj));
        for (int i = 1;; i = 0)
        {
          if (i != 0) {
            break label233;
          }
          localObject = localkcv1;
          break;
        }
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyg
 * JD-Core Version:    0.7.0.1
 */