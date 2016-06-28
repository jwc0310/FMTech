import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;

public final class jmu
  implements mez, mfd
{
  private lut a;
  private mca b;
  
  public jmu(mca parammca, mek parammek)
  {
    if (!(parammca instanceof luu)) {
      throw new IllegalArgumentException("Target fragment must implement AlertDialogListener");
    }
    parammek.a(this);
    this.b = parammca;
  }
  
  public final void a()
  {
    git localgit = (git)this.b.bo.a(git.class);
    ((giz)this.b.bo.a(giz.class)).b(localgit.c()).b("minor_public_extended_dialog", true).d();
  }
  
  public final void a(String paramString, Parcelable paramParcelable)
  {
    if (!(this.b instanceof luu)) {
      throw new IllegalArgumentException("Target fragment must implement AlertDialogListener");
    }
    Resources localResources = this.b.aI_().getResources();
    if (paramString == null) {
      paramString = localResources.getString(aaw.pI);
    }
    this.a = lut.b(paramString, localResources.getString(aaw.pJ), localResources.getString(17039370), localResources.getString(17039360));
    if (paramParcelable != null) {
      this.a.m.putParcelable("MinorWarningDialogExtra", paramParcelable);
    }
    lut locallut = this.a;
    locallut.n = this.b;
    locallut.p = 0;
    this.a.a(this.b.h(), "MinorWarningDialogTag");
  }
  
  public final void b()
  {
    this.a = ((lut)this.b.h().a("MinorWarningDialogTag"));
    if (this.a != null)
    {
      lut locallut = this.a;
      locallut.n = this.b;
      locallut.p = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmu
 * JD-Core Version:    0.7.0.1
 */