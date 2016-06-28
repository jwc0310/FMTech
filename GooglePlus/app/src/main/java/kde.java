import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;

public class kde<RQ extends qat, RS extends qat>
  extends kcu<RQ, RS>
{
  private static final mcq a = new mcq("plusiproto.crash");
  private final qok b;
  
  public kde(Context paramContext, kcg paramkcg, String paramString, RQ paramRQ, RS paramRS) {}
  
  private kde(Context paramContext, kcg paramkcg, String paramString, RQ paramRQ, RS paramRS, qok paramqok)
  {
    super(paramContext, paramkcg, paramString, paramRQ, paramRS, "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    this.b = paramqok;
  }
  
  protected final RS a(ByteBuffer paramByteBuffer)
  {
    qat localqat = super.a(paramByteBuffer);
    kdg.a(this.j, localqat);
    long l = kdg.a(localqat);
    a(u(), l);
    return localqat;
  }
  
  protected final boolean a(Exception paramException)
  {
    if (kdd.a(paramException, "INVALID_CREDENTIALS")) {
      return true;
    }
    return super.a(paramException);
  }
  
  public void b(ByteBuffer paramByteBuffer, String paramString)
  {
    Exception localException1 = this.q;
    if ((localException1 != null) && (!(localException1 instanceof kbt)))
    {
      c(paramByteBuffer, null);
      if ((localException1 instanceof IOException)) {
        throw ((IOException)localException1);
      }
      q();
    }
    if ((paramString == null) || ("application/x-protobuf".equals(paramString)))
    {
      try
      {
        localkdb = new kdb(efj.a(paramByteBuffer));
        if (TextUtils.isEmpty(localkdb.a())) {
          break label345;
        }
        localkdd1 = new kdd(localkdb, this.k.a);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          kdb localkdb;
          int i;
          label297:
          kdd localkdd1 = null;
        }
      }
      try
      {
        if (kdd.a(localkdd1, "APP_UPGRADE_REQUIRED"))
        {
          kbp localkbp = (kbp)mbb.b(this.j, kbp.class);
          if (localkbp != null) {
            localkbp.a();
          }
        }
        if (!kdd.a(localkdd1, "OUT_OF_BOX_REQUIRED"))
        {
          i = 1;
          if (i != 0)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Apiary error response: ").append(k()).append('\n');
            localStringBuilder.append("   domain: ").append(localkdb.b()).append('\n');
            localStringBuilder.append("   reason: ").append(localkdb.a()).append('\n');
            localStringBuilder.append("   message: ").append(localkdb.c()).append('\n');
            String str1 = localkdb.d();
            if (str1 != null)
            {
              String str2 = str1.replace("\\n", "\n").replace("\\t", "\t");
              localStringBuilder.append("   debugInfo: \n");
              localStringBuilder.append(str2);
            }
            efj.a(6, "HttpOperation", localStringBuilder.toString());
          }
        }
      }
      catch (Exception localException3)
      {
        break label297;
      }
    }
    label345:
    for (kdd localkdd2 = localkdd1;; localkdd2 = null)
    {
      if (localkdd2 != null)
      {
        c(paramByteBuffer, localkdd2.toString());
        throw localkdd2;
        i = 0;
        break;
      }
      c(paramByteBuffer, null);
      return;
    }
  }
  
  protected final void c(RQ paramRQ)
  {
    boolean bool;
    Context localContext;
    String str;
    if (this.k.d != null)
    {
      bool = true;
      localContext = this.j;
      str = this.k.b;
      if (!this.k.e) {
        break label60;
      }
    }
    label60:
    for (int i = 50;; i = 100)
    {
      kdg.a(localContext, paramRQ, str, bool, i, this.b);
      return;
      bool = false;
      break;
    }
  }
  
  public final boolean c(Exception paramException)
  {
    return !kdd.a(paramException, "OUT_OF_BOX_REQUIRED");
  }
  
  public final String u()
  {
    String str1 = super.u();
    if (this.k.e)
    {
      String str2 = (String)kdc.a.get(str1);
      if (str2 == null)
      {
        if (Log.isLoggable("BackgroundEndpoints", 3)) {
          new StringBuilder(57 + String.valueOf(str1).length()).append("Calling operation [").append(str1).append("] from sync loop with no sync endpoint");
        }
        str2 = str1;
      }
      return str2;
    }
    return str1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kde
 * JD-Core Version:    0.7.0.1
 */