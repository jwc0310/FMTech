import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class jln
  extends gzf
{
  jln(jlm paramjlm, Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  protected final hae a()
  {
    jlm localjlm = this.a;
    ArrayList localArrayList;
    if (localjlm.a.c() != null)
    {
      localArrayList = new ArrayList();
      List localList = localjlm.a.c();
      int i = localList.size();
      for (int j = 0; j < i; j++)
      {
        jjg localjjg = (jjg)localList.get(j);
        if (localjlm.f.a(localjjg)) {
          localArrayList.add(localjjg);
        }
      }
      switch (localjlm.d)
      {
      default: 
        if ((localjlm.e != 2147483647) && (localjlm.e < localArrayList.size())) {
          break;
        }
      }
    }
    for (localjlm.g = localArrayList;; localjlm.g = localArrayList.subList(0, localjlm.e))
    {
      jlo localjlo = new jlo(this);
      efj.m().post(localjlo);
      return new hae(true);
      Collections.sort(localArrayList, jkt.a);
      break;
      Collections.sort(localArrayList, jkt.b);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jln
 * JD-Core Version:    0.7.0.1
 */