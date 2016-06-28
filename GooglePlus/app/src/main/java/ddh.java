import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.plus.phone.NetworkLogsActivity;

final class ddh
  implements View.OnClickListener
{
  ddh(ddg paramddg, String paramString1, Context paramContext, String paramString2, String paramString3) {}
  
  public final void onClick(View paramView)
  {
    if (this.a != null)
    {
      int i = this.e.f;
      Context localContext = this.b;
      String str1 = this.c;
      String str2 = this.d;
      Intent localIntent = new Intent(localContext, NetworkLogsActivity.class);
      localIntent.putExtra("log_function_name", str1);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("id", str2);
      this.b.startActivity(localIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddh
 * JD-Core Version:    0.7.0.1
 */