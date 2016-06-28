import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;

public final class jvb
{
  private final juz a;
  private final String b;
  private final jud c;
  
  jvb(Context paramContext, int paramInt, juz paramjuz, jud paramjud)
  {
    this.a = paramjuz;
    this.c = paramjud;
    this.b = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
  }
  
  public final qbe a(Context paramContext, boolean paramBoolean)
  {
    if ((!paramBoolean) && ((!this.a.d()) || (!this.a.d(0)))) {
      return null;
    }
    ipf[] arrayOfipf = new ipf[this.a.c()];
    for (int i = 0; i < this.a.c(); i++) {
      arrayOfipf[i] = this.a.a(i).a();
    }
    this.c.a(paramContext, arrayOfipf);
    qdz localqdz = new qdz();
    boolean bool = this.a.l();
    ArrayList localArrayList = this.a.i();
    int j = 0;
    for (int k = 0; k < localArrayList.size(); k++) {
      if ((paramBoolean) || (((jux)localArrayList.get(k)).a(bool))) {
        j++;
      }
    }
    qbe[] arrayOfqbe = new qbe[j];
    int m = 0;
    int n = 0;
    ipf localipf;
    qbe localqbe2;
    int i2;
    if (m < localArrayList.size())
    {
      jux localjux = (jux)localArrayList.get(m);
      if ((!paramBoolean) && (!localjux.a(bool))) {
        break label622;
      }
      qdy localqdy = new qdy();
      localqdy.b = localjux.a;
      localipf = localjux.a();
      if (localipf == null)
      {
        localqbe2 = null;
        localqdy.e = localqbe2;
        qbe localqbe3 = new qbe();
        localqbe3.a = new int[] { 409 };
        localqbe3.a(qdy.a, localqdy);
        i2 = n + 1;
        arrayOfqbe[n] = localqbe3;
      }
    }
    for (;;)
    {
      m++;
      n = i2;
      break;
      qdw localqdw = new qdw();
      int i1;
      if (ipm.b.equals(localipf.e))
      {
        i1 = 2;
        label332:
        localqdw.j = i1;
        if (localipf.d == null) {
          break label453;
        }
      }
      jub localjub;
      label453:
      for (localqdw.f = localipf.d.toString();; localqdw.f = localipf.c)
      {
        localqdw.g = this.b;
        if ((paramBoolean) || (localipf.b.a != 0L)) {
          break label523;
        }
        localjub = this.c.b(localipf);
        if (localjub != null) {
          break label466;
        }
        localqbe2 = null;
        break;
        if ((!ipm.c.equals(localipf.e)) && (ipm.d.equals(localipf.e)))
        {
          i1 = ipm.d.e;
          break label332;
        }
        i1 = 1;
        break label332;
      }
      label466:
      localqdw.b = localjub.b;
      for (localqdw.i = localjub.a;; localqdw.i = Long.toString(localipf.b.a))
      {
        localqbe2 = new qbe();
        localqbe2.a = new int[] { 344 };
        localqbe2.a(qdw.a, localqdw);
        break;
        label523:
        localqdw.b = localipf.c;
      }
      localqdz.e = arrayOfqbe;
      if (paramBoolean) {}
      for (localqdz.b = this.a.g();; localqdz.b = "")
      {
        qbe localqbe1 = new qbe();
        localqbe1.a = new int[] { 408 };
        localqbe1.a(qdz.a, localqdz);
        return localqbe1;
      }
      label622:
      i2 = n;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvb
 * JD-Core Version:    0.7.0.1
 */