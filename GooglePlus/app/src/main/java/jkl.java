import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

final class jkl
  extends gzf
{
  jkl(jkk paramjkk, Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  protected final hae a()
  {
    jkk localjkk = this.a;
    localjkk.e = new ArrayList();
    List localList = localjkk.a.a();
    for (int i = 0; (localList != null) && (i < localList.size()); i++)
    {
      jgw localjgw = (jgw)localList.get(i);
      if (localjkk.b.a(localjgw)) {
        localjkk.e.add(localjgw);
      }
    }
    jkm localjkm = new jkm(this);
    efj.m().post(localjkm);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkl
 * JD-Core Version:    0.7.0.1
 */