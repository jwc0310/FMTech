import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.squares.impl.homepage.SquareHomePageActivity;
import java.util.List;

public final class lcx
  implements kyg
{
  private Intent a;
  private Context b;
  private int c = -1;
  
  public lcx(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public final Intent a()
  {
    giz localgiz = (giz)mbb.a(this.b, giz.class);
    if ((localgiz.c(this.c)) && (!localgiz.a(this.c).c("is_google_plus")))
    {
      ill localill = new ill(this.b, this.c);
      localill.a.add(ine.class);
      this.a = localill.b();
    }
    Intent localIntent = this.a;
    this.a = null;
    this.c = -1;
    return localIntent;
  }
  
  public final kyg a(int paramInt)
  {
    if (this.a == null) {
      this.a = new Intent(this.b, SquareHomePageActivity.class).setAction("android.intent.action.VIEW");
    }
    this.c = paramInt;
    this.a.putExtra("account_id", paramInt);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lcx
 * JD-Core Version:    0.7.0.1
 */