import android.content.Context;
import android.os.Bundle;
import java.util.Set;

public final class ash
  implements mbo, mfb, mfc, mfd
{
  private final bk a;
  private final int b;
  private asi c;
  
  public ash(bk parambk, mek parammek, int paramInt)
  {
    this.a = parambk;
    this.b = paramInt;
    parammek.a(this);
  }
  
  public final void a()
  {
    asi localasi = this.c;
    cv localcv = this.a.k();
    int i = this.b;
    localasi.a.add(new asj(localcv, i));
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((asi)parammbb.a(asi.class));
  }
  
  public final void aK_()
  {
    asi localasi = this.c;
    cv localcv = this.a.k();
    int i = this.b;
    localasi.a.remove(new asj(localcv, i));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ash
 * JD-Core Version:    0.7.0.1
 */