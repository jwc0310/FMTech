import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

final class awu
  implements cw<awp>
{
  private Context a;
  
  awu(awi paramawi, Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final fu<awp> a(int paramInt, Bundle paramBundle)
  {
    Uri localUri = (Uri)paramBundle.getParcelable("local_uri");
    boolean bool = mfq.c(mfq.b(this.b.f().getContentResolver(), localUri));
    bp localbp = this.b.f();
    if (bool) {}
    for (int i = 1;; i = 0) {
      return new awr(localbp, localUri, i);
    }
  }
  
  public final void a(fu<awp> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     awu
 * JD-Core Version:    0.7.0.1
 */