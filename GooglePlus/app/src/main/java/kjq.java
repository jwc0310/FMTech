import android.content.Context;
import android.util.Log;

public final class kjq
  implements klc
{
  public final hae a(Context paramContext, int paramInt, khx paramkhx, oqq paramoqq)
  {
    myt localmyt = new myt();
    localmyt.a = paramoqq;
    kla localkla = new kla(paramContext, paramInt, localmyt);
    localkla.i();
    kiy localkiy;
    int i;
    Exception localException1;
    if (!localkla.n())
    {
      if (!efj.z(paramContext, paramInt)) {
        break label189;
      }
      localkiy = new kiy(paramContext, new kcg(paramContext, paramInt));
      localkiy.a();
      if (!localkiy.a.n()) {
        efj.b(paramContext, paramInt, localkiy.b().b);
      }
    }
    else
    {
      i = localkla.o;
      localException1 = localkla.q;
      if (!localkla.n()) {
        break label303;
      }
    }
    label301:
    label303:
    for (int j = et.r;; j = et.z)
    {
      return new hae(i, localException1, paramContext.getApplicationContext().getString(j));
      Exception localException2 = localkiy.a.q;
      if (Log.isLoggable("ImmediateReshareJob", 6)) {
        Log.e("ImmediateReshareJob", "Error querying audience history", localException2);
      }
      efj.b(paramContext, paramInt, paramkhx.f);
      break;
      label189:
      efj.a(paramContext, paramInt, paramkhx.f);
      if (localkla.x) {}
      for (qat localqat1 = localkla.w;; localqat1 = null)
      {
        if (localqat1 == null) {
          break label301;
        }
        boolean bool = localkla.x;
        qat localqat2 = null;
        if (bool) {
          localqat2 = localkla.w;
        }
        olr localolr = ((myu)localqat2).a;
        kmf localkmf = (kmf)mbb.a(paramContext, kmf.class);
        if ((localolr.b == null) || (localolr.b.a == null)) {
          break;
        }
        localkmf.a(paramInt, localolr.b.a);
        break;
      }
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjq
 * JD-Core Version:    0.7.0.1
 */