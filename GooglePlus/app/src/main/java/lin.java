import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class lin
  implements gzi, liv, mbo, mfd
{
  public final bk a;
  private Context b;
  private git c;
  
  public lin(bk parambk, mek parammek)
  {
    this.a = parambk;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
    this.c = ((git)parammbb.a(git.class));
    ((gzj)parammbb.a(gzj.class)).a.add(this);
  }
  
  public final void a(String paramString, int paramInt)
  {
    a(paramString, null, Integer.valueOf(paramInt));
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa) {}
  
  public final void a(String paramString, Boolean paramBoolean, Integer paramInteger)
  {
    lih locallih = new lih(this.b, this.c.c(), paramString, paramBoolean, paramInteger);
    ((gzj)mbb.a(this.b, gzj.class)).c(locallih);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lin
 * JD-Core Version:    0.7.0.1
 */