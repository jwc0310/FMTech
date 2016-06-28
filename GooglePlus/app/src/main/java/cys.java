import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;

final class cys
  extends Handler
{
  public cys(cyr paramcyr, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    ipf localipf = (ipf)paramMessage.obj;
    cyr localcyr = this.a;
    Uri localUri1 = GooglePhotosImageProvider.a(this.a.a, localipf.c, localipf.e);
    Uri localUri2 = bua.a(localcyr.a, localUri1);
    int i;
    int j;
    if ((localUri2 != null) && (localUri2.toString().contains("file")) && (localUri2.toString().contains("media")))
    {
      i = 1;
      if ((localUri2 == null) || (!localUri2.getAuthority().equals("media"))) {
        break label185;
      }
      j = 1;
      label99:
      ((ivl)mbb.a(localcyr.a, ivl.class)).i();
      if (j == 0) {
        break label191;
      }
    }
    label185:
    label191:
    for (int k = 4;; k = 0)
    {
      int m = k | 0x0;
      int n = 0;
      if (i != 0) {
        n = 2;
      }
      int i1 = m | n;
      Message localMessage = Message.obtain();
      localMessage.obj = localipf;
      localMessage.arg1 = i1;
      this.a.c.sendMessage(localMessage);
      return;
      i = 0;
      break;
      j = 0;
      break label99;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cys
 * JD-Core Version:    0.7.0.1
 */