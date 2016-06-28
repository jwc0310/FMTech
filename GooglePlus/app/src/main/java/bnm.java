import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bnm
  extends gzf
{
  public final kqa a;
  public final List<jpx> b;
  private final int c;
  
  public bnm(Context paramContext, String paramString)
  {
    super(paramContext, "LogShareTask");
    git localgit = (git)mbb.a(paramContext, git.class);
    this.c = localgit.c();
    if (localgit.e()) {}
    for (this.a = new kqa(paramString, localgit.f().b("account_name"));; this.a = new kqa(paramString, null))
    {
      this.b = new ArrayList();
      return;
    }
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    hco localhco = hco.a(this.e);
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      jpx localjpx = (jpx)localIterator.next();
      ipf localipf = localjpx.e();
      if (localjpx.g() != null)
      {
        kqa localkqa3 = this.a;
        String str3 = localjpx.g();
        localkqa3.b.add(new kqc(kqd.a, str3));
      }
      else
      {
        if (localipf.d != null) {}
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label181;
          }
          String str2 = localhco.a(localipf.d.toString(), false);
          if (TextUtils.isEmpty(str2)) {
            break;
          }
          this.a.b.add(new kqc(kqd.b, str2));
          break;
        }
        label181:
        int j;
        label192:
        List localList;
        if (localipf.a != null)
        {
          j = 1;
          if (j == 0) {
            break label308;
          }
          String str1 = localipf.a;
          if (this.c == -1) {
            break label310;
          }
          efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
          localList = jrf.b(this.e, this.c, str1);
          if (localList.size() <= 0) {
            break label310;
          }
        }
        label308:
        label310:
        for (Long localLong = (Long)localList.get(0);; localLong = null)
        {
          if (localLong == null) {
            break label316;
          }
          kqa localkqa2 = this.a;
          long l = localLong.longValue();
          localkqa2.b.add(new kqc(kqd.a, l));
          break;
          j = 0;
          break label192;
          break;
        }
        label316:
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localipf.a;
        String.format("MediaItem has a tileId, but we could not find the photoId.  MediaItem TileId: %s", arrayOfObject);
      }
    }
    kqa localkqa1 = this.a;
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    ((gww)mbb.a(localContext, gww.class)).a(localContext, localkqa1);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bnm
 * JD-Core Version:    0.7.0.1
 */