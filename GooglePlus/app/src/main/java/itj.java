import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;

final class itj
  extends iuf
{
  String a;
  private final Context j;
  private final String k;
  private final iuo l;
  private final iur m;
  private final String n;
  private final String o;
  private HttpUrlRequest p;
  private iun q;
  
  public itj(Context paramContext, kcb paramkcb, String paramString1, iuo paramiuo, iur paramiur, String paramString2, String paramString3, iun paramiun)
  {
    super(paramkcb);
    this.j = paramContext;
    this.k = paramString1;
    this.m = paramiur;
    this.l = paramiuo;
    this.n = paramString2;
    this.o = paramString3;
    this.q = paramiun;
  }
  
  public final void a()
  {
    HashMap localHashMap = new HashMap(this.c.a(this.k));
    localHashMap.put("X-Upload-Content-Type", this.m.a);
    long l1 = this.m.k;
    if (l1 >= 0L) {
      localHashMap.put("X-Upload-Content-Length", Long.toString(l1));
    }
    String str1 = String.valueOf(Base64.encodeToString(this.m.n.a, 2));
    String str2;
    ncr localncr;
    Context localContext2;
    iur localiur;
    nqu localnqu;
    int i;
    label273:
    boolean bool;
    label299:
    label309:
    label470:
    Context localContext3;
    String str8;
    if (str1.length() != 0)
    {
      str2 = "sha1=".concat(str1);
      localHashMap.put("X-Goog-Hash", str2);
      Context localContext1 = this.j;
      String str3 = this.k;
      HttpUrlRequestListener localHttpUrlRequestListener = this.i;
      this.p = ixd.a(localContext1).a(str3, 3, localHashMap, localHttpUrlRequestListener);
      localncr = new ncr();
      ((itk)mbb.a(this.j, itk.class));
      localContext2 = this.j;
      String str4 = this.o;
      iuo localiuo = this.l;
      localiur = this.m;
      iun localiun = this.q;
      localnqu = new nqu();
      String str5 = localiur.c.a();
      localnqu.a = str4;
      localnqu.b = localiuo.e;
      localnqu.c = localiuo.f;
      localnqu.i = localiuo.h;
      localnqu.p = str5;
      if (localiun == iun.d) {
        break label724;
      }
      i = 1;
      if (i == 0) {
        break label736;
      }
      localnqu.w = itk.a(localiun);
      if (localiun != iun.a) {
        break label730;
      }
      bool = true;
      localnqu.f = Boolean.valueOf(bool);
      String str6 = localiuo.g;
      if (TextUtils.isEmpty(str6)) {
        str6 = irc.a(str5);
      }
      localnqu.h = str6;
      localnqu.r = new String[] { str6 };
      String str7 = localiur.d;
      if (!TextUtils.isEmpty(str7)) {
        localnqu.s = str7;
      }
      localnqu.q = new nrw();
      localnqu.q.a = Integer.valueOf(localiuo.k);
      localnqu.k = Long.valueOf(localiur.h / 1000L);
      if (localiur.e == null) {
        break label752;
      }
      localnqu.n = new npy();
      localnqu.n.a = new nrs();
      localnqu.n.a.a = localiur.e;
      if (localiur.f != null)
      {
        localnqu.o = new nqh();
        localnqu.o.a = localiur.f;
      }
      localnqu.g = localiur.i;
      nrz localnrz = localiur.g;
      if (localnrz != null)
      {
        localnqu.v = localnrz;
        localnqu.p = null;
        localnqu.r = null;
        localnqu.w = itk.a(iun.c);
        localnqu.t = 3;
        localnqu.f = null;
        localnqu.h = null;
        localnqu.l = null;
        localnqu.g = null;
        localnqu.o = null;
        localnqu.m = null;
        localnqu.k = null;
        localnqu.q = null;
        localnqu.u = new pst();
      }
      localncr.a = localnqu;
      localContext3 = this.j;
      str8 = this.n;
      if (!this.l.l) {
        break label829;
      }
    }
    label829:
    for (int i1 = 50;; i1 = 100)
    {
      kdg.a(localContext3, localncr, str8, false, i1);
      byte[] arrayOfByte = qat.a(localncr);
      this.p.a("application/x-protobuf", arrayOfByte);
      if (Log.isLoggable("MediaUploader", 2)) {
        efj.a(2, "MediaUploader", localncr.toString());
      }
      return;
      str2 = new String("sha1=");
      break;
      label724:
      i = 0;
      break label273;
      label730:
      bool = false;
      break label299;
      label736:
      localnqu.f = Boolean.valueOf(localiur.j);
      break label309;
      label752:
      if (!efj.f(localContext2, localiur.l)) {
        break label470;
      }
      localnqu.n = new npy();
      localnqu.n.a = new nrs();
      localnqu.n.a.a = new ply();
      localnqu.n.a.a.a = 8;
      break label470;
    }
  }
  
  protected final void a(HttpUrlRequest paramHttpUrlRequest)
  {
    List localList = new iti(paramHttpUrlRequest.k()).a("Location");
    if ((localList == null) || (localList.size() != 1)) {
      return;
    }
    this.a = ((String)localList.get(0));
  }
  
  protected final HttpUrlRequest b()
  {
    return this.p;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     itj
 * JD-Core Version:    0.7.0.1
 */