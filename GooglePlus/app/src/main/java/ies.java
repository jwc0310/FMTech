import android.content.Context;
import com.google.android.libraries.social.help.impl.LearnMoreTourActivity;
import java.util.ArrayList;

public final class ies
  extends ci
{
  public iet b;
  private Context c;
  
  public ies(LearnMoreTourActivity paramLearnMoreTourActivity, Context paramContext, bw parambw)
  {
    super(parambw);
    this.c = paramContext;
  }
  
  public final bk a(int paramInt)
  {
    if (this.d.e()) {
      paramInt = -1 + (this.b.a.size() - paramInt);
    }
    iet localiet = this.b;
    return bk.a(this.c, (String)localiet.a.get(paramInt));
  }
  
  public final int b()
  {
    return this.b.a.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ies
 * JD-Core Version:    0.7.0.1
 */