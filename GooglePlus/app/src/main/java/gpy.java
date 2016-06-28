import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class gpy
  implements mbo, mck, mfd
{
  private final gqa a;
  private gpx b;
  
  public gpy(mek parammek, gqa paramgqa)
  {
    this.a = paramgqa;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((gpx)parammbb.b(gpx.class));
    ((mci)parammbb.a(mci.class)).a.add(this);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b != null)
    {
      if (paramBoolean)
      {
        gpx localgpx2 = this.b;
        gqa localgqa2 = this.a;
        localgpx2.a.add(localgqa2);
      }
    }
    else {
      return;
    }
    gpx localgpx1 = this.b;
    gqa localgqa1 = this.a;
    localgpx1.a.remove(localgqa1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gpy
 * JD-Core Version:    0.7.0.1
 */