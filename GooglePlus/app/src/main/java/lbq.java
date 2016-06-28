import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.squares.impl.edit.EditCategoriesActivity;
import com.google.android.libraries.social.squares.impl.edit.EditLinksActivity;
import com.google.android.libraries.social.squares.impl.edit.EditSquareActivity;

final class lbq
  implements kya
{
  private Context a;
  
  public lbq(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, String paramString)
  {
    Intent localIntent = new Intent(this.a, EditSquareActivity.class);
    localIntent.putExtra("square_id", paramString);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent b(int paramInt, String paramString)
  {
    Intent localIntent = new Intent(this.a, EditCategoriesActivity.class);
    localIntent.putExtra("square_id", paramString);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  public final Intent c(int paramInt, String paramString)
  {
    Intent localIntent = new Intent(this.a, EditLinksActivity.class);
    localIntent.putExtra("square_id", paramString);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbq
 * JD-Core Version:    0.7.0.1
 */