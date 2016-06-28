import android.content.Context;
import java.io.IOException;

public final class kcy<RQ extends qat, RS extends qat>
  extends kcu<mhs, mht>
{
  private final mia a = new mia();
  private final int b;
  
  public kcy(Context paramContext, kcg paramkcg, qao<mia, RQ> paramqao, RQ paramRQ)
  {
    super(paramContext, paramkcg, "mutate", new mhs(), new mht(), "plusdatamixer", "oauth2:https://www.googleapis.com/auth/plus.native");
    this.a.a(paramqao, paramRQ);
    this.b = (paramqao.b >>> 3);
  }
  
  public final RS a(qao<mib, RS> paramqao)
  {
    if (this.x) {}
    for (qat localqat = this.w;; localqat = null) {
      return (qat)((mht)localqat).a.a.b(paramqao);
    }
  }
  
  public final void a(int paramInt, String paramString, IOException paramIOException)
  {
    qat localqat1;
    int i;
    if (this.x)
    {
      localqat1 = this.w;
      mht localmht = (mht)localqat1;
      if ((localmht == null) || (localmht.a.b == null)) {
        break label189;
      }
      i = 1;
      label39:
      if ((paramInt != 200) || (paramIOException != null) || (i == 0)) {
        break label201;
      }
      if (!this.x) {
        break label195;
      }
    }
    label189:
    label195:
    for (qat localqat2 = this.w;; localqat2 = null)
    {
      pko localpko = ((mht)localqat2).a.b;
      String str1 = String.valueOf(localpko.b);
      String str2 = String.valueOf(localpko.a);
      String str3 = String.valueOf(localpko.c);
      super.a(500, 4 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + "::" + str2 + ": " + str3, null);
      return;
      localqat1 = null;
      break;
      i = 0;
      break label39;
    }
    label201:
    super.a(paramInt, paramString, paramIOException);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcy
 * JD-Core Version:    0.7.0.1
 */