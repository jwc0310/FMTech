import android.content.Context;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bor
  extends gzf
{
  private final int a;
  private final String b;
  private final byte[] c;
  
  public bor(Context paramContext, int paramInt, byte[] paramArrayOfByte)
  {
    super("UploadProfilePhotoTask");
    this.a = paramInt;
    this.b = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    this.c = paramArrayOfByte;
  }
  
  private static String a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramContext.getString(aau.mm);
    }
    return paramContext.getString(aau.ri);
  }
  
  protected final hae a(Context paramContext)
  {
    for (;;)
    {
      String str2;
      jrv localjrv;
      try
      {
        str2 = irc.a(new ByteArrayInputStream(this.c));
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(str2);
        localjrv = new jrv(paramContext, this.a, this.b, localArrayList);
        localjrv.i();
        if ((localjrv.n()) || (!localjrv.a.containsKey(str2)))
        {
          if (Log.isLoggable("UploadProfilePhoto", 3))
          {
            int k = localjrv.o;
            new StringBuilder(53).append("CheckPhotosExistenceOperation failed with ").append(k);
          }
          l = 0L;
          if (l == 0L) {
            break label310;
          }
          blw localblw = new blw(paramContext, this.a, this.b, String.valueOf(l));
          localblw.i();
          if (!localblw.n()) {
            break;
          }
          if (Log.isLoggable("UploadProfilePhoto", 3))
          {
            int i = localblw.o;
            new StringBuilder(42).append("SetProfilePhotoOperation error ").append(i);
          }
          return new hae(localblw.o, localblw.q, a(paramContext, true));
        }
      }
      catch (IOException localIOException)
      {
        if (Log.isLoggable("UploadProfilePhoto", 3))
        {
          String str1 = String.valueOf(localIOException);
          new StringBuilder(35 + String.valueOf(str1).length()).append("Generating fingerprint failed with ").append(str1);
        }
        return new hae(0, localIOException, a(paramContext, true));
      }
      long l = localjrv.b(str2);
    }
    return new hae(200, null, a(paramContext, false));
    label310:
    bmr localbmr = new bmr(paramContext, new kch().a(paramContext, this.a).a(), this.b, "profile", this.c);
    localbmr.i();
    if (localbmr.n())
    {
      if (Log.isLoggable("UploadProfilePhoto", 3))
      {
        int j = localbmr.o;
        new StringBuilder(38).append("UploadMediaOperation error ").append(j);
      }
      return new hae(localbmr.o, localbmr.q, a(paramContext, true));
    }
    return new hae(200, null, a(paramContext, false));
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(aau.tg);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bor
 * JD-Core Version:    0.7.0.1
 */