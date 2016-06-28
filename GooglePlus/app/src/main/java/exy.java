import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.google.android.gms.iid.MessengerCompat;

final class exy
  extends Handler
{
  exy(exx paramexx, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    exx localexx = this.a;
    if ((paramMessage != null) && ((paramMessage.obj instanceof Intent)))
    {
      Intent localIntent = (Intent)paramMessage.obj;
      localIntent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
      if (localIntent.hasExtra("google.messenger"))
      {
        Parcelable localParcelable = localIntent.getParcelableExtra("google.messenger");
        if ((localParcelable instanceof MessengerCompat)) {
          localexx.b = ((MessengerCompat)localParcelable);
        }
        if ((localParcelable instanceof Messenger)) {
          localexx.a = ((Messenger)localParcelable);
        }
      }
      localexx.b((Intent)paramMessage.obj);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exy
 * JD-Core Version:    0.7.0.1
 */