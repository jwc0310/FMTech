import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.settings.PhotosSettingsActivity;
import java.util.List;

public final class dpn
  extends kdn
  implements kfp
{
  private final kfo aa = new kfo(this, this.c);
  private git ab;
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b.a(kfs.class, this.aa);
    this.ab = ((git)this.b.a(git.class));
  }
  
  public final void v()
  {
    if ((!((hba)mbb.a(this.a, hba.class)).a().isEmpty()) && (!hbj.b(this.a)))
    {
      kfo localkfo3 = this.aa;
      dpr localdpr2 = new dpr(1);
      localkfo3.a.a(localdpr2, null);
    }
    kfo localkfo1 = this.aa;
    ior localior = new ior();
    mbf localmbf = this.a;
    int i = this.ab.c();
    Intent localIntent = new Intent(localmbf, PhotosSettingsActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.putExtra("account_id", i);
    localior.a = localIntent;
    localior.b = true;
    bk localbk = localior.a();
    localkfo1.a.a(localbk, null);
    if ((dun.b()) && (!"TRUE".equalsIgnoreCase(dun.d.a())))
    {
      kfo localkfo2 = this.aa;
      dpr localdpr1 = new dpr(3);
      localkfo2.a.a(localdpr1, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpn
 * JD-Core Version:    0.7.0.1
 */