import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class lzx
  implements mbo, mck, mfd
{
  private final lzv a;
  private lzw b;
  
  public lzx(mek parammek, lzv paramlzv)
  {
    this.a = paramlzv;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((lzw)parammbb.b(lzw.class));
    ((mci)parammbb.a(mci.class)).a.add(this);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b != null)
    {
      if (paramBoolean) {
        this.b.a(this.a);
      }
    }
    else {
      return;
    }
    lzw locallzw = this.b;
    lzv locallzv = this.a;
    locallzw.b.remove(locallzv);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzx
 * JD-Core Version:    0.7.0.1
 */