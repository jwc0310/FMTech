import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class hzm
  implements kbz
{
  private static hzn a = new hzn();
  
  public final kbw a(Context paramContext, kbw paramkbw)
  {
    int i = 0;
    String str = paramkbw.k.a;
    if (!((hyi)mbb.a(paramContext, hyi.class)).b(hyl.a, str)) {}
    for (;;)
    {
      return paramkbw;
      Object localObject1;
      if (!(paramkbw instanceof kcv))
      {
        if ((!paramkbw.a_("oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native")) || ((paramkbw instanceof hzp))) {
          continue;
        }
        kcv localkcv2 = kdg.b(paramContext, paramkbw.k);
        localkcv2.a(paramkbw);
        localObject1 = localkcv2;
      }
      try
      {
        label78:
        if (a.a(paramContext, str))
        {
          kcg localkcg1 = paramkbw.k;
          if (localkcg1.e) {}
          hzn localhzn;
          ArrayList localArrayList;
          kch localkch;
          for (kcg localkcg2 = localkcg1;; localkcg2 = localkch.a())
          {
            localhzn = a;
            List localList = ((hyi)mbb.a(paramContext, hyi.class)).a();
            int k = localList.size();
            localArrayList = new ArrayList(k);
            while (i < k)
            {
              localArrayList.add(((hyf)localList.get(i)).d);
              i++;
            }
            kcv localkcv1 = (kcv)paramkbw;
            Iterator localIterator = localkcv1.e.iterator();
            do
            {
              if (!localIterator.hasNext()) {
                break;
              }
            } while (!((kbw)localIterator.next() instanceof hzo));
            for (int j = 1; j == 0; j = 0)
            {
              localObject1 = localkcv1;
              break label78;
            }
            localkch = new kch();
            localkch.a = localkcg1.a;
            localkch.b = localkcg1.b;
            localkch.c = localkcg1.c;
            localkch.e = localkcg1.e;
            localkch.f = localkcg1.f;
            localkch.d = localkcg1.d;
            localkch.e = true;
          }
          ((kcv)localObject1).a(new hzo(paramContext, localkcg2, localArrayList, localhzn));
          a.a(str);
          return localObject1;
        }
        return paramkbw;
      }
      finally {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzm
 * JD-Core Version:    0.7.0.1
 */