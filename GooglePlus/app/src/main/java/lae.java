import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.squares.impl.categories.SquareCategoryPickerActivity;

public final class lae
  implements kyl
{
  private final Context a;
  
  public lae(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, lhp paramlhp)
  {
    Intent localIntent = new Intent(this.a, SquareCategoryPickerActivity.class);
    localIntent.putExtra("account_id", paramInt);
    localIntent.putExtra("square_target", paramlhp);
    return localIntent;
  }
  
  public final bj a(lhp paramlhp)
  {
    return lac.a(paramlhp);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lae
 * JD-Core Version:    0.7.0.1
 */