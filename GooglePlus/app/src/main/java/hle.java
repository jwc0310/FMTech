import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import java.io.IOException;

public final class hle
  extends gzf
{
  private final int a;
  
  public hle(int paramInt)
  {
    super("GetCollexionHeaderDataTask");
    this.a = paramInt;
  }
  
  protected final hae a(Context paramContext)
  {
    hkb localhkb = new hkb(paramContext, new kch().a(paramContext, this.a).a());
    localhkb.i();
    hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
    qat localqat1;
    qat localqat2;
    label79:
    qat localqat3;
    label103:
    qat localqat4;
    if (!localhkb.n())
    {
      if (!localhkb.x) {
        break label209;
      }
      localqat1 = localhkb.w;
      if (localqat1 != null)
      {
        if (!localhkb.x) {
          break label215;
        }
        localqat2 = localhkb.w;
        if (((mta)localqat2).a != null)
        {
          if (!localhkb.x) {
            break label221;
          }
          localqat3 = localhkb.w;
          if (((mta)localqat3).a.a != null)
          {
            if (!localhkb.x) {
              break label227;
            }
            localqat4 = localhkb.w;
            label130:
            if (((mta)localqat4).a.a.length != 0) {
              if (!localhkb.x) {
                break label233;
              }
            }
          }
        }
      }
    }
    label209:
    label215:
    label221:
    label227:
    label233:
    for (qat localqat5 = localhkb.w;; localqat5 = null)
    {
      if (((mta)localqat5).a.b != null) {
        break label239;
      }
      hae localhae1 = new hae(0, null, null);
      localhhn.a(((hho)mbb.a(paramContext, hho.class)).f(), 2);
      return localhae1;
      localqat1 = null;
      break;
      localqat2 = null;
      break label79;
      localqat3 = null;
      break label103;
      localqat4 = null;
      break label130;
    }
    label239:
    hot localhot = (hot)mbb.a(paramContext, hot.class);
    int i = this.a;
    qat localqat6;
    nfn localnfn;
    if (localhkb.x)
    {
      localqat6 = localhkb.w;
      localnfn = ((mta)localqat6).a;
      if (localnfn != null) {
        break label407;
      }
    }
    for (;;)
    {
      try
      {
        localhot.a.a(i, "spaces_header_data");
        localhot.a.b(i).b("spaces_header_data_timestamp", 0L).d();
        hae localhae2 = new hae(localhkb.o, localhkb.q, null);
        localhhn.a(((hho)mbb.a(paramContext, hho.class)).f(), 3);
        paramContext.getContentResolver().notifyChange(((hho)mbb.a(paramContext, hho.class)).f(), null);
        return localhae2;
        localqat6 = null;
      }
      catch (IOException localIOException2)
      {
        Log.e("CollexionsSettingsStore", localIOException2.getMessage());
        continue;
      }
      try
      {
        label407:
        localhot.a.a(i, "spaces_header_data", qat.a(localnfn));
        localhot.a.b(i).b("spaces_header_data_timestamp", System.currentTimeMillis()).d();
      }
      catch (IOException localIOException1)
      {
        Log.e("CollexionsSettingsStore", localIOException1.getMessage());
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hle
 * JD-Core Version:    0.7.0.1
 */