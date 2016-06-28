import android.util.Log;
import com.google.android.apps.plus.phone.InviteContactActivity;
import java.util.ArrayList;

public final class dbx
  implements Runnable
{
  public dbx(InviteContactActivity paramInviteContactActivity, ArrayList paramArrayList) {}
  
  public final void run()
  {
    InviteContactActivity localInviteContactActivity = this.b;
    ArrayList localArrayList = this.a;
    try
    {
      new dbz((String[])localArrayList.toArray(new String[0])).a(localInviteContactActivity.b.a.d, "pick_email");
      return;
    }
    catch (Throwable localThrowable)
    {
      if (Log.isLoggable("InviteContactActivity", 6)) {
        Log.e("InviteContactActivity", "Cannot show dialog", localThrowable);
      }
      localInviteContactActivity.finish();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbx
 * JD-Core Version:    0.7.0.1
 */