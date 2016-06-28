import android.content.Context;
import android.graphics.RectF;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class boq
  extends gzf
{
  private String a;
  private int b;
  private String c;
  private RectF d;
  
  public boq(int paramInt, String paramString1, String paramString2, RectF paramRectF)
  {
    super("UploadCoverPhotoTask");
    this.b = paramInt;
    this.c = paramString1;
    this.a = paramString2;
    this.d = paramRectF;
  }
  
  protected final hae a(Context paramContext)
  {
    String str = hco.a(paramContext).a(this.a, false);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(str);
    jrv localjrv = new jrv(paramContext, this.b, this.c, localArrayList);
    localjrv.i();
    if ((localjrv.n()) || (!localjrv.a.containsKey(str))) {
      if (Log.isLoggable("UploadCoverPhoto", 3))
      {
        int k = localjrv.o;
        new StringBuilder(47).append("CheckPhotosExistenceOperation error ").append(k);
      }
    }
    kcg localkcg;
    for (long l = 0L;; l = localjrv.b(str))
    {
      localkcg = new kch().a(paramContext, this.b).a();
      if (l != 0L) {
        break label277;
      }
      bmr localbmr = new bmr(paramContext, new kch().a(paramContext, this.b).a(), this.c, "scrapbook", this.a, this.d);
      localbmr.i();
      if (!localbmr.n()) {
        break;
      }
      if (Log.isLoggable("UploadCoverPhoto", 3))
      {
        int i = localbmr.o;
        new StringBuilder(38).append("UploadMediaOperation error ").append(i);
      }
      return new hae(localbmr.o, localbmr.q, paramContext.getString(aau.uV));
    }
    return new hae(true);
    label277:
    blx localblx = new blx(paramContext, localkcg, this.c, String.valueOf(l), this.d, 0, false);
    localblx.i();
    if (localblx.n())
    {
      if (Log.isLoggable("UploadCoverPhoto", 3))
      {
        int j = localblx.o;
        new StringBuilder(44).append("SetScrapbookPhotoOperation error ").append(j);
      }
      return new hae(localblx.o, localblx.q, paramContext.getString(aau.uV));
    }
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(aau.te);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boq
 * JD-Core Version:    0.7.0.1
 */