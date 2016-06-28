import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.phone.PeopleHomePageActivity;
import java.util.List;

public final class ddx
{
  public Intent a;
  private Context b;
  private int c;
  
  public ddx(Context paramContext)
  {
    this.b = paramContext;
    this.a = new Intent(paramContext, PeopleHomePageActivity.class);
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
    return this.a;
  }
  
  public final ddx a(int paramInt)
  {
    this.a.putExtra("account_id", paramInt);
    this.c = paramInt;
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddx
 * JD-Core Version:    0.7.0.1
 */