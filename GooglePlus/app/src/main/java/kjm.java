import android.content.Context;
import java.util.Date;
import java.util.List;

public class kjm
{
  static String a(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    int i;
    do
    {
      return paramString;
      i = paramString.indexOf('\n');
    } while (i < 0);
    return paramString.substring(0, i);
  }
  
  public hae a(Context paramContext, oqq paramoqq, List<ipf> paramList, khx paramkhx)
  {
    myt localmyt = new myt();
    localmyt.a = paramoqq;
    int i = paramkhx.a;
    if (efj.z(paramContext, i)) {
      efj.b(paramContext, i, paramkhx.f);
    }
    int j;
    if ((paramkhx.o != null) && (paramkhx.o.d))
    {
      j = et.N;
      if (!((hyi)mbb.a(paramContext, hyi.class)).b(iym.a, i)) {
        break label201;
      }
    }
    label201:
    for (Object localObject = new kkg(paramContext, i, localmyt, new Date(), a(paramkhx.k), paramList);; localObject = new kkc(paramContext, i, localmyt, new Date(), a(paramkhx.k), paramList))
    {
      int k = et.r;
      int m = et.P;
      hae localhae = new kkn(paramContext, i, (iyq)localObject, j, k, m).a();
      if (!efj.z(paramContext, i)) {
        efj.a(paramContext, i, paramkhx.f);
      }
      return localhae;
      if (paramkhx.p == khz.i)
      {
        j = et.y;
        break;
      }
      j = et.z;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjm
 * JD-Core Version:    0.7.0.1
 */