import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class hdu
  implements mbo, mck, mfd
{
  private final hdt a;
  private hdr b;
  
  public hdu(mek parammek, hdt paramhdt)
  {
    this.a = paramhdt;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((hdr)parammbb.b(hdr.class));
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
    hdr localhdr = this.b;
    hdt localhdt = this.a;
    localhdr.a.remove(localhdt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdu
 * JD-Core Version:    0.7.0.1
 */