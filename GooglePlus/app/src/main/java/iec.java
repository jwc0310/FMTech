import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.help.impl.LearnMoreTourActivity;
import java.util.ArrayList;

public class iec
{
  public Context a;
  public iet b = new iet();
  
  public iec(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public Intent a(int paramInt)
  {
    Intent localIntent = new Intent(this.a, LearnMoreTourActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putStringArrayListExtra("fragment_names", this.b.a);
    return localIntent;
  }
  
  public iec a(Class<? extends bk> paramClass)
  {
    this.b.a.add(paramClass.getName());
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iec
 * JD-Core Version:    0.7.0.1
 */