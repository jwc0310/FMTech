import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

final class jvd
  extends gzf
{
  static final String a = jvd.class.getName();
  private final int b;
  private final String c;
  private final String d;
  
  public jvd(int paramInt, String paramString1, String paramString2)
  {
    super(a);
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  protected final hae a(Context paramContext)
  {
    jvc localjvc = new jvc(paramContext, this.b, this.c, this.d);
    ((kbu)mbb.a(paramContext, kbu.class)).a(localjvc);
    hae localhae = new hae(localjvc.o, localjvc.q, null);
    if (localjvc.x) {}
    myo localmyo;
    for (qat localqat = localjvc.w;; localqat = null)
    {
      localmyo = (myo)localqat;
      if ((localmyo != null) && (!localjvc.n())) {
        break;
      }
      return localhae;
    }
    nur localnur = localmyo.a;
    if ((localnur == null) || (localnur.a == null) || (localnur.a.a == null) || (localnur.a.a.length < 2) || (localnur.b == null) || (localnur.b.length == 0)) {
      return localhae;
    }
    Long localLong = Long.valueOf(efj.a(localnur.a.b));
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(localnur.a.a.length);
    int i = localnur.a.a.length;
    int j = 0;
    if (j < i)
    {
      nue localnue = localnur.a.a[j];
      long l1;
      label245:
      long l2;
      if (localnue.c != null)
      {
        l1 = localnue.c.a.longValue();
        l2 = efj.a(Long.valueOf(l1));
        if (localLong.longValue() != 0L) {
          break label316;
        }
      }
      label316:
      for (float f = 0.0F;; f = (float)l2 / (float)localLong.longValue())
      {
        jvp localjvp = new jvp(localnue.b.a, f, l2);
        localLinkedHashMap.put(localnue.a, localjvp);
        j++;
        break;
        l1 = 0L;
        break label245;
      }
    }
    int k = localnur.b.length;
    int m = 0;
    int n = 0;
    while (m < k)
    {
      nus localnus = localnur.b[m];
      if ((localnus.b != null) && (localnus.b.length != 0))
      {
        int i1 = localnus.b.length;
        ArrayList localArrayList = new ArrayList();
        for (int i2 = 0; i2 < i1; i2++)
        {
          ood localood = localnus.b[i2];
          localArrayList.add(new jws(localood.b, localood.a, localood.c));
        }
        int i3 = n + localArrayList.size();
        ((jvp)localLinkedHashMap.get(localnus.a)).d = localArrayList;
        n = i3;
      }
      m++;
    }
    Bundle localBundle = localhae.a();
    localBundle.putParcelableArrayList("poll_option_voter_models", new ArrayList(localLinkedHashMap.values()));
    localBundle.putInt("poll_option_voters_count", n);
    return localhae;
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(eyg.aI);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvd
 * JD-Core Version:    0.7.0.1
 */