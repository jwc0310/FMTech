import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ed
{
  private static final Object a = new Object();
  private static Field b;
  private static boolean c;
  
  static
  {
    new Object();
  }
  
  public static Bundle a(Notification.Builder paramBuilder, ea paramea)
  {
    paramBuilder.addAction(paramea.a(), paramea.b(), paramea.c());
    Bundle localBundle = new Bundle(paramea.d());
    if (paramea.e() != null) {
      localBundle.putParcelableArray("android.support.remoteInputs", aau.a(paramea.e()));
    }
    return localBundle;
  }
  
  public static Bundle a(Notification paramNotification)
  {
    Field localField;
    Bundle localBundle;
    synchronized (a)
    {
      if (c) {
        return null;
      }
    }
  }
  
  public static SparseArray<Bundle> a(List<Bundle> paramList)
  {
    SparseArray localSparseArray = null;
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Bundle localBundle = (Bundle)paramList.get(j);
      if (localBundle != null)
      {
        if (localSparseArray == null) {
          localSparseArray = new SparseArray();
        }
        localSparseArray.put(j, localBundle);
      }
    }
    return localSparseArray;
  }
  
  public static ArrayList<Parcelable> a(ea[] paramArrayOfea)
  {
    Object localObject;
    if (paramArrayOfea == null) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      localObject = new ArrayList(paramArrayOfea.length);
      int i = paramArrayOfea.length;
      for (int j = 0; j < i; j++)
      {
        ea localea = paramArrayOfea[j];
        Bundle localBundle = new Bundle();
        localBundle.putInt("icon", localea.a());
        localBundle.putCharSequence("title", localea.b());
        localBundle.putParcelable("actionIntent", localea.c());
        localBundle.putBundle("extras", localea.d());
        localBundle.putParcelableArray("remoteInputs", aau.a(localea.e()));
        ((ArrayList)localObject).add(localBundle);
      }
    }
  }
  
  public static void a(de paramde, CharSequence paramCharSequence1, boolean paramBoolean1, CharSequence paramCharSequence2, Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean2)
  {
    Notification.BigPictureStyle localBigPictureStyle = new Notification.BigPictureStyle(paramde.a()).setBigContentTitle(paramCharSequence1).bigPicture(paramBitmap1);
    if (paramBoolean2) {
      localBigPictureStyle.bigLargeIcon(paramBitmap2);
    }
    if (paramBoolean1) {
      localBigPictureStyle.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(de paramde, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    Notification.BigTextStyle localBigTextStyle = new Notification.BigTextStyle(paramde.a()).setBigContentTitle(paramCharSequence1).bigText(paramCharSequence3);
    if (paramBoolean) {
      localBigTextStyle.setSummaryText(paramCharSequence2);
    }
  }
  
  public static void a(de paramde, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, ArrayList<CharSequence> paramArrayList)
  {
    Notification.InboxStyle localInboxStyle = new Notification.InboxStyle(paramde.a()).setBigContentTitle(paramCharSequence1);
    if (paramBoolean) {
      localInboxStyle.setSummaryText(paramCharSequence2);
    }
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext()) {
      localInboxStyle.addLine((CharSequence)localIterator.next());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ed
 * JD-Core Version:    0.7.0.1
 */